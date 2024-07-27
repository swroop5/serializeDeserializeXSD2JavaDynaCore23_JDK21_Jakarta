//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.Erledigung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.Erledigung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.STRAF.Erledigungsarten.Typ3" minOccurs="0"/&gt;
 *         &lt;element name="neuesAktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/&gt;
 *         &lt;element name="erledigungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="verfahren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ref.Tat" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erledigungskennziffer" type="{http://www.xjustiz.de}Type.STRAF.Kennziffer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erledigungsbezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="betroffeneInstanz" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.Erledigung", propOrder = {
    "art",
    "neuesAktenzeichen",
    "erledigungsdatum",
    "beteiligter",
    "verfahren",
    "refTat",
    "erledigungskennziffer",
    "erledigungsbezeichnung",
    "betroffeneInstanz"
})
public class TypeSTRAFErledigung {

    protected CodeSTRAFErledigungsartenTyp3 art;
    protected TypeGDSAktenzeichen neuesAktenzeichen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erledigungsdatum;
    protected List<TypeGDSRefRollennummer> beteiligter;
    @XmlElement(defaultValue = "false")
    protected Boolean verfahren;
    @XmlElement(name = "ref.Tat")
    protected List<String> refTat;
    protected List<TypeSTRAFKennziffer> erledigungskennziffer;
    protected List<String> erledigungsbezeichnung;
    protected TypeSTRAFErledigung.BetroffeneInstanz betroffeneInstanz;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFErledigungsartenTyp3 }
     *     
     */
    public CodeSTRAFErledigungsartenTyp3 getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFErledigungsartenTyp3 }
     *     
     */
    public void setArt(CodeSTRAFErledigungsartenTyp3 value) {
        this.art = value;
    }

    /**
     * Gets the value of the neuesAktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getNeuesAktenzeichen() {
        return neuesAktenzeichen;
    }

    /**
     * Sets the value of the neuesAktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setNeuesAktenzeichen(TypeGDSAktenzeichen value) {
        this.neuesAktenzeichen = value;
    }

    /**
     * Gets the value of the erledigungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErledigungsdatum() {
        return erledigungsdatum;
    }

    /**
     * Sets the value of the erledigungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErledigungsdatum(XMLGregorianCalendar value) {
        this.erledigungsdatum = value;
    }

    /**
     * Gets the value of the beteiligter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the beteiligter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeteiligter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSRefRollennummer }
     * 
     * 
     */
    public List<TypeGDSRefRollennummer> getBeteiligter() {
        if (beteiligter == null) {
            beteiligter = new ArrayList<TypeGDSRefRollennummer>();
        }
        return this.beteiligter;
    }

    /**
     * Gets the value of the verfahren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerfahren() {
        return verfahren;
    }

    /**
     * Sets the value of the verfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerfahren(Boolean value) {
        this.verfahren = value;
    }

    /**
     * Gets the value of the refTat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refTat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefTat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefTat() {
        if (refTat == null) {
            refTat = new ArrayList<String>();
        }
        return this.refTat;
    }

    /**
     * Gets the value of the erledigungskennziffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the erledigungskennziffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErledigungskennziffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFKennziffer }
     * 
     * 
     */
    public List<TypeSTRAFKennziffer> getErledigungskennziffer() {
        if (erledigungskennziffer == null) {
            erledigungskennziffer = new ArrayList<TypeSTRAFKennziffer>();
        }
        return this.erledigungskennziffer;
    }

    /**
     * Gets the value of the erledigungsbezeichnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the erledigungsbezeichnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErledigungsbezeichnung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErledigungsbezeichnung() {
        if (erledigungsbezeichnung == null) {
            erledigungsbezeichnung = new ArrayList<String>();
        }
        return this.erledigungsbezeichnung;
    }

    /**
     * Gets the value of the betroffeneInstanz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFErledigung.BetroffeneInstanz }
     *     
     */
    public TypeSTRAFErledigung.BetroffeneInstanz getBetroffeneInstanz() {
        return betroffeneInstanz;
    }

    /**
     * Sets the value of the betroffeneInstanz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFErledigung.BetroffeneInstanz }
     *     
     */
    public void setBetroffeneInstanz(TypeSTRAFErledigung.BetroffeneInstanz value) {
        this.betroffeneInstanz = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "refInstanznummer"
    })
    public static class BetroffeneInstanz {

        @XmlElement(name = "ref.instanznummer", required = true)
        protected String refInstanznummer;

        /**
         * Gets the value of the refInstanznummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefInstanznummer() {
            return refInstanznummer;
        }

        /**
         * Sets the value of the refInstanznummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefInstanznummer(String value) {
            this.refInstanznummer = value;
        }

    }

}
