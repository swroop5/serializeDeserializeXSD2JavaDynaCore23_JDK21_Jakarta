//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Aktenzeichen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Aktenzeichen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="az.art" type="{http://www.xjustiz.de}Code.GDS.Aktenzeichenart" minOccurs="0"/&gt;
 *         &lt;element name="auswahl_az.vergebendeStation" type="{http://www.xjustiz.de}Type.GDS.Behoerde" minOccurs="0"/&gt;
 *         &lt;element name="auswahl_aktenzeichen"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="aktenzeichen.freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="aktenzeichen.strukturiert"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="sachgebietsschluessel" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="zusatzkennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="abteilung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="register" type="{http://www.xjustiz.de}Code.GDS.Registerzeichen.Typ3"/&gt;
 *                             &lt;element name="laufendeNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;element name="jahr" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;element name="vorsatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="dezernat" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                             &lt;element name="erfassungsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sammelvorgangsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Aktenzeichen", propOrder = {
    "azArt",
    "auswahlAzVergebendeStation",
    "auswahlAktenzeichen",
    "sammelvorgangsnummer"
})
public class TypeGDSAktenzeichen {

    @XmlElement(name = "az.art")
    protected CodeGDSAktenzeichenart azArt;
    @XmlElement(name = "auswahl_az.vergebendeStation")
    protected TypeGDSBehoerde auswahlAzVergebendeStation;
    @XmlElement(name = "auswahl_aktenzeichen", required = true)
    protected TypeGDSAktenzeichen.AuswahlAktenzeichen auswahlAktenzeichen;
    protected String sammelvorgangsnummer;

    /**
     * Gets the value of the azArt property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSAktenzeichenart }
     *     
     */
    public CodeGDSAktenzeichenart getAzArt() {
        return azArt;
    }

    /**
     * Sets the value of the azArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSAktenzeichenart }
     *     
     */
    public void setAzArt(CodeGDSAktenzeichenart value) {
        this.azArt = value;
    }

    /**
     * Gets the value of the auswahlAzVergebendeStation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSBehoerde }
     *     
     */
    public TypeGDSBehoerde getAuswahlAzVergebendeStation() {
        return auswahlAzVergebendeStation;
    }

    /**
     * Sets the value of the auswahlAzVergebendeStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSBehoerde }
     *     
     */
    public void setAuswahlAzVergebendeStation(TypeGDSBehoerde value) {
        this.auswahlAzVergebendeStation = value;
    }

    /**
     * Gets the value of the auswahlAktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen.AuswahlAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen.AuswahlAktenzeichen getAuswahlAktenzeichen() {
        return auswahlAktenzeichen;
    }

    /**
     * Sets the value of the auswahlAktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen.AuswahlAktenzeichen }
     *     
     */
    public void setAuswahlAktenzeichen(TypeGDSAktenzeichen.AuswahlAktenzeichen value) {
        this.auswahlAktenzeichen = value;
    }

    /**
     * Gets the value of the sammelvorgangsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSammelvorgangsnummer() {
        return sammelvorgangsnummer;
    }

    /**
     * Sets the value of the sammelvorgangsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSammelvorgangsnummer(String value) {
        this.sammelvorgangsnummer = value;
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
     *         &lt;element name="aktenzeichen.freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="aktenzeichen.strukturiert"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="sachgebietsschluessel" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="zusatzkennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="abteilung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="register" type="{http://www.xjustiz.de}Code.GDS.Registerzeichen.Typ3"/&gt;
     *                   &lt;element name="laufendeNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;element name="jahr" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;element name="vorsatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="dezernat" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                   &lt;element name="erfassungsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "aktenzeichenFreitext",
        "aktenzeichenStrukturiert"
    })
    public static class AuswahlAktenzeichen {

        @XmlElement(name = "aktenzeichen.freitext")
        protected String aktenzeichenFreitext;
        @XmlElement(name = "aktenzeichen.strukturiert")
        protected TypeGDSAktenzeichen.AuswahlAktenzeichen.AktenzeichenStrukturiert aktenzeichenStrukturiert;

        /**
         * Gets the value of the aktenzeichenFreitext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAktenzeichenFreitext() {
            return aktenzeichenFreitext;
        }

        /**
         * Sets the value of the aktenzeichenFreitext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAktenzeichenFreitext(String value) {
            this.aktenzeichenFreitext = value;
        }

        /**
         * Gets the value of the aktenzeichenStrukturiert property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSAktenzeichen.AuswahlAktenzeichen.AktenzeichenStrukturiert }
         *     
         */
        public TypeGDSAktenzeichen.AuswahlAktenzeichen.AktenzeichenStrukturiert getAktenzeichenStrukturiert() {
            return aktenzeichenStrukturiert;
        }

