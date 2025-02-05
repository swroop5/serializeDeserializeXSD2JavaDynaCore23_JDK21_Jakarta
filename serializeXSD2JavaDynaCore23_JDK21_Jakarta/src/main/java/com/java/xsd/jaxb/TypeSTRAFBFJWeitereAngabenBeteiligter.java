//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.BFJ.WeitereAngabenBeteiligter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.BFJ.WeitereAngabenBeteiligter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ref.rollennummer" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
 *         &lt;element name="artDerAuskunftsdaten" type="{http://www.xjustiz.de}Code.STRAF.BFJ.ArtDerAuskunftsdaten.Typ3" minOccurs="0"/&gt;
 *         &lt;element name="dnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="anschriftUnstrukturiert" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/&gt;
 *         &lt;element name="weitereAngaben" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geburtsnameZweifelhaft" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.BFJ.WeitereAngabenBeteiligter", propOrder = {
    "refRollennummer",
    "artDerAuskunftsdaten",
    "dnummer",
    "anschriftUnstrukturiert",
    "weitereAngaben",
    "geburtsnameZweifelhaft"
})
public class TypeSTRAFBFJWeitereAngabenBeteiligter {

    @XmlElement(name = "ref.rollennummer")
    protected TypeGDSRefRollennummer refRollennummer;
    protected CodeSTRAFBFJArtDerAuskunftsdatenTyp3 artDerAuskunftsdaten;
    protected String dnummer;
    protected String anschriftUnstrukturiert;
    protected List<String> weitereAngaben;
    protected String geburtsnameZweifelhaft;

    /**
     * Gets the value of the refRollennummer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getRefRollennummer() {
        return refRollennummer;
    }

    /**
     * Sets the value of the refRollennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setRefRollennummer(TypeGDSRefRollennummer value) {
        this.refRollennummer = value;
    }

    /**
     * Gets the value of the artDerAuskunftsdaten property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFBFJArtDerAuskunftsdatenTyp3 }
     *     
     */
    public CodeSTRAFBFJArtDerAuskunftsdatenTyp3 getArtDerAuskunftsdaten() {
        return artDerAuskunftsdaten;
    }

    /**
     * Sets the value of the artDerAuskunftsdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFBFJArtDerAuskunftsdatenTyp3 }
     *     
     */
    public void setArtDerAuskunftsdaten(CodeSTRAFBFJArtDerAuskunftsdatenTyp3 value) {
        this.artDerAuskunftsdaten = value;
    }

    /**
     * Gets the value of the dnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnummer() {
        return dnummer;
    }

    /**
     * Sets the value of the dnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnummer(String value) {
        this.dnummer = value;
    }

    /**
     * Gets the value of the anschriftUnstrukturiert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnschriftUnstrukturiert() {
        return anschriftUnstrukturiert;
    }

    /**
     * Sets the value of the anschriftUnstrukturiert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnschriftUnstrukturiert(String value) {
        this.anschriftUnstrukturiert = value;
    }

    /**
     * Gets the value of the weitereAngaben property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the weitereAngaben property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeitereAngaben().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeitereAngaben() {
        if (weitereAngaben == null) {
            weitereAngaben = new ArrayList<String>();
        }
        return this.weitereAngaben;
    }

    /**
     * Gets the value of the geburtsnameZweifelhaft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeburtsnameZweifelhaft() {
        return geburtsnameZweifelhaft;
    }

    /**
     * Sets the value of the geburtsnameZweifelhaft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeburtsnameZweifelhaft(String value) {
        this.geburtsnameZweifelhaft = value;
    }

}
