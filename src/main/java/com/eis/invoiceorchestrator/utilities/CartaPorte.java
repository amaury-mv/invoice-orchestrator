//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.04 a las 01:54:50 PM CST 
//


package com.eis.invoiceorchestrator.utilities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ubicaciones"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Ubicacion" maxOccurs="unbounded" minOccurs="2"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Domicilio" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
 *                                     &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
 *                                     &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
 *                                     &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
 *                                     &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Estado" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="30"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{1,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                                     &lt;attribute name="CodigoPostal" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="12"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TipoUbicacion" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;enumeration value="Origen"/&gt;
 *                                 &lt;enumeration value="Destino"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="IDUbicacion"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="(OR|DE)[0-9]{6}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="RFCRemitenteDestinatario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
 *                           &lt;attribute name="NombreRemitenteDestinatario"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="254"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,254}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumRegIdTrib"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="40"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{6,40}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ResidenciaFiscal" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                           &lt;attribute name="NumEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Estaciones" /&gt;
 *                           &lt;attribute name="NombreEstacion"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NavegacionTrafico"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;enumeration value="Altura"/&gt;
 *                                 &lt;enumeration value="Cabotaje"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="FechaHoraSalidaLlegada" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" /&gt;
 *                           &lt;attribute name="TipoEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEstacion" /&gt;
 *                           &lt;attribute name="DistanciaRecorrida"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;minInclusive value="0.01"/&gt;
 *                                 &lt;maxInclusive value="99999"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mercancias"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Mercancia" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Pedimentos" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Pedimento" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;length value="21"/&gt;
 *                                           &lt;pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GuiasIdentificacion" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="NumeroGuiaIdentificacion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{10,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="DescripGuiaIdentificacion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="1000"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{1,1000}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PesoGuiaIdentificacion" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;minInclusive value="0.001"/&gt;
 *                                           &lt;fractionDigits value="3"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Cantidad" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="6"/&gt;
 *                                           &lt;minInclusive value="0.000001"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="IDOrigen" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="OR[0-9]{6}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="IDDestino" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="DE[0-9]{6}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="CvesTransporte" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CveTransporte" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DetalleMercancia" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="UnidadPesoMerc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
 *                                     &lt;attribute name="PesoBruto" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="3"/&gt;
 *                                           &lt;minInclusive value="0.001"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PesoNeto" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="3"/&gt;
 *                                           &lt;minInclusive value="0.001"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PesoTara" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="3"/&gt;
 *                                           &lt;minInclusive value="0.001"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="NumPiezas"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                           &lt;minInclusive value="1"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="BienesTransp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveProdServCP" /&gt;
 *                           &lt;attribute name="ClaveSTCC"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="7"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[0-9|]{6,7}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Descripcion" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="1000"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,1000}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Cantidad" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="6"/&gt;
 *                                 &lt;minInclusive value="0.000001"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" /&gt;
 *                           &lt;attribute name="Unidad"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="20"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,20}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Dimensiones"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;pattern value="([0-9]{1,3}[/]){2}([0-9]{1,3})(cm|plg)"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="MaterialPeligroso"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;enumeration value="Sí"/&gt;
 *                                 &lt;enumeration value="No"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="CveMaterialPeligroso" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_MaterialPeligroso" /&gt;
 *                           &lt;attribute name="Embalaje" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEmbalaje" /&gt;
 *                           &lt;attribute name="DescripEmbalaje"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="100"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,100}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PesoEnKg" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;minInclusive value="0.001"/&gt;
 *                                 &lt;fractionDigits value="3"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ValorMercancia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
 *                           &lt;attribute name="Moneda" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" /&gt;
 *                           &lt;attribute name="FraccionArancelaria" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/ComExt}c_FraccionArancelaria" /&gt;
 *                           &lt;attribute name="UUIDComercioExt"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Autotransporte" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IdentificacionVehicular"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ConfigVehicular" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigAutotransporte" /&gt;
 *                                     &lt;attribute name="PlacaVM" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="AnioModeloVM" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Seguros"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="AseguraRespCivil" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="50"/&gt;
 *                                           &lt;pattern value="[^|]{3,50}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PolizaRespCivil" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="30"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{3,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="AseguraMedAmbiente"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="50"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{3,50}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PolizaMedAmbiente"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="30"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{3,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="AseguraCarga"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="50"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{3,50}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PolizaCarga"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="3"/&gt;
 *                                           &lt;maxLength value="30"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{3,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="PrimaSeguro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Remolques" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Remolque" maxOccurs="2"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="SubTipoRem" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_SubTipoRem" /&gt;
 *                                               &lt;attribute name="Placa" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;whiteSpace value="collapse"/&gt;
 *                                                     &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
 *                           &lt;attribute name="NumPermisoSCT" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteMaritimo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Contenedor" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="MatriculaContenedor" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="11"/&gt;
 *                                           &lt;maxLength value="15"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{11,15}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ContenedorMaritimo" /&gt;
 *                                     &lt;attribute name="NumPrecinto"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="5"/&gt;
 *                                           &lt;maxLength value="20"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{5,20}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="PermSCT" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
 *                           &lt;attribute name="NumPermisoSCT"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NombreAseg"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumPolizaSeguro"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="TipoEmbarcacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigMaritima" /&gt;
 *                           &lt;attribute name="Matricula" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="7"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{7,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumeroOMI" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="IMO[0-9]{7}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="AnioEmbarcacion"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NombreEmbarc"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;pattern value="[^|]{1,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NacionalidadEmbarc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                           &lt;attribute name="UnidadesDeArqBruto" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="3"/&gt;
 *                                 &lt;minInclusive value="0.001"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="TipoCarga" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveTipoCarga" /&gt;
 *                           &lt;attribute name="NumCertITC" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="20"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,20}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Eslora"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                                 &lt;minInclusive value="0.01"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Manga"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                                 &lt;minInclusive value="0.01"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="Calado"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                 &lt;fractionDigits value="2"/&gt;
 *                                 &lt;minInclusive value="0.01"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="LineaNaviera"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NombreAgenteNaviero" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="100"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,100}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumAutorizacionNaviero" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_NumAutorizacionNaviero" /&gt;
 *                           &lt;attribute name="NumViaje"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumConocEmbarc"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteAereo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
 *                           &lt;attribute name="NumPermisoSCT" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="MatriculaAeronave"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="5"/&gt;
 *                                 &lt;maxLength value="10"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="([A-Z]|[0-9]|-|){5,10}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NombreAseg"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumPolizaSeguro"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumeroGuia" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="12"/&gt;
 *                                 &lt;maxLength value="15"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{12,15}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="LugarContrato" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                           &lt;attribute name="CodigoTransportista" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CodigoTransporteAereo" /&gt;
 *                           &lt;attribute name="RFCEmbarcador" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
 *                           &lt;attribute name="NumRegIdTribEmbarc"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="40"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{6,40}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                           &lt;attribute name="NombreEmbarcador"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="254"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,254}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TransporteFerroviario" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="TipoDerechoDePaso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_DerechosDePaso" /&gt;
 *                                     &lt;attribute name="KilometrajePagado" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="2"/&gt;
 *                                           &lt;minInclusive value="0.01"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Carro" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Contenedor" /&gt;
 *                                               &lt;attribute name="PesoContenedorVacio" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                     &lt;fractionDigits value="3"/&gt;
 *                                                     &lt;minInclusive value="0.001"/&gt;
 *                                                     &lt;whiteSpace value="collapse"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                               &lt;attribute name="PesoNetoMercancia" use="required"&gt;
 *                                                 &lt;simpleType&gt;
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                     &lt;fractionDigits value="3"/&gt;
 *                                                     &lt;minInclusive value="0.001"/&gt;
 *                                                     &lt;whiteSpace value="collapse"/&gt;
 *                                                   &lt;/restriction&gt;
 *                                                 &lt;/simpleType&gt;
 *                                               &lt;/attribute&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="TipoCarro" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoCarro" /&gt;
 *                                     &lt;attribute name="MatriculaCarro" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="6"/&gt;
 *                                           &lt;maxLength value="15"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{6,15}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="GuiaCarro" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="15"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{1,15}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="ToneladasNetasCarro" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                           &lt;fractionDigits value="3"/&gt;
 *                                           &lt;minInclusive value="0.001"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TipoDeServicio" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeServicio" /&gt;
 *                           &lt;attribute name="TipoDeTrafico" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeTrafico" /&gt;
 *                           &lt;attribute name="NombreAseg"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="50"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,50}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumPolizaSeguro"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="3"/&gt;
 *                                 &lt;maxLength value="30"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{3,30}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PesoBrutoTotal" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="3"/&gt;
 *                       &lt;minInclusive value="0.001"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="UnidadPeso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
 *                 &lt;attribute name="PesoNetoTotal"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="3"/&gt;
 *                       &lt;minInclusive value="0.001"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="NumTotalMercancias" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                       &lt;minInclusive value="1"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CargoPorTasacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FiguraTransporte" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TiposFigura" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PartesTransporte" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="ParteTransporte" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ParteTransporte" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Domicilio" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
 *                                     &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
 *                                     &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
 *                                     &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
 *                                     &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
 *                                     &lt;attribute name="Estado" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="30"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                           &lt;pattern value="[^|]{1,30}"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                                     &lt;attribute name="CodigoPostal" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;minLength value="1"/&gt;
 *                                           &lt;maxLength value="12"/&gt;
 *                                           &lt;whiteSpace value="collapse"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TipoFigura" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_FiguraTransporte" /&gt;
 *                           &lt;attribute name="RFCFigura"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC"&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumLicencia"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="16"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{6,16}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NombreFigura"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="1"/&gt;
 *                                 &lt;maxLength value="254"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{1,254}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="NumRegIdTribFigura"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;minLength value="6"/&gt;
 *                                 &lt;maxLength value="40"/&gt;
 *                                 &lt;whiteSpace value="collapse"/&gt;
 *                                 &lt;pattern value="[^|]{6,40}"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ResidenciaFiscalFigura" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="2.0" /&gt;
 *       &lt;attribute name="TranspInternac" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;enumeration value="Sí"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="EntradaSalidaMerc"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *             &lt;enumeration value="Entrada"/&gt;
 *             &lt;enumeration value="Salida"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PaisOrigenDestino" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
 *       &lt;attribute name="ViaEntradaSalida" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CveTransporte" /&gt;
 *       &lt;attribute name="TotalDistRec"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;minInclusive value="0.01"/&gt;
 *             &lt;maxInclusive value="99999"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ubicaciones",
    "mercancias",
    "figuraTransporte"
})
@XmlRootElement(name = "CartaPorte", namespace = "http://www.sat.gob.mx/CartaPorte20")
public class CartaPorte {

