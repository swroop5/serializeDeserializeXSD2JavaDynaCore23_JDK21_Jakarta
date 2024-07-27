//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dieser Datentyp beinhaltet Angaben zu Beteiligten, Ergebnissen,. Anordnungen und OWI-Bereichen.
 * 
 * <p>Java class for Type.STRAF.Entscheidungstenor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.Entscheidungstenor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="betroffener" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ergebnis" type="{http://www.xjustiz.de}Type.STRAF.Ergebnis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wortlautEntscheidungstenor" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anordnungsinhalt" type="{http://www.xjustiz.de}Type.STRAF.Anordnungsinhalt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="beweismittel" type="{http://www.xjustiz.de}Type.STRAF.Beweismittel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="asservate" type="{http://www.xjustiz.de}Type.STRAF.Asservate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="owi" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tatangabenZusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="bescheidZusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="paragraf28aStVG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="nebenfolgen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *                   &lt;element name="punkte" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="abweichungRegelsatz" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="absehenVonFahrverbot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="vollstreckbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="vollstreckungErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="belehrung66Abs2Nr3OWiG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "Type.STRAF.Entscheidungstenor", propOrder = {
    "betroffener",
    "ergebnis",
    "wortlautEntscheidungstenor",
    "anordnungsinhalt",
    "beweismittel",
    "asservate",
    "owi"
})
public class TypeSTRAFEntscheidungstenor {

    @XmlElement(required = true)
    protected List<TypeGDSRefRollennummer> betroffener;
    protected List<TypeSTRAFErgebnis> ergebnis;
    protected List<String> wortlautEntscheidungstenor;
    protected List<TypeSTRAFAnordnungsinhalt> anordnungsinhalt;
    protected List<TypeSTRAFBeweismittel> beweismittel;
    protected List<TypeSTRAFAsservate> asservate;
    protected TypeSTRAFEntscheidungstenor.Owi owi;

    /**
     * Gets the value of the betroffener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the betroffener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetroffener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSRefRollennummer }
     * 
     * 
     */
    public List<TypeGDSRefRollennummer> getBetroffener() {
        if (betroffener == null) {
            betroffener = new ArrayList<TypeGDSRefRollennummer>();
        }
        return this.betroffener;
    }

    /**
     * Gets the value of the ergebnis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ergebnis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErgebnis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFErgebnis }
     * 
     * 
     */
    public List<TypeSTRAFErgebnis> getErgebnis() {
        if (ergebnis == null) {
            ergebnis = new ArrayList<TypeSTRAFErgebnis>();
        }
        return this.ergebnis;
    }

    /**
     * Gets the value of the wortlautEntscheidungstenor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wortlautEntscheidungstenor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWortlautEntscheidungstenor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWortlautEntscheidungstenor() {
        if (wortlautEntscheidungstenor == null) {
            wortlautEntscheidungstenor = new ArrayList<String>();
        }
        return this.wortlautEntscheidungstenor;
    }

    /**
     * Gets the value of the anordnungsinhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the anordnungsinhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnordnungsinhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFAnordnungsinhalt }
     * 
     * 
     */
    public List<TypeSTRAFAnordnungsinhalt> getAnordnungsinhalt() {
        if (anordnungsinhalt == null) {
            anordnungsinhalt = new ArrayList<TypeSTRAFAnordnungsinhalt>();
        }
        return this.anordnungsinhalt;
    }

    /**
     * Gets the value of the beweismittel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the beweismittel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeweismittel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFBeweismittel }
     * 
     * 
     */
    public List<TypeSTRAFBeweismittel> getBeweismittel() {
        if (beweismittel == null) {
            beweismittel = new ArrayList<TypeSTRAFBeweismittel>();
        }
        return this.beweismittel;
    }

    /**
     * Gets the value of the asservate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the asservate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsservate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFAsservate }
     * 
     * 
     */
    public List<TypeSTRAFAsservate> getAsservate() {
        if (asservate == null) {
            asservate = new ArrayList<TypeSTRAFAsservate>();
        }
        return this.asservate;
    }

    /**
     * Gets the value of the owi property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFEntscheidungstenor.Owi }
     *     
     */
    public TypeSTRAFEntscheidungstenor.Owi getOwi() {
        return owi;
    }

