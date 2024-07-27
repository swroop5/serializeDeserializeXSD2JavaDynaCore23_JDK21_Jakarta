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
 * <p>Java class for Type.GDS.RA.Kanzlei complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.RA.Kanzlei"&gt;
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
 *         &lt;element name="rechtsform" type="{http://www.xjustiz.de}Code.GDS.Rechtsform.Typ3" minOccurs="0"/&gt;
 *         &lt;element name="kanzleiform" type="{http://www.xjustiz.de}Code.GDS.Kanzleiform"/&gt;
 *         &lt;element name="anschrift" type="{http://www.xjustiz.de}Type.GDS.Anschrift" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telekommunikation" type="{http://www.xjustiz.de}Type.GDS.Kommunikation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="raImVerfahren" type="{http://www.xjustiz.de}Type.GDS.NatuerlichePerson" minOccurs="0"/&gt;
 *         &lt;element name="bankverbindung" type="{http://www.xjustiz.de}Type.GDS.Bankverbindung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="umsatzsteuerID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.RA.Kanzlei", propOrder = {
    "bezeichnung",
    "geschlecht",
    "rechtsform",
    "kanzleiform",
    "anschrift",
    "telekommunikation",
    "raImVerfahren",
    "bankverbindung",
    "umsatzsteuerID"
})
public class TypeGDSRAKanzlei {

    @XmlElement(required = true)
    protected TypeGDSRAKanzlei.Bezeichnung bezeichnung;
    protected CodeGDSGeschlecht geschlecht;
    protected CodeGDSRechtsformTyp3 rechtsform;
    @XmlElement(required = true)
    protected CodeGDSKanzleiform kanzleiform;
    protected List<TypeGDSAnschrift> anschrift;
    protected List<TypeGDSKommunikation> telekommunikation;
    protected TypeGDSNatuerlichePerson raImVerfahren;
    protected List<TypeGDSBankverbindung> bankverbindung;
    protected String umsatzsteuerID;

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRAKanzlei.Bezeichnung }
     *     
     */
    public TypeGDSRAKanzlei.Bezeichnung getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRAKanzlei.Bezeichnung }
     *     
     */
    public void setBezeichnung(TypeGDSRAKanzlei.Bezeichnung value) {
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
     * Gets the value of the kanzleiform property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSKanzleiform }
     *     
     */
    public CodeGDSKanzleiform getKanzleiform() {
        return kanzleiform;
    }

    /**
     * Sets the value of the kanzleiform property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSKanzleiform }
     *     
     */
    public void setKanzleiform(CodeGDSKanzleiform value) {
        this.kanzleiform = value;
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
     * Gets the value of the raImVerfahren property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNatuerlichePerson }
     *     
     */
    public TypeGDSNatuerlichePerson getRaImVerfahren() {
        return raImVerfahren;
    }

    /**
     * Sets the value of the raImVerfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNatuerlichePerson }
     *     
     */
    public void setRaImVerfahren(TypeGDSNatuerlichePerson value) {
        this.raImVerfahren = value;
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

}
