//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:24:08 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dieser Typ dient dazu, für einen im Grunddatensatz übergebenen Beteiligten weitergehende Informationen zu übergeben.
 * 
 * <p>Java class for Type.INSO.Beteiligte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.INSO.Beteiligte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/&gt;
 *         &lt;element name="identifier" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="namenszusatzFuerOrganisationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="ansprechpartner" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="handelndUnter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/&gt;
 *         &lt;element name="zustellungsart" type="{http://www.xjustiz.de}Code.INSO.Zustellungsart"/&gt;
 *         &lt;element name="uebertragungsweg" type="{http://www.xjustiz.de}Code.INSO.Uebertragungsweg"/&gt;
 *         &lt;element name="postempfaenger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="glaeubigermerkmale" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="masseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="neumasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="altmasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="absonderungsglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="nachrangglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "Type.INSO.Beteiligte", propOrder = {
    "beteiligter",
    "identifier",
    "namenszusatzFuerOrganisationen",
    "ansprechpartner",
    "handelndUnter",
    "zustellungsart",
    "uebertragungsweg",
    "postempfaenger",
    "glaeubigermerkmale"
})
public class TypeINSOBeteiligte {

    @XmlElement(required = true)
    protected TypeGDSRefBeteiligtennummer beteiligter;
    @XmlElement(required = true)
    protected String identifier;
    protected String namenszusatzFuerOrganisationen;
    protected String ansprechpartner;
    protected String handelndUnter;
    @XmlElement(required = true)
    protected CodeINSOZustellungsart zustellungsart;
    @XmlElement(required = true)
    protected CodeINSOUebertragungsweg uebertragungsweg;
    protected boolean postempfaenger;
    protected TypeINSOBeteiligte.Glaeubigermerkmale glaeubigermerkmale;

    /**
     * Gets the value of the beteiligter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public TypeGDSRefBeteiligtennummer getBeteiligter() {
        return beteiligter;
    }

    /**
     * Sets the value of the beteiligter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public void setBeteiligter(TypeGDSRefBeteiligtennummer value) {
        this.beteiligter = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the namenszusatzFuerOrganisationen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamenszusatzFuerOrganisationen() {
        return namenszusatzFuerOrganisationen;
    }

    /**
     * Sets the value of the namenszusatzFuerOrganisationen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamenszusatzFuerOrganisationen(String value) {
        this.namenszusatzFuerOrganisationen = value;
    }

    /**
     * Gets the value of the ansprechpartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    /**
     * Sets the value of the ansprechpartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsprechpartner(String value) {
        this.ansprechpartner = value;
    }

    /**
     * Gets the value of the handelndUnter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandelndUnter() {
        return handelndUnter;
    }

    /**
     * Sets the value of the handelndUnter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandelndUnter(String value) {
        this.handelndUnter = value;
    }

    /**
     * Gets the value of the zustellungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeINSOZustellungsart }
     *     
     */
    public CodeINSOZustellungsart getZustellungsart() {
        return zustellungsart;
    }

    /**
     * Sets the value of the zustellungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeINSOZustellungsart }
     *     
     */
    public void setZustellungsart(CodeINSOZustellungsart value) {
        this.zustellungsart = value;
    }

    /**
     * Gets the value of the uebertragungsweg property.
     * 
     * @return
     *     possible object is
     *     {@link CodeINSOUebertragungsweg }
     *     
     */
    public CodeINSOUebertragungsweg getUebertragungsweg() {
        return uebertragungsweg;
    }

    /**
     * Sets the value of the uebertragungsweg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeINSOUebertragungsweg }
     *     
     */
    public void setUebertragungsweg(CodeINSOUebertragungsweg value) {
        this.uebertragungsweg = value;
    }

    /**
     * Gets the value of the postempfaenger property.
     * 
     */
    public boolean isPostempfaenger() {
        return postempfaenger;
    }

    /**
     * Sets the value of the postempfaenger property.
     * 
     */
    public void setPostempfaenger(boolean value) {
        this.postempfaenger = value;
    }

    /**
     * Gets the value of the glaeubigermerkmale property.
     * 
     * @return
     *     possible object is
     *     {@link TypeINSOBeteiligte.Glaeubigermerkmale }
     *     
     */
    public TypeINSOBeteiligte.Glaeubigermerkmale getGlaeubigermerkmale() {
        return glaeubigermerkmale;
    }

    /**
     * Sets the value of the glaeubigermerkmale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeINSOBeteiligte.Glaeubigermerkmale }
     *     
     */
    public void setGlaeubigermerkmale(TypeINSOBeteiligte.Glaeubigermerkmale value) {
        this.glaeubigermerkmale = value;
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
     *         &lt;element name="masseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="neumasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="altmasseglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="absonderungsglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="nachrangglaeubiger" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "masseglaeubiger",
        "neumasseglaeubiger",
        "altmasseglaeubiger",
        "absonderungsglaeubiger",
        "nachrangglaeubiger"
    })
    public static class Glaeubigermerkmale {

        protected boolean masseglaeubiger;
        protected boolean neumasseglaeubiger;
        protected boolean altmasseglaeubiger;
        protected boolean absonderungsglaeubiger;
        protected boolean nachrangglaeubiger;

        /**
         * Gets the value of the masseglaeubiger property.
         * 
         */
        public boolean isMasseglaeubiger() {
            return masseglaeubiger;
        }

        /**
         * Sets the value of the masseglaeubiger property.
         * 
         */
        public void setMasseglaeubiger(boolean value) {
            this.masseglaeubiger = value;
        }

        /**
         * Gets the value of the neumasseglaeubiger property.
         * 
         */
        public boolean isNeumasseglaeubiger() {
            return neumasseglaeubiger;
        }

        /**
         * Sets the value of the neumasseglaeubiger property.
         * 
         */
        public void setNeumasseglaeubiger(boolean value) {
            this.neumasseglaeubiger = value;
        }

        /**
         * Gets the value of the altmasseglaeubiger property.
         * 
         */
        public boolean isAltmasseglaeubiger() {
            return altmasseglaeubiger;
        }

        /**
         * Sets the value of the altmasseglaeubiger property.
         * 
         */
        public void setAltmasseglaeubiger(boolean value) {
            this.altmasseglaeubiger = value;
        }

        /**
         * Gets the value of the absonderungsglaeubiger property.
         * 
         */
        public boolean isAbsonderungsglaeubiger() {
            return absonderungsglaeubiger;
        }

        /**
         * Sets the value of the absonderungsglaeubiger property.
         * 
         */
        public void setAbsonderungsglaeubiger(boolean value) {
            this.absonderungsglaeubiger = value;
        }

        /**
         * Gets the value of the nachrangglaeubiger property.
         * 
         */
        public boolean isNachrangglaeubiger() {
            return nachrangglaeubiger;
        }

        /**
         * Sets the value of the nachrangglaeubiger property.
         * 
         */
        public void setNachrangglaeubiger(boolean value) {
            this.nachrangglaeubiger = value;
        }

    }

}