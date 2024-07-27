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
 * <p>Java class for Type.GDS.Organisation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Organisation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bezeichnung"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bezeichnung.aktuell" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/&gt;
 *                   &lt;element name="bezeichnung.alt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geschlecht" type="{http://www.xjustiz.de}Code.GDS.Geschlecht" minOccurs="0"/&gt;
 *         &lt;element name="kurzbezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="angabenZurRechtsform" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rechtsform" type="{http://www.xjustiz.de}Code.GDS.Rechtsform.Typ3"/&gt;
 *                   &lt;element name="weitereBezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sitz" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ort" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB"/&gt;
 *                   &lt;element name="postleitzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="staat" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="registereintragung" type="{http://www.xjustiz.de}Type.GDS.Registrierung" minOccurs="0"/&gt;
 *         &lt;element name="anschrift" type="{http://www.xjustiz.de}Type.GDS.Anschrift" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telekommunikation" type="{http://www.xjustiz.de}Type.GDS.Kommunikation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="umsatzsteuerID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="bundeseinheitlicheWirtschaftsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Organisation", propOrder = {
    "bezeichnung",
    "geschlecht",
    "kurzbezeichnung",
    "angabenZurRechtsform",
    "sitz",
    "registereintragung",
    "anschrift",
    "telekommunikation",
    "bankverbindung",
    "umsatzsteuerID",
    "bundeseinheitlicheWirtschaftsnummer"
})
public class TypeGDSOrganisation {

