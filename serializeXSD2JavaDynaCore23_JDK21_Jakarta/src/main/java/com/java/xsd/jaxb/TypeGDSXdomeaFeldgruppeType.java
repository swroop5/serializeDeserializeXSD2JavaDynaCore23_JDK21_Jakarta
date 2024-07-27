//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Eine Feldgruppe gruppiert mehrere Felder als anwendungsspezifische Metadaten beim Austausch eines Schriftgutobjektes.
 * 
 * <p>Java class for Type.GDS.Xdomea.FeldgruppeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Xdomea.FeldgruppeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unterfeldgruppe" type="{http://www.xjustiz.de}Type.GDS.Xdomea.FeldgruppeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feld" type="{http://www.xjustiz.de}Type.GDS.Xdomea.FeldType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Xdomea.FeldgruppeType", propOrder = {
    "name",
    "beschreibung",
    "unterfeldgruppe",
    "feld"
})
public class TypeGDSXdomeaFeldgruppeType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String beschreibung;
    protected List<TypeGDSXdomeaFeldgruppeType> unterfeldgruppe;
    protected List<TypeGDSXdomeaFeldType> feld;

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
     * Gets the value of the unterfeldgruppe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unterfeldgruppe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnterfeldgruppe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSXdomeaFeldgruppeType }
     * 
     * 
     */
    public List<TypeGDSXdomeaFeldgruppeType> getUnterfeldgruppe() {
        if (unterfeldgruppe == null) {
            unterfeldgruppe = new ArrayList<TypeGDSXdomeaFeldgruppeType>();
        }
        return this.unterfeldgruppe;
    }

    /**
     * Gets the value of the feld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the feld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSXdomeaFeldType }
     * 
     * 
     */
    public List<TypeGDSXdomeaFeldType> getFeld() {
        if (feld == null) {
            feld = new ArrayList<TypeGDSXdomeaFeldType>();
        }
        return this.feld;
    }

}
