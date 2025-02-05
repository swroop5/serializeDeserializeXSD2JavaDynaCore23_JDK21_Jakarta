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
 * <p>Java class for Type.DABAG.Belastung.Abt3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Belastung.Abt3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xjustiz.de}Type.DABAG.Belastung"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.DABAG.Belastungstyp.Abt3" minOccurs="0"/&gt;
 *         &lt;element name="buchgrundschuld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *         &lt;element name="betragP10ZVG" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *         &lt;element name="auswahl_aufschiebendeBedingungP10ZVG" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="auswahl_ausschluss1179a" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="auswahl_ausschluss1179b" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eintragungsgrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="zahlungsbedingung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="besondererGlaeubiger" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="zins" type="{http://www.xjustiz.de}Type.DABAG.Zins" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nebenleistung" type="{http://www.xjustiz.de}Type.DABAG.Nebenleistung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vollstreckbarkeit" type="{http://www.xjustiz.de}Type.DABAG.Vollstreckbarkeit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grundbuchvertreter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
 *         &lt;element name="beguenstigtesRecht1179a" type="{http://www.xjustiz.de}Type.DABAG.Identifikation.Belastung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Belastung.Abt3", propOrder = {
    "art",
    "buchgrundschuld",
    "betrag",
    "betragP10ZVG",
    "auswahlAufschiebendeBedingungP10ZVG",
    "auswahlAusschluss1179A",
    "auswahlAusschluss1179B",
    "eintragungsgrund",
    "zahlungsbedingung",
    "besondererGlaeubiger",
    "zins",
    "nebenleistung",
    "vollstreckbarkeit",
    "grundbuchvertreter",
    "beguenstigtesRecht1179A"
})
public class TypeDABAGBelastungAbt3
    extends TypeDABAGBelastung
{

    protected CodeDABAGBelastungstypAbt3 art;
    protected Boolean buchgrundschuld;
    protected TypeGDSGeldbetrag betrag;
    protected TypeGDSGeldbetrag betragP10ZVG;
    @XmlElement(name = "auswahl_aufschiebendeBedingungP10ZVG")
    protected TypeDABAGBelastungAbt3 .AuswahlAufschiebendeBedingungP10ZVG auswahlAufschiebendeBedingungP10ZVG;
    @XmlElement(name = "auswahl_ausschluss1179a")
    protected TypeDABAGBelastungAbt3 .AuswahlAusschluss1179A auswahlAusschluss1179A;
    @XmlElement(name = "auswahl_ausschluss1179b")
    protected TypeDABAGBelastungAbt3 .AuswahlAusschluss1179B auswahlAusschluss1179B;
    protected String eintragungsgrund;
    protected String zahlungsbedingung;
    protected String besondererGlaeubiger;
    protected List<TypeDABAGZins> zins;
    protected List<TypeDABAGNebenleistung> nebenleistung;
    protected List<TypeDABAGVollstreckbarkeit> vollstreckbarkeit;
    protected TypeGDSRefRollennummer grundbuchvertreter;
    @XmlElement(name = "beguenstigtesRecht1179a")
    protected List<TypeDABAGIdentifikationBelastung> beguenstigtesRecht1179A;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDABAGBelastungstypAbt3 }
     *     
     */
    public CodeDABAGBelastungstypAbt3 getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDABAGBelastungstypAbt3 }
     *     
     */
    public void setArt(CodeDABAGBelastungstypAbt3 value) {
        this.art = value;
    }

    /**
     * Gets the value of the buchgrundschuld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuchgrundschuld() {
        return buchgrundschuld;
    }

    /**
     * Sets the value of the buchgrundschuld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuchgrundschuld(Boolean value) {
        this.buchgrundschuld = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setBetrag(TypeGDSGeldbetrag value) {
        this.betrag = value;
    }

    /**
     * Gets the value of the betragP10ZVG property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getBetragP10ZVG() {
        return betragP10ZVG;
    }

    /**
     * Sets the value of the betragP10ZVG property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setBetragP10ZVG(TypeGDSGeldbetrag value) {
        this.betragP10ZVG = value;
    }

    /**
     * Gets the value of the auswahlAufschiebendeBedingungP10ZVG property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAufschiebendeBedingungP10ZVG }
     *     
     */
    public TypeDABAGBelastungAbt3 .AuswahlAufschiebendeBedingungP10ZVG getAuswahlAufschiebendeBedingungP10ZVG() {
        return auswahlAufschiebendeBedingungP10ZVG;
    }

    /**
     * Sets the value of the auswahlAufschiebendeBedingungP10ZVG property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAufschiebendeBedingungP10ZVG }
     *     
     */
    public void setAuswahlAufschiebendeBedingungP10ZVG(TypeDABAGBelastungAbt3 .AuswahlAufschiebendeBedingungP10ZVG value) {
        this.auswahlAufschiebendeBedingungP10ZVG = value;
    }

    /**
     * Gets the value of the auswahlAusschluss1179A property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAusschluss1179A }
     *     
     */
    public TypeDABAGBelastungAbt3 .AuswahlAusschluss1179A getAuswahlAusschluss1179A() {
        return auswahlAusschluss1179A;
    }

    /**
     * Sets the value of the auswahlAusschluss1179A property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAusschluss1179A }
     *     
     */
    public void setAuswahlAusschluss1179A(TypeDABAGBelastungAbt3 .AuswahlAusschluss1179A value) {
        this.auswahlAusschluss1179A = value;
    }

    /**
     * Gets the value of the auswahlAusschluss1179B property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAusschluss1179B }
     *     
     */
    public TypeDABAGBelastungAbt3 .AuswahlAusschluss1179B getAuswahlAusschluss1179B() {
        return auswahlAusschluss1179B;
    }

    /**
     * Sets the value of the auswahlAusschluss1179B property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGBelastungAbt3 .AuswahlAusschluss1179B }
     *     
     */
    public void setAuswahlAusschluss1179B(TypeDABAGBelastungAbt3 .AuswahlAusschluss1179B value) {
        this.auswahlAusschluss1179B = value;
    }

    /**
     * Gets the value of the eintragungsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEintragungsgrund() {
        return eintragungsgrund;
    }

    /**
     * Sets the value of the eintragungsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEintragungsgrund(String value) {
        this.eintragungsgrund = value;
    }

    /**
     * Gets the value of the zahlungsbedingung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZahlungsbedingung() {
        return zahlungsbedingung;
    }

    /**
     * Sets the value of the zahlungsbedingung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZahlungsbedingung(String value) {
        this.zahlungsbedingung = value;
    }

    /**
     * Gets the value of the besondererGlaeubiger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBesondererGlaeubiger() {
        return besondererGlaeubiger;
    }

    /**
     * Sets the value of the besondererGlaeubiger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBesondererGlaeubiger(String value) {
        this.besondererGlaeubiger = value;
    }

    /**
     * Gets the value of the zins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the zins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGZins }
     * 
     * 
     */
    public List<TypeDABAGZins> getZins() {
        if (zins == null) {
            zins = new ArrayList<TypeDABAGZins>();
        }
        return this.zins;
    }

    /**
     * Gets the value of the nebenleistung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nebenleistung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNebenleistung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGNebenleistung }
     * 
     * 
     */
    public List<TypeDABAGNebenleistung> getNebenleistung() {
        if (nebenleistung == null) {
            nebenleistung = new ArrayList<TypeDABAGNebenleistung>();
        }
        return this.nebenleistung;
    }

    /**
     * Gets the value of the vollstreckbarkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vollstreckbarkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVollstreckbarkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGVollstreckbarkeit }
     * 
     * 
     */
    public List<TypeDABAGVollstreckbarkeit> getVollstreckbarkeit() {
        if (vollstreckbarkeit == null) {
            vollstreckbarkeit = new ArrayList<TypeDABAGVollstreckbarkeit>();
        }
        return this.vollstreckbarkeit;
    }

    /**
     * Gets the value of the grundbuchvertreter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getGrundbuchvertreter() {
        return grundbuchvertreter;
    }

    /**
     * Sets the value of the grundbuchvertreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setGrundbuchvertreter(TypeGDSRefRollennummer value) {
        this.grundbuchvertreter = value;
    }

    /**
     * Gets the value of the beguenstigtesRecht1179A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the beguenstigtesRecht1179A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeguenstigtesRecht1179A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGIdentifikationBelastung }
     * 
     * 
     */
    public List<TypeDABAGIdentifikationBelastung> getBeguenstigtesRecht1179A() {
        if (beguenstigtesRecht1179A == null) {
            beguenstigtesRecht1179A = new ArrayList<TypeDABAGIdentifikationBelastung>();
        }
        return this.beguenstigtesRecht1179A;
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
     *       &lt;choice&gt;
     *         &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vollstaendig",
        "teilweise"
    })
    public static class AuswahlAufschiebendeBedingungP10ZVG {

        protected String vollstaendig;
        protected String teilweise;

        /**
         * Gets the value of the vollstaendig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVollstaendig() {
            return vollstaendig;
        }

        /**
         * Sets the value of the vollstaendig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVollstaendig(String value) {
            this.vollstaendig = value;
        }

        /**
         * Gets the value of the teilweise property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeilweise() {
            return teilweise;
        }

        /**
         * Sets the value of the teilweise property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeilweise(String value) {
            this.teilweise = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vollstaendig",
        "teilweise"
    })
    public static class AuswahlAusschluss1179A {

        protected String vollstaendig;
        protected String teilweise;

        /**
         * Gets the value of the vollstaendig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVollstaendig() {
            return vollstaendig;
        }

        /**
         * Sets the value of the vollstaendig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVollstaendig(String value) {
            this.vollstaendig = value;
        }

        /**
         * Gets the value of the teilweise property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeilweise() {
            return teilweise;
        }

        /**
         * Sets the value of the teilweise property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeilweise(String value) {
            this.teilweise = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="vollstaendig" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="teilweise" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vollstaendig",
        "teilweise"
    })
    public static class AuswahlAusschluss1179B {

        protected String vollstaendig;
        protected String teilweise;

        /**
         * Gets the value of the vollstaendig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVollstaendig() {
            return vollstaendig;
        }

        /**
         * Sets the value of the vollstaendig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVollstaendig(String value) {
            this.vollstaendig = value;
        }

        /**
         * Gets the value of the teilweise property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeilweise() {
            return teilweise;
        }

        /**
         * Sets the value of the teilweise property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeilweise(String value) {
            this.teilweise = value;
        }

    }

}
