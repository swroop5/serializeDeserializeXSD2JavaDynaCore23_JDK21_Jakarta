//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.BFJ.Freiheitsentziehung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.BFJ.Freiheitsentziehung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.STRAF.BFJ.BZR.FreiheitsentziehungArt.Typ3"/&gt;
 *         &lt;element name="auswahl_dauer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="dauer" type="{http://www.xjustiz.de}Type.STRAF.Dauer"/&gt;
 *                   &lt;element name="lebenslang" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "Type.STRAF.BFJ.Freiheitsentziehung", propOrder = {
    "art",
    "auswahlDauer"
})
public class TypeSTRAFBFJFreiheitsentziehung {

    @XmlElement(required = true)
    protected CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 art;
    @XmlElement(name = "auswahl_dauer", required = true)
    protected TypeSTRAFBFJFreiheitsentziehung.AuswahlDauer auswahlDauer;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 }
     *     
     */
    public CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 }
     *     
     */
    public void setArt(CodeSTRAFBFJBZRFreiheitsentziehungArtTyp3 value) {
        this.art = value;
    }

    /**
     * Gets the value of the auswahlDauer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFBFJFreiheitsentziehung.AuswahlDauer }
     *     
     */
    public TypeSTRAFBFJFreiheitsentziehung.AuswahlDauer getAuswahlDauer() {
        return auswahlDauer;
    }

    /**
     * Sets the value of the auswahlDauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFBFJFreiheitsentziehung.AuswahlDauer }
     *     
     */
    public void setAuswahlDauer(TypeSTRAFBFJFreiheitsentziehung.AuswahlDauer value) {
        this.auswahlDauer = value;
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
     *         &lt;element name="dauer" type="{http://www.xjustiz.de}Type.STRAF.Dauer"/&gt;
     *         &lt;element name="lebenslang" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "dauer",
        "lebenslang"
    })
    public static class AuswahlDauer {

        protected TypeSTRAFDauer dauer;
        protected Boolean lebenslang;

        /**
         * Gets the value of the dauer property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSTRAFDauer }
         *     
         */
        public TypeSTRAFDauer getDauer() {
            return dauer;
        }

        /**
         * Sets the value of the dauer property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSTRAFDauer }
         *     
         */
        public void setDauer(TypeSTRAFDauer value) {
            this.dauer = value;
        }

        /**
         * Gets the value of the lebenslang property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLebenslang() {
            return lebenslang;
        }

        /**
         * Sets the value of the lebenslang property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLebenslang(Boolean value) {
            this.lebenslang = value;
        }

    }

}
