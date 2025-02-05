//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:43 PM CEST 
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
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="auswahl_versandart"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="download" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO"/&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="egvpVersandEingeleitet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/choice&gt;
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
    "grunddaten",
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.zvr.erstelleAuskunft.output.1000011")
public class NachrichtZvrErstelleAuskunftOutput1000011 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten fachdaten;

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
     *     {@link NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten }
     *     
     */
    public NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten value) {
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
     *         &lt;element name="auswahl_versandart"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="download" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO"/&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="egvpVersandEingeleitet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/choice&gt;
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
        "auswahlVersandart"
    })
    public static class Fachdaten {

        @XmlElement(name = "auswahl_versandart", required = true)
        protected NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten.AuswahlVersandart auswahlVersandart;

        /**
         * Gets the value of the auswahlVersandart property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten.AuswahlVersandart }
         *     
         */
        public NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten.AuswahlVersandart getAuswahlVersandart() {
            return auswahlVersandart;
        }

        /**
         * Sets the value of the auswahlVersandart property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten.AuswahlVersandart }
         *     
         */
        public void setAuswahlVersandart(NachrichtZvrErstelleAuskunftOutput1000011 .Fachdaten.AuswahlVersandart value) {
            this.auswahlVersandart = value;
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
         *       &lt;choice&gt;
         *         &lt;element name="download" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO"/&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="egvpVersandEingeleitet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;/sequence&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "download",
            "egvpVersandEingeleitet"
        })
        public static class AuswahlVersandart {

            protected TypeGDSRefSGO download;
            protected Boolean egvpVersandEingeleitet;

            /**
             * Gets the value of the download property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSRefSGO }
             *     
             */
            public TypeGDSRefSGO getDownload() {
                return download;
            }

            /**
             * Sets the value of the download property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSRefSGO }
             *     
             */
            public void setDownload(TypeGDSRefSGO value) {
                this.download = value;
            }

            /**
             * Gets the value of the egvpVersandEingeleitet property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEgvpVersandEingeleitet() {
                return egvpVersandEingeleitet;
            }

            /**
             * Sets the value of the egvpVersandEingeleitet property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEgvpVersandEingeleitet(Boolean value) {
                this.egvpVersandEingeleitet = value;
            }

        }

    }

}
