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
 * Ein Feld ist ein anwendungsspezifisches Metadatum, das bei dem Austausch eines Schriftgutobjektes übergeben wird. Die Konfiguration eines Feldes in den austauschenden Systemen muss zwischen den Kommunikationspartnern abgesprochen und in den Systemen umgesetzt sein.
 * 
 * <p>Java class for Type.GDS.Xdomea.FeldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Xdomea.FeldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datentyp" type="{http://www.xjustiz.de}Code.GDS.Datentyp.Typ3" minOccurs="0"/&gt;
 *         &lt;element name="wert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Xdomea.FeldType", propOrder = {
    "name",
    "beschreibung",
    "datentyp",
    "wert"
})
public class TypeGDSXdomeaFeldType {

    @XmlElement(required = true)
    protected String name;
    protected String beschreibung;
    protected CodeGDSDatentypTyp3 datentyp;
    protected String wert;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the datentyp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSDatentypTyp3 }
     *     
     */
    public CodeGDSDatentypTyp3 getDatentyp() {
        return datentyp;
    }

    /**
     * Sets the value of the datentyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSDatentypTyp3 }
     *     
     */
    public void setDatentyp(CodeGDSDatentypTyp3 value) {
        this.datentyp = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWert(String value) {
        this.wert = value;
    }

}
