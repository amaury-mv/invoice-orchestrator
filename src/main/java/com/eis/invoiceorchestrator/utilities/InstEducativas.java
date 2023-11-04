//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.04 a las 01:54:50 PM CST 
//


package com.eis.invoiceorchestrator.utilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="version" use="required" fixed="1.0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="nombreAlumno" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CURP" use="required" type="{http://www.sat.gob.mx/iedu}tCURP" /&gt;
 *       &lt;attribute name="nivelEducativo" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Preescolar"/&gt;
 *             &lt;enumeration value="Primaria"/&gt;
 *             &lt;enumeration value="Secundaria"/&gt;
 *             &lt;enumeration value="Profesional técnico"/&gt;
 *             &lt;enumeration value="Bachillerato o su equivalente"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="autRVOE" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rfcPago" type="{http://www.sat.gob.mx/iedu}tRFC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "instEducativas", namespace = "http://www.sat.gob.mx/iedu")
public class InstEducativas {

    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "nombreAlumno", required = true)
    protected String nombreAlumno;
    @XmlAttribute(name = "CURP", required = true)
    protected String curp;
    @XmlAttribute(name = "nivelEducativo", required = true)
    protected String nivelEducativo;
    @XmlAttribute(name = "autRVOE", required = true)
    protected String autRVOE;
    @XmlAttribute(name = "rfcPago")
    protected String rfcPago;

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
            return "1.0";
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
     * Obtiene el valor de la propiedad nombreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Define el valor de la propiedad nombreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEducativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelEducativo() {
        return nivelEducativo;
    }

    /**
     * Define el valor de la propiedad nivelEducativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelEducativo(String value) {
        this.nivelEducativo = value;
    }

    /**
     * Obtiene el valor de la propiedad autRVOE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutRVOE() {
        return autRVOE;
    }

    /**
     * Define el valor de la propiedad autRVOE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutRVOE(String value) {
        this.autRVOE = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPago() {
        return rfcPago;
    }

    /**
     * Define el valor de la propiedad rfcPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPago(String value) {
        this.rfcPago = value;
    }

}
