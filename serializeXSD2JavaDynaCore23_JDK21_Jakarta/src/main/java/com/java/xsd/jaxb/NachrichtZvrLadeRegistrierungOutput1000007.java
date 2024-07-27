//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:43 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *                   &lt;element name="registerverlauf"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="registereintrag" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="vollmachtdaten" type="{http://www.xjustiz.de}Type.ZVR.Vollmachtdaten"/&gt;
 *                                       &lt;element name="vollmachtgeber" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *                                       &lt;element name="bevollmaechtigter" maxOccurs="12" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="referenzierungBevollmaechtigter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *                                                 &lt;element name="weitereAngabenBevollmaechtigter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="vielmelder" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="aktuellerEintrag" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlRootElement(name = "nachricht.zvr.ladeRegistrierung.output.1000007")
public class NachrichtZvrLadeRegistrierungOutput1000007 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten fachdaten;

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
     *     {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten }
     *     
     */
    public NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten value) {
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
     *         &lt;element name="registerverlauf"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="registereintrag" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="vollmachtdaten" type="{http://www.xjustiz.de}Type.ZVR.Vollmachtdaten"/&gt;
     *                             &lt;element name="vollmachtgeber" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
     *                             &lt;element name="bevollmaechtigter" maxOccurs="12" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="referenzierungBevollmaechtigter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
     *                                       &lt;element name="weitereAngabenBevollmaechtigter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="vielmelder" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="aktuellerEintrag" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
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
        "registerverlauf"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf registerverlauf;

        /**
         * Gets the value of the registerverlauf property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf }
         *     
         */
        public NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf getRegisterverlauf() {
            return registerverlauf;
        }

        /**
         * Sets the value of the registerverlauf property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf }
         *     
         */
        public void setRegisterverlauf(NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf value) {
            this.registerverlauf = value;
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
         *         &lt;element name="registereintrag" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="vollmachtdaten" type="{http://www.xjustiz.de}Type.ZVR.Vollmachtdaten"/&gt;
         *                   &lt;element name="vollmachtgeber" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
         *                   &lt;element name="bevollmaechtigter" maxOccurs="12" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="referenzierungBevollmaechtigter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
         *                             &lt;element name="weitereAngabenBevollmaechtigter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="vielmelder" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="aktuellerEintrag" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
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
            "registereintrag"
        })
        public static class Registerverlauf {

            @XmlElement(required = true)
            protected List<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag> registereintrag;

            /**
             * Gets the value of the registereintrag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the registereintrag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegistereintrag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag }
             * 
             * 
             */
            public List<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag> getRegistereintrag() {
                if (registereintrag == null) {
                    registereintrag = new ArrayList<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag>();
                }
                return this.registereintrag;
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
             *         &lt;element name="vollmachtdaten" type="{http://www.xjustiz.de}Type.ZVR.Vollmachtdaten"/&gt;
             *         &lt;element name="vollmachtgeber" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
             *         &lt;element name="bevollmaechtigter" maxOccurs="12" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="referenzierungBevollmaechtigter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
             *                   &lt;element name="weitereAngabenBevollmaechtigter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="vielmelder" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="aktuellerEintrag" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="true" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "vollmachtdaten",
                "vollmachtgeber",
                "bevollmaechtigter",
                "vielmelder"
            })
            public static class Registereintrag {

                @XmlElement(required = true)
                protected TypeZVRVollmachtdaten vollmachtdaten;
                @XmlElement(required = true)
                protected TypeGDSRefRollennummer vollmachtgeber;
                protected List<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag.Bevollmaechtigter> bevollmaechtigter;
                protected TypeGDSRefRollennummer vielmelder;
                @XmlAttribute(name = "aktuellerEintrag")
                protected Boolean aktuellerEintrag;

                /**
                 * Gets the value of the vollmachtdaten property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeZVRVollmachtdaten }
                 *     
                 */
                public TypeZVRVollmachtdaten getVollmachtdaten() {
                    return vollmachtdaten;
                }

                /**
                 * Sets the value of the vollmachtdaten property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeZVRVollmachtdaten }
                 *     
                 */
                public void setVollmachtdaten(TypeZVRVollmachtdaten value) {
                    this.vollmachtdaten = value;
                }

                /**
                 * Gets the value of the vollmachtgeber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeGDSRefRollennummer }
                 *     
                 */
                public TypeGDSRefRollennummer getVollmachtgeber() {
                    return vollmachtgeber;
                }

                /**
                 * Sets the value of the vollmachtgeber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeGDSRefRollennummer }
                 *     
                 */
                public void setVollmachtgeber(TypeGDSRefRollennummer value) {
                    this.vollmachtgeber = value;
                }

                /**
                 * Gets the value of the bevollmaechtigter property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a <CODE>set</CODE> method for the bevollmaechtigter property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBevollmaechtigter().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag.Bevollmaechtigter }
                 * 
                 * 
                 */
                public List<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag.Bevollmaechtigter> getBevollmaechtigter() {
                    if (bevollmaechtigter == null) {
                        bevollmaechtigter = new ArrayList<NachrichtZvrLadeRegistrierungOutput1000007 .Fachdaten.Registerverlauf.Registereintrag.Bevollmaechtigter>();
                    }
                    return this.bevollmaechtigter;
                }

                /**
                 * Gets the value of the vielmelder property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeGDSRefRollennummer }
                 *     
                 */
                public TypeGDSRefRollennummer getVielmelder() {
                    return vielmelder;
                }

                /**
                 * Sets the value of the vielmelder property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeGDSRefRollennummer }
                 *     
                 */
                public void setVielmelder(TypeGDSRefRollennummer value) {
                    this.vielmelder = value;
                }

                /**
                 * Gets the value of the aktuellerEintrag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isAktuellerEintrag() {
                    if (aktuellerEintrag == null) {
                        return true;
                    } else {
                        return aktuellerEintrag;
                    }
                }

                /**
                 * Sets the value of the aktuellerEintrag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAktuellerEintrag(Boolean value) {
                    this.aktuellerEintrag = value;
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
                 *         &lt;element name="referenzierungBevollmaechtigter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
                 *         &lt;element name="weitereAngabenBevollmaechtigter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
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
                    "referenzierungBevollmaechtigter",
                    "weitereAngabenBevollmaechtigter"
                })
                public static class Bevollmaechtigter {

                    @XmlElement(required = true)
                    protected TypeGDSRefRollennummer referenzierungBevollmaechtigter;
                    protected String weitereAngabenBevollmaechtigter;

                    /**
                     * Gets the value of the referenzierungBevollmaechtigter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TypeGDSRefRollennummer }
                     *     
                     */
                    public TypeGDSRefRollennummer getReferenzierungBevollmaechtigter() {
                        return referenzierungBevollmaechtigter;
                    }

                    /**
                     * Sets the value of the referenzierungBevollmaechtigter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TypeGDSRefRollennummer }
                     *     
                     */
                    public void setReferenzierungBevollmaechtigter(TypeGDSRefRollennummer value) {
                        this.referenzierungBevollmaechtigter = value;
                    }

                    /**
                     * Gets the value of the weitereAngabenBevollmaechtigter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWeitereAngabenBevollmaechtigter() {
                        return weitereAngabenBevollmaechtigter;
                    }

                    /**
                     * Sets the value of the weitereAngabenBevollmaechtigter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWeitereAngabenBevollmaechtigter(String value) {
                        this.weitereAngabenBevollmaechtigter = value;
                    }

                }

            }

        }

    }

}
