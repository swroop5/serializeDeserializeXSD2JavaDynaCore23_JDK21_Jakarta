//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:52 PM CEST 
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/&gt;
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten" minOccurs="0"/&gt;
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="urteil"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
 *                             &lt;element name="inhaltUrteil" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;element name="nameBeklagter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
 *                             &lt;element name="nameKlaeger" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
 *                             &lt;element name="hauptforderung" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="zinsen" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="kosten" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="urteilText" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="berufungsgerichtPruefung"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="flag.berufungsgerichtPruefung" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="vorrang" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="datumVorrang" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                       &lt;element name="aktenzeichenVorrang" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ortDatumUnterschrift" type="{http://www.xjustiz.de}Type.SC.OrtDatumUnterschrift"/&gt;
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
    "grunddaten",
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.sc.form_d_urteil.1600004")
public class NachrichtScFormDUrteil1600004 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    protected TypeGDSGrunddaten grunddaten;
    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtScFormDUrteil1600004 .Fachdaten fachdaten;

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
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

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
     *     {@link NachrichtScFormDUrteil1600004 .Fachdaten }
     *     
     */
    public NachrichtScFormDUrteil1600004 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtScFormDUrteil1600004 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtScFormDUrteil1600004 .Fachdaten value) {
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
     *         &lt;element name="urteil"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
     *                   &lt;element name="inhaltUrteil" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;element name="nameBeklagter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
     *                   &lt;element name="nameKlaeger" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
     *                   &lt;element name="hauptforderung" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="zinsen" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="kosten" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="urteilText" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="berufungsgerichtPruefung"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="flag.berufungsgerichtPruefung" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="vorrang" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="datumVorrang" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                             &lt;element name="aktenzeichenVorrang" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
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
     *         &lt;element name="ortDatumUnterschrift" type="{http://www.xjustiz.de}Type.SC.OrtDatumUnterschrift"/&gt;
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
        "urteil",
        "berufungsgerichtPruefung",
        "ortDatumUnterschrift"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected NachrichtScFormDUrteil1600004 .Fachdaten.Urteil urteil;
        @XmlElement(required = true)
        protected NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung berufungsgerichtPruefung;
        @XmlElement(required = true)
        protected TypeSCOrtDatumUnterschrift ortDatumUnterschrift;

        /**
         * Gets the value of the urteil property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.Urteil }
         *     
         */
        public NachrichtScFormDUrteil1600004 .Fachdaten.Urteil getUrteil() {
            return urteil;
        }

        /**
         * Sets the value of the urteil property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.Urteil }
         *     
         */
        public void setUrteil(NachrichtScFormDUrteil1600004 .Fachdaten.Urteil value) {
            this.urteil = value;
        }

        /**
         * Gets the value of the berufungsgerichtPruefung property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung }
         *     
         */
        public NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung getBerufungsgerichtPruefung() {
            return berufungsgerichtPruefung;
        }

        /**
         * Sets the value of the berufungsgerichtPruefung property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung }
         *     
         */
        public void setBerufungsgerichtPruefung(NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung value) {
            this.berufungsgerichtPruefung = value;
        }

        /**
         * Gets the value of the ortDatumUnterschrift property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSCOrtDatumUnterschrift }
         *     
         */
        public TypeSCOrtDatumUnterschrift getOrtDatumUnterschrift() {
            return ortDatumUnterschrift;
        }

        /**
         * Sets the value of the ortDatumUnterschrift property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSCOrtDatumUnterschrift }
         *     
         */
        public void setOrtDatumUnterschrift(TypeSCOrtDatumUnterschrift value) {
            this.ortDatumUnterschrift = value;
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
         *         &lt;element name="flag.berufungsgerichtPruefung" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="vorrang" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="datumVorrang" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                   &lt;element name="aktenzeichenVorrang" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
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
            "flagBerufungsgerichtPruefung",
            "vorrang"
        })
        public static class BerufungsgerichtPruefung {

            @XmlElement(name = "flag.berufungsgerichtPruefung", defaultValue = "false")
            protected boolean flagBerufungsgerichtPruefung;
            protected NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung.Vorrang vorrang;

            /**
             * Gets the value of the flagBerufungsgerichtPruefung property.
             * 
             */
            public boolean isFlagBerufungsgerichtPruefung() {
                return flagBerufungsgerichtPruefung;
            }

            /**
             * Sets the value of the flagBerufungsgerichtPruefung property.
             * 
             */
            public void setFlagBerufungsgerichtPruefung(boolean value) {
                this.flagBerufungsgerichtPruefung = value;
            }

            /**
             * Gets the value of the vorrang property.
             * 
             * @return
             *     possible object is
             *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung.Vorrang }
             *     
             */
            public NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung.Vorrang getVorrang() {
                return vorrang;
            }

            /**
             * Sets the value of the vorrang property.
             * 
             * @param value
             *     allowed object is
             *     {@link NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung.Vorrang }
             *     
             */
            public void setVorrang(NachrichtScFormDUrteil1600004 .Fachdaten.BerufungsgerichtPruefung.Vorrang value) {
                this.vorrang = value;
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
             *         &lt;element name="datumVorrang" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *         &lt;element name="aktenzeichenVorrang" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
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
                "datumVorrang",
                "aktenzeichenVorrang"
            })
            public static class Vorrang {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar datumVorrang;
                @XmlElement(required = true)
                protected TypeGDSAktenzeichen aktenzeichenVorrang;

                /**
                 * Gets the value of the datumVorrang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDatumVorrang() {
                    return datumVorrang;
                }

                /**
                 * Sets the value of the datumVorrang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDatumVorrang(XMLGregorianCalendar value) {
                    this.datumVorrang = value;
                }

                /**
                 * Gets the value of the aktenzeichenVorrang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeGDSAktenzeichen }
                 *     
                 */
                public TypeGDSAktenzeichen getAktenzeichenVorrang() {
                    return aktenzeichenVorrang;
                }

                /**
                 * Sets the value of the aktenzeichenVorrang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeGDSAktenzeichen }
                 *     
                 */
                public void setAktenzeichenVorrang(TypeGDSAktenzeichen value) {
                    this.aktenzeichenVorrang = value;
                }

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
         *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
         *         &lt;element name="inhaltUrteil" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;element name="nameBeklagter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
         *         &lt;element name="nameKlaeger" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE"/&gt;
         *         &lt;element name="hauptforderung" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="zinsen" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="kosten" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="urteilText" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
            "datum",
            "aktenzeichen",
            "inhaltUrteil",
            "nameBeklagter",
            "nameKlaeger",
            "hauptforderung",
            "zinsen",
            "kosten",
            "urteilText"
        })
        public static class Urteil {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datum;
            @XmlElement(required = true)
            protected TypeGDSAktenzeichen aktenzeichen;
            @XmlElement(required = true)
            protected String inhaltUrteil;
            @XmlElement(required = true)
            protected String nameBeklagter;
            @XmlElement(required = true)
            protected String nameKlaeger;
            protected double hauptforderung;
            protected double zinsen;
            protected double kosten;
            @XmlElement(required = true)
            protected String urteilText;

            /**
             * Gets the value of the datum property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatum() {
                return datum;
            }

            /**
             * Sets the value of the datum property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatum(XMLGregorianCalendar value) {
                this.datum = value;
            }

            /**
             * Gets the value of the aktenzeichen property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSAktenzeichen }
             *     
             */
            public TypeGDSAktenzeichen getAktenzeichen() {
                return aktenzeichen;
            }

            /**
             * Sets the value of the aktenzeichen property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSAktenzeichen }
             *     
             */
            public void setAktenzeichen(TypeGDSAktenzeichen value) {
                this.aktenzeichen = value;
            }

            /**
             * Gets the value of the inhaltUrteil property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInhaltUrteil() {
                return inhaltUrteil;
            }

            /**
             * Sets the value of the inhaltUrteil property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInhaltUrteil(String value) {
                this.inhaltUrteil = value;
            }

            /**
             * Gets the value of the nameBeklagter property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameBeklagter() {
                return nameBeklagter;
            }

            /**
             * Sets the value of the nameBeklagter property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameBeklagter(String value) {
                this.nameBeklagter = value;
            }

            /**
             * Gets the value of the nameKlaeger property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameKlaeger() {
                return nameKlaeger;
            }

            /**
             * Sets the value of the nameKlaeger property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameKlaeger(String value) {
                this.nameKlaeger = value;
            }

            /**
             * Gets the value of the hauptforderung property.
             * 
             */
            public double getHauptforderung() {
                return hauptforderung;
            }

            /**
             * Sets the value of the hauptforderung property.
             * 
             */
            public void setHauptforderung(double value) {
                this.hauptforderung = value;
            }

            /**
             * Gets the value of the zinsen property.
             * 
             */
            public double getZinsen() {
                return zinsen;
            }

            /**
             * Sets the value of the zinsen property.
             * 
             */
            public void setZinsen(double value) {
                this.zinsen = value;
            }

            /**
             * Gets the value of the kosten property.
             * 
             */
            public double getKosten() {
                return kosten;
            }

            /**
             * Sets the value of the kosten property.
             * 
             */
            public void setKosten(double value) {
                this.kosten = value;
            }

            /**
             * Gets the value of the urteilText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrteilText() {
                return urteilText;
            }

            /**
             * Sets the value of the urteilText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrteilText(String value) {
                this.urteilText = value;
            }

        }

    }

}