    @XmlElement(required = true)
    protected TypeGDSOrganisation.Bezeichnung bezeichnung;
    protected CodeGDSGeschlecht geschlecht;
    protected String kurzbezeichnung;
    protected TypeGDSOrganisation.AngabenZurRechtsform angabenZurRechtsform;
    protected List<TypeGDSOrganisation.Sitz> sitz;
    protected TypeGDSRegistrierung registereintragung;
    protected List<TypeGDSAnschrift> anschrift;
    protected List<TypeGDSKommunikation> telekommunikation;
    protected List<TypeGDSBankverbindung> bankverbindung;
    protected String umsatzsteuerID;
    protected String bundeseinheitlicheWirtschaftsnummer;

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSOrganisation.Bezeichnung }
     *     
     */
    public TypeGDSOrganisation.Bezeichnung getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSOrganisation.Bezeichnung }
     *     
     */
    public void setBezeichnung(TypeGDSOrganisation.Bezeichnung value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSGeschlecht }
     *     
     */
    public CodeGDSGeschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSGeschlecht }
     *     
     */
    public void setGeschlecht(CodeGDSGeschlecht value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the kurzbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurzbezeichnung() {
        return kurzbezeichnung;
    }

    /**
     * Sets the value of the kurzbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurzbezeichnung(String value) {
        this.kurzbezeichnung = value;
    }

    /**
     * Gets the value of the angabenZurRechtsform property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSOrganisation.AngabenZurRechtsform }
     *     
     */
    public TypeGDSOrganisation.AngabenZurRechtsform getAngabenZurRechtsform() {
        return angabenZurRechtsform;
    }

    /**
     * Sets the value of the angabenZurRechtsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSOrganisation.AngabenZurRechtsform }
     *     
     */
    public void setAngabenZurRechtsform(TypeGDSOrganisation.AngabenZurRechtsform value) {
        this.angabenZurRechtsform = value;
    }

    /**
     * Gets the value of the sitz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sitz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSOrganisation.Sitz }
     * 
     * 
     */
    public List<TypeGDSOrganisation.Sitz> getSitz() {
        if (sitz == null) {
            sitz = new ArrayList<TypeGDSOrganisation.Sitz>();
        }
        return this.sitz;
    }

    /**
     * Gets the value of the registereintragung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRegistrierung }
     *     
     */
    public TypeGDSRegistrierung getRegistereintragung() {
        return registereintragung;
    }

    /**
     * Sets the value of the registereintragung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRegistrierung }
     *     
     */
    public void setRegistereintragung(TypeGDSRegistrierung value) {
        this.registereintragung = value;
    }

    /**
     * Gets the value of the anschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the anschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSAnschrift }
     * 
     * 
     */
    public List<TypeGDSAnschrift> getAnschrift() {
        if (anschrift == null) {
            anschrift = new ArrayList<TypeGDSAnschrift>();
        }
        return this.anschrift;
    }

    /**
     * Gets the value of the telekommunikation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the telekommunikation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelekommunikation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSKommunikation }
     * 
     * 
     */
    public List<TypeGDSKommunikation> getTelekommunikation() {
        if (telekommunikation == null) {
            telekommunikation = new ArrayList<TypeGDSKommunikation>();
        }
        return this.telekommunikation;
    }

    /**
     * Gets the value of the bankverbindung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bankverbindung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankverbindung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSBankverbindung }
     * 
     * 
     */
    public List<TypeGDSBankverbindung> getBankverbindung() {
        if (bankverbindung == null) {
            bankverbindung = new ArrayList<TypeGDSBankverbindung>();
        }
        return this.bankverbindung;
    }

    /**
     * Gets the value of the umsatzsteuerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmsatzsteuerID() {
        return umsatzsteuerID;
    }

    /**
     * Sets the value of the umsatzsteuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmsatzsteuerID(String value) {
        this.umsatzsteuerID = value;
    }

    /**
     * Gets the value of the bundeseinheitlicheWirtschaftsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundeseinheitlicheWirtschaftsnummer() {
        return bundeseinheitlicheWirtschaftsnummer;
    }

    /**
     * Sets the value of the bundeseinheitlicheWirtschaftsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundeseinheitlicheWirtschaftsnummer(String value) {
        this.bundeseinheitlicheWirtschaftsnummer = value;
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
     *         &lt;element name="rechtsform" type="{http://www.xjustiz.de}Code.GDS.Rechtsform.Typ3"/&gt;
     *         &lt;element name="weitereBezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
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
        "rechtsform",
        "weitereBezeichnung"
    })
    public static class AngabenZurRechtsform {

        @XmlElement(required = true)
        protected CodeGDSRechtsformTyp3 rechtsform;
        protected String weitereBezeichnung;

        /**
         * Gets the value of the rechtsform property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSRechtsformTyp3 }
         *     
         */
        public CodeGDSRechtsformTyp3 getRechtsform() {
            return rechtsform;
        }

        /**
         * Sets the value of the rechtsform property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSRechtsformTyp3 }
         *     
         */
        public void setRechtsform(CodeGDSRechtsformTyp3 value) {
            this.rechtsform = value;
        }

        /**
         * Gets the value of the weitereBezeichnung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeitereBezeichnung() {
            return weitereBezeichnung;
        }

        /**
         * Sets the value of the weitereBezeichnung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeitereBezeichnung(String value) {
            this.weitereBezeichnung = value;
        }

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
     *         &lt;element name="bezeichnung.aktuell" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/&gt;
     *         &lt;element name="bezeichnung.alt" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "bezeichnungAktuell",
        "bezeichnungAlt"
    })
    public static class Bezeichnung {

        @XmlElement(name = "bezeichnung.aktuell", required = true)
        protected String bezeichnungAktuell;
        @XmlElement(name = "bezeichnung.alt")
        protected List<String> bezeichnungAlt;

        /**
         * Gets the value of the bezeichnungAktuell property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBezeichnungAktuell() {
            return bezeichnungAktuell;
        }

        /**
         * Sets the value of the bezeichnungAktuell property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBezeichnungAktuell(String value) {
            this.bezeichnungAktuell = value;
        }

        /**
         * Gets the value of the bezeichnungAlt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the bezeichnungAlt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBezeichnungAlt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBezeichnungAlt() {
            if (bezeichnungAlt == null) {
                bezeichnungAlt = new ArrayList<String>();
            }
            return this.bezeichnungAlt;
        }

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
     *         &lt;element name="ort" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB"/&gt;
     *         &lt;element name="postleitzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="staat" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3" minOccurs="0"/&gt;
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
        "ort",
        "postleitzahl",
        "staat"
    })
    public static class Sitz {

        @XmlElement(required = true)
        protected String ort;
        protected String postleitzahl;
        protected CodeGDSStaatenTyp3 staat;

        /**
         * Gets the value of the ort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrt() {
            return ort;
        }

        /**
         * Sets the value of the ort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrt(String value) {
            this.ort = value;
        }

        /**
         * Gets the value of the postleitzahl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostleitzahl() {
            return postleitzahl;
        }

        /**
         * Sets the value of the postleitzahl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostleitzahl(String value) {
            this.postleitzahl = value;
        }

        /**
         * Gets the value of the staat property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSStaatenTyp3 }
         *     
         */
        public CodeGDSStaatenTyp3 getStaat() {
            return staat;
        }

        /**
         * Sets the value of the staat property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSStaatenTyp3 }
         *     
         */
        public void setStaat(CodeGDSStaatenTyp3 value) {
            this.staat = value;
        }

    }

}