    /**
     * Sets the value of the owi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFEntscheidungstenor.Owi }
     *     
     */
    public void setOwi(TypeSTRAFEntscheidungstenor.Owi value) {
        this.owi = value;
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
     *         &lt;element name="tatangabenZusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="bescheidZusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="paragraf28aStVG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="nebenfolgen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
     *         &lt;element name="punkte" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="abweichungRegelsatz" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="absehenVonFahrverbot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="vollstreckbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="vollstreckungErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="belehrung66Abs2Nr3OWiG" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "tatangabenZusatztext",
        "bescheidZusatztext",
        "paragraf28AStVG",
        "nebenfolgen",
        "punkte",
        "abweichungRegelsatz",
        "absehenVonFahrverbot",
        "vollstreckbar",
        "vollstreckungErfolglos",
        "belehrung66Abs2Nr3OWiG"
    })
    public static class Owi {

        protected String tatangabenZusatztext;
        protected String bescheidZusatztext;
        @XmlElement(name = "paragraf28aStVG")
        protected Boolean paragraf28AStVG;
        protected String nebenfolgen;
        protected BigInteger punkte;
        @XmlElement(defaultValue = "false")
        protected boolean abweichungRegelsatz;
        @XmlElement(defaultValue = "false")
        protected boolean absehenVonFahrverbot;
        protected Boolean vollstreckbar;
        protected Boolean vollstreckungErfolglos;
        protected Boolean belehrung66Abs2Nr3OWiG;

        /**
         * Gets the value of the tatangabenZusatztext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTatangabenZusatztext() {
            return tatangabenZusatztext;
        }

        /**
         * Sets the value of the tatangabenZusatztext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTatangabenZusatztext(String value) {
            this.tatangabenZusatztext = value;
        }

        /**
         * Gets the value of the bescheidZusatztext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBescheidZusatztext() {
            return bescheidZusatztext;
        }

        /**
         * Sets the value of the bescheidZusatztext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBescheidZusatztext(String value) {
            this.bescheidZusatztext = value;
        }

        /**
         * Gets the value of the paragraf28AStVG property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isParagraf28AStVG() {
            return paragraf28AStVG;
        }

        /**
         * Sets the value of the paragraf28AStVG property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setParagraf28AStVG(Boolean value) {
            this.paragraf28AStVG = value;
        }

        /**
         * Gets the value of the nebenfolgen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNebenfolgen() {
            return nebenfolgen;
        }

        /**
         * Sets the value of the nebenfolgen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNebenfolgen(String value) {
            this.nebenfolgen = value;
        }

        /**
         * Gets the value of the punkte property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPunkte() {
            return punkte;
        }

        /**
         * Sets the value of the punkte property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPunkte(BigInteger value) {
            this.punkte = value;
        }

        /**
         * Gets the value of the abweichungRegelsatz property.
         * 
         */
        public boolean isAbweichungRegelsatz() {
            return abweichungRegelsatz;
        }

        /**
         * Sets the value of the abweichungRegelsatz property.
         * 
         */
        public void setAbweichungRegelsatz(boolean value) {
            this.abweichungRegelsatz = value;
        }

        /**
         * Gets the value of the absehenVonFahrverbot property.
         * 
         */
        public boolean isAbsehenVonFahrverbot() {
            return absehenVonFahrverbot;
        }

        /**
         * Sets the value of the absehenVonFahrverbot property.
         * 
         */
        public void setAbsehenVonFahrverbot(boolean value) {
            this.absehenVonFahrverbot = value;
        }

        /**
         * Gets the value of the vollstreckbar property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVollstreckbar() {
            return vollstreckbar;
        }

        /**
         * Sets the value of the vollstreckbar property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVollstreckbar(Boolean value) {
            this.vollstreckbar = value;
        }

        /**
         * Gets the value of the vollstreckungErfolglos property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVollstreckungErfolglos() {
            return vollstreckungErfolglos;
        }

        /**
         * Sets the value of the vollstreckungErfolglos property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVollstreckungErfolglos(Boolean value) {
            this.vollstreckungErfolglos = value;
        }

        /**
         * Gets the value of the belehrung66Abs2Nr3OWiG property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBelehrung66Abs2Nr3OWiG() {
            return belehrung66Abs2Nr3OWiG;
        }

        /**
         * Sets the value of the belehrung66Abs2Nr3OWiG property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBelehrung66Abs2Nr3OWiG(Boolean value) {
            this.belehrung66Abs2Nr3OWiG = value;
        }

    }

}
