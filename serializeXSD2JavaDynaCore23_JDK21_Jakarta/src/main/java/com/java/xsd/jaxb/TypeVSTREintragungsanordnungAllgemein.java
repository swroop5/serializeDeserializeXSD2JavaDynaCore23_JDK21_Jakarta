//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:41 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dieser Typ ist die Basis für die Typen 'Type.VSTR.Eintragungsanordnung.Schuldnerverzeichnis' und 'Type.VSTR.Eintragungsanordnung.Schuldnerverzeichnis.Portal'.
 * 
 * <p>Java class for Type.VSTR.Eintragungsanordnung.Allgemein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VSTR.Eintragungsanordnung.Allgemein"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auswahl_anordnungsbehoerde.eintragungsgrund"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="anordnung.gerichtsvollzieherVollstreckungsbehoerde"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="auswahl_gerichtsvollzieherVollstreckungsbehoerde"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="gerichtsvollzieher" type="{http://www.xjustiz.de}Type.VSTR.Gerichtsvollzieher"/&gt;
 *                                       &lt;element name="vollstreckungsbehoerde" type="{http://www.xjustiz.de}Type.VSTR.Vollstreckungsbehoerde"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="eintragungsgrund.gerichtsvollzieherVollstreckungsbehoerde" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Gerichtsvollzieher.Vollstreckungsbehoerde"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="anordnung.insolvenzgericht"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="insolvenzgericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
 *                             &lt;element name="eintragungsgrund.insolvenzgericht" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Insolvenzgericht"/&gt;
 *                             &lt;element name="datum.erlassDesBeschlusses" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
 *         &lt;element name="aktenzeichen.eintragungsanordnung" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen"/&gt;
 *         &lt;element name="datumDerEintragungsanordnung" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VSTR.Eintragungsanordnung.Allgemein", propOrder = {
    "auswahlAnordnungsbehoerdeEintragungsgrund",
    "aktenzeichenEintragungsanordnung",
    "datumDerEintragungsanordnung"
})
@XmlSeeAlso({
    TypeVSTREintragungsanordnungSchuldnerverzeichnis.class,
    TypeVSTREintragungsanordnungSchuldnerverzeichnisPortal.class
})
public class TypeVSTREintragungsanordnungAllgemein {

    @XmlElement(name = "auswahl_anordnungsbehoerde.eintragungsgrund", required = true)
    protected TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund auswahlAnordnungsbehoerdeEintragungsgrund;
    @XmlElement(name = "aktenzeichen.eintragungsanordnung", required = true)
    protected TypeGDSAktenzeichen aktenzeichenEintragungsanordnung;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDerEintragungsanordnung;

    /**
     * Gets the value of the auswahlAnordnungsbehoerdeEintragungsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund }
     *     
     */
    public TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund getAuswahlAnordnungsbehoerdeEintragungsgrund() {
        return auswahlAnordnungsbehoerdeEintragungsgrund;
    }

    /**
     * Sets the value of the auswahlAnordnungsbehoerdeEintragungsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund }
     *     
     */
    public void setAuswahlAnordnungsbehoerdeEintragungsgrund(TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund value) {
        this.auswahlAnordnungsbehoerdeEintragungsgrund = value;
    }

    /**
     * Gets the value of the aktenzeichenEintragungsanordnung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public TypeGDSAktenzeichen getAktenzeichenEintragungsanordnung() {
        return aktenzeichenEintragungsanordnung;
    }

    /**
     * Sets the value of the aktenzeichenEintragungsanordnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAktenzeichen }
     *     
     */
    public void setAktenzeichenEintragungsanordnung(TypeGDSAktenzeichen value) {
        this.aktenzeichenEintragungsanordnung = value;
    }

