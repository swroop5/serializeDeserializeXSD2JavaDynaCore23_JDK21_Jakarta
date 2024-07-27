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
 *         &lt;element name="schriftgutobjekte" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Dokument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="asservate" type="{http://www.xjustiz.de}Type.STRAF.Asservate" maxOccurs="unbounded"/&gt;
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
@XmlRootElement(name = "nachricht.straf.asservate.0500017")
public class NachrichtStrafAsservate0500017
    extends TypeGDSBasisnachricht
{

    protected NachrichtStrafAsservate0500017 .Schriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtStrafAsservate0500017 .Fachdaten fachdaten;

    /**
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafAsservate0500017 .Schriftgutobjekte }
     *     
     */
    public NachrichtStrafAsservate0500017 .Schriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafAsservate0500017 .Schriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(NachrichtStrafAsservate0500017 .Schriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafAsservate0500017 .Fachdaten }
     *     
     */
    public NachrichtStrafAsservate0500017 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafAsservate0500017 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafAsservate0500017 .Fachdaten value) {
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
     *         &lt;element name="asservate" type="{http://www.xjustiz.de}Type.STRAF.Asservate" maxOccurs="unbounded"/&gt;
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
        "asservate"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected List<TypeSTRAFAsservate> asservate;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Dokument" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Schriftgutobjekte
        extends TypeGDSSchriftgutobjekte
    {


    }

}
