//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.OWI.Bussgeldkatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.OWI.Bussgeldkatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auswahl_tatbestandsnummer.text"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="tatbestandsnummer" type="{http://www.xjustiz.de}Type.STRAF.Kennziffer"/&gt;
 *                   &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="textalternative" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="konkretisierung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="gemessenerWert" type="{http://www.xjustiz.de}Type.STRAF.Messung" minOccurs="0"/&gt;
 *         &lt;element name="zulaessigerWert" type="{http://www.xjustiz.de}Type.STRAF.Messung" minOccurs="0"/&gt;
 *         &lt;element name="differenz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="vorsatz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fahrverbot" type="{http://www.xjustiz.de}Type.STRAF.Dauer" minOccurs="0"/&gt;
 *         &lt;element name="punkte" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="geldbusse" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="tateinheit"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ref.delikt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                     &lt;element name="beschreibung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="tatmehrheit"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ref.delikt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                     &lt;element name="beschreibung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.OWI.Bussgeldkatalog", propOrder = {
    "auswahlTatbestandsnummerText",
    "textalternative",
    "konkretisierung",
    "gemessenerWert",
    "zulaessigerWert",
    "differenz",
    "vorsatz",
    "fahrverbot",
    "punkte",
    "geldbusse",
    "tateinheit",
    "tatmehrheit"
})
public class TypeSTRAFOWIBussgeldkatalog {

    @XmlElement(name = "auswahl_tatbestandsnummer.text", required = true)
    protected TypeSTRAFOWIBussgeldkatalog.AuswahlTatbestandsnummerText auswahlTatbestandsnummerText;
    protected String textalternative;
    protected String konkretisierung;
    protected TypeSTRAFMessung gemessenerWert;
    protected TypeSTRAFMessung zulaessigerWert;
    protected String differenz;
    protected Boolean vorsatz;
    protected TypeSTRAFDauer fahrverbot;
    protected String punkte;
    protected String geldbusse;
    protected TypeSTRAFOWIBussgeldkatalog.Tateinheit tateinheit;
    protected TypeSTRAFOWIBussgeldkatalog.Tatmehrheit tatmehrheit;

    /**
     * Gets the value of the auswahlTatbestandsnummerText property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.AuswahlTatbestandsnummerText }
     *     
     */
    public TypeSTRAFOWIBussgeldkatalog.AuswahlTatbestandsnummerText getAuswahlTatbestandsnummerText() {
        return auswahlTatbestandsnummerText;
    }

    /**
     * Sets the value of the auswahlTatbestandsnummerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.AuswahlTatbestandsnummerText }
     *     
     */
    public void setAuswahlTatbestandsnummerText(TypeSTRAFOWIBussgeldkatalog.AuswahlTatbestandsnummerText value) {
        this.auswahlTatbestandsnummerText = value;
    }

    /**
     * Gets the value of the textalternative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextalternative() {
        return textalternative;
    }

    /**
     * Sets the value of the textalternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextalternative(String value) {
        this.textalternative = value;
    }

    /**
     * Gets the value of the konkretisierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkretisierung() {
        return konkretisierung;
    }

    /**
     * Sets the value of the konkretisierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkretisierung(String value) {
        this.konkretisierung = value;
    }

    /**
     * Gets the value of the gemessenerWert property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFMessung }
     *     
     */
    public TypeSTRAFMessung getGemessenerWert() {
        return gemessenerWert;
    }

    /**
     * Sets the value of the gemessenerWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFMessung }
     *     
     */
    public void setGemessenerWert(TypeSTRAFMessung value) {
        this.gemessenerWert = value;
    }

    /**
     * Gets the value of the zulaessigerWert property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFMessung }
     *     
     */
    public TypeSTRAFMessung getZulaessigerWert() {
        return zulaessigerWert;
    }

    /**
     * Sets the value of the zulaessigerWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFMessung }
     *     
     */
    public void setZulaessigerWert(TypeSTRAFMessung value) {
        this.zulaessigerWert = value;
    }

