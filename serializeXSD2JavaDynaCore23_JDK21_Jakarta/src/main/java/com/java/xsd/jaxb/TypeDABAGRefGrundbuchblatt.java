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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Ref.Grundbuchblatt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Ref.Grundbuchblatt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ref.grundbuchblatt" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Ref.Grundbuchblatt")
public class TypeDABAGRefGrundbuchblatt {

    @XmlAttribute(name = "ref.grundbuchblatt", required = true)
    protected String refGrundbuchblatt;

    /**
     * Gets the value of the refGrundbuchblatt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefGrundbuchblatt() {
        return refGrundbuchblatt;
    }

    /**
     * Sets the value of the refGrundbuchblatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefGrundbuchblatt(String value) {
        this.refGrundbuchblatt = value;
    }

}