//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:05 PM CEST 
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
 *                   &lt;element name="nachrichtenID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="auskunftID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="voraussetzungenAuskunftsersuchen"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
 *                             &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
 *                             &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/&gt;
 *                             &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlRootElement(name = "nachricht.ezoll.auskunftsersuchen.2400002")
public class NachrichtEzollAuskunftsersuchen2400002 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtEzollAuskunftsersuchen2400002 .Fachdaten fachdaten;

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
     *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten }
     *     
     */
    public NachrichtEzollAuskunftsersuchen2400002 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtEzollAuskunftsersuchen2400002 .Fachdaten value) {
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
     *         &lt;element name="nachrichtenID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="auskunftID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="voraussetzungenAuskunftsersuchen"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
     *                   &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
     *                   &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/&gt;
     *                   &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "nachrichtenID",
        "auskunftID",
        "voraussetzungenAuskunftsersuchen"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected String nachrichtenID;
        @XmlElement(required = true)
        protected String auskunftID;
        @XmlElement(required = true)
        protected NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen voraussetzungenAuskunftsersuchen;

        /**
         * Gets the value of the nachrichtenID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachrichtenID() {
            return nachrichtenID;
        }

        /**
         * Sets the value of the nachrichtenID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachrichtenID(String value) {
            this.nachrichtenID = value;
        }

        /**
         * Gets the value of the auskunftID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuskunftID() {
            return auskunftID;
        }

        /**
         * Sets the value of the auskunftID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuskunftID(String value) {
            this.auskunftID = value;
        }

        /**
         * Gets the value of the voraussetzungenAuskunftsersuchen property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen }
         *     
         */
        public NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen getVoraussetzungenAuskunftsersuchen() {
            return voraussetzungenAuskunftsersuchen;
        }

        /**
         * Sets the value of the voraussetzungenAuskunftsersuchen property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen }
         *     
         */
        public void setVoraussetzungenAuskunftsersuchen(NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen value) {
            this.voraussetzungenAuskunftsersuchen = value;
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
         *         &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
         *         &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/&gt;
         *         &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/&gt;
         *         &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
            "forderungEinordnung",
            "forderungBezeichnung",
            "benennungGlaeubiger",
            "bisherigeBemuehungenErfolglos",
            "bestaetigungDatenNotwendig"
        })
        public static class VoraussetzungenAuskunftsersuchen {

            @XmlElement(name = "forderung.einordnung", required = true)
            protected CodeEZOLLForderung forderungEinordnung;
            @XmlElement(name = "forderung.bezeichnung", required = true)
            protected CodeEZOLLForderung forderungBezeichnung;
            @XmlElement(required = true)
            protected CodeEZOLLGlaeubiger benennungGlaeubiger;
            protected boolean bisherigeBemuehungenErfolglos;
            protected boolean bestaetigungDatenNotwendig;

            /**
             * Gets the value of the forderungEinordnung property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public CodeEZOLLForderung getForderungEinordnung() {
                return forderungEinordnung;
            }

            /**
             * Sets the value of the forderungEinordnung property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public void setForderungEinordnung(CodeEZOLLForderung value) {
                this.forderungEinordnung = value;
            }

            /**
             * Gets the value of the forderungBezeichnung property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public CodeEZOLLForderung getForderungBezeichnung() {
                return forderungBezeichnung;
            }

            /**
             * Sets the value of the forderungBezeichnung property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public void setForderungBezeichnung(CodeEZOLLForderung value) {
                this.forderungBezeichnung = value;
            }

            /**
             * Gets the value of the benennungGlaeubiger property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLGlaeubiger }
             *     
             */
            public CodeEZOLLGlaeubiger getBenennungGlaeubiger() {
                return benennungGlaeubiger;
            }

            /**
             * Sets the value of the benennungGlaeubiger property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLGlaeubiger }
             *     
             */
            public void setBenennungGlaeubiger(CodeEZOLLGlaeubiger value) {
                this.benennungGlaeubiger = value;
            }

            /**
             * Gets the value of the bisherigeBemuehungenErfolglos property.
             * 
             */
            public boolean isBisherigeBemuehungenErfolglos() {
                return bisherigeBemuehungenErfolglos;
            }

            /**
             * Sets the value of the bisherigeBemuehungenErfolglos property.
             * 
             */
            public void setBisherigeBemuehungenErfolglos(boolean value) {
                this.bisherigeBemuehungenErfolglos = value;
            }

            /**
             * Gets the value of the bestaetigungDatenNotwendig property.
             * 
             */
            public boolean isBestaetigungDatenNotwendig() {
                return bestaetigungDatenNotwendig;
            }

            /**
             * Sets the value of the bestaetigungDatenNotwendig property.
             * 
             */
            public void setBestaetigungDatenNotwendig(boolean value) {
                this.bestaetigungDatenNotwendig = value;
            }

        }

    }

}
