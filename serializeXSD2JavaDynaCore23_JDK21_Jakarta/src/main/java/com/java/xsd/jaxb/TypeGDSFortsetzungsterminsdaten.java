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
 * Der Fortsetzungstermin enthält alle "Terminsdaten". Er bezieht sich über das Datum und die Uhrzeit auf einen Haupttermin.
 * 
 * <p>Java class for Type.GDS.Fortsetzungsterminsdaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Fortsetzungsterminsdaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Terminsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hauptterminsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="auswahl_hauptterminszeit"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="hauptterminsuhrzeit" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *                   &lt;element name="hauptterminszeit" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hauptterminsID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Fortsetzungsterminsdaten", propOrder = {
    "hauptterminsdatum",
    "auswahlHauptterminszeit",
    "hauptterminsID"
})
public class TypeGDSFortsetzungsterminsdaten
    extends TypeGDSTerminsdaten
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hauptterminsdatum;
    @XmlElement(name = "auswahl_hauptterminszeit", required = true)
    protected TypeGDSFortsetzungsterminsdaten.AuswahlHauptterminszeit auswahlHauptterminszeit;
    protected String hauptterminsID;

    /**
     * Gets the value of the hauptterminsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHauptterminsdatum() {
        return hauptterminsdatum;
    }

    /**
     * Sets the value of the hauptterminsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHauptterminsdatum(XMLGregorianCalendar value) {
        this.hauptterminsdatum = value;
    }

    /**
     * Gets the value of the auswahlHauptterminszeit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSFortsetzungsterminsdaten.AuswahlHauptterminszeit }
     *     
     */
    public TypeGDSFortsetzungsterminsdaten.AuswahlHauptterminszeit getAuswahlHauptterminszeit() {
        return auswahlHauptterminszeit;
    }

    /**
     * Sets the value of the auswahlHauptterminszeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSFortsetzungsterminsdaten.AuswahlHauptterminszeit }
     *     
     */
    public void setAuswahlHauptterminszeit(TypeGDSFortsetzungsterminsdaten.AuswahlHauptterminszeit value) {
        this.auswahlHauptterminszeit = value;
    }

    /**
     * Gets the value of the hauptterminsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHauptterminsID() {
        return hauptterminsID;
    }

    /**
     * Sets the value of the hauptterminsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHauptterminsID(String value) {
        this.hauptterminsID = value;
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
     *         &lt;element name="hauptterminsuhrzeit" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
     *         &lt;element name="hauptterminszeit" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
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
        "hauptterminsuhrzeit",
        "hauptterminszeit"
    })
    public static class AuswahlHauptterminszeit {

        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar hauptterminsuhrzeit;
        protected String hauptterminszeit;

        /**
         * Gets the value of the hauptterminsuhrzeit property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHauptterminsuhrzeit() {
            return hauptterminsuhrzeit;
        }

        /**
         * Sets the value of the hauptterminsuhrzeit property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHauptterminsuhrzeit(XMLGregorianCalendar value) {
            this.hauptterminsuhrzeit = value;
        }

        /**
         * Gets the value of the hauptterminszeit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHauptterminszeit() {
            return hauptterminszeit;
        }

        /**
         * Sets the value of the hauptterminszeit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHauptterminszeit(String value) {
            this.hauptterminszeit = value;
        }

    }

}
