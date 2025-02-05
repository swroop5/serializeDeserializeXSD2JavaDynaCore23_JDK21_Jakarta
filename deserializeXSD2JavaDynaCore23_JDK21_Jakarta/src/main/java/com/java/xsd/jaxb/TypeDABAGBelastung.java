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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Belastung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Belastung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="istVormerkung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vormerkungsinhalt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="belasteteBuchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Ref.Buchungsstelle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="teilflaechenbelastung" type="{http://www.xjustiz.de}Type.DABAG.Teilflaechenbelastung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="belasteterEigentuemer" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="berechtigter" type="{http://www.xjustiz.de}Type.DABAG.Berechtigter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rangvorbehalt" type="{http://www.xjustiz.de}Type.DABAG.Rangvorbehalt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bedingt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="befristet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="abtretungsausschluss" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="vorloeschklausel" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="verfuegungsbeschraenkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="widerspruchBelastung" type="{http://www.xjustiz.de}Type.DABAG.Widerspruch.Belastung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eintragungsgrundlage" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eintragungsgrundlage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bundeslandfremdesGrundbuchblatt" type="{http://www.xjustiz.de}Type.DABAG.BundeslandfremdesGrundbuchblatt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aenderungsvormerkung" type="{http://www.xjustiz.de}Type.DABAG.Aenderungsvormerkung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Belastung", propOrder = {
    "lfdNummer",
    "istVormerkung",
    "vormerkungsinhalt",
    "belasteteBuchungsstelle",
    "teilflaechenbelastung",
    "belasteterEigentuemer",
    "berechtigter",
    "rangvorbehalt",
    "bedingt",
    "befristet",
    "abtretungsausschluss",
    "vorloeschklausel",
    "verfuegungsbeschraenkung",
    "zusatz",
    "widerspruchBelastung",
    "eintragungsgrundlage",
    "bundeslandfremdesGrundbuchblatt",
    "aenderungsvormerkung"
})
@XmlSeeAlso({
    TypeDABAGBelastungAbt2 .class,
    TypeDABAGBelastungAbt3 .class
})
public class TypeDABAGBelastung {

    protected String lfdNummer;
    protected Boolean istVormerkung;
    protected String vormerkungsinhalt;
    protected List<TypeDABAGRefBuchungsstelle> belasteteBuchungsstelle;
    protected List<TypeDABAGTeilflaechenbelastung> teilflaechenbelastung;
    protected List<TypeDABAGRefEigentuemer> belasteterEigentuemer;
    protected List<TypeDABAGBerechtigter> berechtigter;
    protected List<TypeDABAGRangvorbehalt> rangvorbehalt;
    protected Boolean bedingt;
    protected Boolean befristet;
    protected String abtretungsausschluss;
    protected String vorloeschklausel;
    protected String verfuegungsbeschraenkung;
    protected String zusatz;
    protected List<TypeDABAGWiderspruchBelastung> widerspruchBelastung;
    protected List<TypeDABAGRefEintragungsgrundlage> eintragungsgrundlage;
    protected List<TypeDABAGBundeslandfremdesGrundbuchblatt> bundeslandfremdesGrundbuchblatt;
    protected List<TypeDABAGAenderungsvormerkung> aenderungsvormerkung;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the lfdNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfdNummer() {
        return lfdNummer;
    }

    /**
     * Sets the value of the lfdNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfdNummer(String value) {
        this.lfdNummer = value;
    }

    /**
     * Gets the value of the istVormerkung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstVormerkung() {
        return istVormerkung;
    }

    /**
     * Sets the value of the istVormerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstVormerkung(Boolean value) {
        this.istVormerkung = value;
    }

    /**
     * Gets the value of the vormerkungsinhalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVormerkungsinhalt() {
        return vormerkungsinhalt;
    }

    /**
     * Sets the value of the vormerkungsinhalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVormerkungsinhalt(String value) {
        this.vormerkungsinhalt = value;
    }

    /**
     * Gets the value of the belasteteBuchungsstelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the belasteteBuchungsstelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelasteteBuchungsstelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefBuchungsstelle }
     * 
     * 
     */
    public List<TypeDABAGRefBuchungsstelle> getBelasteteBuchungsstelle() {
        if (belasteteBuchungsstelle == null) {
            belasteteBuchungsstelle = new ArrayList<TypeDABAGRefBuchungsstelle>();
        }
        return this.belasteteBuchungsstelle;
    }

    /**
     * Gets the value of the teilflaechenbelastung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the teilflaechenbelastung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeilflaechenbelastung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGTeilflaechenbelastung }
     * 
     * 
     */
    public List<TypeDABAGTeilflaechenbelastung> getTeilflaechenbelastung() {
        if (teilflaechenbelastung == null) {
            teilflaechenbelastung = new ArrayList<TypeDABAGTeilflaechenbelastung>();
        }
        return this.teilflaechenbelastung;
    }

