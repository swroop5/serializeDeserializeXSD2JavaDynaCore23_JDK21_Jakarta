//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:56 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="niederschlagungen" type="{http://www.xjustiz.de}Type.KASSE.Niederschlagungen"/&gt;
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
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.kasse.niederschlagungen.2000007")
public class NachrichtKasseNiederschlagungen2000007 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtKasseNiederschlagungen2000007 .Fachdaten fachdaten;

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
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtKasseNiederschlagungen2000007 .Fachdaten }
     *     
     */
    public NachrichtKasseNiederschlagungen2000007 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtKasseNiederschlagungen2000007 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtKasseNiederschlagungen2000007 .Fachdaten value) {
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
     *         &lt;element name="niederschlagungen" type="{http://www.xjustiz.de}Type.KASSE.Niederschlagungen"/&gt;
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
        "niederschlagungen"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected TypeKASSENiederschlagungen niederschlagungen;

        /**
         * Gets the value of the niederschlagungen property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSENiederschlagungen }
         *     
         */
        public TypeKASSENiederschlagungen getNiederschlagungen() {
            return niederschlagungen;
        }

        /**
         * Sets the value of the niederschlagungen property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSENiederschlagungen }
         *     
         */
        public void setNiederschlagungen(TypeKASSENiederschlagungen value) {
            this.niederschlagungen = value;
        }

    }

}
