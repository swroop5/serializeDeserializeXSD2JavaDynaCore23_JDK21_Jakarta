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
 * <p>Java class for Type.STRAF.BFJ.UebermittelndeStelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.BFJ.UebermittelndeStelle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sender" type="{http://www.xjustiz.de}Code.STRAF.BFJ.UebermittelndeStelle.Typ3"/&gt;
 *         &lt;element name="empfaenger" type="{http://www.xjustiz.de}Code.STRAF.BFJ.UebermittelndeStelle.Typ3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.BFJ.UebermittelndeStelle", propOrder = {
    "sender",
    "empfaenger"
})
public class TypeSTRAFBFJUebermittelndeStelle {

    @XmlElement(required = true)
    protected CodeSTRAFBFJUebermittelndeStelleTyp3 sender;
    protected CodeSTRAFBFJUebermittelndeStelleTyp3 empfaenger;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFBFJUebermittelndeStelleTyp3 }
     *     
     */
    public CodeSTRAFBFJUebermittelndeStelleTyp3 getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFBFJUebermittelndeStelleTyp3 }
     *     
     */
    public void setSender(CodeSTRAFBFJUebermittelndeStelleTyp3 value) {
        this.sender = value;
    }

    /**
     * Gets the value of the empfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFBFJUebermittelndeStelleTyp3 }
     *     
     */
    public CodeSTRAFBFJUebermittelndeStelleTyp3 getEmpfaenger() {
        return empfaenger;
    }

    /**
     * Sets the value of the empfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFBFJUebermittelndeStelleTyp3 }
     *     
     */
    public void setEmpfaenger(CodeSTRAFBFJUebermittelndeStelleTyp3 value) {
        this.empfaenger = value;
    }

}
