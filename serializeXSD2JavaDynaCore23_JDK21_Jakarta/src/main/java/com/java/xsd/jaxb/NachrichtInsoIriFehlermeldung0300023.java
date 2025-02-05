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
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fehlerart" type="{http://www.xjustiz.de}Code.INSO.IRI.Fehlerart"/&gt;
 *                   &lt;element name="id.fehler" type="{http://www.xjustiz.de}Code.INSO.IRI.Fehlercode" minOccurs="0"/&gt;
 *                   &lt;element name="fehlermeldung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
@XmlRootElement(name = "nachricht.inso.iri.fehlermeldung.0300023")
public class NachrichtInsoIriFehlermeldung0300023 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected NachrichtInsoIriFehlermeldung0300023 .Fachdaten fachdaten;

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
     *     {@link NachrichtInsoIriFehlermeldung0300023 .Fachdaten }
     *     
     */
    public NachrichtInsoIriFehlermeldung0300023 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtInsoIriFehlermeldung0300023 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtInsoIriFehlermeldung0300023 .Fachdaten value) {
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
     *         &lt;element name="fehlerart" type="{http://www.xjustiz.de}Code.INSO.IRI.Fehlerart"/&gt;
     *         &lt;element name="id.fehler" type="{http://www.xjustiz.de}Code.INSO.IRI.Fehlercode" minOccurs="0"/&gt;
     *         &lt;element name="fehlermeldung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "fehlerart",
        "idFehler",
        "fehlermeldung"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected CodeINSOIRIFehlerart fehlerart;
        @XmlElement(name = "id.fehler")
        protected CodeINSOIRIFehlercode idFehler;
        @XmlElement(required = true)
        protected String fehlermeldung;

        /**
         * Gets the value of the fehlerart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeINSOIRIFehlerart }
         *     
         */
        public CodeINSOIRIFehlerart getFehlerart() {
            return fehlerart;
        }

        /**
         * Sets the value of the fehlerart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeINSOIRIFehlerart }
         *     
         */
        public void setFehlerart(CodeINSOIRIFehlerart value) {
            this.fehlerart = value;
        }

        /**
         * Gets the value of the idFehler property.
         * 
         * @return
         *     possible object is
         *     {@link CodeINSOIRIFehlercode }
         *     
         */
        public CodeINSOIRIFehlercode getIdFehler() {
            return idFehler;
        }

        /**
         * Sets the value of the idFehler property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeINSOIRIFehlercode }
         *     
         */
        public void setIdFehler(CodeINSOIRIFehlercode value) {
            this.idFehler = value;
        }

        /**
         * Gets the value of the fehlermeldung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFehlermeldung() {
            return fehlermeldung;
        }

        /**
         * Sets the value of the fehlermeldung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFehlermeldung(String value) {
            this.fehlermeldung = value;
        }

    }

}
