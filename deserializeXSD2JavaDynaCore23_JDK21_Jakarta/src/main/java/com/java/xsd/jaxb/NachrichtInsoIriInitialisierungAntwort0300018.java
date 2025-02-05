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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="feld" type="{http://www.xjustiz.de}Type.INSO.IRI.FeldRenderingInfo" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="abschnitt" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                             &lt;element name="beschreibung" type="{http://www.xjustiz.de}Type.INSO.IRI.QualifizierterText" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="kontext" type="{http://www.xjustiz.de}Type.INSO.IRI.Basiskontext"/&gt;
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
    "nachrichtenkopf",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.inso.iri.initialisierung.antwort.0300018")
public class NachrichtInsoIriInitialisierungAntwort0300018 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten }
     *     
     */
    public NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten value) {
        this.fachdaten = value;
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
     *         &lt;element name="feld" type="{http://www.xjustiz.de}Type.INSO.IRI.FeldRenderingInfo" maxOccurs="unbounded"/&gt;
     *         &lt;element name="abschnitt" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="schluessel" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                   &lt;element name="beschreibung" type="{http://www.xjustiz.de}Type.INSO.IRI.QualifizierterText" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="kontext" type="{http://www.xjustiz.de}Type.INSO.IRI.Basiskontext"/&gt;
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
        "feld",
        "abschnitt",
        "kontext"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected List<TypeINSOIRIFeldRenderingInfo> feld;
        protected List<NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten.Abschnitt> abschnitt;
        @XmlElement(required = true)
        protected TypeINSOIRIBasiskontext kontext;

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
         * {@link TypeINSOIRIFeldRenderingInfo }
         * 
         * 
         */
        public List<TypeINSOIRIFeldRenderingInfo> getFeld() {
            if (feld == null) {
                feld = new ArrayList<TypeINSOIRIFeldRenderingInfo>();
            }
            return this.feld;
        }

        /**
         * Gets the value of the abschnitt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the abschnitt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbschnitt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten.Abschnitt }
         * 
         * 
         */
        public List<NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten.Abschnitt> getAbschnitt() {
            if (abschnitt == null) {
                abschnitt = new ArrayList<NachrichtInsoIriInitialisierungAntwort0300018 .Fachdaten.Abschnitt>();
            }
            return this.abschnitt;
        }

        /**
         * Gets the value of the kontext property.
         * 
         * @return
         *     possible object is
         *     {@link TypeINSOIRIBasiskontext }
         *     
         */
        public TypeINSOIRIBasiskontext getKontext() {
            return kontext;
        }

        /**
         * Sets the value of the kontext property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeINSOIRIBasiskontext }
         *     
         */
        public void setKontext(TypeINSOIRIBasiskontext value) {
            this.kontext = value;
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
         *         &lt;element name="beschreibung" type="{http://www.xjustiz.de}Type.INSO.IRI.QualifizierterText" minOccurs="0"/&gt;
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
            "beschreibung"
        })
        public static class Abschnitt {

            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String schluessel;
            protected TypeINSOIRIQualifizierterText beschreibung;

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
             * Gets the value of the beschreibung property.
             * 
             * @return
             *     possible object is
             *     {@link TypeINSOIRIQualifizierterText }
             *     
             */
            public TypeINSOIRIQualifizierterText getBeschreibung() {
                return beschreibung;
            }

            /**
             * Sets the value of the beschreibung property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeINSOIRIQualifizierterText }
             *     
             */
            public void setBeschreibung(TypeINSOIRIQualifizierterText value) {
                this.beschreibung = value;
            }

        }

    }

}
