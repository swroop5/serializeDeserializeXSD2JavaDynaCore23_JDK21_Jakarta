//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Identifikation.Flurstueck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Identifikation.Flurstueck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gemarkungsschluessel" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="flurnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="flurstuecksnummer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="zaehler" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="nenner" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Identifikation.Flurstueck", propOrder = {
    "gemarkungsschluessel",
    "flurnummer",
    "flurstuecksnummer"
})
public class TypeDABAGIdentifikationFlurstueck {

    @XmlElement(required = true)
    protected String gemarkungsschluessel;
    protected BigInteger flurnummer;
    @XmlElement(required = true)
    protected TypeDABAGIdentifikationFlurstueck.Flurstuecksnummer flurstuecksnummer;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the gemarkungsschluessel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemarkungsschluessel() {
        return gemarkungsschluessel;
    }

    /**
     * Sets the value of the gemarkungsschluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemarkungsschluessel(String value) {
        this.gemarkungsschluessel = value;
    }

    /**
     * Gets the value of the flurnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlurnummer() {
        return flurnummer;
    }

    /**
     * Sets the value of the flurnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlurnummer(BigInteger value) {
        this.flurnummer = value;
    }

    /**
     * Gets the value of the flurstuecksnummer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGIdentifikationFlurstueck.Flurstuecksnummer }
     *     
     */
    public TypeDABAGIdentifikationFlurstueck.Flurstuecksnummer getFlurstuecksnummer() {
        return flurstuecksnummer;
    }

    /**
     * Sets the value of the flurstuecksnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGIdentifikationFlurstueck.Flurstuecksnummer }
     *     
     */
    public void setFlurstuecksnummer(TypeDABAGIdentifikationFlurstueck.Flurstuecksnummer value) {
        this.flurstuecksnummer = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="zaehler" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="nenner" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
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
        "zaehler",
        "nenner"
    })
    public static class Flurstuecksnummer {

        @XmlElement(required = true)
        protected String zaehler;
        protected String nenner;

        /**
         * Gets the value of the zaehler property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZaehler() {
            return zaehler;
        }

        /**
         * Sets the value of the zaehler property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZaehler(String value) {
            this.zaehler = value;
        }

        /**
         * Gets the value of the nenner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNenner() {
            return nenner;
        }

        /**
         * Sets the value of the nenner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNenner(String value) {
            this.nenner = value;
        }

    }

}
