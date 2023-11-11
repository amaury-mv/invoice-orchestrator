package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.model.CertificateData;
import com.eis.invoiceorchestrator.utilities.Comprobante;
import com.eis.invoiceorchestrator.utilities.DateUtil;
import com.eis.invoiceorchestrator.utilities.ImpuestosLocales;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import com.sun.xml.bind.v2.WellKnownNamespace;
import org.apache.commons.ssl.PKCS8Key;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Class to generate XML SAT from CFDI
 */
@Service
public class XMLService {

    private final ModelMapper modelMapper;
    private static final String CFDI_VERSION = "4.0";
    private static final String ALGORITHM_SHA256 = "SHA256withRSA";
    private static final String CERTIFICATE_TYPE = "X.509";
    private static final String XSLT_LOCAL_RESOURCE = "xslt/cadenaoriginal.xslt";
    private final Transformer transformer;


    public XMLService(@Lazy ModelMapper modelMapper) throws TransformerConfigurationException {

        //FIXME: Classpath include inside cadenaoriginal.xslt
        StreamSource streamSource = new StreamSource(getClass()
                .getClassLoader().getResourceAsStream(XSLT_LOCAL_RESOURCE));
        this.transformer = TransformerFactory.newInstance().newTransformer(streamSource);
        this.modelMapper = modelMapper;
    }

    public String getXML(CFDI cfdi, CertificateData certificateData) throws Exception {

        Comprobante comprobante =  modelMapper.map(cfdi,Comprobante.class);
//        FIXME: Definir excepciones
        comprobante.setFecha(Optional.ofNullable(cfdi.getFecha()).map(DateUtil::dateToXMLFormat).orElseThrow(()
                -> new Exception()));

        if(cfdi.getComplemento()!=null){
            if(cfdi.getComplemento().getImpuestosLocales()!=null){

                if(comprobante.getComplemento()==null){
                    comprobante.setComplemento(new Comprobante.Complemento());
                }

                //FIXME
                ImpuestosLocales impuestosLocales = new ImpuestosLocales();
                impuestosLocales.setVersion("1.0");
                impuestosLocales.setTotaldeRetenciones(cfdi.getComplemento().getImpuestosLocales().getTotaldeRetenciones());
                impuestosLocales.setTotaldeTraslados(cfdi.getComplemento().getImpuestosLocales().getTotaldeTraslados());

                comprobante.getComplemento().getImpuestosLocales().add(impuestosLocales);


            }
        }
        comprobante.setVersion(CFDI_VERSION);
        comprobante.setNoCertificado(certificateData.getNumber());//30001000000400002444
        comprobante.setCertificado(getCertificateBase64(Base64.getDecoder().decode(certificateData.getBase64Cer())));
        comprobante.setSello(getDigitalStamp(comprobante,certificateData));



        return Base64.getEncoder().encodeToString(getXMLFromComprobante(comprobante));


    }


    private String getCertificateBase64(byte[] certificado) throws Exception {


        try (InputStream streamCertificado = new ByteArrayInputStream(certificado)) {

            CertificateFactory certificateFactory = CertificateFactory.getInstance(CERTIFICATE_TYPE);
            X509Certificate certificate = (X509Certificate) certificateFactory.generateCertificate(streamCertificado);
            return  Base64.getEncoder().encodeToString(certificate.getEncoded()).replaceAll("\\r|\\n","");

        } catch (IOException | CertificateException exception) {
            throw new Exception("");
        }

    }

    private String getDigitalStamp(Comprobante comprobante, CertificateData certificadoData) throws Exception {

        try {

            InputStream keyCertificado = new ByteArrayInputStream(Base64.getDecoder()
                    .decode(certificadoData.getBase64Key()));
            PKCS8Key pkcs8Key = new PKCS8Key(keyCertificado, certificadoData.getPassword().toCharArray());
            PrivateKey privateKey = pkcs8Key.getPrivateKey();
            Signature firma = Signature.getInstance(ALGORITHM_SHA256);
            firma.initSign(privateKey);

            String cadenaOriginal = getOriginalString(comprobante);
            firma.update(cadenaOriginal.getBytes(StandardCharsets.UTF_8));

            return Base64.getEncoder().encodeToString(firma.sign());

        } catch (GeneralSecurityException | IOException | TransformerException ex) {

            throw new Exception("");
        }
    }

    private String getOriginalString(Comprobante comprobante) throws Exception {



        StringWriter outWriter = new StringWriter();
        StreamResult result = new StreamResult(outWriter);
        StreamSource streamComprobante = new StreamSource(new ByteArrayInputStream(getXMLFromComprobante(comprobante)));
        this.transformer.transform(streamComprobante, result);
        StringBuffer buffer = outWriter.getBuffer();
        return buffer.toString().trim();

    }


