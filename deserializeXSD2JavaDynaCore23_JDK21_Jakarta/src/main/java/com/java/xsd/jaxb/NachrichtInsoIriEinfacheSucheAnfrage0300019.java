//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:24:08 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *                   &lt;element name="id.national" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="maxErgebnis" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
    "nachrichtenkopf",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.inso.iri.einfacheSuche.anfrage.0300019")
public class NachrichtInsoIriEinfacheSucheAnfrage0300019 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected NachrichtInsoIriEinfacheSucheAnfrage0300019 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtInsoIriEinfacheSucheAnfrage0300019 .Fachdaten }
     *     
     */
    public NachrichtInsoIriEinfacheSucheAnfrage0300019 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtInsoIriEinfacheSucheAnfrage0300019 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtInsoIriEinfacheSucheAnfrage0300019 .Fachdaten value) {
        this.fachdaten = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
     *         &lt;element name="id.national" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="maxErgebnis" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
        "name",
        "idNational",
        "maxErgebnis"
    })
    public static class Fachdaten {

        protected String name;
        @XmlElement(name = "id.national")
        protected String idNational;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxErgebnis;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the idNational property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdNational() {
            return idNational;
        }

        /**
         * Sets the value of the idNational property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdNational(String value) {
            this.idNational = value;
        }

        /**
         * Gets the value of the maxErgebnis property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxErgebnis() {
            return maxErgebnis;
        }

        /**
         * Sets the value of the maxErgebnis property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxErgebnis(BigInteger value) {
            this.maxErgebnis = value;
        }

    }

}
