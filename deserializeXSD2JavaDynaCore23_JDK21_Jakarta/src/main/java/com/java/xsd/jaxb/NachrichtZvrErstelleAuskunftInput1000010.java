//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:43 PM CEST 
//


package com.java.xsd.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 *                   &lt;element name="abfrageID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="auswahl_auskunfttyp"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                               &lt;element name="inDetailGeladen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                               &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="versandart" type="{http://www.xjustiz.de}Code.ZVR.Antwortart"/&gt;
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
@XmlRootElement(name = "nachricht.zvr.erstelleAuskunft.input.1000010")
public class NachrichtZvrErstelleAuskunftInput1000010 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten fachdaten;

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
     *     {@link NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten }
     *     
     */
    public NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten value) {
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
     *         &lt;element name="abfrageID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="auswahl_auskunfttyp"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                     &lt;element name="inDetailGeladen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                     &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="versandart" type="{http://www.xjustiz.de}Code.ZVR.Antwortart"/&gt;
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
        "abfrageID",
        "auswahlAuskunfttyp",
        "versandart"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected String abfrageID;
        @XmlElement(name = "auswahl_auskunfttyp", required = true)
        protected NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten.AuswahlAuskunfttyp auswahlAuskunfttyp;
        @XmlElement(required = true)
        protected CodeZVRAntwortart versandart;

        /**
         * Gets the value of the abfrageID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbfrageID() {
            return abfrageID;
        }

        /**
         * Sets the value of the abfrageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbfrageID(String value) {
            this.abfrageID = value;
        }

        /**
         * Gets the value of the auswahlAuskunfttyp property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten.AuswahlAuskunfttyp }
         *     
         */
        public NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten.AuswahlAuskunfttyp getAuswahlAuskunfttyp() {
            return auswahlAuskunfttyp;
        }

        /**
         * Sets the value of the auswahlAuskunfttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten.AuswahlAuskunfttyp }
         *     
         */
        public void setAuswahlAuskunfttyp(NachrichtZvrErstelleAuskunftInput1000010 .Fachdaten.AuswahlAuskunfttyp value) {
            this.auswahlAuskunfttyp = value;
        }

        /**
         * Gets the value of the versandart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeZVRAntwortart }
         *     
         */
        public CodeZVRAntwortart getVersandart() {
            return versandart;
        }

        /**
         * Sets the value of the versandart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeZVRAntwortart }
         *     
         */
        public void setVersandart(CodeZVRAntwortart value) {
            this.versandart = value;
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
         *         &lt;sequence&gt;
         *           &lt;element name="registernummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *           &lt;element name="inDetailGeladen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *           &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;/sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="auskunfttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
         *         &lt;/sequence&gt;
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
            "content"
        })
        public static class AuswahlAuskunfttyp {

            @XmlElementRefs({
                @XmlElementRef(name = "registernummer", namespace = "http://www.xjustiz.de", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "inDetailGeladen", namespace = "http://www.xjustiz.de", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "auskunfttyp", namespace = "http://www.xjustiz.de", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<? extends Serializable>> content;

            /**
             * Gets the rest of the content model. 
             * 
             * <p>
             * You are getting this "catch-all" property because of the following reason: 
             * The field name "Auskunfttyp" is used by two different parts of a schema. See: 
             * line 467 of file:/X:/eclipse-workspace_XSD/GenerateXSD2JavaFiles/src/main/xsd/xjustiz_1000_vorsorgeregister_3_1.xsd
             * line 458 of file:/X:/eclipse-workspace_XSD/GenerateXSD2JavaFiles/src/main/xsd/xjustiz_1000_vorsorgeregister_3_1.xsd
             * <p>
             * To get rid of this property, apply a property customization to one 
             * of both of the following declarations to change their names: 
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * 
             * 
             */
            public List<JAXBElement<? extends Serializable>> getContent() {
                if (content == null) {
                    content = new ArrayList<JAXBElement<? extends Serializable>>();
                }
                return this.content;
            }

        }

    }

}
