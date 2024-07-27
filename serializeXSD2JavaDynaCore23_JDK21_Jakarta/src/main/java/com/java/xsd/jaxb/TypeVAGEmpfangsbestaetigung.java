//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:28 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.VAG.Empfangsbestaetigung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VAG.Empfangsbestaetigung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anfrage.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="auskunft.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="entscheidung.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="versicherungstraeger" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="schluesselnummer.versorgungstraeger" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VAG.Empfangsbestaetigung", propOrder = {
    "anfrageID",
    "auskunftID",
    "entscheidungID",
    "versicherungstraeger",
    "schluesselnummerVersorgungstraeger"
})
public class TypeVAGEmpfangsbestaetigung {

    @XmlElement(name = "anfrage.ID", required = true)
    protected String anfrageID;
    @XmlElement(name = "auskunft.ID")
    protected String auskunftID;
    @XmlElement(name = "entscheidung.ID")
    protected String entscheidungID;
    @XmlElement(required = true)
    protected TypeGDSRefRollennummer versicherungstraeger;
    @XmlElement(name = "schluesselnummer.versorgungstraeger")
    protected String schluesselnummerVersorgungstraeger;

    /**
     * Gets the value of the anfrageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnfrageID() {
        return anfrageID;
    }

    /**
     * Sets the value of the anfrageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnfrageID(String value) {
        this.anfrageID = value;
    }

    /**
     * Gets the value of the auskunftID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuskunftID() {
        return auskunftID;
    }

    /**
     * Sets the value of the auskunftID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuskunftID(String value) {
        this.auskunftID = value;
    }

    /**
     * Gets the value of the entscheidungID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntscheidungID() {
        return entscheidungID;
    }

    /**
     * Sets the value of the entscheidungID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntscheidungID(String value) {
        this.entscheidungID = value;
    }

    /**
     * Gets the value of the versicherungstraeger property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getVersicherungstraeger() {
        return versicherungstraeger;
    }

    /**
     * Sets the value of the versicherungstraeger property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setVersicherungstraeger(TypeGDSRefRollennummer value) {
        this.versicherungstraeger = value;
    }

    /**
     * Gets the value of the schluesselnummerVersorgungstraeger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchluesselnummerVersorgungstraeger() {
        return schluesselnummerVersorgungstraeger;
    }

    /**
     * Sets the value of the schluesselnummerVersorgungstraeger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchluesselnummerVersorgungstraeger(String value) {
        this.schluesselnummerVersorgungstraeger = value;
    }

}