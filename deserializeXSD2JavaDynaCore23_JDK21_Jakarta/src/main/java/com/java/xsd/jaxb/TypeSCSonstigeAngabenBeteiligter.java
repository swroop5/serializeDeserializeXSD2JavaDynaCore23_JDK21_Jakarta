//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:52 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.SC.SonstigeAngabenBeteiligter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.SC.SonstigeAngabenBeteiligter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ref.rollennummer" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.SC.SonstigeAngabenBeteiligter", propOrder = {
    "refRollennummer",
    "freitext"
})
public class TypeSCSonstigeAngabenBeteiligter {

    @XmlElement(name = "ref.rollennummer", required = true)
    protected TypeGDSRefRollennummer refRollennummer;
    @XmlElement(required = true)
    protected String freitext;

    /**
     * Gets the value of the refRollennummer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getRefRollennummer() {
        return refRollennummer;
    }

    /**
     * Sets the value of the refRollennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setRefRollennummer(TypeGDSRefRollennummer value) {
        this.refRollennummer = value;
    }

    /**
     * Gets the value of the freitext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreitext() {
        return freitext;
    }

    /**
     * Sets the value of the freitext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreitext(String value) {
        this.freitext = value;
    }

}