    /**
     * Gets the value of the datumDerEintragungsanordnung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDerEintragungsanordnung() {
        return datumDerEintragungsanordnung;
    }

    /**
     * Sets the value of the datumDerEintragungsanordnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDerEintragungsanordnung(XMLGregorianCalendar value) {
        this.datumDerEintragungsanordnung = value;
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
     *         &lt;element name="anordnung.gerichtsvollzieherVollstreckungsbehoerde"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="auswahl_gerichtsvollzieherVollstreckungsbehoerde"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="gerichtsvollzieher" type="{http://www.xjustiz.de}Type.VSTR.Gerichtsvollzieher"/&gt;
     *                             &lt;element name="vollstreckungsbehoerde" type="{http://www.xjustiz.de}Type.VSTR.Vollstreckungsbehoerde"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="eintragungsgrund.gerichtsvollzieherVollstreckungsbehoerde" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Gerichtsvollzieher.Vollstreckungsbehoerde"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="anordnung.insolvenzgericht"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="insolvenzgericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
     *                   &lt;element name="eintragungsgrund.insolvenzgericht" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Insolvenzgericht"/&gt;
     *                   &lt;element name="datum.erlassDesBeschlusses" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
        "anordnungGerichtsvollzieherVollstreckungsbehoerde",
        "anordnungInsolvenzgericht"
    })
    public static class AuswahlAnordnungsbehoerdeEintragungsgrund {

        @XmlElement(name = "anordnung.gerichtsvollzieherVollstreckungsbehoerde")
        protected TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde anordnungGerichtsvollzieherVollstreckungsbehoerde;
        @XmlElement(name = "anordnung.insolvenzgericht")
        protected TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungInsolvenzgericht anordnungInsolvenzgericht;

        /**
         * Gets the value of the anordnungGerichtsvollzieherVollstreckungsbehoerde property.
         * 
         * @return
         *     possible object is
         *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde }
         *     
         */
        public TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde getAnordnungGerichtsvollzieherVollstreckungsbehoerde() {
            return anordnungGerichtsvollzieherVollstreckungsbehoerde;
        }

        /**
         * Sets the value of the anordnungGerichtsvollzieherVollstreckungsbehoerde property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde }
         *     
         */
        public void setAnordnungGerichtsvollzieherVollstreckungsbehoerde(TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde value) {
            this.anordnungGerichtsvollzieherVollstreckungsbehoerde = value;
        }

        /**
         * Gets the value of the anordnungInsolvenzgericht property.
         * 
         * @return
         *     possible object is
         *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungInsolvenzgericht }
         *     
         */
        public TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungInsolvenzgericht getAnordnungInsolvenzgericht() {
            return anordnungInsolvenzgericht;
        }

