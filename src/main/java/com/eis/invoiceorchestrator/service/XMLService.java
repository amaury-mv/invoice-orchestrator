package com.eis.invoiceorchestrator.service;

import com.eis.invoiceorchestrator.CFDI;
import com.eis.invoiceorchestrator.utilities.Comprobante;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.File;

/**
 * Class to generate XML SAT from CFDI class
 */
@Service
public class XMLService {

    private ModelMapper modelMapper;
    public XMLService(@Lazy ModelMapper modelMapper) {

        this.modelMapper = modelMapper;
    }

    public String getXML(CFDI cfdi, String centroCostoId) throws JAXBException {

        //Get certificate
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT)
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PROTECTED);
        Comprobante comprobante =  modelMapper.map(cfdi,Comprobante.class);
        JAXBContext context = JAXBContext.newInstance(Comprobante.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        marshaller.marshal(comprobante, outputStream);
        return outputStream.toString();

    }
}
