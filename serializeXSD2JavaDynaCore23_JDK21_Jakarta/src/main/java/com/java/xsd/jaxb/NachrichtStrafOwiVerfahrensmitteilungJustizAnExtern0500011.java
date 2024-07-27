//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Basisnachricht"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.OWI.Erledigungsmitteilung" minOccurs="0"/&gt;
 *                   &lt;element name="einspruch" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="datumDesEinspruchs" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="entscheidungsbehoerde" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="entscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="entscheidungsart" type="{http://www.xjustiz.de}Code.STRAF.Entscheidungsart.Typ3"/&gt;
 *                             &lt;element name="ergebnisart" type="{http://www.xjustiz.de}Code.STRAF.Ergebnisart.Typ3"/&gt;
 *                             &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" minOccurs="0"/&gt;
 *                             &lt;element name="geldbusse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                             &lt;element name="fahrverbot" type="{http://www.xjustiz.de}Type.STRAF.Dauer" minOccurs="0"/&gt;
 *                             &lt;element name="aufgrundStrafverfahrenAufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="keinEinspruch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="verstorben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ruecknahme" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.straf.owi.verfahrensmitteilung.justizAnExtern.0500011")
public class NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011
    extends TypeGDSBasisnachricht
{

    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten fachdaten;

    /**
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public TypeGDSSchriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(TypeGDSSchriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten }
     *     
     */
    public NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten value) {
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
     *         &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.OWI.Erledigungsmitteilung" minOccurs="0"/&gt;
     *         &lt;element name="einspruch" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="datumDesEinspruchs" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="entscheidungsbehoerde" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="entscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="entscheidungsart" type="{http://www.xjustiz.de}Code.STRAF.Entscheidungsart.Typ3"/&gt;
     *                   &lt;element name="ergebnisart" type="{http://www.xjustiz.de}Code.STRAF.Ergebnisart.Typ3"/&gt;
     *                   &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" minOccurs="0"/&gt;
     *                   &lt;element name="geldbusse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                   &lt;element name="fahrverbot" type="{http://www.xjustiz.de}Type.STRAF.Dauer" minOccurs="0"/&gt;
     *                   &lt;element name="aufgrundStrafverfahrenAufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="keinEinspruch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="verstorben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ruecknahme" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "erledigung",
        "einspruch",
        "keinEinspruch",
        "verstorben",
        "ruecknahme"
    })
    public static class Fachdaten {

        protected TypeSTRAFOWIErledigungsmitteilung erledigung;
        protected NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch einspruch;
        protected Boolean keinEinspruch;
        protected Boolean verstorben;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ruecknahme;

        /**
         * Gets the value of the erledigung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSTRAFOWIErledigungsmitteilung }
         *     
         */
        public TypeSTRAFOWIErledigungsmitteilung getErledigung() {
            return erledigung;
        }

        /**
         * Sets the value of the erledigung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSTRAFOWIErledigungsmitteilung }
         *     
         */
        public void setErledigung(TypeSTRAFOWIErledigungsmitteilung value) {
            this.erledigung = value;
        }

        /**
         * Gets the value of the einspruch property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch }
         *     
         */
        public NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch getEinspruch() {
            return einspruch;
        }

        /**
         * Sets the value of the einspruch property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch }
         *     
         */
        public void setEinspruch(NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch value) {
            this.einspruch = value;
        }

        /**
         * Gets the value of the keinEinspruch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isKeinEinspruch() {
            return keinEinspruch;
        }

        /**
         * Sets the value of the keinEinspruch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setKeinEinspruch(Boolean value) {
            this.keinEinspruch = value;
        }

        /**
         * Gets the value of the verstorben property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVerstorben() {
            return verstorben;
        }

        /**
         * Sets the value of the verstorben property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVerstorben(Boolean value) {
            this.verstorben = value;
        }

        /**
         * Gets the value of the ruecknahme property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRuecknahme() {
            return ruecknahme;
        }

        /**
         * Sets the value of the ruecknahme property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRuecknahme(XMLGregorianCalendar value) {
            this.ruecknahme = value;
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
         *         &lt;element name="datumDesEinspruchs" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="entscheidungsbehoerde" minOccurs="0"&gt;
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
         *         &lt;element name="entscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="entscheidungsart" type="{http://www.xjustiz.de}Code.STRAF.Entscheidungsart.Typ3"/&gt;
         *         &lt;element name="ergebnisart" type="{http://www.xjustiz.de}Code.STRAF.Ergebnisart.Typ3"/&gt;
         *         &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" minOccurs="0"/&gt;
         *         &lt;element name="geldbusse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *         &lt;element name="fahrverbot" type="{http://www.xjustiz.de}Type.STRAF.Dauer" minOccurs="0"/&gt;
         *         &lt;element name="aufgrundStrafverfahrenAufgehoben" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
            "datumDesEinspruchs",
            "entscheidungsbehoerde",
            "entscheidungsdatum",
            "entscheidungsart",
            "ergebnisart",
            "rechtskraft",
            "geldbusse",
            "fahrverbot",
            "aufgrundStrafverfahrenAufgehoben"
        })
        public static class Einspruch {

            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumDesEinspruchs;
            protected NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch.Entscheidungsbehoerde entscheidungsbehoerde;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar entscheidungsdatum;
            @XmlElement(required = true)
            protected CodeSTRAFEntscheidungsartTyp3 entscheidungsart;
            @XmlElement(required = true)
            protected CodeSTRAFErgebnisartTyp3 ergebnisart;
            protected TypeSTRAFRechtskraft rechtskraft;
            protected Double geldbusse;
            protected TypeSTRAFDauer fahrverbot;
            protected Boolean aufgrundStrafverfahrenAufgehoben;

            /**
             * Gets the value of the datumDesEinspruchs property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatumDesEinspruchs() {
                return datumDesEinspruchs;
            }

            /**
             * Sets the value of the datumDesEinspruchs property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatumDesEinspruchs(XMLGregorianCalendar value) {
                this.datumDesEinspruchs = value;
            }

            /**
             * Gets the value of the entscheidungsbehoerde property.
             * 
             * @return
             *     possible object is
             *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch.Entscheidungsbehoerde }
             *     
             */
            public NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch.Entscheidungsbehoerde getEntscheidungsbehoerde() {
                return entscheidungsbehoerde;
            }

            /**
             * Sets the value of the entscheidungsbehoerde property.
             * 
             * @param value
             *     allowed object is
             *     {@link NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch.Entscheidungsbehoerde }
             *     
             */
            public void setEntscheidungsbehoerde(NachrichtStrafOwiVerfahrensmitteilungJustizAnExtern0500011 .Fachdaten.Einspruch.Entscheidungsbehoerde value) {
                this.entscheidungsbehoerde = value;
            }

            /**
             * Gets the value of the entscheidungsdatum property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEntscheidungsdatum() {
                return entscheidungsdatum;
            }

            /**
             * Sets the value of the entscheidungsdatum property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEntscheidungsdatum(XMLGregorianCalendar value) {
                this.entscheidungsdatum = value;
            }

            /**
             * Gets the value of the entscheidungsart property.
             * 
             * @return
             *     possible object is
             *     {@link CodeSTRAFEntscheidungsartTyp3 }
             *     
             */
            public CodeSTRAFEntscheidungsartTyp3 getEntscheidungsart() {
                return entscheidungsart;
            }

            /**
             * Sets the value of the entscheidungsart property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeSTRAFEntscheidungsartTyp3 }
             *     
             */
            public void setEntscheidungsart(CodeSTRAFEntscheidungsartTyp3 value) {
                this.entscheidungsart = value;
            }

            /**
             * Gets the value of the ergebnisart property.
             * 
             * @return
             *     possible object is
             *     {@link CodeSTRAFErgebnisartTyp3 }
             *     
             */
            public CodeSTRAFErgebnisartTyp3 getErgebnisart() {
                return ergebnisart;
            }

            /**
             * Sets the value of the ergebnisart property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeSTRAFErgebnisartTyp3 }
             *     
             */
            public void setErgebnisart(CodeSTRAFErgebnisartTyp3 value) {
                this.ergebnisart = value;
            }

            /**
             * Gets the value of the rechtskraft property.
             * 
             * @return
             *     possible object is
             *     {@link TypeSTRAFRechtskraft }
             *     
             */
            public TypeSTRAFRechtskraft getRechtskraft() {
                return rechtskraft;
            }

            /**
             * Sets the value of the rechtskraft property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeSTRAFRechtskraft }
             *     
             */
            public void setRechtskraft(TypeSTRAFRechtskraft value) {
                this.rechtskraft = value;
            }

            /**
             * Gets the value of the geldbusse property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getGeldbusse() {
                return geldbusse;
            }

            /**
             * Sets the value of the geldbusse property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setGeldbusse(Double value) {
                this.geldbusse = value;
            }

            /**
             * Gets the value of the fahrverbot property.
             * 
             * @return
             *     possible object is
             *     {@link TypeSTRAFDauer }
             *     
             */
            public TypeSTRAFDauer getFahrverbot() {
                return fahrverbot;
            }

            /**
             * Sets the value of the fahrverbot property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeSTRAFDauer }
             *     
             */
            public void setFahrverbot(TypeSTRAFDauer value) {
                this.fahrverbot = value;
            }

            /**
             * Gets the value of the aufgrundStrafverfahrenAufgehoben property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAufgrundStrafverfahrenAufgehoben() {
                return aufgrundStrafverfahrenAufgehoben;
            }

            /**
             * Sets the value of the aufgrundStrafverfahrenAufgehoben property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAufgrundStrafverfahrenAufgehoben(Boolean value) {
                this.aufgrundStrafverfahrenAufgehoben = value;
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
            public static class Entscheidungsbehoerde {

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

    }

}
