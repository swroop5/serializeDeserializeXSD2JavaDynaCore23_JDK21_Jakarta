//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:56 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Rechnungspostenblock enthält alle Fachdaten zu den Rechnungsposten des Zahlungspartners.
 * 
 * <p>Java class for Type.KASSE.Rechnungspostenblock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Rechnungspostenblock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hinweis.rechnungspostenblock" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erstschuldner-kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vorbehalt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vorbehaltshinweis" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="vorbehaltsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="anrechnung" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *         &lt;element name="rechnungsposten" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rechnungspostennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="ansatz" type="{http://www.xjustiz.de}Type.KASSE.Ansatz"/&gt;
 *                   &lt;element name="rechnungspostenbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
 *                   &lt;element name="vorbehaltsposten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="gerichtlicheFestlegung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="rechnungspostenbemerkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="durchlaufendesGeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="zweitschuldner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ref.rechnungsposten" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rechnungsposten.gesamtbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Rechnungspostenblock", propOrder = {
    "hinweisRechnungspostenblock",
    "erstschuldnerKassenzeichen",
    "vorbehalt",
    "anrechnung",
    "rechnungsposten",
    "rechnungspostenGesamtbetrag"
})
public class TypeKASSERechnungspostenblock {

    @XmlElement(name = "hinweis.rechnungspostenblock")
    protected List<String> hinweisRechnungspostenblock;
    @XmlElement(name = "erstschuldner-kassenzeichen")
    protected List<String> erstschuldnerKassenzeichen;
    protected TypeKASSERechnungspostenblock.Vorbehalt vorbehalt;
    protected TypeGDSGeldbetrag anrechnung;
    protected List<TypeKASSERechnungspostenblock.Rechnungsposten> rechnungsposten;
    @XmlElement(name = "rechnungsposten.gesamtbetrag", required = true)
    protected TypeGDSGeldbetrag rechnungspostenGesamtbetrag;

    /**
     * Gets the value of the hinweisRechnungspostenblock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hinweisRechnungspostenblock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHinweisRechnungspostenblock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHinweisRechnungspostenblock() {
        if (hinweisRechnungspostenblock == null) {
            hinweisRechnungspostenblock = new ArrayList<String>();
        }
        return this.hinweisRechnungspostenblock;
    }

    /**
     * Gets the value of the erstschuldnerKassenzeichen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the erstschuldnerKassenzeichen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErstschuldnerKassenzeichen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErstschuldnerKassenzeichen() {
        if (erstschuldnerKassenzeichen == null) {
            erstschuldnerKassenzeichen = new ArrayList<String>();
        }
        return this.erstschuldnerKassenzeichen;
    }

    /**
     * Gets the value of the vorbehalt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKASSERechnungspostenblock.Vorbehalt }
     *     
     */
    public TypeKASSERechnungspostenblock.Vorbehalt getVorbehalt() {
        return vorbehalt;
    }

    /**
     * Sets the value of the vorbehalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKASSERechnungspostenblock.Vorbehalt }
     *     
     */
    public void setVorbehalt(TypeKASSERechnungspostenblock.Vorbehalt value) {
        this.vorbehalt = value;
    }

    /**
     * Gets the value of the anrechnung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getAnrechnung() {
        return anrechnung;
    }

    /**
     * Sets the value of the anrechnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setAnrechnung(TypeGDSGeldbetrag value) {
        this.anrechnung = value;
    }

    /**
     * Gets the value of the rechnungsposten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rechnungsposten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechnungsposten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSERechnungspostenblock.Rechnungsposten }
     * 
     * 
     */
    public List<TypeKASSERechnungspostenblock.Rechnungsposten> getRechnungsposten() {
        if (rechnungsposten == null) {
            rechnungsposten = new ArrayList<TypeKASSERechnungspostenblock.Rechnungsposten>();
        }
        return this.rechnungsposten;
    }

