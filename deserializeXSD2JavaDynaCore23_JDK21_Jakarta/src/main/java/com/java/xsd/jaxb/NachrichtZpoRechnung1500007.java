//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:50 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nachrichtID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="antwortID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="anfrage.datum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
 *                   &lt;element name="auswahl_auskunfttyp"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="p.755.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
 *                             &lt;element name="p.802l.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="rechnung"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="gebuehr" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
 *                             &lt;element name="zahlungsfrist" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
 *                             &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;element name="datum.rechnungsstellung" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="versicherungsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
    "fachdaten"
})
@XmlRootElement(name = "nachricht.zpo.rechnung.1500007")
public class NachrichtZpoRechnung1500007 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtZpoRechnung1500007 .Fachdaten fachdaten;

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
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtZpoRechnung1500007 .Fachdaten }
     *     
     */
    public NachrichtZpoRechnung1500007 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZpoRechnung1500007 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZpoRechnung1500007 .Fachdaten value) {
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
     *         &lt;element name="nachrichtID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="antwortID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="anfrage.datum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
     *         &lt;element name="auswahl_auskunfttyp"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="p.755.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
     *                   &lt;element name="p.802l.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="rechnung"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="gebuehr" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
     *                   &lt;element name="zahlungsfrist" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
     *                   &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;element name="datum.rechnungsstellung" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="versicherungsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "nachrichtID",
        "antwortID",
        "anfrageDatum",
        "auswahlAuskunfttyp",
        "rechnung",
        "versicherungsnummer"
    })
    public static class Fachdaten {

        protected String nachrichtID;
        protected String antwortID;
        @XmlElement(name = "anfrage.datum", required = true)
        protected String anfrageDatum;
        @XmlElement(name = "auswahl_auskunfttyp", required = true)
        protected NachrichtZpoRechnung1500007 .Fachdaten.AuswahlAuskunfttyp auswahlAuskunfttyp;
        @XmlElement(required = true)
        protected NachrichtZpoRechnung1500007 .Fachdaten.Rechnung rechnung;
        @XmlElement(required = true)
        protected String versicherungsnummer;

        /**
         * Gets the value of the nachrichtID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachrichtID() {
            return nachrichtID;
        }

        /**
         * Sets the value of the nachrichtID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachrichtID(String value) {
            this.nachrichtID = value;
        }

        /**
         * Gets the value of the antwortID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAntwortID() {
            return antwortID;
        }

        /**
         * Sets the value of the antwortID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAntwortID(String value) {
            this.antwortID = value;
        }

        /**
         * Gets the value of the anfrageDatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnfrageDatum() {
            return anfrageDatum;
        }

        /**
         * Sets the value of the anfrageDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnfrageDatum(String value) {
            this.anfrageDatum = value;
        }

        /**
         * Gets the value of the auswahlAuskunfttyp property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZpoRechnung1500007 .Fachdaten.AuswahlAuskunfttyp }
         *     
         */
        public NachrichtZpoRechnung1500007 .Fachdaten.AuswahlAuskunfttyp getAuswahlAuskunfttyp() {
            return auswahlAuskunfttyp;
        }

        /**
         * Sets the value of the auswahlAuskunfttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZpoRechnung1500007 .Fachdaten.AuswahlAuskunfttyp }
         *     
         */
        public void setAuswahlAuskunfttyp(NachrichtZpoRechnung1500007 .Fachdaten.AuswahlAuskunfttyp value) {
            this.auswahlAuskunfttyp = value;
        }

        /**
         * Gets the value of the rechnung property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZpoRechnung1500007 .Fachdaten.Rechnung }
         *     
         */
        public NachrichtZpoRechnung1500007 .Fachdaten.Rechnung getRechnung() {
            return rechnung;
        }

        /**
         * Sets the value of the rechnung property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZpoRechnung1500007 .Fachdaten.Rechnung }
         *     
         */
        public void setRechnung(NachrichtZpoRechnung1500007 .Fachdaten.Rechnung value) {
            this.rechnung = value;
        }

        /**
         * Gets the value of the versicherungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersicherungsnummer() {
            return versicherungsnummer;
        }

        /**
         * Sets the value of the versicherungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersicherungsnummer(String value) {
            this.versicherungsnummer = value;
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
         *         &lt;element name="p.755.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
         *         &lt;element name="p.802l.ZPO" type="{http://www.xjustiz.de}Code.GDS.Ereignis.Typ3"/&gt;
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
            "p755ZPO",
            "p802LZPO"
        })
        public static class AuswahlAuskunfttyp {

            @XmlElement(name = "p.755.ZPO")
            protected CodeGDSEreignisTyp3 p755ZPO;
            @XmlElement(name = "p.802l.ZPO")
            protected CodeGDSEreignisTyp3 p802LZPO;

            /**
             * Gets the value of the p755ZPO property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGDSEreignisTyp3 }
             *     
             */
            public CodeGDSEreignisTyp3 getP755ZPO() {
                return p755ZPO;
            }

            /**
             * Sets the value of the p755ZPO property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGDSEreignisTyp3 }
             *     
             */
            public void setP755ZPO(CodeGDSEreignisTyp3 value) {
                this.p755ZPO = value;
            }

            /**
             * Gets the value of the p802LZPO property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGDSEreignisTyp3 }
             *     
             */
            public CodeGDSEreignisTyp3 getP802LZPO() {
                return p802LZPO;
            }

            /**
             * Sets the value of the p802LZPO property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGDSEreignisTyp3 }
             *     
             */
            public void setP802LZPO(CodeGDSEreignisTyp3 value) {
                this.p802LZPO = value;
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
         *         &lt;element name="gebuehr" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
         *         &lt;element name="zahlungsfrist" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
         *         &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;element name="datum.rechnungsstellung" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/&gt;
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
            "gebuehr",
            "zahlungsfrist",
            "kassenzeichen",
            "datumRechnungsstellung"
        })
        public static class Rechnung {

            @XmlElement(required = true)
            protected TypeGDSGeldbetrag gebuehr;
            @XmlElement(required = true)
            protected String zahlungsfrist;
            @XmlElement(required = true)
            protected String kassenzeichen;
            @XmlElement(name = "datum.rechnungsstellung", required = true)
            protected String datumRechnungsstellung;

            /**
             * Gets the value of the gebuehr property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSGeldbetrag }
             *     
             */
            public TypeGDSGeldbetrag getGebuehr() {
                return gebuehr;
            }

            /**
             * Sets the value of the gebuehr property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSGeldbetrag }
             *     
             */
            public void setGebuehr(TypeGDSGeldbetrag value) {
                this.gebuehr = value;
            }

            /**
             * Gets the value of the zahlungsfrist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZahlungsfrist() {
                return zahlungsfrist;
            }

            /**
             * Sets the value of the zahlungsfrist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZahlungsfrist(String value) {
                this.zahlungsfrist = value;
            }

            /**
             * Gets the value of the kassenzeichen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKassenzeichen() {
                return kassenzeichen;
            }

            /**
             * Sets the value of the kassenzeichen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKassenzeichen(String value) {
                this.kassenzeichen = value;
            }

            /**
             * Gets the value of the datumRechnungsstellung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatumRechnungsstellung() {
                return datumRechnungsstellung;
            }

            /**
             * Sets the value of the datumRechnungsstellung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatumRechnungsstellung(String value) {
                this.datumRechnungsstellung = value;
            }

        }

    }

}
