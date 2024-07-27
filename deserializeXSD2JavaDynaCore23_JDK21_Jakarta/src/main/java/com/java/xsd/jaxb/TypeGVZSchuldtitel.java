//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:07 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GVZ.Schuldtitel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GVZ.Schuldtitel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titelart" type="{http://www.xjustiz.de}Code.GVZ.Titelart"/&gt;
 *         &lt;element name="titelbezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
 *         &lt;element name="auswahl_ausstellendeBehoerde"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="gericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
 *                   &lt;element name="sonstige" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titeldatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="zustelldatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="rechtsnachfolgedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="rechtsnachfolgezustelldatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GVZ.Schuldtitel", propOrder = {
    "titelart",
    "titelbezeichnung",
    "aktenzeichen",
    "auswahlAusstellendeBehoerde",
    "titeldatum",
    "zustelldatum",
    "rechtsnachfolgedatum",
    "rechtsnachfolgezustelldatum"
})
public class TypeGVZSchuldtitel {

    @XmlElement(required = true)
    protected CodeGVZTitelart titelart;
    protected String titelbezeichnung;
    @XmlElement(required = true)
    protected TypeGDSAktenzeichen aktenzeichen;
    @XmlElement(name = "auswahl_ausstellendeBehoerde", required = true)
    protected TypeGVZSchuldtitel.AuswahlAusstellendeBehoerde auswahlAusstellendeBehoerde;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar titeldatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zustelldatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtsnachfolgedatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rechtsnachfolgezustelldatum;

    /**
     * Gets the value of the titelart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGVZTitelart }
     *     
     */
    public CodeGVZTitelart getTitelart() {
        return titelart;
    }

    /**
     * Sets the value of the titelart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGVZTitelart }
     *     
     */
    public void setTitelart(CodeGVZTitelart value) {
        this.titelart = value;
    }

    /**
     * Gets the value of the titelbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelbezeichnung() {
        return titelbezeichnung;
    }

    /**
     * Sets the value of the titelbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelbezeichnung(String value) {
        this.titelbezeichnung = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setAktenzeichen(TypeGDSAktenzeichen value) {
        this.aktenzeichen = value;
    }

    /**
     * Gets the value of the auswahlAusstellendeBehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGVZSchuldtitel.AuswahlAusstellendeBehoerde }
     *     
     */
    public TypeGVZSchuldtitel.AuswahlAusstellendeBehoerde getAuswahlAusstellendeBehoerde() {
        return auswahlAusstellendeBehoerde;
    }

    /**
     * Sets the value of the auswahlAusstellendeBehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGVZSchuldtitel.AuswahlAusstellendeBehoerde }
     *     
     */
    public void setAuswahlAusstellendeBehoerde(TypeGVZSchuldtitel.AuswahlAusstellendeBehoerde value) {
        this.auswahlAusstellendeBehoerde = value;
    }

    /**
     * Gets the value of the titeldatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTiteldatum() {
        return titeldatum;
    }

    /**
     * Sets the value of the titeldatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTiteldatum(XMLGregorianCalendar value) {
        this.titeldatum = value;
    }

    /**
     * Gets the value of the zustelldatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZustelldatum() {
        return zustelldatum;
    }

    /**
     * Sets the value of the zustelldatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZustelldatum(XMLGregorianCalendar value) {
        this.zustelldatum = value;
    }

    /**
     * Gets the value of the rechtsnachfolgedatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRechtsnachfolgedatum() {
        return rechtsnachfolgedatum;
    }

    /**
     * Sets the value of the rechtsnachfolgedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRechtsnachfolgedatum(XMLGregorianCalendar value) {
        this.rechtsnachfolgedatum = value;
    }

    /**
     * Gets the value of the rechtsnachfolgezustelldatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRechtsnachfolgezustelldatum() {
        return rechtsnachfolgezustelldatum;
    }

    /**
     * Sets the value of the rechtsnachfolgezustelldatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRechtsnachfolgezustelldatum(XMLGregorianCalendar value) {
        this.rechtsnachfolgezustelldatum = value;
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
     *         &lt;element name="gericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
     *         &lt;element name="sonstige" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/&gt;
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
        "gericht",
        "sonstige"
    })
    public static class AuswahlAusstellendeBehoerde {

        protected CodeGDSGerichteTyp3 gericht;
        protected String sonstige;

        /**
         * Gets the value of the gericht property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSGerichteTyp3 }
         *     
         */
        public CodeGDSGerichteTyp3 getGericht() {
            return gericht;
        }

        /**
         * Sets the value of the gericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSGerichteTyp3 }
         *     
         */
        public void setGericht(CodeGDSGerichteTyp3 value) {
            this.gericht = value;
        }

        /**
         * Gets the value of the sonstige property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSonstige() {
            return sonstige;
        }

        /**
         * Sets the value of the sonstige property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSonstige(String value) {
            this.sonstige = value;
        }

    }

}