    /**
     * Gets the value of the rechnungspostenGesamtbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getRechnungspostenGesamtbetrag() {
        return rechnungspostenGesamtbetrag;
    }

    /**
     * Sets the value of the rechnungspostenGesamtbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setRechnungspostenGesamtbetrag(TypeGDSGeldbetrag value) {
        this.rechnungspostenGesamtbetrag = value;
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
     *         &lt;element name="rechnungspostennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="ansatz" type="{http://www.xjustiz.de}Type.KASSE.Ansatz"/&gt;
     *         &lt;element name="rechnungspostenbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
     *         &lt;element name="vorbehaltsposten" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="gerichtlicheFestlegung" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="rechnungspostenbemerkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="durchlaufendesGeld" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="zweitschuldner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ref.rechnungsposten" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rechnungspostennummer",
        "position",
        "ansatz",
        "rechnungspostenbetrag",
        "vorbehaltsposten",
        "gerichtlicheFestlegung",
        "rechnungspostenbemerkung",
        "durchlaufendesGeld",
        "zweitschuldner",
        "refRechnungsposten"
    })
    public static class Rechnungsposten {

        @XmlElement(required = true)
        protected String rechnungspostennummer;
        @XmlElement(required = true)
        protected BigInteger position;
        @XmlElement(required = true)
        protected TypeKASSEAnsatz ansatz;
        @XmlElement(required = true)
        protected TypeGDSGeldbetrag rechnungspostenbetrag;
        protected Boolean vorbehaltsposten;
        protected Boolean gerichtlicheFestlegung;
        protected String rechnungspostenbemerkung;
        protected Boolean durchlaufendesGeld;
        protected Boolean zweitschuldner;
        @XmlElement(name = "ref.rechnungsposten")
        protected List<String> refRechnungsposten;

        /**
         * Gets the value of the rechnungspostennummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechnungspostennummer() {
            return rechnungspostennummer;
        }

        /**
         * Sets the value of the rechnungspostennummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechnungspostennummer(String value) {
            this.rechnungspostennummer = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPosition(BigInteger value) {
            this.position = value;
        }

        /**
         * Gets the value of the ansatz property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEAnsatz }
         *     
         */
        public TypeKASSEAnsatz getAnsatz() {
            return ansatz;
        }

        /**
         * Sets the value of the ansatz property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEAnsatz }
         *     
         */
        public void setAnsatz(TypeKASSEAnsatz value) {
            this.ansatz = value;
        }

        /**
         * Gets the value of the rechnungspostenbetrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getRechnungspostenbetrag() {
            return rechnungspostenbetrag;
        }

        /**
         * Sets the value of the rechnungspostenbetrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setRechnungspostenbetrag(TypeGDSGeldbetrag value) {
            this.rechnungspostenbetrag = value;
        }

        /**
         * Gets the value of the vorbehaltsposten property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVorbehaltsposten() {
            return vorbehaltsposten;
        }

        /**
         * Sets the value of the vorbehaltsposten property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVorbehaltsposten(Boolean value) {
            this.vorbehaltsposten = value;
        }

        /**
         * Gets the value of the gerichtlicheFestlegung property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGerichtlicheFestlegung() {
            return gerichtlicheFestlegung;
        }

        /**
         * Sets the value of the gerichtlicheFestlegung property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGerichtlicheFestlegung(Boolean value) {
            this.gerichtlicheFestlegung = value;
        }

        /**
         * Gets the value of the rechnungspostenbemerkung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechnungspostenbemerkung() {
            return rechnungspostenbemerkung;
        }

        /**
         * Sets the value of the rechnungspostenbemerkung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechnungspostenbemerkung(String value) {
            this.rechnungspostenbemerkung = value;
        }

        /**
         * Gets the value of the durchlaufendesGeld property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDurchlaufendesGeld() {
            return durchlaufendesGeld;
        }

        /**
         * Sets the value of the durchlaufendesGeld property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDurchlaufendesGeld(Boolean value) {
            this.durchlaufendesGeld = value;
        }

        /**
         * Gets the value of the zweitschuldner property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZweitschuldner() {
            return zweitschuldner;
        }

        /**
         * Sets the value of the zweitschuldner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZweitschuldner(Boolean value) {
            this.zweitschuldner = value;
        }

        /**
         * Gets the value of the refRechnungsposten property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the refRechnungsposten property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefRechnungsposten().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRefRechnungsposten() {
            if (refRechnungsposten == null) {
                refRechnungsposten = new ArrayList<String>();
            }
            return this.refRechnungsposten;
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
     *         &lt;element name="vorbehaltshinweis" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="vorbehaltsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
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
        "vorbehaltshinweis",
        "vorbehaltsbetrag"
    })
    public static class Vorbehalt {

        protected String vorbehaltshinweis;
        protected TypeGDSGeldbetrag vorbehaltsbetrag;

        /**
         * Gets the value of the vorbehaltshinweis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVorbehaltshinweis() {
            return vorbehaltshinweis;
        }

        /**
         * Sets the value of the vorbehaltshinweis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVorbehaltshinweis(String value) {
            this.vorbehaltshinweis = value;
        }

        /**
         * Gets the value of the vorbehaltsbetrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getVorbehaltsbetrag() {
            return vorbehaltsbetrag;
        }

        /**
         * Sets the value of the vorbehaltsbetrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setVorbehaltsbetrag(TypeGDSGeldbetrag value) {
            this.vorbehaltsbetrag = value;
        }

    }

}
