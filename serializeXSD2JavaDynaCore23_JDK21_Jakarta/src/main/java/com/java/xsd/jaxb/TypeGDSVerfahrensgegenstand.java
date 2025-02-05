//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Verfahrensgegenstand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Verfahrensgegenstand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gegenstand" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="gegenstandswert" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *         &lt;element name="auswahl_zeitraumDesVerwaltungsaktes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="jahr" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *                   &lt;element name="zeitraum" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType"/&gt;
 *                   &lt;element name="stichtag" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="keinZeitraum" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "Type.GDS.Verfahrensgegenstand", propOrder = {
    "gegenstand",
    "gegenstandswert",
    "auswahlZeitraumDesVerwaltungsaktes"
})
public class TypeGDSVerfahrensgegenstand {

    @XmlElement(required = true)
    protected String gegenstand;
    protected TypeGDSGeldbetrag gegenstandswert;
    @XmlElement(name = "auswahl_zeitraumDesVerwaltungsaktes")
    protected TypeGDSVerfahrensgegenstand.AuswahlZeitraumDesVerwaltungsaktes auswahlZeitraumDesVerwaltungsaktes;

    /**
     * Gets the value of the gegenstand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGegenstand() {
        return gegenstand;
    }

    /**
     * Sets the value of the gegenstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGegenstand(String value) {
        this.gegenstand = value;
    }

    /**
     * Gets the value of the gegenstandswert property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getGegenstandswert() {
        return gegenstandswert;
    }

    /**
     * Sets the value of the gegenstandswert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setGegenstandswert(TypeGDSGeldbetrag value) {
        this.gegenstandswert = value;
    }

    /**
     * Gets the value of the auswahlZeitraumDesVerwaltungsaktes property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSVerfahrensgegenstand.AuswahlZeitraumDesVerwaltungsaktes }
     *     
     */
    public TypeGDSVerfahrensgegenstand.AuswahlZeitraumDesVerwaltungsaktes getAuswahlZeitraumDesVerwaltungsaktes() {
        return auswahlZeitraumDesVerwaltungsaktes;
    }

    /**
     * Sets the value of the auswahlZeitraumDesVerwaltungsaktes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSVerfahrensgegenstand.AuswahlZeitraumDesVerwaltungsaktes }
     *     
     */
    public void setAuswahlZeitraumDesVerwaltungsaktes(TypeGDSVerfahrensgegenstand.AuswahlZeitraumDesVerwaltungsaktes value) {
        this.auswahlZeitraumDesVerwaltungsaktes = value;
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
     *         &lt;element name="jahr" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
     *         &lt;element name="zeitraum" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType"/&gt;
     *         &lt;element name="stichtag" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="keinZeitraum" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "jahr",
        "zeitraum",
        "stichtag",
        "keinZeitraum"
    })
    public static class AuswahlZeitraumDesVerwaltungsaktes {

        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar jahr;
        protected TypeGDSXdomeaZeitraumType zeitraum;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stichtag;
        protected String keinZeitraum;

        /**
         * Gets the value of the jahr property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJahr() {
            return jahr;
        }

        /**
         * Sets the value of the jahr property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJahr(XMLGregorianCalendar value) {
            this.jahr = value;
        }

        /**
         * Gets the value of the zeitraum property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSXdomeaZeitraumType }
         *     
         */
        public TypeGDSXdomeaZeitraumType getZeitraum() {
            return zeitraum;
        }

        /**
         * Sets the value of the zeitraum property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSXdomeaZeitraumType }
         *     
         */
        public void setZeitraum(TypeGDSXdomeaZeitraumType value) {
            this.zeitraum = value;
        }

        /**
         * Gets the value of the stichtag property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStichtag() {
            return stichtag;
        }

        /**
         * Sets the value of the stichtag property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStichtag(XMLGregorianCalendar value) {
            this.stichtag = value;
        }

        /**
         * Gets the value of the keinZeitraum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeinZeitraum() {
            return keinZeitraum;
        }

        /**
         * Sets the value of the keinZeitraum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeinZeitraum(String value) {
            this.keinZeitraum = value;
        }

    }

}
