//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:24:08 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.INSO.Vollmacht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.INSO.Vollmacht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenz" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="untervollmacht" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="blattzahlDerVollmacht" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.INSO.Vollmacht", propOrder = {
    "referenz",
    "untervollmacht",
    "blattzahlDerVollmacht"
})
public class TypeINSOVollmacht {

    @XmlElement(required = true)
    protected TypeGDSRefRollennummer referenz;
    protected boolean untervollmacht;
    protected String blattzahlDerVollmacht;

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getReferenz() {
        return referenz;
    }

    /**
     * Sets the value of the referenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setReferenz(TypeGDSRefRollennummer value) {
        this.referenz = value;
    }

    /**
     * Gets the value of the untervollmacht property.
     * 
     */
    public boolean isUntervollmacht() {
        return untervollmacht;
    }

    /**
     * Sets the value of the untervollmacht property.
     * 
     */
    public void setUntervollmacht(boolean value) {
        this.untervollmacht = value;
    }

    /**
     * Gets the value of the blattzahlDerVollmacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlattzahlDerVollmacht() {
        return blattzahlDerVollmacht;
    }

    /**
     * Sets the value of the blattzahlDerVollmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlattzahlDerVollmacht(String value) {
        this.blattzahlDerVollmacht = value;
    }

}
