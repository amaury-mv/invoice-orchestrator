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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="RetencionesLocales" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TasadeRetencion" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="2"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Importe" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="2"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TrasladosLocales" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TasadeTraslado" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="2"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Importe" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                       &lt;fractionDigits value="2"/&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" /&gt;
 *       &lt;attribute name="TotaldeRetenciones" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;fractionDigits value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TotaldeTraslados" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *             &lt;fractionDigits value="2"/&gt;
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
    "retencionesLocalesAndTrasladosLocales"
})
@XmlRootElement(name = "ImpuestosLocales", namespace = "http://www.sat.gob.mx/implocal")
public class ImpuestosLocales {

    @XmlElements({
        @XmlElement(name = "RetencionesLocales", namespace = "http://www.sat.gob.mx/implocal", type = ImpuestosLocales.RetencionesLocales.class),
        @XmlElement(name = "TrasladosLocales", namespace = "http://www.sat.gob.mx/implocal", type = ImpuestosLocales.TrasladosLocales.class)
    })
    protected List<Object> retencionesLocalesAndTrasladosLocales;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String version;
    @XmlAttribute(name = "TotaldeRetenciones", required = true)
    protected BigDecimal totaldeRetenciones;
    @XmlAttribute(name = "TotaldeTraslados", required = true)
    protected BigDecimal totaldeTraslados;

    /**
     * Gets the value of the retencionesLocalesAndTrasladosLocales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionesLocalesAndTrasladosLocales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionesLocalesAndTrasladosLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpuestosLocales.RetencionesLocales }
     * {@link ImpuestosLocales.TrasladosLocales }
     * 
     * 
     */
    public List<Object> getRetencionesLocalesAndTrasladosLocales() {
        if (retencionesLocalesAndTrasladosLocales == null) {
            retencionesLocalesAndTrasladosLocales = new ArrayList<Object>();
        }
        return this.retencionesLocalesAndTrasladosLocales;
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
     * Obtiene el valor de la propiedad totaldeRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeRetenciones() {
        return totaldeRetenciones;
    }

    /**
     * Define el valor de la propiedad totaldeRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaldeRetenciones(BigDecimal value) {
        this.totaldeRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totaldeTraslados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaldeTraslados() {
        return totaldeTraslados;
    }

    /**
     * Define el valor de la propiedad totaldeTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaldeTraslados(BigDecimal value) {
        this.totaldeTraslados = value;
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
     *       &lt;attribute name="ImpLocRetenido" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TasadeRetencion" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="2"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Importe" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="2"/&gt;
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
    public static class RetencionesLocales {

        @XmlAttribute(name = "ImpLocRetenido", required = true)
        protected String impLocRetenido;
        @XmlAttribute(name = "TasadeRetencion", required = true)
        protected BigDecimal tasadeRetencion;
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Obtiene el valor de la propiedad impLocRetenido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocRetenido() {
            return impLocRetenido;
        }

        /**
         * Define el valor de la propiedad impLocRetenido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpLocRetenido(String value) {
            this.impLocRetenido = value;
        }

        /**
         * Obtiene el valor de la propiedad tasadeRetencion.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeRetencion() {
            return tasadeRetencion;
        }

        /**
         * Define el valor de la propiedad tasadeRetencion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasadeRetencion(BigDecimal value) {
            this.tasadeRetencion = value;
        }

        /**
         * Obtiene el valor de la propiedad importe.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Define el valor de la propiedad importe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
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
     *       &lt;attribute name="ImpLocTrasladado" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TasadeTraslado" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="2"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Importe" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *             &lt;fractionDigits value="2"/&gt;
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
    public static class TrasladosLocales {

        @XmlAttribute(name = "ImpLocTrasladado", required = true)
        protected String impLocTrasladado;
        @XmlAttribute(name = "TasadeTraslado", required = true)
        protected BigDecimal tasadeTraslado;
        @XmlAttribute(name = "Importe", required = true)
        protected BigDecimal importe;

        /**
         * Obtiene el valor de la propiedad impLocTrasladado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpLocTrasladado() {
            return impLocTrasladado;
        }

        /**
         * Define el valor de la propiedad impLocTrasladado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpLocTrasladado(String value) {
            this.impLocTrasladado = value;
        }

        /**
         * Obtiene el valor de la propiedad tasadeTraslado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasadeTraslado() {
            return tasadeTraslado;
        }

        /**
         * Define el valor de la propiedad tasadeTraslado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasadeTraslado(BigDecimal value) {
            this.tasadeTraslado = value;
        }

        /**
         * Obtiene el valor de la propiedad importe.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getImporte() {
            return importe;
        }

        /**
         * Define el valor de la propiedad importe.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setImporte(BigDecimal value) {
            this.importe = value;
        }

    }

}
