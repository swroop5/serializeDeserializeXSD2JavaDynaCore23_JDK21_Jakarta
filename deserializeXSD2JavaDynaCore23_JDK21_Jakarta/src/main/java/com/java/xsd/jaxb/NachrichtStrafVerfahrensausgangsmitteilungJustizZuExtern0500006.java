//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Basisnachricht"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.Erledigung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.STRAF.Entscheidung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="tatvorwurf" type="{http://www.xjustiz.de}Type.STRAF.Tatvorwurf" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.straf.verfahrensausgangsmitteilung.justizZuExtern.0500006")
public class NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006
    extends TypeGDSBasisnachricht
{

    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006 .Fachdaten fachdaten;

    /**
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public TypeGDSSchriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(TypeGDSSchriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006 .Fachdaten }
     *     
     */
    public NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafVerfahrensausgangsmitteilungJustizZuExtern0500006 .Fachdaten value) {
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
     *         &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.Erledigung" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.STRAF.Entscheidung" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="tatvorwurf" type="{http://www.xjustiz.de}Type.STRAF.Tatvorwurf" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "erledigung",
        "entscheidung",
        "tatvorwurf"
    })
    public static class Fachdaten {

        protected List<TypeSTRAFErledigung> erledigung;
        protected List<TypeSTRAFEntscheidung> entscheidung;
        protected List<TypeSTRAFTatvorwurf> tatvorwurf;

        /**
         * Gets the value of the erledigung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the erledigung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErledigung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFErledigung }
         * 
         * 
         */
        public List<TypeSTRAFErledigung> getErledigung() {
            if (erledigung == null) {
                erledigung = new ArrayList<TypeSTRAFErledigung>();
            }
            return this.erledigung;
        }

        /**
         * Gets the value of the entscheidung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the entscheidung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntscheidung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFEntscheidung }
         * 
         * 
         */
        public List<TypeSTRAFEntscheidung> getEntscheidung() {
            if (entscheidung == null) {
                entscheidung = new ArrayList<TypeSTRAFEntscheidung>();
            }
            return this.entscheidung;
        }

        /**
         * Gets the value of the tatvorwurf property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the tatvorwurf property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTatvorwurf().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFTatvorwurf }
         * 
         * 
         */
        public List<TypeSTRAFTatvorwurf> getTatvorwurf() {
            if (tatvorwurf == null) {
                tatvorwurf = new ArrayList<TypeSTRAFTatvorwurf>();
            }
            return this.tatvorwurf;
        }

    }

}
