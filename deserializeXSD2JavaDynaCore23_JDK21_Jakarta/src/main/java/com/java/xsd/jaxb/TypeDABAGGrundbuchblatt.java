//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Grundbuchblatt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Grundbuchblatt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amtsgericht" type="{http://www.xjustiz.de}Code.GDS.Gerichte.Typ3"/&gt;
 *         &lt;element name="grundbuchbezirk"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                   &lt;element name="nummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="blattnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="buchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Buchungsstelle" maxOccurs="unbounded"/&gt;
 *         &lt;element name="eigentuemer" type="{http://www.xjustiz.de}Type.DABAG.Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="belastungen" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="belastungAbt2" type="{http://www.xjustiz.de}Type.DABAG.Belastung.Abt2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="belastungAbt3" type="{http://www.xjustiz.de}Type.DABAG.Belastung.Abt3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="rangvermerk" type="{http://www.xjustiz.de}Type.DABAG.Rangvermerk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="wirksamkeitsvermerk" type="{http://www.xjustiz.de}Type.DABAG.Wirksamkeitsvermerk" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="widerspruch" type="{http://www.xjustiz.de}Type.DABAG.Widerspruch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sondernutzungsrechte" type="{http://www.xjustiz.de}Type.DABAG.Sondernutzungsrecht" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Grundbuchblatt", propOrder = {
    "amtsgericht",
    "grundbuchbezirk",
    "blattnummer",
    "buchungsstelle",
    "eigentuemer",
    "belastungen",
    "sondernutzungsrechte"
})
public class TypeDABAGGrundbuchblatt {

    @XmlElement(required = true)
    protected CodeGDSGerichteTyp3 amtsgericht;
    @XmlElement(required = true)
    protected TypeDABAGGrundbuchblatt.Grundbuchbezirk grundbuchbezirk;
    @XmlElement(required = true)
    protected String blattnummer;
    @XmlElement(required = true)
    protected List<TypeDABAGBuchungsstelle> buchungsstelle;
    protected List<TypeDABAGEigentuemer> eigentuemer;
    protected TypeDABAGGrundbuchblatt.Belastungen belastungen;
    protected List<TypeDABAGSondernutzungsrecht> sondernutzungsrechte;

    /**
     * Gets the value of the amtsgericht property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSGerichteTyp3 }
     *     
     */
    public CodeGDSGerichteTyp3 getAmtsgericht() {
        return amtsgericht;
    }

    /**
     * Sets the value of the amtsgericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSGerichteTyp3 }
     *     
     */
    public void setAmtsgericht(CodeGDSGerichteTyp3 value) {
        this.amtsgericht = value;
    }

    /**
     * Gets the value of the grundbuchbezirk property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGGrundbuchblatt.Grundbuchbezirk }
     *     
     */
    public TypeDABAGGrundbuchblatt.Grundbuchbezirk getGrundbuchbezirk() {
        return grundbuchbezirk;
    }

    /**
     * Sets the value of the grundbuchbezirk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGGrundbuchblatt.Grundbuchbezirk }
     *     
     */
    public void setGrundbuchbezirk(TypeDABAGGrundbuchblatt.Grundbuchbezirk value) {
        this.grundbuchbezirk = value;
    }

    /**
     * Gets the value of the blattnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlattnummer() {
        return blattnummer;
    }

    /**
     * Sets the value of the blattnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlattnummer(String value) {
        this.blattnummer = value;
    }

    /**
     * Gets the value of the buchungsstelle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the buchungsstelle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuchungsstelle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGBuchungsstelle }
     * 
     * 
     */
    public List<TypeDABAGBuchungsstelle> getBuchungsstelle() {
        if (buchungsstelle == null) {
            buchungsstelle = new ArrayList<TypeDABAGBuchungsstelle>();
        }
        return this.buchungsstelle;
    }