    private byte[] getXMLFromComprobante(Comprobante comprobante) throws Exception {

            Marshaller marshaller;
            JAXBContext jaxBContext = JAXBContext.newInstance(Comprobante.class);
            marshaller = jaxBContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            final boolean impuestoLocales = comprobante.getComplemento() != null && comprobante.getComplemento().getImpuestosLocales() != null
                    && !comprobante.getComplemento().getImpuestosLocales().isEmpty();
            final boolean complIne = comprobante.getComplemento() != null && comprobante.getComplemento().getINE() != null;
            final boolean complPago = comprobante.getComplemento() != null && comprobante.getComplemento().getPagos() != null;
            final boolean complDonatarias = comprobante.getComplemento() != null && comprobante.getComplemento().getDonatarias() != null;
            final boolean complComercioExterior = comprobante.getComplemento() != null && comprobante.getComplemento().getComercioExterior() != null;

            final boolean complCartaPorte = comprobante.getComplemento() != null && comprobante.getComplemento().getCartaPorte() != null;
            final boolean leyendasFiscales = comprobante.getComplemento() != null && comprobante.getComplemento().getLeyendasFiscales() != null;

            final boolean complIedu = comprobante.getConceptos() != null && !comprobante.getConceptos().getConcepto().stream()
                    .filter(c -> c.getComplementoConcepto() != null
                            && c.getComplementoConcepto().getInstEducativas() != null).collect(Collectors.toList()).isEmpty();
            final boolean complNomina = comprobante.getComplemento() != null && comprobante.getComplemento().getNomina() != null;


            marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {

                @Override
                public String[] getPreDeclaredNamespaceUris() {
                    return new String[]{WellKnownNamespace.XML_SCHEMA_INSTANCE};
                }

                @Override
                public String getPreferredPrefix(String nameSpaceUri, String suggestion, boolean requiredPrefix) {
                    switch (nameSpaceUri.trim()) {
                        case WellKnownNamespace.XML_SCHEMA_INSTANCE:
                            return "xsi";
                        case WellKnownNamespace.XML_MIME_URI:
                            return "xmime";
                        case "http://www.sat.gob.mx/implocal":
                            return "implocal";
                        case "http://www.sat.gob.mx/cfd/4":
                            return "cfdi";
                        case "http://www.sat.gob.mx/ine":
                            return "ine";
                        case "http://www.sat.gob.mx/Pagos20":
                            return "pago20";
                        case "http://www.sat.gob.mx/iedu":
                            return "iedu";
                        case "http://www.sat.gob.mx/detallista":
                            return "detallista";
                        case "http://www.sat.gob.mx/donat":
                            return "donat";
                        case "http://www.sat.gob.mx/ComercioExterior11":
                            return "cce11";
                        case "http://www.sat.gob.mx/CartaPorte20":
                            return "cartaporte20";
                        case "http://www.sat.gob.mx/leyendasFiscales":
                            return "leyendasFisc";
                        case "http://www.sat.gob.mx/nomina12":
                            return "nomina12";
                        default:
                            break;
                    }
                    return suggestion;
                }
            });

            StringBuilder schemeLocation = new StringBuilder().append("http://www.sat.gob.mx/cfd/4 http://www.sat.gob.mx/sitio_internet/cfd/4/cfdv40.xsd ");

            if (comprobante.getComplemento() != null) {

                if (impuestoLocales) {
                    schemeLocation.append("http://www.sat.gob.mx/implocal http://www.sat.gob.mx/sitio_internet/cfd/implocal/implocal.xsd ");
                }

                if (complIne) {

                    schemeLocation.append("http://www.sat.gob.mx/ine http://www.sat.gob.mx/sitio_internet/cfd/ine/ine11.xsd ");
                }

                if (complPago) {

                    schemeLocation.append("http://www.sat.gob.mx/Pagos20 http://www.sat.gob.mx/sitio_internet/cfd/Pagos/Pagos20.xsd ");
                }

                if (complDonatarias) {

                    schemeLocation.append("http://www.sat.gob.mx/donat http://www.sat.gob.mx/sitio_internet/cfd/donat/donat11.xsd ");
                }

                if (complComercioExterior) {

                    schemeLocation.append("http://www.sat.gob.mx/ComercioExterior11 http://www.sat.gob.mx/sitio_internet/cfd/ComercioExterior11/ComercioExterior11.xsd");
                }

                if (complCartaPorte) {

                    schemeLocation.append("http://www.sat.gob.mx/CartaPorte20 http://www.sat.gob.mx/sitio_internet/cfd/CartaPorte/CartaPorte20.xsd ");
                }

                if (leyendasFiscales) {

                    schemeLocation.append("http://www.sat.gob.mx/leyendasFiscales http://www.sat.gob.mx/sitio_internet/cfd/leyendasFiscales/leyendasFisc.xsd ");

                }
                if (complNomina) {
                    schemeLocation.append("http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd");
                }

            }

            if (complIedu) {

                schemeLocation.append("http://www.sat.gob.mx/iedu http://www.sat.gob.mx/sitio_internet/cfd/iedu/iedu.xsd ");
            }

            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemeLocation.toString());

            marshaller.marshal(comprobante, outputStream);
            return outputStream.toByteArray();


    }

}
