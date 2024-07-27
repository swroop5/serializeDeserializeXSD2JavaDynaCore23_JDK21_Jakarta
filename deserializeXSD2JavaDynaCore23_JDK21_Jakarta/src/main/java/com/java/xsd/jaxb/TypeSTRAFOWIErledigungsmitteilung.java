//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.OWI.Erledigungsmitteilung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.OWI.Erledigungsmitteilung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erledigungsart" type="{http://www.xjustiz.de}Code.STRAF.OWI.Erledigungsart.Typ3" minOccurs="0"/&gt;
 *         &lt;element name="dauer" type="{http://www.xjustiz.de}Type.STRAF.Dauer" minOccurs="0"/&gt;
 *         &lt;element name="erledigungsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/&gt;
 *         &lt;element name="auslagenAg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="auslagenSta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ratenhoehe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.OWI.Erledigungsmitteilung", propOrder = {
    "erledigungsart",
    "dauer",
    "erledigungsdatum",
    "auslagenAg",
    "auslagenSta",
    "ratenhoehe"
})
public class TypeSTRAFOWIErledigungsmitteilung {

    protected CodeSTRAFOWIErledigungsartTyp3 erledigungsart;
    protected TypeSTRAFDauer dauer;
    protected String erledigungsdatum;
    protected Double auslagenAg;
    protected Double auslagenSta;
    protected Double ratenhoehe;

    /**
     * Gets the value of the erledigungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFOWIErledigungsartTyp3 }
     *     
     */
    public CodeSTRAFOWIErledigungsartTyp3 getErledigungsart() {
        return erledigungsart;
    }

    /**
     * Sets the value of the erledigungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFOWIErledigungsartTyp3 }
     *     
     */
    public void setErledigungsart(CodeSTRAFOWIErledigungsartTyp3 value) {
        this.erledigungsart = value;
    }

    /**
     * Gets the value of the dauer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public TypeSTRAFDauer getDauer() {
        return dauer;
    }

    /**
     * Sets the value of the dauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public void setDauer(TypeSTRAFDauer value) {
        this.dauer = value;
    }

    /**
     * Gets the value of the erledigungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErledigungsdatum() {
        return erledigungsdatum;
    }

    /**
     * Sets the value of the erledigungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErledigungsdatum(String value) {
        this.erledigungsdatum = value;
    }

    /**
     * Gets the value of the auslagenAg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuslagenAg() {
        return auslagenAg;
    }

    /**
     * Sets the value of the auslagenAg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuslagenAg(Double value) {
        this.auslagenAg = value;
    }

    /**
     * Gets the value of the auslagenSta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuslagenSta() {
        return auslagenSta;
    }

    /**
     * Sets the value of the auslagenSta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuslagenSta(Double value) {
        this.auslagenSta = value;
    }

    /**
     * Gets the value of the ratenhoehe property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRatenhoehe() {
        return ratenhoehe;
    }

    /**
     * Sets the value of the ratenhoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRatenhoehe(Double value) {
        this.ratenhoehe = value;
    }

}