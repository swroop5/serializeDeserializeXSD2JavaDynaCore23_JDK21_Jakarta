//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Kreditkartendaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Kreditkartendaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kreditkartenunternehmen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="gueltigkeit" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="kartenpruefnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="karteninhaber" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="kartennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="kartennummerGueltigkeitPruefnr" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Kreditkartendaten", propOrder = {
    "kreditkartenunternehmen",
    "gueltigkeit",
    "kartenpruefnummer",
    "karteninhaber",
    "kartennummer",
    "kartennummerGueltigkeitPruefnr"
})
public class TypeGDSKreditkartendaten {

    protected String kreditkartenunternehmen;
    protected String gueltigkeit;
    protected String kartenpruefnummer;
    protected String karteninhaber;
    protected String kartennummer;
    protected String kartennummerGueltigkeitPruefnr;

    /**
     * Gets the value of the kreditkartenunternehmen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKreditkartenunternehmen() {
        return kreditkartenunternehmen;
    }

    /**
     * Sets the value of the kreditkartenunternehmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKreditkartenunternehmen(String value) {
        this.kreditkartenunternehmen = value;
    }

    /**
     * Gets the value of the gueltigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Sets the value of the gueltigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGueltigkeit(String value) {
        this.gueltigkeit = value;
    }

    /**
     * Gets the value of the kartenpruefnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartenpruefnummer() {
        return kartenpruefnummer;
    }

    /**
     * Sets the value of the kartenpruefnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartenpruefnummer(String value) {
        this.kartenpruefnummer = value;
    }

    /**
     * Gets the value of the karteninhaber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKarteninhaber() {
        return karteninhaber;
    }

    /**
     * Sets the value of the karteninhaber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKarteninhaber(String value) {
        this.karteninhaber = value;
    }

    /**
     * Gets the value of the kartennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartennummer() {
        return kartennummer;
    }

    /**
     * Sets the value of the kartennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartennummer(String value) {
        this.kartennummer = value;
    }

    /**
     * Gets the value of the kartennummerGueltigkeitPruefnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartennummerGueltigkeitPruefnr() {
        return kartennummerGueltigkeitPruefnr;
    }

    /**
     * Sets the value of the kartennummerGueltigkeitPruefnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartennummerGueltigkeitPruefnr(String value) {
        this.kartennummerGueltigkeitPruefnr = value;
    }

}
