//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Teilflaechenbelastung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Teilflaechenbelastung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flurstueck" type="{http://www.xjustiz.de}Type.DABAG.Ref.Flurstueck"/&gt;
 *         &lt;element name="istTeilweiseBelastet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Teilflaechenbelastung", propOrder = {
    "flurstueck",
    "istTeilweiseBelastet"
})
public class TypeDABAGTeilflaechenbelastung {

    @XmlElement(required = true)
    protected TypeDABAGRefFlurstueck flurstueck;
    protected Boolean istTeilweiseBelastet;

    /**
     * Gets the value of the flurstueck property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefFlurstueck }
     *     
     */
    public TypeDABAGRefFlurstueck getFlurstueck() {
        return flurstueck;
    }

    /**
     * Sets the value of the flurstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefFlurstueck }
     *     
     */
    public void setFlurstueck(TypeDABAGRefFlurstueck value) {
        this.flurstueck = value;
    }

    /**
     * Gets the value of the istTeilweiseBelastet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstTeilweiseBelastet() {
        return istTeilweiseBelastet;
    }

    /**
     * Sets the value of the istTeilweiseBelastet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstTeilweiseBelastet(Boolean value) {
        this.istTeilweiseBelastet = value;
    }

}