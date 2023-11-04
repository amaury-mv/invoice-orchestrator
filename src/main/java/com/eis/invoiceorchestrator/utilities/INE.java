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
 *         &lt;element name="Entidad" maxOccurs="76" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="IdContabilidad" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                 &lt;totalDigits value="6"/&gt;
 *                                 &lt;fractionDigits value="0"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ClaveEntidad" use="required" type="{http://www.sat.gob.mx/ine}t_ClaveEntidad" /&gt;
 *                 &lt;attribute name="Ambito"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.sat.gob.mx/ine}t_Ambito"&gt;
 *                       &lt;whiteSpace value="collapse"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" use="required" fixed="1.1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TipoProceso" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_TipoProc"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="TipoComite"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_TipoComite"&gt;
 *             &lt;whiteSpace value="collapse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="IdContabilidad"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;totalDigits value="6"/&gt;
 *             &lt;fractionDigits value="0"/&gt;
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
    "entidad"
})
@XmlRootElement(name = "INE")
public class INE {

    @XmlElement(name = "Entidad")
    protected List<INE.Entidad> entidad;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TipoProceso", required = true)
    protected String tipoProceso;
    @XmlAttribute(name = "TipoComite")
    protected String tipoComite;
    @XmlAttribute(name = "IdContabilidad")
    protected Integer idContabilidad;

    /**
     * Gets the value of the entidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INE.Entidad }
     * 
     * 
     */
    public List<INE.Entidad> getEntidad() {
        if (entidad == null) {
            entidad = new ArrayList<INE.Entidad>();
        }
        return this.entidad;
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
            return "1.1";
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
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComite() {
        return tipoComite;
    }

    /**
     * Define el valor de la propiedad tipoComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComite(String value) {
        this.tipoComite = value;
    }

    /**
     * Obtiene el valor de la propiedad idContabilidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdContabilidad() {
        return idContabilidad;
    }

    /**
     * Define el valor de la propiedad idContabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdContabilidad(Integer value) {
        this.idContabilidad = value;
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
     *         &lt;element name="Contabilidad" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="IdContabilidad" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                       &lt;totalDigits value="6"/&gt;
     *                       &lt;fractionDigits value="0"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ClaveEntidad" use="required" type="{http://www.sat.gob.mx/ine}t_ClaveEntidad" /&gt;
     *       &lt;attribute name="Ambito"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.sat.gob.mx/ine}t_Ambito"&gt;
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
        "contabilidad"
    })
    public static class Entidad {

        @XmlElement(name = "Contabilidad")
        protected List<INE.Entidad.Contabilidad> contabilidad;
        @XmlAttribute(name = "ClaveEntidad", required = true)
        protected String claveEntidad;
        @XmlAttribute(name = "Ambito")
        protected String ambito;

        /**
         * Gets the value of the contabilidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contabilidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContabilidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link INE.Entidad.Contabilidad }
         * 
         * 
         */
        public List<INE.Entidad.Contabilidad> getContabilidad() {
            if (contabilidad == null) {
                contabilidad = new ArrayList<INE.Entidad.Contabilidad>();
            }
            return this.contabilidad;
        }

        /**
         * Obtiene el valor de la propiedad claveEntidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaveEntidad() {
            return claveEntidad;
        }

        /**
         * Define el valor de la propiedad claveEntidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaveEntidad(String value) {
            this.claveEntidad = value;
        }

        /**
         * Obtiene el valor de la propiedad ambito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmbito() {
            return ambito;
        }

        /**
         * Define el valor de la propiedad ambito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmbito(String value) {
            this.ambito = value;
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
         *       &lt;attribute name="IdContabilidad" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *             &lt;totalDigits value="6"/&gt;
         *             &lt;fractionDigits value="0"/&gt;
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
        public static class Contabilidad {

            @XmlAttribute(name = "IdContabilidad", required = true)
            protected int idContabilidad;

            /**
             * Obtiene el valor de la propiedad idContabilidad.
             * 
             */
            public int getIdContabilidad() {
                return idContabilidad;
            }

            /**
             * Define el valor de la propiedad idContabilidad.
             * 
             */
            public void setIdContabilidad(int value) {
                this.idContabilidad = value;
            }

        }

    }

}