    /**
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGEigentuemer }
     * 
     * 
     */
    public List<TypeDABAGEigentuemer> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<TypeDABAGEigentuemer>();
        }
        return this.eigentuemer;
    }

    /**
     * Gets the value of the belastungen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGGrundbuchblatt.Belastungen }
     *     
     */
    public TypeDABAGGrundbuchblatt.Belastungen getBelastungen() {
        return belastungen;
    }

    /**
     * Sets the value of the belastungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGGrundbuchblatt.Belastungen }
     *     
     */
    public void setBelastungen(TypeDABAGGrundbuchblatt.Belastungen value) {
        this.belastungen = value;
    }

    /**
     * Gets the value of the sondernutzungsrechte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sondernutzungsrechte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSondernutzungsrechte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGSondernutzungsrecht }
     * 
     * 
     */
    public List<TypeDABAGSondernutzungsrecht> getSondernutzungsrechte() {
        if (sondernutzungsrechte == null) {
            sondernutzungsrechte = new ArrayList<TypeDABAGSondernutzungsrecht>();
        }
        return this.sondernutzungsrechte;
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
     *         &lt;element name="belastungAbt2" type="{http://www.xjustiz.de}Type.DABAG.Belastung.Abt2" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="belastungAbt3" type="{http://www.xjustiz.de}Type.DABAG.Belastung.Abt3" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="rangvermerk" type="{http://www.xjustiz.de}Type.DABAG.Rangvermerk" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="wirksamkeitsvermerk" type="{http://www.xjustiz.de}Type.DABAG.Wirksamkeitsvermerk" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="widerspruch" type="{http://www.xjustiz.de}Type.DABAG.Widerspruch" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "belastungAbt2",
        "belastungAbt3",
        "rangvermerk",
        "wirksamkeitsvermerk",
        "widerspruch"
    })
    public static class Belastungen {

        protected List<TypeDABAGBelastungAbt2> belastungAbt2;
        protected List<TypeDABAGBelastungAbt3> belastungAbt3;
        protected List<TypeDABAGRangvermerk> rangvermerk;
        protected List<TypeDABAGWirksamkeitsvermerk> wirksamkeitsvermerk;
        protected List<TypeDABAGWiderspruch> widerspruch;

        /**
         * Gets the value of the belastungAbt2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the belastungAbt2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBelastungAbt2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeDABAGBelastungAbt2 }
         * 
         * 
         */
        public List<TypeDABAGBelastungAbt2> getBelastungAbt2() {
            if (belastungAbt2 == null) {
                belastungAbt2 = new ArrayList<TypeDABAGBelastungAbt2>();
            }
            return this.belastungAbt2;
        }

        /**
         * Gets the value of the belastungAbt3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the belastungAbt3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBelastungAbt3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeDABAGBelastungAbt3 }
         * 
         * 
         */
        public List<TypeDABAGBelastungAbt3> getBelastungAbt3() {
            if (belastungAbt3 == null) {
                belastungAbt3 = new ArrayList<TypeDABAGBelastungAbt3>();
            }
            return this.belastungAbt3;
        }

        /**
         * Gets the value of the rangvermerk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the rangvermerk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRangvermerk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeDABAGRangvermerk }
         * 
         * 
         */
        public List<TypeDABAGRangvermerk> getRangvermerk() {
            if (rangvermerk == null) {
                rangvermerk = new ArrayList<TypeDABAGRangvermerk>();
            }
            return this.rangvermerk;
        }

        /**
         * Gets the value of the wirksamkeitsvermerk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the wirksamkeitsvermerk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWirksamkeitsvermerk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeDABAGWirksamkeitsvermerk }
         * 
         * 
         */
        public List<TypeDABAGWirksamkeitsvermerk> getWirksamkeitsvermerk() {
            if (wirksamkeitsvermerk == null) {
                wirksamkeitsvermerk = new ArrayList<TypeDABAGWirksamkeitsvermerk>();
            }
            return this.wirksamkeitsvermerk;
        }

        /**
         * Gets the value of the widerspruch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the widerspruch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWiderspruch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeDABAGWiderspruch }
         * 
         * 
         */
        public List<TypeDABAGWiderspruch> getWiderspruch() {
            if (widerspruch == null) {
                widerspruch = new ArrayList<TypeDABAGWiderspruch>();
            }
            return this.widerspruch;
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
     *         &lt;element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
     *         &lt;element name="nummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "name",
        "nummer"
    })
    public static class Grundbuchbezirk {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String nummer;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the nummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNummer() {
            return nummer;
        }

        /**
         * Sets the value of the nummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNummer(String value) {
            this.nummer = value;
        }

    }

}
