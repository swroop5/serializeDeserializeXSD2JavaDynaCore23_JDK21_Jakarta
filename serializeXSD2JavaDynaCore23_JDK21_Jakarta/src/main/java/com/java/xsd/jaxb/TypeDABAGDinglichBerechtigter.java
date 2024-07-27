//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.DinglichBerechtigter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.DinglichBerechtigter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="anteil" type="{http://www.xjustiz.de}Type.DABAG.Anteil" minOccurs="0"/&gt;
 *         &lt;element name="buchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Ref.DinglichBerechtigter" minOccurs="0"/&gt;
 *         &lt;element name="herrschvermerk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.DinglichBerechtigter", propOrder = {
    "lfdNummer",
    "anteil",
    "buchungsstelle",
    "herrschvermerk"
})
public class TypeDABAGDinglichBerechtigter {

    protected String lfdNummer;
    protected TypeDABAGAnteil anteil;
    protected TypeDABAGRefDinglichBerechtigter buchungsstelle;
    protected Boolean herrschvermerk;

    /**
     * Gets the value of the lfdNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfdNummer() {
        return lfdNummer;
    }

    /**
     * Sets the value of the lfdNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfdNummer(String value) {
        this.lfdNummer = value;
    }

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public TypeDABAGAnteil getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public void setAnteil(TypeDABAGAnteil value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the buchungsstelle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefDinglichBerechtigter }
     *     
     */
    public TypeDABAGRefDinglichBerechtigter getBuchungsstelle() {
        return buchungsstelle;
    }

    /**
     * Sets the value of the buchungsstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefDinglichBerechtigter }
     *     
     */
    public void setBuchungsstelle(TypeDABAGRefDinglichBerechtigter value) {
        this.buchungsstelle = value;
    }

    /**
     * Gets the value of the herrschvermerk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHerrschvermerk() {
        return herrschvermerk;
    }

    /**
     * Sets the value of the herrschvermerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHerrschvermerk(Boolean value) {
        this.herrschvermerk = value;
    }

}
