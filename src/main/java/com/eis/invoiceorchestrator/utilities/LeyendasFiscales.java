//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.11.04 a las 01:54:50 PM CST 
//


package com.eis.invoiceorchestrator.utilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="Leyenda" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="disposicionFiscal"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="norma"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                       &lt;minLength value="1"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="textoLeyenda" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;minLength value="1"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "leyenda"
})
@XmlRootElement(name = "LeyendasFiscales", namespace = "http://www.sat.gob.mx/leyendasFiscales")
public class LeyendasFiscales {

    @XmlElement(name = "Leyenda", namespace = "http://www.sat.gob.mx/leyendasFiscales", required = true)
    protected List<LeyendasFiscales.Leyenda> leyenda;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the leyenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leyenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeyenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeyendasFiscales.Leyenda }
     * 
     * 
     */
    public List<LeyendasFiscales.Leyenda> getLeyenda() {
        if (leyenda == null) {
            leyenda = new ArrayList<LeyendasFiscales.Leyenda>();
        }
        return this.leyenda;
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
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="disposicionFiscal"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *             &lt;minLength value="1"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="norma"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;whiteSpace value="collapse"/&gt;
     *             &lt;minLength value="1"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="textoLeyenda" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;minLength value="1"/&gt;
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
    public static class Leyenda {

        @XmlAttribute(name = "disposicionFiscal")
        protected String disposicionFiscal;
        @XmlAttribute(name = "norma")
        protected String norma;
        @XmlAttribute(name = "textoLeyenda", required = true)
        protected String textoLeyenda;

        /**
         * Obtiene el valor de la propiedad disposicionFiscal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisposicionFiscal() {
            return disposicionFiscal;
        }

        /**
         * Define el valor de la propiedad disposicionFiscal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisposicionFiscal(String value) {
            this.disposicionFiscal = value;
        }

        /**
         * Obtiene el valor de la propiedad norma.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNorma() {
            return norma;
        }

        /**
         * Define el valor de la propiedad norma.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNorma(String value) {
            this.norma = value;
        }

        /**
         * Obtiene el valor de la propiedad textoLeyenda.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextoLeyenda() {
            return textoLeyenda;
        }

        /**
         * Define el valor de la propiedad textoLeyenda.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextoLeyenda(String value) {
            this.textoLeyenda = value;
        }

    }

}
