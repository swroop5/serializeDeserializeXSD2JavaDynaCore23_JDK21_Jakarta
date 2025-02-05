//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Wirksamkeitsvermerk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Wirksamkeitsvermerk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vortretendeBelastung" type="{http://www.xjustiz.de}Type.DABAG.Ref.Belastung"/&gt;
 *         &lt;element name="zuruecktretendeBelastung" type="{http://www.xjustiz.de}Type.DABAG.Ref.Belastung"/&gt;
 *         &lt;element name="betroffeneBuchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Ref.Buchungsstelle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betroffenerEigentuemer" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Wirksamkeitsvermerk", propOrder = {
    "vortretendeBelastung",
    "zuruecktretendeBelastung",
    "betroffeneBuchungsstelle",
    "betroffenerEigentuemer",
    "zusatz"
})
public class TypeDABAGWirksamkeitsvermerk {

    @XmlElement(required = true)
    protected TypeDABAGRefBelastung vortretendeBelastung;
    @XmlElement(required = true)
    protected TypeDABAGRefBelastung zuruecktretendeBelastung;
    protected List<TypeDABAGRefBuchungsstelle> betroffeneBuchungsstelle;
    protected List<TypeDABAGRefEigentuemer> betroffenerEigentuemer;
    protected String zusatz;

    /**
     * Gets the value of the vortretendeBelastung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public TypeDABAGRefBelastung getVortretendeBelastung() {
        return vortretendeBelastung;
    }

    /**
     * Sets the value of the vortretendeBelastung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public void setVortretendeBelastung(TypeDABAGRefBelastung value) {
        this.vortretendeBelastung = value;
    }

    /**
     * Gets the value of the zuruecktretendeBelastung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public TypeDABAGRefBelastung getZuruecktretendeBelastung() {
        return zuruecktretendeBelastung;
    }

    /**
     * Sets the value of the zuruecktretendeBelastung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefBelastung }
     *     
     */
    public void setZuruecktretendeBelastung(TypeDABAGRefBelastung value) {
        this.zuruecktretendeBelastung = value;
    }

    /**
     * Gets the value of the betroffeneBuchungsstelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the betroffeneBuchungsstelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetroffeneBuchungsstelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefBuchungsstelle }
     * 
     * 
     */
    public List<TypeDABAGRefBuchungsstelle> getBetroffeneBuchungsstelle() {
        if (betroffeneBuchungsstelle == null) {
            betroffeneBuchungsstelle = new ArrayList<TypeDABAGRefBuchungsstelle>();
        }
        return this.betroffeneBuchungsstelle;
    }

    /**
     * Gets the value of the betroffenerEigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the betroffenerEigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetroffenerEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefEigentuemer }
     * 
     * 
     */
    public List<TypeDABAGRefEigentuemer> getBetroffenerEigentuemer() {
        if (betroffenerEigentuemer == null) {
            betroffenerEigentuemer = new ArrayList<TypeDABAGRefEigentuemer>();
        }
        return this.betroffenerEigentuemer;
    }

    /**
     * Gets the value of the zusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Sets the value of the zusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
    }

}