        /**
         * Sets the value of the aktenzeichenStrukturiert property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSAktenzeichen.AuswahlAktenzeichen.AktenzeichenStrukturiert }
         *     
         */
        public void setAktenzeichenStrukturiert(TypeGDSAktenzeichen.AuswahlAktenzeichen.AktenzeichenStrukturiert value) {
            this.aktenzeichenStrukturiert = value;
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
         *         &lt;element name="sachgebietsschluessel" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="zusatzkennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="abteilung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="register" type="{http://www.xjustiz.de}Code.GDS.Registerzeichen.Typ3"/&gt;
         *         &lt;element name="laufendeNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;element name="jahr" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;element name="vorsatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="zusatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="dezernat" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *         &lt;element name="erfassungsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/&gt;
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
            "sachgebietsschluessel",
            "zusatzkennung",
            "abteilung",
            "register",
            "laufendeNummer",
            "jahr",
            "vorsatz",
            "zusatz",
            "dezernat",
            "erfassungsdatum"
        })
        public static class AktenzeichenStrukturiert {

            protected String sachgebietsschluessel;
            protected String zusatzkennung;
            protected String abteilung;
            @XmlElement(required = true)
            protected CodeGDSRegisterzeichenTyp3 register;
            @XmlElement(required = true)
            protected String laufendeNummer;
            @XmlElement(required = true)
            protected String jahr;
            protected String vorsatz;
            protected String zusatz;
            protected String dezernat;
            protected String erfassungsdatum;

            /**
             * Gets the value of the sachgebietsschluessel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSachgebietsschluessel() {
                return sachgebietsschluessel;
            }

            /**
             * Sets the value of the sachgebietsschluessel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSachgebietsschluessel(String value) {
                this.sachgebietsschluessel = value;
            }

            /**
             * Gets the value of the zusatzkennung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZusatzkennung() {
                return zusatzkennung;
            }

            /**
             * Sets the value of the zusatzkennung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZusatzkennung(String value) {
                this.zusatzkennung = value;
            }

            /**
             * Gets the value of the abteilung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAbteilung() {
                return abteilung;
            }

            /**
             * Sets the value of the abteilung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAbteilung(String value) {
                this.abteilung = value;
            }

            /**
             * Gets the value of the register property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGDSRegisterzeichenTyp3 }
             *     
             */
            public CodeGDSRegisterzeichenTyp3 getRegister() {
                return register;
            }

            /**
             * Sets the value of the register property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGDSRegisterzeichenTyp3 }
             *     
             */
            public void setRegister(CodeGDSRegisterzeichenTyp3 value) {
                this.register = value;
            }

            /**
             * Gets the value of the laufendeNummer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLaufendeNummer() {
                return laufendeNummer;
            }

            /**
             * Sets the value of the laufendeNummer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLaufendeNummer(String value) {
                this.laufendeNummer = value;
            }

            /**
             * Gets the value of the jahr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJahr() {
                return jahr;
            }

            /**
             * Sets the value of the jahr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJahr(String value) {
                this.jahr = value;
            }

            /**
             * Gets the value of the vorsatz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVorsatz() {
                return vorsatz;
            }

            /**
             * Sets the value of the vorsatz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVorsatz(String value) {
                this.vorsatz = value;
            }

            /**
             * Gets the value of the zusatz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZusatz() {
                return zusatz;
            }

            /**
             * Sets the value of the zusatz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZusatz(String value) {
                this.zusatz = value;
            }

            /**
             * Gets the value of the dezernat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDezernat() {
                return dezernat;
            }

            /**
             * Sets the value of the dezernat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDezernat(String value) {
                this.dezernat = value;
            }

            /**
             * Gets the value of the erfassungsdatum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErfassungsdatum() {
                return erfassungsdatum;
            }

            /**
             * Sets the value of the erfassungsdatum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErfassungsdatum(String value) {
                this.erfassungsdatum = value;
            }

        }

    }

}