    @XmlElement(name = "Ubicaciones", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
    protected CartaPorte.Ubicaciones ubicaciones;
    @XmlElement(name = "Mercancias", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
    protected CartaPorte.Mercancias mercancias;
    @XmlElement(name = "FiguraTransporte", namespace = "http://www.sat.gob.mx/CartaPorte20")
    protected CartaPorte.FiguraTransporte figuraTransporte;
    @XmlAttribute(name = "Version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TranspInternac", required = true)
    protected String transpInternac;
    @XmlAttribute(name = "EntradaSalidaMerc")
    protected String entradaSalidaMerc;
    @XmlAttribute(name = "PaisOrigenDestino")
    protected String paisOrigenDestino;
    @XmlAttribute(name = "ViaEntradaSalida")
    protected String viaEntradaSalida;
    @XmlAttribute(name = "TotalDistRec")
    protected BigDecimal totalDistRec;

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte.Ubicaciones }
     *     
     */
    public CartaPorte.Ubicaciones getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte.Ubicaciones }
     *     
     */
    public void setUbicaciones(CartaPorte.Ubicaciones value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte.Mercancias }
     *     
     */
    public CartaPorte.Mercancias getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte.Mercancias }
     *     
     */
    public void setMercancias(CartaPorte.Mercancias value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link CartaPorte.FiguraTransporte }
     *     
     */
    public CartaPorte.FiguraTransporte getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaPorte.FiguraTransporte }
     *     
     */
    public void setFiguraTransporte(CartaPorte.FiguraTransporte value) {
        this.figuraTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad transpInternac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * Define el valor de la propiedad transpInternac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspInternac(String value) {
        this.transpInternac = value;
    }

    /**
     * Obtiene el valor de la propiedad entradaSalidaMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * Define el valor de la propiedad entradaSalidaMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaSalidaMerc(String value) {
        this.entradaSalidaMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigenDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    /**
     * Define el valor de la propiedad paisOrigenDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenDestino(String value) {
        this.paisOrigenDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad viaEntradaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * Define el valor de la propiedad viaEntradaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaEntradaSalida(String value) {
        this.viaEntradaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistRec.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * Define el valor de la propiedad totalDistRec.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDistRec(BigDecimal value) {
        this.totalDistRec = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TiposFigura" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PartesTransporte" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ParteTransporte" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ParteTransporte" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Domicilio" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
     *                           &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
     *                           &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
     *                           &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
     *                           &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Estado" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="30"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{1,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *                           &lt;attribute name="CodigoPostal" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="12"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TipoFigura" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_FiguraTransporte" /&gt;
     *                 &lt;attribute name="RFCFigura"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC"&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumLicencia"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="16"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{6,16}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NombreFigura"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="254"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,254}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumRegIdTribFigura"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="40"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{6,40}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ResidenciaFiscalFigura" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tiposFigura"
    })
    public static class FiguraTransporte {

        @XmlElement(name = "TiposFigura", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
        protected List<CartaPorte.FiguraTransporte.TiposFigura> tiposFigura;

        /**
         * Gets the value of the tiposFigura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tiposFigura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTiposFigura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.FiguraTransporte.TiposFigura }
         * 
         * 
         */
        public List<CartaPorte.FiguraTransporte.TiposFigura> getTiposFigura() {
            if (tiposFigura == null) {
                tiposFigura = new ArrayList<CartaPorte.FiguraTransporte.TiposFigura>();
            }
            return this.tiposFigura;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PartesTransporte" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ParteTransporte" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ParteTransporte" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Domicilio" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
         *                 &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
         *                 &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
         *                 &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
         *                 &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Estado" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="30"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{1,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *                 &lt;attribute name="CodigoPostal" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="12"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TipoFigura" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_FiguraTransporte" /&gt;
         *       &lt;attribute name="RFCFigura"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC"&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumLicencia"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="16"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{6,16}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NombreFigura"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="254"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,254}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumRegIdTribFigura"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="40"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{6,40}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ResidenciaFiscalFigura" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "partesTransporte",
            "domicilio"
        })
        public static class TiposFigura {

            @XmlElement(name = "PartesTransporte", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected List<CartaPorte.FiguraTransporte.TiposFigura.PartesTransporte> partesTransporte;
            @XmlElement(name = "Domicilio", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected CartaPorte.FiguraTransporte.TiposFigura.Domicilio domicilio;
            @XmlAttribute(name = "TipoFigura", required = true)
            protected String tipoFigura;
            @XmlAttribute(name = "RFCFigura")
            protected String rfcFigura;
            @XmlAttribute(name = "NumLicencia")
            protected String numLicencia;
            @XmlAttribute(name = "NombreFigura")
            protected String nombreFigura;
            @XmlAttribute(name = "NumRegIdTribFigura")
            protected String numRegIdTribFigura;
            @XmlAttribute(name = "ResidenciaFiscalFigura")
            protected String residenciaFiscalFigura;

            /**
             * Gets the value of the partesTransporte property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partesTransporte property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPartesTransporte().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.FiguraTransporte.TiposFigura.PartesTransporte }
             * 
             * 
             */
            public List<CartaPorte.FiguraTransporte.TiposFigura.PartesTransporte> getPartesTransporte() {
                if (partesTransporte == null) {
                    partesTransporte = new ArrayList<CartaPorte.FiguraTransporte.TiposFigura.PartesTransporte>();
                }
                return this.partesTransporte;
            }

            /**
             * Obtiene el valor de la propiedad domicilio.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.FiguraTransporte.TiposFigura.Domicilio }
             *     
             */
            public CartaPorte.FiguraTransporte.TiposFigura.Domicilio getDomicilio() {
                return domicilio;
            }

            /**
             * Define el valor de la propiedad domicilio.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.FiguraTransporte.TiposFigura.Domicilio }
             *     
             */
            public void setDomicilio(CartaPorte.FiguraTransporte.TiposFigura.Domicilio value) {
                this.domicilio = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoFigura.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoFigura() {
                return tipoFigura;
            }

            /**
             * Define el valor de la propiedad tipoFigura.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoFigura(String value) {
                this.tipoFigura = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcFigura.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCFigura() {
                return rfcFigura;
            }

            /**
             * Define el valor de la propiedad rfcFigura.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCFigura(String value) {
                this.rfcFigura = value;
            }

            /**
             * Obtiene el valor de la propiedad numLicencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumLicencia() {
                return numLicencia;
            }

            /**
             * Define el valor de la propiedad numLicencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumLicencia(String value) {
                this.numLicencia = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreFigura.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreFigura() {
                return nombreFigura;
            }

            /**
             * Define el valor de la propiedad nombreFigura.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreFigura(String value) {
                this.nombreFigura = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribFigura.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribFigura() {
                return numRegIdTribFigura;
            }

            /**
             * Define el valor de la propiedad numRegIdTribFigura.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribFigura(String value) {
                this.numRegIdTribFigura = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalFigura.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalFigura() {
                return residenciaFiscalFigura;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalFigura.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalFigura(String value) {
                this.residenciaFiscalFigura = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
             *       &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
             *       &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
             *       &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
             *       &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Estado" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="30"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{1,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
             *       &lt;attribute name="CodigoPostal" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Domicilio {

                @XmlAttribute(name = "Calle")
                protected String calle;
                @XmlAttribute(name = "NumeroExterior")
                protected String numeroExterior;
                @XmlAttribute(name = "NumeroInterior")
                protected String numeroInterior;
                @XmlAttribute(name = "Colonia")
                protected String colonia;
                @XmlAttribute(name = "Localidad")
                protected String localidad;
                @XmlAttribute(name = "Referencia")
                protected String referencia;
                @XmlAttribute(name = "Municipio")
                protected String municipio;
                @XmlAttribute(name = "Estado", required = true)
                protected String estado;
                @XmlAttribute(name = "Pais", required = true)
                protected String pais;
                @XmlAttribute(name = "CodigoPostal", required = true)
                protected String codigoPostal;

                /**
                 * Obtiene el valor de la propiedad calle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCalle() {
                    return calle;
                }

                /**
                 * Define el valor de la propiedad calle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCalle(String value) {
                    this.calle = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroExterior.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroExterior() {
                    return numeroExterior;
                }

                /**
                 * Define el valor de la propiedad numeroExterior.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroExterior(String value) {
                    this.numeroExterior = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroInterior.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroInterior() {
                    return numeroInterior;
                }

                /**
                 * Define el valor de la propiedad numeroInterior.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroInterior(String value) {
                    this.numeroInterior = value;
                }

                /**
                 * Obtiene el valor de la propiedad colonia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColonia() {
                    return colonia;
                }

                /**
                 * Define el valor de la propiedad colonia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColonia(String value) {
                    this.colonia = value;
                }

                /**
                 * Obtiene el valor de la propiedad localidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocalidad() {
                    return localidad;
                }

                /**
                 * Define el valor de la propiedad localidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocalidad(String value) {
                    this.localidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad referencia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferencia() {
                    return referencia;
                }

                /**
                 * Define el valor de la propiedad referencia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferencia(String value) {
                    this.referencia = value;
                }

                /**
                 * Obtiene el valor de la propiedad municipio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMunicipio() {
                    return municipio;
                }

                /**
                 * Define el valor de la propiedad municipio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMunicipio(String value) {
                    this.municipio = value;
                }

                /**
                 * Obtiene el valor de la propiedad estado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEstado() {
                    return estado;
                }

                /**
                 * Define el valor de la propiedad estado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEstado(String value) {
                    this.estado = value;
                }

                /**
                 * Obtiene el valor de la propiedad pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define el valor de la propiedad pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoPostal() {
                    return codigoPostal;
                }

                /**
                 * Define el valor de la propiedad codigoPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoPostal(String value) {
                    this.codigoPostal = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="ParteTransporte" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ParteTransporte" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PartesTransporte {

                @XmlAttribute(name = "ParteTransporte", required = true)
                protected String parteTransporte;

                /**
                 * Obtiene el valor de la propiedad parteTransporte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParteTransporte() {
                    return parteTransporte;
                }

                /**
                 * Define el valor de la propiedad parteTransporte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParteTransporte(String value) {
                    this.parteTransporte = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Mercancia" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Pedimentos" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Pedimento" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;length value="21"/&gt;
     *                                 &lt;pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GuiasIdentificacion" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="NumeroGuiaIdentificacion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{10,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="DescripGuiaIdentificacion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="1000"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{1,1000}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PesoGuiaIdentificacion" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;minInclusive value="0.001"/&gt;
     *                                 &lt;fractionDigits value="3"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Cantidad" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="6"/&gt;
     *                                 &lt;minInclusive value="0.000001"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="IDOrigen" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="OR[0-9]{6}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="IDDestino" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="DE[0-9]{6}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="CvesTransporte" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CveTransporte" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DetalleMercancia" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="UnidadPesoMerc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
     *                           &lt;attribute name="PesoBruto" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="3"/&gt;
     *                                 &lt;minInclusive value="0.001"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PesoNeto" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="3"/&gt;
     *                                 &lt;minInclusive value="0.001"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PesoTara" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="3"/&gt;
     *                                 &lt;minInclusive value="0.001"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="NumPiezas"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                 &lt;minInclusive value="1"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="BienesTransp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveProdServCP" /&gt;
     *                 &lt;attribute name="ClaveSTCC"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="7"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[0-9|]{6,7}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Descripcion" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="1000"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,1000}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Cantidad" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="6"/&gt;
     *                       &lt;minInclusive value="0.000001"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" /&gt;
     *                 &lt;attribute name="Unidad"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="20"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,20}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Dimensiones"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="([0-9]{1,3}[/]){2}([0-9]{1,3})(cm|plg)"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="MaterialPeligroso"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;enumeration value="Sí"/&gt;
     *                       &lt;enumeration value="No"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="CveMaterialPeligroso" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_MaterialPeligroso" /&gt;
     *                 &lt;attribute name="Embalaje" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEmbalaje" /&gt;
     *                 &lt;attribute name="DescripEmbalaje"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="100"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,100}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PesoEnKg" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;minInclusive value="0.001"/&gt;
     *                       &lt;fractionDigits value="3"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ValorMercancia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
     *                 &lt;attribute name="Moneda" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" /&gt;
     *                 &lt;attribute name="FraccionArancelaria" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/ComExt}c_FraccionArancelaria" /&gt;
     *                 &lt;attribute name="UUIDComercioExt"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Autotransporte" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdentificacionVehicular"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="ConfigVehicular" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigAutotransporte" /&gt;
     *                           &lt;attribute name="PlacaVM" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="AnioModeloVM" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Seguros"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="AseguraRespCivil" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="50"/&gt;
     *                                 &lt;pattern value="[^|]{3,50}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PolizaRespCivil" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="30"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{3,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="AseguraMedAmbiente"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="50"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{3,50}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PolizaMedAmbiente"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="30"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{3,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="AseguraCarga"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="50"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{3,50}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PolizaCarga"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="3"/&gt;
     *                                 &lt;maxLength value="30"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{3,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="PrimaSeguro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Remolques" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Remolque" maxOccurs="2"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="SubTipoRem" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_SubTipoRem" /&gt;
     *                                     &lt;attribute name="Placa" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;whiteSpace value="collapse"/&gt;
     *                                           &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
     *                 &lt;attribute name="NumPermisoSCT" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteMaritimo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Contenedor" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="MatriculaContenedor" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="11"/&gt;
     *                                 &lt;maxLength value="15"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{11,15}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ContenedorMaritimo" /&gt;
     *                           &lt;attribute name="NumPrecinto"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="5"/&gt;
     *                                 &lt;maxLength value="20"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{5,20}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="PermSCT" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
     *                 &lt;attribute name="NumPermisoSCT"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NombreAseg"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumPolizaSeguro"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="TipoEmbarcacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigMaritima" /&gt;
     *                 &lt;attribute name="Matricula" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="7"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{7,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumeroOMI" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="IMO[0-9]{7}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="AnioEmbarcacion"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NombreEmbarc"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;pattern value="[^|]{1,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NacionalidadEmbarc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *                 &lt;attribute name="UnidadesDeArqBruto" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="3"/&gt;
     *                       &lt;minInclusive value="0.001"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="TipoCarga" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveTipoCarga" /&gt;
     *                 &lt;attribute name="NumCertITC" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="20"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,20}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Eslora"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                       &lt;minInclusive value="0.01"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Manga"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                       &lt;minInclusive value="0.01"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Calado"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;fractionDigits value="2"/&gt;
     *                       &lt;minInclusive value="0.01"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="LineaNaviera"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NombreAgenteNaviero" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="100"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,100}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumAutorizacionNaviero" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_NumAutorizacionNaviero" /&gt;
     *                 &lt;attribute name="NumViaje"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumConocEmbarc"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteAereo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
     *                 &lt;attribute name="NumPermisoSCT" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="MatriculaAeronave"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="5"/&gt;
     *                       &lt;maxLength value="10"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="([A-Z]|[0-9]|-|){5,10}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NombreAseg"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumPolizaSeguro"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumeroGuia" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="12"/&gt;
     *                       &lt;maxLength value="15"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{12,15}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="LugarContrato" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                 &lt;attribute name="CodigoTransportista" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CodigoTransporteAereo" /&gt;
     *                 &lt;attribute name="RFCEmbarcador" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
     *                 &lt;attribute name="NumRegIdTribEmbarc"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="40"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{6,40}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *                 &lt;attribute name="NombreEmbarcador"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="254"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,254}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TransporteFerroviario" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="TipoDerechoDePaso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_DerechosDePaso" /&gt;
     *                           &lt;attribute name="KilometrajePagado" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="2"/&gt;
     *                                 &lt;minInclusive value="0.01"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Carro" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Contenedor" /&gt;
     *                                     &lt;attribute name="PesoContenedorVacio" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                           &lt;fractionDigits value="3"/&gt;
     *                                           &lt;minInclusive value="0.001"/&gt;
     *                                           &lt;whiteSpace value="collapse"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                     &lt;attribute name="PesoNetoMercancia" use="required"&gt;
     *                                       &lt;simpleType&gt;
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                           &lt;fractionDigits value="3"/&gt;
     *                                           &lt;minInclusive value="0.001"/&gt;
     *                                           &lt;whiteSpace value="collapse"/&gt;
     *                                         &lt;/restriction&gt;
     *                                       &lt;/simpleType&gt;
     *                                     &lt;/attribute&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="TipoCarro" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoCarro" /&gt;
     *                           &lt;attribute name="MatriculaCarro" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="6"/&gt;
     *                                 &lt;maxLength value="15"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{6,15}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="GuiaCarro" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="15"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{1,15}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="ToneladasNetasCarro" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                 &lt;fractionDigits value="3"/&gt;
     *                                 &lt;minInclusive value="0.001"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TipoDeServicio" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeServicio" /&gt;
     *                 &lt;attribute name="TipoDeTrafico" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeTrafico" /&gt;
     *                 &lt;attribute name="NombreAseg"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumPolizaSeguro"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="3"/&gt;
     *                       &lt;maxLength value="30"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{3,30}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PesoBrutoTotal" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="3"/&gt;
     *             &lt;minInclusive value="0.001"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="UnidadPeso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
     *       &lt;attribute name="PesoNetoTotal"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="3"/&gt;
     *             &lt;minInclusive value="0.001"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="NumTotalMercancias" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *             &lt;minInclusive value="1"/&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CargoPorTasacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mercancia",
        "autotransporte",
        "transporteMaritimo",
        "transporteAereo",
        "transporteFerroviario"
    })
    public static class Mercancias {

        @XmlElement(name = "Mercancia", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
        protected List<CartaPorte.Mercancias.Mercancia> mercancia;
        @XmlElement(name = "Autotransporte", namespace = "http://www.sat.gob.mx/CartaPorte20")
        protected CartaPorte.Mercancias.Autotransporte autotransporte;
        @XmlElement(name = "TransporteMaritimo", namespace = "http://www.sat.gob.mx/CartaPorte20")
        protected CartaPorte.Mercancias.TransporteMaritimo transporteMaritimo;
        @XmlElement(name = "TransporteAereo", namespace = "http://www.sat.gob.mx/CartaPorte20")
        protected CartaPorte.Mercancias.TransporteAereo transporteAereo;
        @XmlElement(name = "TransporteFerroviario", namespace = "http://www.sat.gob.mx/CartaPorte20")
        protected CartaPorte.Mercancias.TransporteFerroviario transporteFerroviario;
        @XmlAttribute(name = "PesoBrutoTotal", required = true)
        protected BigDecimal pesoBrutoTotal;
        @XmlAttribute(name = "UnidadPeso", required = true)
        protected String unidadPeso;
        @XmlAttribute(name = "PesoNetoTotal")
        protected BigDecimal pesoNetoTotal;
        @XmlAttribute(name = "NumTotalMercancias", required = true)
        protected int numTotalMercancias;
        @XmlAttribute(name = "CargoPorTasacion")
        protected BigDecimal cargoPorTasacion;

        /**
         * Gets the value of the mercancia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mercancia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMercancia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.Mercancias.Mercancia }
         * 
         * 
         */
        public List<CartaPorte.Mercancias.Mercancia> getMercancia() {
            if (mercancia == null) {
                mercancia = new ArrayList<CartaPorte.Mercancias.Mercancia>();
            }
            return this.mercancia;
        }

        /**
         * Obtiene el valor de la propiedad autotransporte.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.Autotransporte }
         *     
         */
        public CartaPorte.Mercancias.Autotransporte getAutotransporte() {
            return autotransporte;
        }

        /**
         * Define el valor de la propiedad autotransporte.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.Autotransporte }
         *     
         */
        public void setAutotransporte(CartaPorte.Mercancias.Autotransporte value) {
            this.autotransporte = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteMaritimo.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteMaritimo }
         *     
         */
        public CartaPorte.Mercancias.TransporteMaritimo getTransporteMaritimo() {
            return transporteMaritimo;
        }

        /**
         * Define el valor de la propiedad transporteMaritimo.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteMaritimo }
         *     
         */
        public void setTransporteMaritimo(CartaPorte.Mercancias.TransporteMaritimo value) {
            this.transporteMaritimo = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteAereo.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteAereo }
         *     
         */
        public CartaPorte.Mercancias.TransporteAereo getTransporteAereo() {
            return transporteAereo;
        }

        /**
         * Define el valor de la propiedad transporteAereo.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteAereo }
         *     
         */
        public void setTransporteAereo(CartaPorte.Mercancias.TransporteAereo value) {
            this.transporteAereo = value;
        }

        /**
         * Obtiene el valor de la propiedad transporteFerroviario.
         * 
         * @return
         *     possible object is
         *     {@link CartaPorte.Mercancias.TransporteFerroviario }
         *     
         */
        public CartaPorte.Mercancias.TransporteFerroviario getTransporteFerroviario() {
            return transporteFerroviario;
        }

        /**
         * Define el valor de la propiedad transporteFerroviario.
         * 
         * @param value
         *     allowed object is
         *     {@link CartaPorte.Mercancias.TransporteFerroviario }
         *     
         */
        public void setTransporteFerroviario(CartaPorte.Mercancias.TransporteFerroviario value) {
            this.transporteFerroviario = value;
        }

        /**
         * Obtiene el valor de la propiedad pesoBrutoTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPesoBrutoTotal() {
            return pesoBrutoTotal;
        }

        /**
         * Define el valor de la propiedad pesoBrutoTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPesoBrutoTotal(BigDecimal value) {
            this.pesoBrutoTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad unidadPeso.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnidadPeso() {
            return unidadPeso;
        }

        /**
         * Define el valor de la propiedad unidadPeso.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnidadPeso(String value) {
            this.unidadPeso = value;
        }

        /**
         * Obtiene el valor de la propiedad pesoNetoTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPesoNetoTotal() {
            return pesoNetoTotal;
        }

        /**
         * Define el valor de la propiedad pesoNetoTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPesoNetoTotal(BigDecimal value) {
            this.pesoNetoTotal = value;
        }

        /**
         * Obtiene el valor de la propiedad numTotalMercancias.
         * 
         */
        public int getNumTotalMercancias() {
            return numTotalMercancias;
        }

        /**
         * Define el valor de la propiedad numTotalMercancias.
         * 
         */
        public void setNumTotalMercancias(int value) {
            this.numTotalMercancias = value;
        }

        /**
         * Obtiene el valor de la propiedad cargoPorTasacion.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCargoPorTasacion() {
            return cargoPorTasacion;
        }

        /**
         * Define el valor de la propiedad cargoPorTasacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCargoPorTasacion(BigDecimal value) {
            this.cargoPorTasacion = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="IdentificacionVehicular"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="ConfigVehicular" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigAutotransporte" /&gt;
         *                 &lt;attribute name="PlacaVM" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="AnioModeloVM" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Seguros"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="AseguraRespCivil" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="50"/&gt;
         *                       &lt;pattern value="[^|]{3,50}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PolizaRespCivil" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="30"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{3,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="AseguraMedAmbiente"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="50"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{3,50}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PolizaMedAmbiente"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="30"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{3,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="AseguraCarga"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="50"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{3,50}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PolizaCarga"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="3"/&gt;
         *                       &lt;maxLength value="30"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{3,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PrimaSeguro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Remolques" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Remolque" maxOccurs="2"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="SubTipoRem" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_SubTipoRem" /&gt;
         *                           &lt;attribute name="Placa" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;whiteSpace value="collapse"/&gt;
         *                                 &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
         *       &lt;attribute name="NumPermisoSCT" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identificacionVehicular",
            "seguros",
            "remolques"
        })
        public static class Autotransporte {

            @XmlElement(name = "IdentificacionVehicular", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
            protected CartaPorte.Mercancias.Autotransporte.IdentificacionVehicular identificacionVehicular;
            @XmlElement(name = "Seguros", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
            protected CartaPorte.Mercancias.Autotransporte.Seguros seguros;
            @XmlElement(name = "Remolques", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected CartaPorte.Mercancias.Autotransporte.Remolques remolques;
            @XmlAttribute(name = "PermSCT", required = true)
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT", required = true)
            protected String numPermisoSCT;

            /**
             * Obtiene el valor de la propiedad identificacionVehicular.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.Autotransporte.IdentificacionVehicular }
             *     
             */
            public CartaPorte.Mercancias.Autotransporte.IdentificacionVehicular getIdentificacionVehicular() {
                return identificacionVehicular;
            }

            /**
             * Define el valor de la propiedad identificacionVehicular.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.Autotransporte.IdentificacionVehicular }
             *     
             */
            public void setIdentificacionVehicular(CartaPorte.Mercancias.Autotransporte.IdentificacionVehicular value) {
                this.identificacionVehicular = value;
            }

            /**
             * Obtiene el valor de la propiedad seguros.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.Autotransporte.Seguros }
             *     
             */
            public CartaPorte.Mercancias.Autotransporte.Seguros getSeguros() {
                return seguros;
            }

            /**
             * Define el valor de la propiedad seguros.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.Autotransporte.Seguros }
             *     
             */
            public void setSeguros(CartaPorte.Mercancias.Autotransporte.Seguros value) {
                this.seguros = value;
            }

            /**
             * Obtiene el valor de la propiedad remolques.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.Autotransporte.Remolques }
             *     
             */
            public CartaPorte.Mercancias.Autotransporte.Remolques getRemolques() {
                return remolques;
            }

            /**
             * Define el valor de la propiedad remolques.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.Autotransporte.Remolques }
             *     
             */
            public void setRemolques(CartaPorte.Mercancias.Autotransporte.Remolques value) {
                this.remolques = value;
            }

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="ConfigVehicular" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigAutotransporte" /&gt;
             *       &lt;attribute name="PlacaVM" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="AnioModeloVM" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class IdentificacionVehicular {

                @XmlAttribute(name = "ConfigVehicular", required = true)
                protected String configVehicular;
                @XmlAttribute(name = "PlacaVM", required = true)
                protected String placaVM;
                @XmlAttribute(name = "AnioModeloVM", required = true)
                protected int anioModeloVM;

                /**
                 * Obtiene el valor de la propiedad configVehicular.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfigVehicular() {
                    return configVehicular;
                }

                /**
                 * Define el valor de la propiedad configVehicular.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfigVehicular(String value) {
                    this.configVehicular = value;
                }

                /**
                 * Obtiene el valor de la propiedad placaVM.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlacaVM() {
                    return placaVM;
                }

                /**
                 * Define el valor de la propiedad placaVM.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlacaVM(String value) {
                    this.placaVM = value;
                }

                /**
                 * Obtiene el valor de la propiedad anioModeloVM.
                 * 
                 */
                public int getAnioModeloVM() {
                    return anioModeloVM;
                }

                /**
                 * Define el valor de la propiedad anioModeloVM.
                 * 
                 */
                public void setAnioModeloVM(int value) {
                    this.anioModeloVM = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Remolque" maxOccurs="2"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="SubTipoRem" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_SubTipoRem" /&gt;
             *                 &lt;attribute name="Placa" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;whiteSpace value="collapse"/&gt;
             *                       &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "remolque"
            })
            public static class Remolques {

                @XmlElement(name = "Remolque", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
                protected List<CartaPorte.Mercancias.Autotransporte.Remolques.Remolque> remolque;

                /**
                 * Gets the value of the remolque property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remolque property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemolque().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CartaPorte.Mercancias.Autotransporte.Remolques.Remolque }
                 * 
                 * 
                 */
                public List<CartaPorte.Mercancias.Autotransporte.Remolques.Remolque> getRemolque() {
                    if (remolque == null) {
                        remolque = new ArrayList<CartaPorte.Mercancias.Autotransporte.Remolques.Remolque>();
                    }
                    return this.remolque;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="SubTipoRem" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_SubTipoRem" /&gt;
                 *       &lt;attribute name="Placa" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;whiteSpace value="collapse"/&gt;
                 *             &lt;pattern value="[^(?!.*\s)-]{5,7}"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Remolque {

                    @XmlAttribute(name = "SubTipoRem", required = true)
                    protected String subTipoRem;
                    @XmlAttribute(name = "Placa", required = true)
                    protected String placa;

                    /**
                     * Obtiene el valor de la propiedad subTipoRem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSubTipoRem() {
                        return subTipoRem;
                    }

                    /**
                     * Define el valor de la propiedad subTipoRem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSubTipoRem(String value) {
                        this.subTipoRem = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad placa.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPlaca() {
                        return placa;
                    }

                    /**
                     * Define el valor de la propiedad placa.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPlaca(String value) {
                        this.placa = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="AseguraRespCivil" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="50"/&gt;
             *             &lt;pattern value="[^|]{3,50}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PolizaRespCivil" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="30"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{3,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="AseguraMedAmbiente"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="50"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{3,50}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PolizaMedAmbiente"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="30"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{3,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="AseguraCarga"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="50"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{3,50}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PolizaCarga"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="3"/&gt;
             *             &lt;maxLength value="30"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{3,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PrimaSeguro" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Seguros {

                @XmlAttribute(name = "AseguraRespCivil", required = true)
                protected String aseguraRespCivil;
                @XmlAttribute(name = "PolizaRespCivil", required = true)
                protected String polizaRespCivil;
                @XmlAttribute(name = "AseguraMedAmbiente")
                protected String aseguraMedAmbiente;
                @XmlAttribute(name = "PolizaMedAmbiente")
                protected String polizaMedAmbiente;
                @XmlAttribute(name = "AseguraCarga")
                protected String aseguraCarga;
                @XmlAttribute(name = "PolizaCarga")
                protected String polizaCarga;
                @XmlAttribute(name = "PrimaSeguro")
                protected BigDecimal primaSeguro;

                /**
                 * Obtiene el valor de la propiedad aseguraRespCivil.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAseguraRespCivil() {
                    return aseguraRespCivil;
                }

                /**
                 * Define el valor de la propiedad aseguraRespCivil.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAseguraRespCivil(String value) {
                    this.aseguraRespCivil = value;
                }

                /**
                 * Obtiene el valor de la propiedad polizaRespCivil.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolizaRespCivil() {
                    return polizaRespCivil;
                }

                /**
                 * Define el valor de la propiedad polizaRespCivil.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolizaRespCivil(String value) {
                    this.polizaRespCivil = value;
                }

                /**
                 * Obtiene el valor de la propiedad aseguraMedAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAseguraMedAmbiente() {
                    return aseguraMedAmbiente;
                }

                /**
                 * Define el valor de la propiedad aseguraMedAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAseguraMedAmbiente(String value) {
                    this.aseguraMedAmbiente = value;
                }

                /**
                 * Obtiene el valor de la propiedad polizaMedAmbiente.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolizaMedAmbiente() {
                    return polizaMedAmbiente;
                }

                /**
                 * Define el valor de la propiedad polizaMedAmbiente.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolizaMedAmbiente(String value) {
                    this.polizaMedAmbiente = value;
                }

                /**
                 * Obtiene el valor de la propiedad aseguraCarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAseguraCarga() {
                    return aseguraCarga;
                }

                /**
                 * Define el valor de la propiedad aseguraCarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAseguraCarga(String value) {
                    this.aseguraCarga = value;
                }

                /**
                 * Obtiene el valor de la propiedad polizaCarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPolizaCarga() {
                    return polizaCarga;
                }

                /**
                 * Define el valor de la propiedad polizaCarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPolizaCarga(String value) {
                    this.polizaCarga = value;
                }

                /**
                 * Obtiene el valor de la propiedad primaSeguro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPrimaSeguro() {
                    return primaSeguro;
                }

                /**
                 * Define el valor de la propiedad primaSeguro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPrimaSeguro(BigDecimal value) {
                    this.primaSeguro = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Pedimentos" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Pedimento" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;length value="21"/&gt;
         *                       &lt;pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GuiasIdentificacion" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="NumeroGuiaIdentificacion" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{10,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="DescripGuiaIdentificacion" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="1000"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{1,1000}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PesoGuiaIdentificacion" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;minInclusive value="0.001"/&gt;
         *                       &lt;fractionDigits value="3"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CantidadTransporta" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Cantidad" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="6"/&gt;
         *                       &lt;minInclusive value="0.000001"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="IDOrigen" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="OR[0-9]{6}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="IDDestino" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="DE[0-9]{6}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="CvesTransporte" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CveTransporte" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DetalleMercancia" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="UnidadPesoMerc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
         *                 &lt;attribute name="PesoBruto" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="3"/&gt;
         *                       &lt;minInclusive value="0.001"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PesoNeto" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="3"/&gt;
         *                       &lt;minInclusive value="0.001"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="PesoTara" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="3"/&gt;
         *                       &lt;minInclusive value="0.001"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="NumPiezas"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                       &lt;minInclusive value="1"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="BienesTransp" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveProdServCP" /&gt;
         *       &lt;attribute name="ClaveSTCC"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="7"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[0-9|]{6,7}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Descripcion" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="1000"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,1000}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Cantidad" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="6"/&gt;
         *             &lt;minInclusive value="0.000001"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ClaveUnidad" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_ClaveUnidad" /&gt;
         *       &lt;attribute name="Unidad"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="20"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,20}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Dimensiones"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="([0-9]{1,3}[/]){2}([0-9]{1,3})(cm|plg)"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="MaterialPeligroso"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;enumeration value="Sí"/&gt;
         *             &lt;enumeration value="No"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="CveMaterialPeligroso" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_MaterialPeligroso" /&gt;
         *       &lt;attribute name="Embalaje" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEmbalaje" /&gt;
         *       &lt;attribute name="DescripEmbalaje"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="100"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,100}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PesoEnKg" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;minInclusive value="0.001"/&gt;
         *             &lt;fractionDigits value="3"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ValorMercancia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Importe" /&gt;
         *       &lt;attribute name="Moneda" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Moneda" /&gt;
         *       &lt;attribute name="FraccionArancelaria" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/ComExt}c_FraccionArancelaria" /&gt;
         *       &lt;attribute name="UUIDComercioExt"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;pattern value="[a-f0-9A-F]{8}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{4}-[a-f0-9A-F]{12}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pedimentos",
            "guiasIdentificacion",
            "cantidadTransporta",
            "detalleMercancia"
        })
        public static class Mercancia {

            @XmlElement(name = "Pedimentos", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected List<CartaPorte.Mercancias.Mercancia.Pedimentos> pedimentos;
            @XmlElement(name = "GuiasIdentificacion", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected List<CartaPorte.Mercancias.Mercancia.GuiasIdentificacion> guiasIdentificacion;
            @XmlElement(name = "CantidadTransporta", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected List<CartaPorte.Mercancias.Mercancia.CantidadTransporta> cantidadTransporta;
            @XmlElement(name = "DetalleMercancia", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected CartaPorte.Mercancias.Mercancia.DetalleMercancia detalleMercancia;
            @XmlAttribute(name = "BienesTransp", required = true)
            protected String bienesTransp;
            @XmlAttribute(name = "ClaveSTCC")
            protected String claveSTCC;
            @XmlAttribute(name = "Descripcion", required = true)
            protected String descripcion;
            @XmlAttribute(name = "Cantidad", required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(name = "ClaveUnidad", required = true)
            protected String claveUnidad;
            @XmlAttribute(name = "Unidad")
            protected String unidad;
            @XmlAttribute(name = "Dimensiones")
            protected String dimensiones;
            @XmlAttribute(name = "MaterialPeligroso")
            protected String materialPeligroso;
            @XmlAttribute(name = "CveMaterialPeligroso")
            protected String cveMaterialPeligroso;
            @XmlAttribute(name = "Embalaje")
            protected String embalaje;
            @XmlAttribute(name = "DescripEmbalaje")
            protected String descripEmbalaje;
            @XmlAttribute(name = "PesoEnKg", required = true)
            protected BigDecimal pesoEnKg;
            @XmlAttribute(name = "ValorMercancia")
            protected BigDecimal valorMercancia;
            @XmlAttribute(name = "Moneda")
            protected String moneda;
            @XmlAttribute(name = "FraccionArancelaria")
            protected String fraccionArancelaria;
            @XmlAttribute(name = "UUIDComercioExt")
            protected String uuidComercioExt;

            /**
             * Gets the value of the pedimentos property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pedimentos property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPedimentos().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.Mercancia.Pedimentos }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.Mercancia.Pedimentos> getPedimentos() {
                if (pedimentos == null) {
                    pedimentos = new ArrayList<CartaPorte.Mercancias.Mercancia.Pedimentos>();
                }
                return this.pedimentos;
            }

            /**
             * Gets the value of the guiasIdentificacion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the guiasIdentificacion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGuiasIdentificacion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.Mercancia.GuiasIdentificacion }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.Mercancia.GuiasIdentificacion> getGuiasIdentificacion() {
                if (guiasIdentificacion == null) {
                    guiasIdentificacion = new ArrayList<CartaPorte.Mercancias.Mercancia.GuiasIdentificacion>();
                }
                return this.guiasIdentificacion;
            }

            /**
             * Gets the value of the cantidadTransporta property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cantidadTransporta property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCantidadTransporta().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.Mercancia.CantidadTransporta }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.Mercancia.CantidadTransporta> getCantidadTransporta() {
                if (cantidadTransporta == null) {
                    cantidadTransporta = new ArrayList<CartaPorte.Mercancias.Mercancia.CantidadTransporta>();
                }
                return this.cantidadTransporta;
            }

            /**
             * Obtiene el valor de la propiedad detalleMercancia.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Mercancias.Mercancia.DetalleMercancia }
             *     
             */
            public CartaPorte.Mercancias.Mercancia.DetalleMercancia getDetalleMercancia() {
                return detalleMercancia;
            }

            /**
             * Define el valor de la propiedad detalleMercancia.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Mercancias.Mercancia.DetalleMercancia }
             *     
             */
            public void setDetalleMercancia(CartaPorte.Mercancias.Mercancia.DetalleMercancia value) {
                this.detalleMercancia = value;
            }

            /**
             * Obtiene el valor de la propiedad bienesTransp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBienesTransp() {
                return bienesTransp;
            }

            /**
             * Define el valor de la propiedad bienesTransp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBienesTransp(String value) {
                this.bienesTransp = value;
            }

            /**
             * Obtiene el valor de la propiedad claveSTCC.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaveSTCC() {
                return claveSTCC;
            }

            /**
             * Define el valor de la propiedad claveSTCC.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaveSTCC(String value) {
                this.claveSTCC = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad claveUnidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaveUnidad() {
                return claveUnidad;
            }

            /**
             * Define el valor de la propiedad claveUnidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaveUnidad(String value) {
                this.claveUnidad = value;
            }

            /**
             * Obtiene el valor de la propiedad unidad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidad(String value) {
                this.unidad = value;
            }

            /**
             * Obtiene el valor de la propiedad dimensiones.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDimensiones() {
                return dimensiones;
            }

            /**
             * Define el valor de la propiedad dimensiones.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDimensiones(String value) {
                this.dimensiones = value;
            }

            /**
             * Obtiene el valor de la propiedad materialPeligroso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaterialPeligroso() {
                return materialPeligroso;
            }

            /**
             * Define el valor de la propiedad materialPeligroso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaterialPeligroso(String value) {
                this.materialPeligroso = value;
            }

            /**
             * Obtiene el valor de la propiedad cveMaterialPeligroso.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCveMaterialPeligroso() {
                return cveMaterialPeligroso;
            }

            /**
             * Define el valor de la propiedad cveMaterialPeligroso.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCveMaterialPeligroso(String value) {
                this.cveMaterialPeligroso = value;
            }

            /**
             * Obtiene el valor de la propiedad embalaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmbalaje() {
                return embalaje;
            }

            /**
             * Define el valor de la propiedad embalaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmbalaje(String value) {
                this.embalaje = value;
            }

            /**
             * Obtiene el valor de la propiedad descripEmbalaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripEmbalaje() {
                return descripEmbalaje;
            }

            /**
             * Define el valor de la propiedad descripEmbalaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripEmbalaje(String value) {
                this.descripEmbalaje = value;
            }

            /**
             * Obtiene el valor de la propiedad pesoEnKg.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPesoEnKg() {
                return pesoEnKg;
            }

            /**
             * Define el valor de la propiedad pesoEnKg.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPesoEnKg(BigDecimal value) {
                this.pesoEnKg = value;
            }

            /**
             * Obtiene el valor de la propiedad valorMercancia.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorMercancia() {
                return valorMercancia;
            }

            /**
             * Define el valor de la propiedad valorMercancia.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorMercancia(BigDecimal value) {
                this.valorMercancia = value;
            }

            /**
             * Obtiene el valor de la propiedad moneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneda() {
                return moneda;
            }

            /**
             * Define el valor de la propiedad moneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoneda(String value) {
                this.moneda = value;
            }

            /**
             * Obtiene el valor de la propiedad fraccionArancelaria.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFraccionArancelaria() {
                return fraccionArancelaria;
            }

            /**
             * Define el valor de la propiedad fraccionArancelaria.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFraccionArancelaria(String value) {
                this.fraccionArancelaria = value;
            }

            /**
             * Obtiene el valor de la propiedad uuidComercioExt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUUIDComercioExt() {
                return uuidComercioExt;
            }

            /**
             * Define el valor de la propiedad uuidComercioExt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUUIDComercioExt(String value) {
                this.uuidComercioExt = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Cantidad" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="6"/&gt;
             *             &lt;minInclusive value="0.000001"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="IDOrigen" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="OR[0-9]{6}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="IDDestino" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="DE[0-9]{6}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="CvesTransporte" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CveTransporte" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CantidadTransporta {

                @XmlAttribute(name = "Cantidad", required = true)
                protected BigDecimal cantidad;
                @XmlAttribute(name = "IDOrigen", required = true)
                protected String idOrigen;
                @XmlAttribute(name = "IDDestino", required = true)
                protected String idDestino;
                @XmlAttribute(name = "CvesTransporte")
                protected String cvesTransporte;

                /**
                 * Obtiene el valor de la propiedad cantidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCantidad() {
                    return cantidad;
                }

                /**
                 * Define el valor de la propiedad cantidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCantidad(BigDecimal value) {
                    this.cantidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad idOrigen.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIDOrigen() {
                    return idOrigen;
                }

                /**
                 * Define el valor de la propiedad idOrigen.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIDOrigen(String value) {
                    this.idOrigen = value;
                }

                /**
                 * Obtiene el valor de la propiedad idDestino.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIDDestino() {
                    return idDestino;
                }

                /**
                 * Define el valor de la propiedad idDestino.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIDDestino(String value) {
                    this.idDestino = value;
                }

                /**
                 * Obtiene el valor de la propiedad cvesTransporte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCvesTransporte() {
                    return cvesTransporte;
                }

                /**
                 * Define el valor de la propiedad cvesTransporte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCvesTransporte(String value) {
                    this.cvesTransporte = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="UnidadPesoMerc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveUnidadPeso" /&gt;
             *       &lt;attribute name="PesoBruto" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="3"/&gt;
             *             &lt;minInclusive value="0.001"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PesoNeto" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="3"/&gt;
             *             &lt;minInclusive value="0.001"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PesoTara" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="3"/&gt;
             *             &lt;minInclusive value="0.001"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="NumPiezas"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *             &lt;minInclusive value="1"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DetalleMercancia {

                @XmlAttribute(name = "UnidadPesoMerc", required = true)
                protected String unidadPesoMerc;
                @XmlAttribute(name = "PesoBruto", required = true)
                protected BigDecimal pesoBruto;
                @XmlAttribute(name = "PesoNeto", required = true)
                protected BigDecimal pesoNeto;
                @XmlAttribute(name = "PesoTara", required = true)
                protected BigDecimal pesoTara;
                @XmlAttribute(name = "NumPiezas")
                protected Integer numPiezas;

                /**
                 * Obtiene el valor de la propiedad unidadPesoMerc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnidadPesoMerc() {
                    return unidadPesoMerc;
                }

                /**
                 * Define el valor de la propiedad unidadPesoMerc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnidadPesoMerc(String value) {
                    this.unidadPesoMerc = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoBruto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoBruto() {
                    return pesoBruto;
                }

                /**
                 * Define el valor de la propiedad pesoBruto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoBruto(BigDecimal value) {
                    this.pesoBruto = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoNeto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoNeto() {
                    return pesoNeto;
                }

                /**
                 * Define el valor de la propiedad pesoNeto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoNeto(BigDecimal value) {
                    this.pesoNeto = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoTara.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoTara() {
                    return pesoTara;
                }

                /**
                 * Define el valor de la propiedad pesoTara.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoTara(BigDecimal value) {
                    this.pesoTara = value;
                }

                /**
                 * Obtiene el valor de la propiedad numPiezas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumPiezas() {
                    return numPiezas;
                }

                /**
                 * Define el valor de la propiedad numPiezas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumPiezas(Integer value) {
                    this.numPiezas = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="NumeroGuiaIdentificacion" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{10,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="DescripGuiaIdentificacion" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="1000"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{1,1000}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="PesoGuiaIdentificacion" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;minInclusive value="0.001"/&gt;
             *             &lt;fractionDigits value="3"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class GuiasIdentificacion {

                @XmlAttribute(name = "NumeroGuiaIdentificacion", required = true)
                protected String numeroGuiaIdentificacion;
                @XmlAttribute(name = "DescripGuiaIdentificacion", required = true)
                protected String descripGuiaIdentificacion;
                @XmlAttribute(name = "PesoGuiaIdentificacion", required = true)
                protected BigDecimal pesoGuiaIdentificacion;

                /**
                 * Obtiene el valor de la propiedad numeroGuiaIdentificacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroGuiaIdentificacion() {
                    return numeroGuiaIdentificacion;
                }

                /**
                 * Define el valor de la propiedad numeroGuiaIdentificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroGuiaIdentificacion(String value) {
                    this.numeroGuiaIdentificacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad descripGuiaIdentificacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescripGuiaIdentificacion() {
                    return descripGuiaIdentificacion;
                }

                /**
                 * Define el valor de la propiedad descripGuiaIdentificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescripGuiaIdentificacion(String value) {
                    this.descripGuiaIdentificacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoGuiaIdentificacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoGuiaIdentificacion() {
                    return pesoGuiaIdentificacion;
                }

                /**
                 * Define el valor de la propiedad pesoGuiaIdentificacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoGuiaIdentificacion(BigDecimal value) {
                    this.pesoGuiaIdentificacion = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Pedimento" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;length value="21"/&gt;
             *             &lt;pattern value="[0-9]{2}  [0-9]{2}  [0-9]{4}  [0-9]{7}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Pedimentos {

                @XmlAttribute(name = "Pedimento", required = true)
                protected String pedimento;

                /**
                 * Obtiene el valor de la propiedad pedimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPedimento() {
                    return pedimento;
                }

                /**
                 * Define el valor de la propiedad pedimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPedimento(String value) {
                    this.pedimento = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="PermSCT" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
         *       &lt;attribute name="NumPermisoSCT" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="MatriculaAeronave"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="5"/&gt;
         *             &lt;maxLength value="10"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="([A-Z]|[0-9]|-|){5,10}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NombreAseg"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumPolizaSeguro"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumeroGuia" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="12"/&gt;
         *             &lt;maxLength value="15"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{12,15}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="LugarContrato" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *       &lt;attribute name="CodigoTransportista" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_CodigoTransporteAereo" /&gt;
         *       &lt;attribute name="RFCEmbarcador" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
         *       &lt;attribute name="NumRegIdTribEmbarc"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="40"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{6,40}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ResidenciaFiscalEmbarc" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *       &lt;attribute name="NombreEmbarcador"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="254"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,254}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TransporteAereo {

            @XmlAttribute(name = "PermSCT", required = true)
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT", required = true)
            protected String numPermisoSCT;
            @XmlAttribute(name = "MatriculaAeronave")
            protected String matriculaAeronave;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;
            @XmlAttribute(name = "NumeroGuia", required = true)
            protected String numeroGuia;
            @XmlAttribute(name = "LugarContrato")
            protected String lugarContrato;
            @XmlAttribute(name = "CodigoTransportista", required = true)
            protected String codigoTransportista;
            @XmlAttribute(name = "RFCEmbarcador")
            protected String rfcEmbarcador;
            @XmlAttribute(name = "NumRegIdTribEmbarc")
            protected String numRegIdTribEmbarc;
            @XmlAttribute(name = "ResidenciaFiscalEmbarc")
            protected String residenciaFiscalEmbarc;
            @XmlAttribute(name = "NombreEmbarcador")
            protected String nombreEmbarcador;

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad matriculaAeronave.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatriculaAeronave() {
                return matriculaAeronave;
            }

            /**
             * Define el valor de la propiedad matriculaAeronave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatriculaAeronave(String value) {
                this.matriculaAeronave = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroGuia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroGuia() {
                return numeroGuia;
            }

            /**
             * Define el valor de la propiedad numeroGuia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroGuia(String value) {
                this.numeroGuia = value;
            }

            /**
             * Obtiene el valor de la propiedad lugarContrato.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLugarContrato() {
                return lugarContrato;
            }

            /**
             * Define el valor de la propiedad lugarContrato.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLugarContrato(String value) {
                this.lugarContrato = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoTransportista() {
                return codigoTransportista;
            }

            /**
             * Define el valor de la propiedad codigoTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoTransportista(String value) {
                this.codigoTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcEmbarcador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCEmbarcador() {
                return rfcEmbarcador;
            }

            /**
             * Define el valor de la propiedad rfcEmbarcador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCEmbarcador(String value) {
                this.rfcEmbarcador = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTribEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTribEmbarc() {
                return numRegIdTribEmbarc;
            }

            /**
             * Define el valor de la propiedad numRegIdTribEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTribEmbarc(String value) {
                this.numRegIdTribEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscalEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscalEmbarc() {
                return residenciaFiscalEmbarc;
            }

            /**
             * Define el valor de la propiedad residenciaFiscalEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscalEmbarc(String value) {
                this.residenciaFiscalEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEmbarcador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEmbarcador() {
                return nombreEmbarcador;
            }

            /**
             * Define el valor de la propiedad nombreEmbarcador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEmbarcador(String value) {
                this.nombreEmbarcador = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DerechosDePaso" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="TipoDerechoDePaso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_DerechosDePaso" /&gt;
         *                 &lt;attribute name="KilometrajePagado" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="2"/&gt;
         *                       &lt;minInclusive value="0.01"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Carro" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Contenedor" /&gt;
         *                           &lt;attribute name="PesoContenedorVacio" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                 &lt;fractionDigits value="3"/&gt;
         *                                 &lt;minInclusive value="0.001"/&gt;
         *                                 &lt;whiteSpace value="collapse"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                           &lt;attribute name="PesoNetoMercancia" use="required"&gt;
         *                             &lt;simpleType&gt;
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                 &lt;fractionDigits value="3"/&gt;
         *                                 &lt;minInclusive value="0.001"/&gt;
         *                                 &lt;whiteSpace value="collapse"/&gt;
         *                               &lt;/restriction&gt;
         *                             &lt;/simpleType&gt;
         *                           &lt;/attribute&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="TipoCarro" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoCarro" /&gt;
         *                 &lt;attribute name="MatriculaCarro" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="6"/&gt;
         *                       &lt;maxLength value="15"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{6,15}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="GuiaCarro" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="15"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{1,15}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="ToneladasNetasCarro" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                       &lt;fractionDigits value="3"/&gt;
         *                       &lt;minInclusive value="0.001"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TipoDeServicio" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeServicio" /&gt;
         *       &lt;attribute name="TipoDeTrafico" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoDeTrafico" /&gt;
         *       &lt;attribute name="NombreAseg"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumPolizaSeguro"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "derechosDePaso",
            "carro"
        })
        public static class TransporteFerroviario {

            @XmlElement(name = "DerechosDePaso", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected List<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso> derechosDePaso;
            @XmlElement(name = "Carro", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
            protected List<CartaPorte.Mercancias.TransporteFerroviario.Carro> carro;
            @XmlAttribute(name = "TipoDeServicio", required = true)
            protected String tipoDeServicio;
            @XmlAttribute(name = "TipoDeTrafico", required = true)
            protected String tipoDeTrafico;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;

            /**
             * Gets the value of the derechosDePaso property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the derechosDePaso property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDerechosDePaso().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso> getDerechosDePaso() {
                if (derechosDePaso == null) {
                    derechosDePaso = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.DerechosDePaso>();
                }
                return this.derechosDePaso;
            }

            /**
             * Gets the value of the carro property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the carro property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCarro().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteFerroviario.Carro }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteFerroviario.Carro> getCarro() {
                if (carro == null) {
                    carro = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.Carro>();
                }
                return this.carro;
            }

            /**
             * Obtiene el valor de la propiedad tipoDeServicio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDeServicio() {
                return tipoDeServicio;
            }

            /**
             * Define el valor de la propiedad tipoDeServicio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDeServicio(String value) {
                this.tipoDeServicio = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoDeTrafico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDeTrafico() {
                return tipoDeTrafico;
            }

            /**
             * Define el valor de la propiedad tipoDeTrafico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDeTrafico(String value) {
                this.tipoDeTrafico = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Contenedor" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Contenedor" /&gt;
             *                 &lt;attribute name="PesoContenedorVacio" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                       &lt;fractionDigits value="3"/&gt;
             *                       &lt;minInclusive value="0.001"/&gt;
             *                       &lt;whiteSpace value="collapse"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *                 &lt;attribute name="PesoNetoMercancia" use="required"&gt;
             *                   &lt;simpleType&gt;
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                       &lt;fractionDigits value="3"/&gt;
             *                       &lt;minInclusive value="0.001"/&gt;
             *                       &lt;whiteSpace value="collapse"/&gt;
             *                     &lt;/restriction&gt;
             *                   &lt;/simpleType&gt;
             *                 &lt;/attribute&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="TipoCarro" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoCarro" /&gt;
             *       &lt;attribute name="MatriculaCarro" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="6"/&gt;
             *             &lt;maxLength value="15"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{6,15}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="GuiaCarro" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="15"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{1,15}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="ToneladasNetasCarro" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="3"/&gt;
             *             &lt;minInclusive value="0.001"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contenedor"
            })
            public static class Carro {

                @XmlElement(name = "Contenedor", namespace = "http://www.sat.gob.mx/CartaPorte20")
                protected List<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor> contenedor;
                @XmlAttribute(name = "TipoCarro", required = true)
                protected String tipoCarro;
                @XmlAttribute(name = "MatriculaCarro", required = true)
                protected String matriculaCarro;
                @XmlAttribute(name = "GuiaCarro", required = true)
                protected String guiaCarro;
                @XmlAttribute(name = "ToneladasNetasCarro", required = true)
                protected BigDecimal toneladasNetasCarro;

                /**
                 * Gets the value of the contenedor property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contenedor property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContenedor().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor }
                 * 
                 * 
                 */
                public List<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor> getContenedor() {
                    if (contenedor == null) {
                        contenedor = new ArrayList<CartaPorte.Mercancias.TransporteFerroviario.Carro.Contenedor>();
                    }
                    return this.contenedor;
                }

                /**
                 * Obtiene el valor de la propiedad tipoCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoCarro() {
                    return tipoCarro;
                }

                /**
                 * Define el valor de la propiedad tipoCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoCarro(String value) {
                    this.tipoCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad matriculaCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatriculaCarro() {
                    return matriculaCarro;
                }

                /**
                 * Define el valor de la propiedad matriculaCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatriculaCarro(String value) {
                    this.matriculaCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad guiaCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuiaCarro() {
                    return guiaCarro;
                }

                /**
                 * Define el valor de la propiedad guiaCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuiaCarro(String value) {
                    this.guiaCarro = value;
                }

                /**
                 * Obtiene el valor de la propiedad toneladasNetasCarro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getToneladasNetasCarro() {
                    return toneladasNetasCarro;
                }

                /**
                 * Define el valor de la propiedad toneladasNetasCarro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setToneladasNetasCarro(BigDecimal value) {
                    this.toneladasNetasCarro = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Contenedor" /&gt;
                 *       &lt;attribute name="PesoContenedorVacio" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *             &lt;fractionDigits value="3"/&gt;
                 *             &lt;minInclusive value="0.001"/&gt;
                 *             &lt;whiteSpace value="collapse"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *       &lt;attribute name="PesoNetoMercancia" use="required"&gt;
                 *         &lt;simpleType&gt;
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *             &lt;fractionDigits value="3"/&gt;
                 *             &lt;minInclusive value="0.001"/&gt;
                 *             &lt;whiteSpace value="collapse"/&gt;
                 *           &lt;/restriction&gt;
                 *         &lt;/simpleType&gt;
                 *       &lt;/attribute&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Contenedor {

                    @XmlAttribute(name = "TipoContenedor", required = true)
                    protected String tipoContenedor;
                    @XmlAttribute(name = "PesoContenedorVacio", required = true)
                    protected BigDecimal pesoContenedorVacio;
                    @XmlAttribute(name = "PesoNetoMercancia", required = true)
                    protected BigDecimal pesoNetoMercancia;

                    /**
                     * Obtiene el valor de la propiedad tipoContenedor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoContenedor() {
                        return tipoContenedor;
                    }

                    /**
                     * Define el valor de la propiedad tipoContenedor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoContenedor(String value) {
                        this.tipoContenedor = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pesoContenedorVacio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPesoContenedorVacio() {
                        return pesoContenedorVacio;
                    }

                    /**
                     * Define el valor de la propiedad pesoContenedorVacio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPesoContenedorVacio(BigDecimal value) {
                        this.pesoContenedorVacio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad pesoNetoMercancia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPesoNetoMercancia() {
                        return pesoNetoMercancia;
                    }

                    /**
                     * Define el valor de la propiedad pesoNetoMercancia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPesoNetoMercancia(BigDecimal value) {
                        this.pesoNetoMercancia = value;
                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="TipoDerechoDePaso" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_DerechosDePaso" /&gt;
             *       &lt;attribute name="KilometrajePagado" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *             &lt;fractionDigits value="2"/&gt;
             *             &lt;minInclusive value="0.01"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DerechosDePaso {

                @XmlAttribute(name = "TipoDerechoDePaso", required = true)
                protected String tipoDerechoDePaso;
                @XmlAttribute(name = "KilometrajePagado", required = true)
                protected BigDecimal kilometrajePagado;

                /**
                 * Obtiene el valor de la propiedad tipoDerechoDePaso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoDerechoDePaso() {
                    return tipoDerechoDePaso;
                }

                /**
                 * Define el valor de la propiedad tipoDerechoDePaso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoDerechoDePaso(String value) {
                    this.tipoDerechoDePaso = value;
                }

                /**
                 * Obtiene el valor de la propiedad kilometrajePagado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getKilometrajePagado() {
                    return kilometrajePagado;
                }

                /**
                 * Define el valor de la propiedad kilometrajePagado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setKilometrajePagado(BigDecimal value) {
                    this.kilometrajePagado = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Contenedor" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="MatriculaContenedor" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="11"/&gt;
         *                       &lt;maxLength value="15"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{11,15}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ContenedorMaritimo" /&gt;
         *                 &lt;attribute name="NumPrecinto"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="5"/&gt;
         *                       &lt;maxLength value="20"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{5,20}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="PermSCT" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoPermiso" /&gt;
         *       &lt;attribute name="NumPermisoSCT"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NombreAseg"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumPolizaSeguro"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="TipoEmbarcacion" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ConfigMaritima" /&gt;
         *       &lt;attribute name="Matricula" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="7"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{7,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumeroOMI" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="IMO[0-9]{7}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="AnioEmbarcacion"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="(19[0-9]{2}|20[0-9]{2})"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NombreEmbarc"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;pattern value="[^|]{1,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NacionalidadEmbarc" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *       &lt;attribute name="UnidadesDeArqBruto" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="3"/&gt;
         *             &lt;minInclusive value="0.001"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="TipoCarga" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ClaveTipoCarga" /&gt;
         *       &lt;attribute name="NumCertITC" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="20"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,20}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Eslora"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="2"/&gt;
         *             &lt;minInclusive value="0.01"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Manga"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="2"/&gt;
         *             &lt;minInclusive value="0.01"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Calado"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;fractionDigits value="2"/&gt;
         *             &lt;minInclusive value="0.01"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="LineaNaviera"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="3"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{3,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NombreAgenteNaviero" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="100"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,100}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumAutorizacionNaviero" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_NumAutorizacionNaviero" /&gt;
         *       &lt;attribute name="NumViaje"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumConocEmbarc"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="30"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,30}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contenedor"
        })
        public static class TransporteMaritimo {

            @XmlElement(name = "Contenedor", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
            protected List<CartaPorte.Mercancias.TransporteMaritimo.Contenedor> contenedor;
            @XmlAttribute(name = "PermSCT")
            protected String permSCT;
            @XmlAttribute(name = "NumPermisoSCT")
            protected String numPermisoSCT;
            @XmlAttribute(name = "NombreAseg")
            protected String nombreAseg;
            @XmlAttribute(name = "NumPolizaSeguro")
            protected String numPolizaSeguro;
            @XmlAttribute(name = "TipoEmbarcacion", required = true)
            protected String tipoEmbarcacion;
            @XmlAttribute(name = "Matricula", required = true)
            protected String matricula;
            @XmlAttribute(name = "NumeroOMI", required = true)
            protected String numeroOMI;
            @XmlAttribute(name = "AnioEmbarcacion")
            protected Integer anioEmbarcacion;
            @XmlAttribute(name = "NombreEmbarc")
            protected String nombreEmbarc;
            @XmlAttribute(name = "NacionalidadEmbarc", required = true)
            protected String nacionalidadEmbarc;
            @XmlAttribute(name = "UnidadesDeArqBruto", required = true)
            protected BigDecimal unidadesDeArqBruto;
            @XmlAttribute(name = "TipoCarga", required = true)
            protected String tipoCarga;
            @XmlAttribute(name = "NumCertITC", required = true)
            protected String numCertITC;
            @XmlAttribute(name = "Eslora")
            protected BigDecimal eslora;
            @XmlAttribute(name = "Manga")
            protected BigDecimal manga;
            @XmlAttribute(name = "Calado")
            protected BigDecimal calado;
            @XmlAttribute(name = "LineaNaviera")
            protected String lineaNaviera;
            @XmlAttribute(name = "NombreAgenteNaviero", required = true)
            protected String nombreAgenteNaviero;
            @XmlAttribute(name = "NumAutorizacionNaviero", required = true)
            protected String numAutorizacionNaviero;
            @XmlAttribute(name = "NumViaje")
            protected String numViaje;
            @XmlAttribute(name = "NumConocEmbarc")
            protected String numConocEmbarc;

            /**
             * Gets the value of the contenedor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contenedor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContenedor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CartaPorte.Mercancias.TransporteMaritimo.Contenedor }
             * 
             * 
             */
            public List<CartaPorte.Mercancias.TransporteMaritimo.Contenedor> getContenedor() {
                if (contenedor == null) {
                    contenedor = new ArrayList<CartaPorte.Mercancias.TransporteMaritimo.Contenedor>();
                }
                return this.contenedor;
            }

            /**
             * Obtiene el valor de la propiedad permSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermSCT() {
                return permSCT;
            }

            /**
             * Define el valor de la propiedad permSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermSCT(String value) {
                this.permSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad numPermisoSCT.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPermisoSCT() {
                return numPermisoSCT;
            }

            /**
             * Define el valor de la propiedad numPermisoSCT.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPermisoSCT(String value) {
                this.numPermisoSCT = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAseg.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAseg() {
                return nombreAseg;
            }

            /**
             * Define el valor de la propiedad nombreAseg.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAseg(String value) {
                this.nombreAseg = value;
            }

            /**
             * Obtiene el valor de la propiedad numPolizaSeguro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumPolizaSeguro() {
                return numPolizaSeguro;
            }

            /**
             * Define el valor de la propiedad numPolizaSeguro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumPolizaSeguro(String value) {
                this.numPolizaSeguro = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoEmbarcacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoEmbarcacion() {
                return tipoEmbarcacion;
            }

            /**
             * Define el valor de la propiedad tipoEmbarcacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoEmbarcacion(String value) {
                this.tipoEmbarcacion = value;
            }

            /**
             * Obtiene el valor de la propiedad matricula.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Define el valor de la propiedad matricula.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroOMI.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOMI() {
                return numeroOMI;
            }

            /**
             * Define el valor de la propiedad numeroOMI.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOMI(String value) {
                this.numeroOMI = value;
            }

            /**
             * Obtiene el valor de la propiedad anioEmbarcacion.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAnioEmbarcacion() {
                return anioEmbarcacion;
            }

            /**
             * Define el valor de la propiedad anioEmbarcacion.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAnioEmbarcacion(Integer value) {
                this.anioEmbarcacion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEmbarc() {
                return nombreEmbarc;
            }

            /**
             * Define el valor de la propiedad nombreEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEmbarc(String value) {
                this.nombreEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad nacionalidadEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNacionalidadEmbarc() {
                return nacionalidadEmbarc;
            }

            /**
             * Define el valor de la propiedad nacionalidadEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNacionalidadEmbarc(String value) {
                this.nacionalidadEmbarc = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadesDeArqBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUnidadesDeArqBruto() {
                return unidadesDeArqBruto;
            }

            /**
             * Define el valor de la propiedad unidadesDeArqBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUnidadesDeArqBruto(BigDecimal value) {
                this.unidadesDeArqBruto = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoCarga.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoCarga() {
                return tipoCarga;
            }

            /**
             * Define el valor de la propiedad tipoCarga.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoCarga(String value) {
                this.tipoCarga = value;
            }

            /**
             * Obtiene el valor de la propiedad numCertITC.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumCertITC() {
                return numCertITC;
            }

            /**
             * Define el valor de la propiedad numCertITC.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumCertITC(String value) {
                this.numCertITC = value;
            }

            /**
             * Obtiene el valor de la propiedad eslora.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEslora() {
                return eslora;
            }

            /**
             * Define el valor de la propiedad eslora.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEslora(BigDecimal value) {
                this.eslora = value;
            }

            /**
             * Obtiene el valor de la propiedad manga.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getManga() {
                return manga;
            }

            /**
             * Define el valor de la propiedad manga.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setManga(BigDecimal value) {
                this.manga = value;
            }

            /**
             * Obtiene el valor de la propiedad calado.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCalado() {
                return calado;
            }

            /**
             * Define el valor de la propiedad calado.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCalado(BigDecimal value) {
                this.calado = value;
            }

            /**
             * Obtiene el valor de la propiedad lineaNaviera.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineaNaviera() {
                return lineaNaviera;
            }

            /**
             * Define el valor de la propiedad lineaNaviera.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineaNaviera(String value) {
                this.lineaNaviera = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreAgenteNaviero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreAgenteNaviero() {
                return nombreAgenteNaviero;
            }

            /**
             * Define el valor de la propiedad nombreAgenteNaviero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreAgenteNaviero(String value) {
                this.nombreAgenteNaviero = value;
            }

            /**
             * Obtiene el valor de la propiedad numAutorizacionNaviero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumAutorizacionNaviero() {
                return numAutorizacionNaviero;
            }

            /**
             * Define el valor de la propiedad numAutorizacionNaviero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumAutorizacionNaviero(String value) {
                this.numAutorizacionNaviero = value;
            }

            /**
             * Obtiene el valor de la propiedad numViaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumViaje() {
                return numViaje;
            }

            /**
             * Define el valor de la propiedad numViaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumViaje(String value) {
                this.numViaje = value;
            }

            /**
             * Obtiene el valor de la propiedad numConocEmbarc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumConocEmbarc() {
                return numConocEmbarc;
            }

            /**
             * Define el valor de la propiedad numConocEmbarc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumConocEmbarc(String value) {
                this.numConocEmbarc = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="MatriculaContenedor" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="11"/&gt;
             *             &lt;maxLength value="15"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{11,15}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="TipoContenedor" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_ContenedorMaritimo" /&gt;
             *       &lt;attribute name="NumPrecinto"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="5"/&gt;
             *             &lt;maxLength value="20"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{5,20}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Contenedor {

                @XmlAttribute(name = "MatriculaContenedor", required = true)
                protected String matriculaContenedor;
                @XmlAttribute(name = "TipoContenedor", required = true)
                protected String tipoContenedor;
                @XmlAttribute(name = "NumPrecinto")
                protected String numPrecinto;

                /**
                 * Obtiene el valor de la propiedad matriculaContenedor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatriculaContenedor() {
                    return matriculaContenedor;
                }

                /**
                 * Define el valor de la propiedad matriculaContenedor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatriculaContenedor(String value) {
                    this.matriculaContenedor = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoContenedor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoContenedor() {
                    return tipoContenedor;
                }

                /**
                 * Define el valor de la propiedad tipoContenedor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoContenedor(String value) {
                    this.tipoContenedor = value;
                }

                /**
                 * Obtiene el valor de la propiedad numPrecinto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumPrecinto() {
                    return numPrecinto;
                }

                /**
                 * Define el valor de la propiedad numPrecinto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumPrecinto(String value) {
                    this.numPrecinto = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Ubicacion" maxOccurs="unbounded" minOccurs="2"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Domicilio" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
     *                           &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
     *                           &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
     *                           &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
     *                           &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
     *                           &lt;attribute name="Estado" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="30"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                                 &lt;pattern value="[^|]{1,30}"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *                           &lt;attribute name="CodigoPostal" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;minLength value="1"/&gt;
     *                                 &lt;maxLength value="12"/&gt;
     *                                 &lt;whiteSpace value="collapse"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TipoUbicacion" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;enumeration value="Origen"/&gt;
     *                       &lt;enumeration value="Destino"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="IDUbicacion"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="(OR|DE)[0-9]{6}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="RFCRemitenteDestinatario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
     *                 &lt;attribute name="NombreRemitenteDestinatario"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="254"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,254}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NumRegIdTrib"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="6"/&gt;
     *                       &lt;maxLength value="40"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{6,40}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ResidenciaFiscal" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
     *                 &lt;attribute name="NumEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Estaciones" /&gt;
     *                 &lt;attribute name="NombreEstacion"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;minLength value="1"/&gt;
     *                       &lt;maxLength value="50"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;pattern value="[^|]{1,50}"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="NavegacionTrafico"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                       &lt;enumeration value="Altura"/&gt;
     *                       &lt;enumeration value="Cabotaje"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="FechaHoraSalidaLlegada" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" /&gt;
     *                 &lt;attribute name="TipoEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEstacion" /&gt;
     *                 &lt;attribute name="DistanciaRecorrida"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                       &lt;minInclusive value="0.01"/&gt;
     *                       &lt;maxInclusive value="99999"/&gt;
     *                       &lt;whiteSpace value="collapse"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ubicacion"
    })
    public static class Ubicaciones {

        @XmlElement(name = "Ubicacion", namespace = "http://www.sat.gob.mx/CartaPorte20", required = true)
        protected List<CartaPorte.Ubicaciones.Ubicacion> ubicacion;

        /**
         * Gets the value of the ubicacion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ubicacion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUbicacion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartaPorte.Ubicaciones.Ubicacion }
         * 
         * 
         */
        public List<CartaPorte.Ubicaciones.Ubicacion> getUbicacion() {
            if (ubicacion == null) {
                ubicacion = new ArrayList<CartaPorte.Ubicaciones.Ubicacion>();
            }
            return this.ubicacion;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Domicilio" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
         *                 &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
         *                 &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
         *                 &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
         *                 &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
         *                 &lt;attribute name="Estado" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="30"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                       &lt;pattern value="[^|]{1,30}"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *                 &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *                 &lt;attribute name="CodigoPostal" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;minLength value="1"/&gt;
         *                       &lt;maxLength value="12"/&gt;
         *                       &lt;whiteSpace value="collapse"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="TipoUbicacion" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;enumeration value="Origen"/&gt;
         *             &lt;enumeration value="Destino"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="IDUbicacion"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="(OR|DE)[0-9]{6}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="RFCRemitenteDestinatario" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_RFC" /&gt;
         *       &lt;attribute name="NombreRemitenteDestinatario"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="254"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,254}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NumRegIdTrib"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="6"/&gt;
         *             &lt;maxLength value="40"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{6,40}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ResidenciaFiscal" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
         *       &lt;attribute name="NumEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_Estaciones" /&gt;
         *       &lt;attribute name="NombreEstacion"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;minLength value="1"/&gt;
         *             &lt;maxLength value="50"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;pattern value="[^|]{1,50}"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="NavegacionTrafico"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *             &lt;enumeration value="Altura"/&gt;
         *             &lt;enumeration value="Cabotaje"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="FechaHoraSalidaLlegada" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_FechaH" /&gt;
         *       &lt;attribute name="TipoEstacion" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte}c_TipoEstacion" /&gt;
         *       &lt;attribute name="DistanciaRecorrida"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *             &lt;minInclusive value="0.01"/&gt;
         *             &lt;maxInclusive value="99999"/&gt;
         *             &lt;whiteSpace value="collapse"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "domicilio"
        })
        public static class Ubicacion {

            @XmlElement(name = "Domicilio", namespace = "http://www.sat.gob.mx/CartaPorte20")
            protected CartaPorte.Ubicaciones.Ubicacion.Domicilio domicilio;
            @XmlAttribute(name = "TipoUbicacion", required = true)
            protected String tipoUbicacion;
            @XmlAttribute(name = "IDUbicacion")
            protected String idUbicacion;
            @XmlAttribute(name = "RFCRemitenteDestinatario", required = true)
            protected String rfcRemitenteDestinatario;
            @XmlAttribute(name = "NombreRemitenteDestinatario")
            protected String nombreRemitenteDestinatario;
            @XmlAttribute(name = "NumRegIdTrib")
            protected String numRegIdTrib;
            @XmlAttribute(name = "ResidenciaFiscal")
            protected String residenciaFiscal;
            @XmlAttribute(name = "NumEstacion")
            protected String numEstacion;
            @XmlAttribute(name = "NombreEstacion")
            protected String nombreEstacion;
            @XmlAttribute(name = "NavegacionTrafico")
            protected String navegacionTrafico;
            @XmlAttribute(name = "FechaHoraSalidaLlegada", required = true)
            protected XMLGregorianCalendar fechaHoraSalidaLlegada;
            @XmlAttribute(name = "TipoEstacion")
            protected String tipoEstacion;
            @XmlAttribute(name = "DistanciaRecorrida")
            protected BigDecimal distanciaRecorrida;

            /**
             * Obtiene el valor de la propiedad domicilio.
             * 
             * @return
             *     possible object is
             *     {@link CartaPorte.Ubicaciones.Ubicacion.Domicilio }
             *     
             */
            public CartaPorte.Ubicaciones.Ubicacion.Domicilio getDomicilio() {
                return domicilio;
            }

            /**
             * Define el valor de la propiedad domicilio.
             * 
             * @param value
             *     allowed object is
             *     {@link CartaPorte.Ubicaciones.Ubicacion.Domicilio }
             *     
             */
            public void setDomicilio(CartaPorte.Ubicaciones.Ubicacion.Domicilio value) {
                this.domicilio = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoUbicacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoUbicacion() {
                return tipoUbicacion;
            }

            /**
             * Define el valor de la propiedad tipoUbicacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoUbicacion(String value) {
                this.tipoUbicacion = value;
            }

            /**
             * Obtiene el valor de la propiedad idUbicacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDUbicacion() {
                return idUbicacion;
            }

            /**
             * Define el valor de la propiedad idUbicacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDUbicacion(String value) {
                this.idUbicacion = value;
            }

            /**
             * Obtiene el valor de la propiedad rfcRemitenteDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRFCRemitenteDestinatario() {
                return rfcRemitenteDestinatario;
            }

            /**
             * Define el valor de la propiedad rfcRemitenteDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRFCRemitenteDestinatario(String value) {
                this.rfcRemitenteDestinatario = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreRemitenteDestinatario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreRemitenteDestinatario() {
                return nombreRemitenteDestinatario;
            }

            /**
             * Define el valor de la propiedad nombreRemitenteDestinatario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreRemitenteDestinatario(String value) {
                this.nombreRemitenteDestinatario = value;
            }

            /**
             * Obtiene el valor de la propiedad numRegIdTrib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumRegIdTrib() {
                return numRegIdTrib;
            }

            /**
             * Define el valor de la propiedad numRegIdTrib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumRegIdTrib(String value) {
                this.numRegIdTrib = value;
            }

            /**
             * Obtiene el valor de la propiedad residenciaFiscal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidenciaFiscal() {
                return residenciaFiscal;
            }

            /**
             * Define el valor de la propiedad residenciaFiscal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidenciaFiscal(String value) {
                this.residenciaFiscal = value;
            }

            /**
             * Obtiene el valor de la propiedad numEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumEstacion() {
                return numEstacion;
            }

            /**
             * Define el valor de la propiedad numEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumEstacion(String value) {
                this.numEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreEstacion() {
                return nombreEstacion;
            }

            /**
             * Define el valor de la propiedad nombreEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreEstacion(String value) {
                this.nombreEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad navegacionTrafico.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNavegacionTrafico() {
                return navegacionTrafico;
            }

            /**
             * Define el valor de la propiedad navegacionTrafico.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNavegacionTrafico(String value) {
                this.navegacionTrafico = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHoraSalidaLlegada.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaHoraSalidaLlegada() {
                return fechaHoraSalidaLlegada;
            }

            /**
             * Define el valor de la propiedad fechaHoraSalidaLlegada.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaHoraSalidaLlegada(XMLGregorianCalendar value) {
                this.fechaHoraSalidaLlegada = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoEstacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoEstacion() {
                return tipoEstacion;
            }

            /**
             * Define el valor de la propiedad tipoEstacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoEstacion(String value) {
                this.tipoEstacion = value;
            }

            /**
             * Obtiene el valor de la propiedad distanciaRecorrida.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDistanciaRecorrida() {
                return distanciaRecorrida;
            }

            /**
             * Define el valor de la propiedad distanciaRecorrida.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDistanciaRecorrida(BigDecimal value) {
                this.distanciaRecorrida = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Calle" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip100" /&gt;
             *       &lt;attribute name="NumeroExterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
             *       &lt;attribute name="NumeroInterior" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_NumeroDomicilio" /&gt;
             *       &lt;attribute name="Colonia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Localidad" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Referencia" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Referencia" /&gt;
             *       &lt;attribute name="Municipio" type="{http://www.sat.gob.mx/sitio_internet/cfd/tipoDatos/tdCFDI}t_Descrip120" /&gt;
             *       &lt;attribute name="Estado" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="30"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *             &lt;pattern value="[^|]{1,30}"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *       &lt;attribute name="Pais" use="required" type="{http://www.sat.gob.mx/sitio_internet/cfd/catalogos}c_Pais" /&gt;
             *       &lt;attribute name="CodigoPostal" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;minLength value="1"/&gt;
             *             &lt;maxLength value="12"/&gt;
             *             &lt;whiteSpace value="collapse"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Domicilio {

                @XmlAttribute(name = "Calle")
                protected String calle;
                @XmlAttribute(name = "NumeroExterior")
                protected String numeroExterior;
                @XmlAttribute(name = "NumeroInterior")
                protected String numeroInterior;
                @XmlAttribute(name = "Colonia")
                protected String colonia;
                @XmlAttribute(name = "Localidad")
                protected String localidad;
                @XmlAttribute(name = "Referencia")
                protected String referencia;
                @XmlAttribute(name = "Municipio")
                protected String municipio;
                @XmlAttribute(name = "Estado", required = true)
                protected String estado;
                @XmlAttribute(name = "Pais", required = true)
                protected String pais;
                @XmlAttribute(name = "CodigoPostal", required = true)
                protected String codigoPostal;

                /**
                 * Obtiene el valor de la propiedad calle.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCalle() {
                    return calle;
                }

                /**
                 * Define el valor de la propiedad calle.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCalle(String value) {
                    this.calle = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroExterior.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroExterior() {
                    return numeroExterior;
                }

                /**
                 * Define el valor de la propiedad numeroExterior.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroExterior(String value) {
                    this.numeroExterior = value;
                }

                /**
                 * Obtiene el valor de la propiedad numeroInterior.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroInterior() {
                    return numeroInterior;
                }

                /**
                 * Define el valor de la propiedad numeroInterior.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroInterior(String value) {
                    this.numeroInterior = value;
                }

                /**
                 * Obtiene el valor de la propiedad colonia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColonia() {
                    return colonia;
                }

                /**
                 * Define el valor de la propiedad colonia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColonia(String value) {
                    this.colonia = value;
                }

                /**
                 * Obtiene el valor de la propiedad localidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocalidad() {
                    return localidad;
                }

                /**
                 * Define el valor de la propiedad localidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocalidad(String value) {
                    this.localidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad referencia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferencia() {
                    return referencia;
                }

                /**
                 * Define el valor de la propiedad referencia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferencia(String value) {
                    this.referencia = value;
                }

                /**
                 * Obtiene el valor de la propiedad municipio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMunicipio() {
                    return municipio;
                }

                /**
                 * Define el valor de la propiedad municipio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMunicipio(String value) {
                    this.municipio = value;
                }

                /**
                 * Obtiene el valor de la propiedad estado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEstado() {
                    return estado;
                }

                /**
                 * Define el valor de la propiedad estado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEstado(String value) {
                    this.estado = value;
                }

                /**
                 * Obtiene el valor de la propiedad pais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPais() {
                    return pais;
                }

                /**
                 * Define el valor de la propiedad pais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPais(String value) {
                    this.pais = value;
                }

                /**
                 * Obtiene el valor de la propiedad codigoPostal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoPostal() {
                    return codigoPostal;
                }

                /**
                 * Define el valor de la propiedad codigoPostal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoPostal(String value) {
                    this.codigoPostal = value;
                }

            }

        }

    }

}
