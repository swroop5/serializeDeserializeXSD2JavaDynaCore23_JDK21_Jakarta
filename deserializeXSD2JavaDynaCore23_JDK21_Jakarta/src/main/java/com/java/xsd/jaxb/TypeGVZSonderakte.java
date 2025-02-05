//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:07 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GVZ.Sonderakte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GVZ.Sonderakte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dr.nummer" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dr.jahrgang" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dr.register" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="eingangsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="bemerkung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="auftrag"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="auftragsart" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="auftragsart.code" type="{http://www.xjustiz.de}Code.GVZ.Auftragsart"/&gt;
 *                             &lt;element name="auftragsart.datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ref.rollennummer" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="schuldtitel" type="{http://www.xjustiz.de}Type.GVZ.Schuldtitel" maxOccurs="unbounded"/&gt;
 *         &lt;element name="forderung" type="{http://www.xjustiz.de}Type.GVZ.Forderung" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GVZ.Sonderakte", propOrder = {
    "drNummer",
    "drJahrgang",
    "drRegister",
    "eingangsdatum",
    "bemerkung",
    "auftrag",
    "refRollennummer",
    "schuldtitel",
    "forderung"
})
public class TypeGVZSonderakte {

    @XmlElement(name = "dr.nummer", required = true)
    protected BigInteger drNummer;
    @XmlElement(name = "dr.jahrgang", required = true)
    protected BigInteger drJahrgang;
    @XmlElement(name = "dr.register", required = true)
    protected BigInteger drRegister;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eingangsdatum;
    protected String bemerkung;
    @XmlElement(required = true)
    protected TypeGVZSonderakte.Auftrag auftrag;
    @XmlElement(name = "ref.rollennummer", required = true)
    protected List<TypeGDSRefRollennummer> refRollennummer;
    @XmlElement(required = true)
    protected List<TypeGVZSchuldtitel> schuldtitel;
    protected TypeGVZForderung forderung;

    /**
     * Gets the value of the drNummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrNummer() {
        return drNummer;
    }

    /**
     * Sets the value of the drNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrNummer(BigInteger value) {
        this.drNummer = value;
    }

    /**
     * Gets the value of the drJahrgang property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrJahrgang() {
        return drJahrgang;
    }

    /**
     * Sets the value of the drJahrgang property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrJahrgang(BigInteger value) {
        this.drJahrgang = value;
    }

    /**
     * Gets the value of the drRegister property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrRegister() {
        return drRegister;
    }

    /**
     * Sets the value of the drRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrRegister(BigInteger value) {
        this.drRegister = value;
    }

    /**
     * Gets the value of the eingangsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEingangsdatum() {
        return eingangsdatum;
    }

    /**
     * Sets the value of the eingangsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEingangsdatum(XMLGregorianCalendar value) {
        this.eingangsdatum = value;
    }

    /**
     * Gets the value of the bemerkung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the value of the bemerkung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

    /**
     * Gets the value of the auftrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGVZSonderakte.Auftrag }
     *     
     */
    public TypeGVZSonderakte.Auftrag getAuftrag() {
        return auftrag;
    }

    /**
     * Sets the value of the auftrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGVZSonderakte.Auftrag }
     *     
     */
    public void setAuftrag(TypeGVZSonderakte.Auftrag value) {
        this.auftrag = value;
    }

    /**
     * Gets the value of the refRollennummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refRollennummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefRollennummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSRefRollennummer }
     * 
     * 
     */
    public List<TypeGDSRefRollennummer> getRefRollennummer() {
        if (refRollennummer == null) {
            refRollennummer = new ArrayList<TypeGDSRefRollennummer>();
        }
        return this.refRollennummer;
    }

    /**
     * Gets the value of the schuldtitel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the schuldtitel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchuldtitel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGVZSchuldtitel }
     * 
     * 
     */
    public List<TypeGVZSchuldtitel> getSchuldtitel() {
        if (schuldtitel == null) {
            schuldtitel = new ArrayList<TypeGVZSchuldtitel>();
        }
        return this.schuldtitel;
    }

    /**
     * Gets the value of the forderung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGVZForderung }
     *     
     */
    public TypeGVZForderung getForderung() {
        return forderung;
    }

    /**
     * Sets the value of the forderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGVZForderung }
     *     
     */
    public void setForderung(TypeGVZForderung value) {
        this.forderung = value;
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
     *         &lt;element name="auftragsart" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="auftragsart.code" type="{http://www.xjustiz.de}Code.GVZ.Auftragsart"/&gt;
     *                   &lt;element name="auftragsart.datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    @XmlType(name = "", propOrder = {
        "auftragsart"
    })
    public static class Auftrag {

        @XmlElement(required = true)
        protected List<TypeGVZSonderakte.Auftrag.Auftragsart> auftragsart;

        /**
         * Gets the value of the auftragsart property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the auftragsart property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuftragsart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeGVZSonderakte.Auftrag.Auftragsart }
         * 
         * 
         */
        public List<TypeGVZSonderakte.Auftrag.Auftragsart> getAuftragsart() {
            if (auftragsart == null) {
                auftragsart = new ArrayList<TypeGVZSonderakte.Auftrag.Auftragsart>();
            }
            return this.auftragsart;
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
         *         &lt;element name="auftragsart.code" type="{http://www.xjustiz.de}Code.GVZ.Auftragsart"/&gt;
         *         &lt;element name="auftragsart.datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "auftragsartCode",
            "auftragsartDatum"
        })
        public static class Auftragsart {

            @XmlElement(name = "auftragsart.code", required = true)
            protected CodeGVZAuftragsart auftragsartCode;
            @XmlElement(name = "auftragsart.datum", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar auftragsartDatum;

            /**
             * Gets the value of the auftragsartCode property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGVZAuftragsart }
             *     
             */
            public CodeGVZAuftragsart getAuftragsartCode() {
                return auftragsartCode;
            }

            /**
             * Sets the value of the auftragsartCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGVZAuftragsart }
             *     
             */
            public void setAuftragsartCode(CodeGVZAuftragsart value) {
                this.auftragsartCode = value;
            }

            /**
             * Gets the value of the auftragsartDatum property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAuftragsartDatum() {
                return auftragsartDatum;
            }

            /**
             * Sets the value of the auftragsartDatum property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAuftragsartDatum(XMLGregorianCalendar value) {
                this.auftragsartDatum = value;
            }

        }

    }

}