    /**
     * Gets the value of the belasteterEigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the belasteterEigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelasteterEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefEigentuemer }
     * 
     * 
     */
    public List<TypeDABAGRefEigentuemer> getBelasteterEigentuemer() {
        if (belasteterEigentuemer == null) {
            belasteterEigentuemer = new ArrayList<TypeDABAGRefEigentuemer>();
        }
        return this.belasteterEigentuemer;
    }

    /**
     * Gets the value of the berechtigter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the berechtigter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBerechtigter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGBerechtigter }
     * 
     * 
     */
    public List<TypeDABAGBerechtigter> getBerechtigter() {
        if (berechtigter == null) {
            berechtigter = new ArrayList<TypeDABAGBerechtigter>();
        }
        return this.berechtigter;
    }

    /**
     * Gets the value of the rangvorbehalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rangvorbehalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangvorbehalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRangvorbehalt }
     * 
     * 
     */
    public List<TypeDABAGRangvorbehalt> getRangvorbehalt() {
        if (rangvorbehalt == null) {
            rangvorbehalt = new ArrayList<TypeDABAGRangvorbehalt>();
        }
        return this.rangvorbehalt;
    }

    /**
     * Gets the value of the bedingt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBedingt() {
        return bedingt;
    }

    /**
     * Sets the value of the bedingt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBedingt(Boolean value) {
        this.bedingt = value;
    }

    /**
     * Gets the value of the befristet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBefristet() {
        return befristet;
    }

    /**
     * Sets the value of the befristet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBefristet(Boolean value) {
        this.befristet = value;
    }

    /**
     * Gets the value of the abtretungsausschluss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbtretungsausschluss() {
        return abtretungsausschluss;
    }

    /**
     * Sets the value of the abtretungsausschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbtretungsausschluss(String value) {
        this.abtretungsausschluss = value;
    }

    /**
     * Gets the value of the vorloeschklausel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorloeschklausel() {
        return vorloeschklausel;
    }

    /**
     * Sets the value of the vorloeschklausel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorloeschklausel(String value) {
        this.vorloeschklausel = value;
    }

    /**
     * Gets the value of the verfuegungsbeschraenkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerfuegungsbeschraenkung() {
        return verfuegungsbeschraenkung;
    }

    /**
     * Sets the value of the verfuegungsbeschraenkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerfuegungsbeschraenkung(String value) {
        this.verfuegungsbeschraenkung = value;
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

    /**
     * Gets the value of the widerspruchBelastung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the widerspruchBelastung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiderspruchBelastung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGWiderspruchBelastung }
     * 
     * 
     */
    public List<TypeDABAGWiderspruchBelastung> getWiderspruchBelastung() {
        if (widerspruchBelastung == null) {
            widerspruchBelastung = new ArrayList<TypeDABAGWiderspruchBelastung>();
        }
        return this.widerspruchBelastung;
    }

    /**
     * Gets the value of the eintragungsgrundlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eintragungsgrundlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEintragungsgrundlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefEintragungsgrundlage }
     * 
     * 
     */
    public List<TypeDABAGRefEintragungsgrundlage> getEintragungsgrundlage() {
        if (eintragungsgrundlage == null) {
            eintragungsgrundlage = new ArrayList<TypeDABAGRefEintragungsgrundlage>();
        }
        return this.eintragungsgrundlage;
    }

    /**
     * Gets the value of the bundeslandfremdesGrundbuchblatt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bundeslandfremdesGrundbuchblatt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundeslandfremdesGrundbuchblatt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGBundeslandfremdesGrundbuchblatt }
     * 
     * 
     */
    public List<TypeDABAGBundeslandfremdesGrundbuchblatt> getBundeslandfremdesGrundbuchblatt() {
        if (bundeslandfremdesGrundbuchblatt == null) {
            bundeslandfremdesGrundbuchblatt = new ArrayList<TypeDABAGBundeslandfremdesGrundbuchblatt>();
        }
        return this.bundeslandfremdesGrundbuchblatt;
    }

    /**
     * Gets the value of the aenderungsvormerkung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aenderungsvormerkung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAenderungsvormerkung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGAenderungsvormerkung }
     * 
     * 
     */
    public List<TypeDABAGAenderungsvormerkung> getAenderungsvormerkung() {
        if (aenderungsvormerkung == null) {
            aenderungsvormerkung = new ArrayList<TypeDABAGAenderungsvormerkung>();
        }
        return this.aenderungsvormerkung;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
