//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Ref.Bankverbindung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Ref.Bankverbindung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ref.bankverbindung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Ref.Bankverbindung", propOrder = {
    "refBankverbindung"
})
public class TypeGDSRefBankverbindung {

    @XmlElement(name = "ref.bankverbindung", required = true)
    protected String refBankverbindung;

    /**
     * Gets the value of the refBankverbindung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBankverbindung() {
        return refBankverbindung;
    }

    /**
     * Sets the value of the refBankverbindung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefBankverbindung(String value) {
        this.refBankverbindung = value;
    }

}
