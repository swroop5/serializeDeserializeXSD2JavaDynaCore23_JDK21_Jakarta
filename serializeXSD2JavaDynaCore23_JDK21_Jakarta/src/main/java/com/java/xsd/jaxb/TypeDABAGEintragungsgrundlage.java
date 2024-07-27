//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Eintragungsgrundlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Eintragungsgrundlage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eintragungsgrundlagentyp" type="{http://www.xjustiz.de}Type.DABAG.Eintragungsgrundlagentyp"/&gt;
 *         &lt;element name="auswahl_referenz"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
 *                   &lt;element name="urkundsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="verfahrensname" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="ausstellungsort" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/&gt;
 *         &lt;element name="aussteller" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO" minOccurs="0"/&gt;
 *         &lt;element name="sichtbar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Eintragungsgrundlage", propOrder = {
    "eintragungsgrundlagentyp",
    "auswahlReferenz",
    "verfahrensname",
    "ausstellungsort",
    "aussteller",
    "dokument",
    "sichtbar"
})
public class TypeDABAGEintragungsgrundlage {

    @XmlElement(required = true)
    protected TypeDABAGEintragungsgrundlagentyp eintragungsgrundlagentyp;
    @XmlElement(name = "auswahl_referenz", required = true)
    protected TypeDABAGEintragungsgrundlage.AuswahlReferenz auswahlReferenz;
    protected String verfahrensname;
    protected String ausstellungsort;
    @XmlElement(required = true)
    protected TypeGDSRefRollennummer aussteller;
    protected TypeGDSRefSGO dokument;
    @XmlElement(defaultValue = "true")
    protected boolean sichtbar;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the eintragungsgrundlagentyp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGEintragungsgrundlagentyp }
     *     
     */
    public TypeDABAGEintragungsgrundlagentyp getEintragungsgrundlagentyp() {
        return eintragungsgrundlagentyp;
    }

    /**
     * Sets the value of the eintragungsgrundlagentyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGEintragungsgrundlagentyp }
     *     
     */
    public void setEintragungsgrundlagentyp(TypeDABAGEintragungsgrundlagentyp value) {
        this.eintragungsgrundlagentyp = value;
    }

    /**
     * Gets the value of the auswahlReferenz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGEintragungsgrundlage.AuswahlReferenz }
     *     
     */
    public TypeDABAGEintragungsgrundlage.AuswahlReferenz getAuswahlReferenz() {
        return auswahlReferenz;
    }

    /**
     * Sets the value of the auswahlReferenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGEintragungsgrundlage.AuswahlReferenz }
     *     
     */
    public void setAuswahlReferenz(TypeDABAGEintragungsgrundlage.AuswahlReferenz value) {
        this.auswahlReferenz = value;
    }

    /**
     * Gets the value of the verfahrensname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerfahrensname() {
        return verfahrensname;
    }

    /**
     * Sets the value of the verfahrensname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerfahrensname(String value) {
        this.verfahrensname = value;
    }

    /**
     * Gets the value of the ausstellungsort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusstellungsort() {
        return ausstellungsort;
    }

    /**
     * Sets the value of the ausstellungsort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusstellungsort(String value) {
        this.ausstellungsort = value;
    }

    /**
     * Gets the value of the aussteller property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getAussteller() {
        return aussteller;
    }

    /**
     * Sets the value of the aussteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setAussteller(TypeGDSRefRollennummer value) {
        this.aussteller = value;
    }

    /**
     * Gets the value of the dokument property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public TypeGDSRefSGO getDokument() {
        return dokument;
    }

    /**
     * Sets the value of the dokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public void setDokument(TypeGDSRefSGO value) {
        this.dokument = value;
    }

    /**
     * Gets the value of the sichtbar property.
     * 
     */
    public boolean isSichtbar() {
        return sichtbar;
    }

    /**
     * Sets the value of the sichtbar property.
     * 
     */
    public void setSichtbar(boolean value) {
        this.sichtbar = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
     *         &lt;element name="urkundsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "aktenzeichen",
        "urkundsnummer"
    })
    public static class AuswahlReferenz {

        protected TypeGDSAktenzeichen aktenzeichen;
        protected String urkundsnummer;

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
         * Gets the value of the urkundsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrkundsnummer() {
            return urkundsnummer;
        }

        /**
         * Sets the value of the urkundsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrkundsnummer(String value) {
            this.urkundsnummer = value;
        }

    }

}
