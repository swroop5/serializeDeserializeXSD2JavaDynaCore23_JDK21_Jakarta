//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:03 PM CEST 
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
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="verfahrensdaten"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;element name="ruecknahmecode" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                           &lt;/sequence&gt;
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
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.zssr.ruecknahmeSchutzschrift.2300005")
public class NachrichtZssrRuecknahmeSchutzschrift2300005 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten fachdaten;

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
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public TypeGDSSchriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(TypeGDSSchriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten }
     *     
     */
    public NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten value) {
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
     *         &lt;element name="verfahrensdaten"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;element name="ruecknahmecode" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "verfahrensdaten"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten.Verfahrensdaten verfahrensdaten;

        /**
         * Gets the value of the verfahrensdaten property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten.Verfahrensdaten }
         *     
         */
        public NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten.Verfahrensdaten getVerfahrensdaten() {
            return verfahrensdaten;
        }

        /**
         * Sets the value of the verfahrensdaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten.Verfahrensdaten }
         *     
         */
        public void setVerfahrensdaten(NachrichtZssrRuecknahmeSchutzschrift2300005 .Fachdaten.Verfahrensdaten value) {
            this.verfahrensdaten = value;
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
         *         &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;element name="ruecknahmecode" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
            "registernummer",
            "ruecknahmecode"
        })
        public static class Verfahrensdaten {

            @XmlElement(required = true)
            protected String registernummer;
            @XmlElement(required = true)
            protected String ruecknahmecode;

            /**
             * Gets the value of the registernummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegisternummer() {
                return registernummer;
            }

            /**
             * Sets the value of the registernummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegisternummer(String value) {
                this.registernummer = value;
            }

            /**
             * Gets the value of the ruecknahmecode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRuecknahmecode() {
                return ruecknahmecode;
            }

            /**
             * Sets the value of the ruecknahmecode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRuecknahmecode(String value) {
                this.ruecknahmecode = value;
            }

        }

    }

}