        /**
         * Sets the value of the anordnungInsolvenzgericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungInsolvenzgericht }
         *     
         */
        public void setAnordnungInsolvenzgericht(TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungInsolvenzgericht value) {
            this.anordnungInsolvenzgericht = value;
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
         *         &lt;element name="auswahl_gerichtsvollzieherVollstreckungsbehoerde"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="gerichtsvollzieher" type="{http://www.xjustiz.de}Type.VSTR.Gerichtsvollzieher"/&gt;
         *                   &lt;element name="vollstreckungsbehoerde" type="{http://www.xjustiz.de}Type.VSTR.Vollstreckungsbehoerde"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="eintragungsgrund.gerichtsvollzieherVollstreckungsbehoerde" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Gerichtsvollzieher.Vollstreckungsbehoerde"/&gt;
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
            "auswahlGerichtsvollzieherVollstreckungsbehoerde",
            "eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde"
        })
        public static class AnordnungGerichtsvollzieherVollstreckungsbehoerde {

            @XmlElement(name = "auswahl_gerichtsvollzieherVollstreckungsbehoerde", required = true)
            protected TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde.AuswahlGerichtsvollzieherVollstreckungsbehoerde auswahlGerichtsvollzieherVollstreckungsbehoerde;
            @XmlElement(name = "eintragungsgrund.gerichtsvollzieherVollstreckungsbehoerde", required = true)
            protected CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde;

            /**
             * Gets the value of the auswahlGerichtsvollzieherVollstreckungsbehoerde property.
             * 
             * @return
             *     possible object is
             *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde.AuswahlGerichtsvollzieherVollstreckungsbehoerde }
             *     
             */
            public TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde.AuswahlGerichtsvollzieherVollstreckungsbehoerde getAuswahlGerichtsvollzieherVollstreckungsbehoerde() {
                return auswahlGerichtsvollzieherVollstreckungsbehoerde;
            }

            /**
             * Sets the value of the auswahlGerichtsvollzieherVollstreckungsbehoerde property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde.AuswahlGerichtsvollzieherVollstreckungsbehoerde }
             *     
             */
            public void setAuswahlGerichtsvollzieherVollstreckungsbehoerde(TypeVSTREintragungsanordnungAllgemein.AuswahlAnordnungsbehoerdeEintragungsgrund.AnordnungGerichtsvollzieherVollstreckungsbehoerde.AuswahlGerichtsvollzieherVollstreckungsbehoerde value) {
                this.auswahlGerichtsvollzieherVollstreckungsbehoerde = value;
            }

            /**
             * Gets the value of the eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde property.
             * 
             * @return
             *     possible object is
             *     {@link CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde }
             *     
             */
            public CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde getEintragungsgrundGerichtsvollzieherVollstreckungsbehoerde() {
                return eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde;
            }

            /**
             * Sets the value of the eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde }
             *     
             */
            public void setEintragungsgrundGerichtsvollzieherVollstreckungsbehoerde(CodeVSTREintragungsgruendeGerichtsvollzieherVollstreckungsbehoerde value) {
                this.eintragungsgrundGerichtsvollzieherVollstreckungsbehoerde = value;
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
             *         &lt;element name="gerichtsvollzieher" type="{http://www.xjustiz.de}Type.VSTR.Gerichtsvollzieher"/&gt;
             *         &lt;element name="vollstreckungsbehoerde" type="{http://www.xjustiz.de}Type.VSTR.Vollstreckungsbehoerde"/&gt;
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
                "gerichtsvollzieher",
                "vollstreckungsbehoerde"
            })
            public static class AuswahlGerichtsvollzieherVollstreckungsbehoerde {

                protected TypeVSTRGerichtsvollzieher gerichtsvollzieher;
                protected TypeVSTRVollstreckungsbehoerde vollstreckungsbehoerde;

                /**
                 * Gets the value of the gerichtsvollzieher property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeVSTRGerichtsvollzieher }
                 *     
                 */
                public TypeVSTRGerichtsvollzieher getGerichtsvollzieher() {
                    return gerichtsvollzieher;
                }

                /**
                 * Sets the value of the gerichtsvollzieher property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeVSTRGerichtsvollzieher }
                 *     
                 */
                public void setGerichtsvollzieher(TypeVSTRGerichtsvollzieher value) {
                    this.gerichtsvollzieher = value;
                }

                /**
                 * Gets the value of the vollstreckungsbehoerde property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeVSTRVollstreckungsbehoerde }
                 *     
                 */
                public TypeVSTRVollstreckungsbehoerde getVollstreckungsbehoerde() {
                    return vollstreckungsbehoerde;
                }

                /**
                 * Sets the value of the vollstreckungsbehoerde property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeVSTRVollstreckungsbehoerde }
                 *     
                 */
                public void setVollstreckungsbehoerde(TypeVSTRVollstreckungsbehoerde value) {
                    this.vollstreckungsbehoerde = value;
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
         *         &lt;element name="insolvenzgericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
         *         &lt;element name="eintragungsgrund.insolvenzgericht" type="{http://www.xjustiz.de}Code.VSTR.Eintragungsgruende.Insolvenzgericht"/&gt;
         *         &lt;element name="datum.erlassDesBeschlusses" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "insolvenzgericht",
            "eintragungsgrundInsolvenzgericht",
            "datumErlassDesBeschlusses"
        })
        public static class AnordnungInsolvenzgericht {

            @XmlElement(required = true)
            protected CodeGDSGerichteTyp3 insolvenzgericht;
            @XmlElement(name = "eintragungsgrund.insolvenzgericht", required = true)
            protected CodeVSTREintragungsgruendeInsolvenzgericht eintragungsgrundInsolvenzgericht;
            @XmlElement(name = "datum.erlassDesBeschlusses", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumErlassDesBeschlusses;

            /**
             * Gets the value of the insolvenzgericht property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGDSGerichteTyp3 }
             *     
             */
            public CodeGDSGerichteTyp3 getInsolvenzgericht() {
                return insolvenzgericht;
            }

            /**
             * Sets the value of the insolvenzgericht property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGDSGerichteTyp3 }
             *     
             */
            public void setInsolvenzgericht(CodeGDSGerichteTyp3 value) {
                this.insolvenzgericht = value;
            }

            /**
             * Gets the value of the eintragungsgrundInsolvenzgericht property.
             * 
             * @return
             *     possible object is
             *     {@link CodeVSTREintragungsgruendeInsolvenzgericht }
             *     
             */
            public CodeVSTREintragungsgruendeInsolvenzgericht getEintragungsgrundInsolvenzgericht() {
                return eintragungsgrundInsolvenzgericht;
            }

            /**
             * Sets the value of the eintragungsgrundInsolvenzgericht property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeVSTREintragungsgruendeInsolvenzgericht }
             *     
             */
            public void setEintragungsgrundInsolvenzgericht(CodeVSTREintragungsgruendeInsolvenzgericht value) {
                this.eintragungsgrundInsolvenzgericht = value;
            }

            /**
             * Gets the value of the datumErlassDesBeschlusses property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatumErlassDesBeschlusses() {
                return datumErlassDesBeschlusses;
            }

            /**
             * Sets the value of the datumErlassDesBeschlusses property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatumErlassDesBeschlusses(XMLGregorianCalendar value) {
                this.datumErlassDesBeschlusses = value;
            }

        }

    }

}
