//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:24:08 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dieser Typ definiert eine generische Struktur für eine Ergebnistabelle.
 * 
 * <p>Java class for Type.INSO.IRI.Ergebnistabelle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.INSO.IRI.Ergebnistabelle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ueberschriften" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="spalte" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                             &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
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
 *         &lt;element name="datenzeile" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="feld" type="{http://www.xjustiz.de}Type.INSO.IRI.Ergebnisdaten.komplex" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "Type.INSO.IRI.Ergebnistabelle", propOrder = {
    "ueberschriften",
    "datenzeile"
})
public class TypeINSOIRIErgebnistabelle {

    protected TypeINSOIRIErgebnistabelle.Ueberschriften ueberschriften;
    protected List<TypeINSOIRIErgebnistabelle.Datenzeile> datenzeile;

    /**
     * Gets the value of the ueberschriften property.
     * 
     * @return
     *     possible object is
     *     {@link TypeINSOIRIErgebnistabelle.Ueberschriften }
     *     
     */
    public TypeINSOIRIErgebnistabelle.Ueberschriften getUeberschriften() {
        return ueberschriften;
    }

    /**
     * Sets the value of the ueberschriften property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeINSOIRIErgebnistabelle.Ueberschriften }
     *     
     */
    public void setUeberschriften(TypeINSOIRIErgebnistabelle.Ueberschriften value) {
        this.ueberschriften = value;
    }

    /**
     * Gets the value of the datenzeile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the datenzeile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatenzeile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeINSOIRIErgebnistabelle.Datenzeile }
     * 
     * 
     */
    public List<TypeINSOIRIErgebnistabelle.Datenzeile> getDatenzeile() {
        if (datenzeile == null) {
            datenzeile = new ArrayList<TypeINSOIRIErgebnistabelle.Datenzeile>();
        }
        return this.datenzeile;
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
     *         &lt;element name="feld" type="{http://www.xjustiz.de}Type.INSO.IRI.Ergebnisdaten.komplex" maxOccurs="unbounded"/&gt;
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
        "feld"
    })
    public static class Datenzeile {

        @XmlElement(required = true)
        protected List<TypeINSOIRIErgebnisdatenKomplex> feld;

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
         * {@link TypeINSOIRIErgebnisdatenKomplex }
         * 
         * 
         */
        public List<TypeINSOIRIErgebnisdatenKomplex> getFeld() {
            if (feld == null) {
                feld = new ArrayList<TypeINSOIRIErgebnisdatenKomplex>();
            }
            return this.feld;
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
     *         &lt;element name="spalte" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                   &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
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
        "spalte"
    })
    public static class Ueberschriften {

        @XmlElement(required = true)
        protected List<TypeINSOIRIErgebnistabelle.Ueberschriften.Spalte> spalte;

        /**
         * Gets the value of the spalte property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the spalte property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpalte().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeINSOIRIErgebnistabelle.Ueberschriften.Spalte }
         * 
         * 
         */
        public List<TypeINSOIRIErgebnistabelle.Ueberschriften.Spalte> getSpalte() {
            if (spalte == null) {
                spalte = new ArrayList<TypeINSOIRIErgebnistabelle.Ueberschriften.Spalte>();
            }
            return this.spalte;
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
         *         &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *         &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
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
            "schluessel",
            "text"
        })
        public static class Spalte {

            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String schluessel;
            protected String text;

            /**
             * Gets the value of the schluessel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchluessel() {
                return schluessel;
            }

            /**
             * Sets the value of the schluessel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchluessel(String value) {
                this.schluessel = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

        }

    }

}