    /**
     * Gets the value of the differenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifferenz() {
        return differenz;
    }

    /**
     * Sets the value of the differenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifferenz(String value) {
        this.differenz = value;
    }

    /**
     * Gets the value of the vorsatz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVorsatz() {
        return vorsatz;
    }

    /**
     * Sets the value of the vorsatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVorsatz(Boolean value) {
        this.vorsatz = value;
    }

    /**
     * Gets the value of the fahrverbot property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public TypeSTRAFDauer getFahrverbot() {
        return fahrverbot;
    }

    /**
     * Sets the value of the fahrverbot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public void setFahrverbot(TypeSTRAFDauer value) {
        this.fahrverbot = value;
    }

    /**
     * Gets the value of the punkte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunkte() {
        return punkte;
    }

    /**
     * Sets the value of the punkte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunkte(String value) {
        this.punkte = value;
    }

    /**
     * Gets the value of the geldbusse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeldbusse() {
        return geldbusse;
    }

    /**
     * Sets the value of the geldbusse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeldbusse(String value) {
        this.geldbusse = value;
    }

    /**
     * Gets the value of the tateinheit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.Tateinheit }
     *     
     */
    public TypeSTRAFOWIBussgeldkatalog.Tateinheit getTateinheit() {
        return tateinheit;
    }

    /**
     * Sets the value of the tateinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.Tateinheit }
     *     
     */
    public void setTateinheit(TypeSTRAFOWIBussgeldkatalog.Tateinheit value) {
        this.tateinheit = value;
    }

    /**
     * Gets the value of the tatmehrheit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.Tatmehrheit }
     *     
     */
    public TypeSTRAFOWIBussgeldkatalog.Tatmehrheit getTatmehrheit() {
        return tatmehrheit;
    }

    /**
     * Sets the value of the tatmehrheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFOWIBussgeldkatalog.Tatmehrheit }
     *     
     */
    public void setTatmehrheit(TypeSTRAFOWIBussgeldkatalog.Tatmehrheit value) {
        this.tatmehrheit = value;
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
     *         &lt;element name="tatbestandsnummer" type="{http://www.xjustiz.de}Type.STRAF.Kennziffer"/&gt;
     *         &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "tatbestandsnummer",
        "text"
    })
    public static class AuswahlTatbestandsnummerText {

        protected TypeSTRAFKennziffer tatbestandsnummer;
        protected String text;

        /**
         * Gets the value of the tatbestandsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSTRAFKennziffer }
         *     
         */
        public TypeSTRAFKennziffer getTatbestandsnummer() {
            return tatbestandsnummer;
        }

        /**
         * Sets the value of the tatbestandsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSTRAFKennziffer }
         *     
         */
        public void setTatbestandsnummer(TypeSTRAFKennziffer value) {
            this.tatbestandsnummer = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

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
     *         &lt;element name="ref.delikt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="beschreibung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
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
        "refDelikt",
        "beschreibung"
    })
    public static class Tateinheit {

        @XmlElement(name = "ref.delikt")
        protected String refDelikt;
        protected String beschreibung;

        /**
         * Gets the value of the refDelikt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefDelikt() {
            return refDelikt;
        }

        /**
         * Sets the value of the refDelikt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefDelikt(String value) {
            this.refDelikt = value;
        }

        /**
         * Gets the value of the beschreibung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Sets the value of the beschreibung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

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
     *         &lt;element name="ref.delikt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="beschreibung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
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
        "refDelikt",
        "beschreibung"
    })
    public static class Tatmehrheit {

        @XmlElement(name = "ref.delikt")
        protected String refDelikt;
        protected String beschreibung;

        /**
         * Gets the value of the refDelikt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefDelikt() {
            return refDelikt;
        }

        /**
         * Sets the value of the refDelikt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefDelikt(String value) {
            this.refDelikt = value;
        }

        /**
         * Gets the value of the beschreibung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Sets the value of the beschreibung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

    }

}
