//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Zinsen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Zinsen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zinsberechnung" type="{http://www.xjustiz.de}Code.GDS.Zinsberechnung"/&gt;
 *         &lt;element name="ref.anspruchsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="zinssatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *           &lt;element name="basiszinssatz" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="zinsmerkmal" type="{http://www.xjustiz.de}Code.GDS.Intervall"/&gt;
 *         &lt;element name="berechnungsgrundlage" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="zinsbeginn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="zinsende" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="zinsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Zinsen", propOrder = {
    "zinsberechnung",
    "refAnspruchsnummer",
    "zinssatz",
    "basiszinssatz",
    "zinsmerkmal",
    "berechnungsgrundlage",
    "zinsbeginn",
    "zinsende",
    "zinsbetrag"
})
public class TypeGDSZinsen {

    @XmlElement(required = true)
    protected CodeGDSZinsberechnung zinsberechnung;
    @XmlElement(name = "ref.anspruchsnummer", required = true)
    protected List<String> refAnspruchsnummer;
    protected String zinssatz;
    protected String basiszinssatz;
    @XmlElement(required = true)
    protected CodeGDSIntervall zinsmerkmal;
    protected String berechnungsgrundlage;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsbeginn;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zinsende;
    @XmlElement(required = true)
    protected TypeGDSGeldbetrag zinsbetrag;

    /**
     * Gets the value of the zinsberechnung property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSZinsberechnung }
     *     
     */
    public CodeGDSZinsberechnung getZinsberechnung() {
        return zinsberechnung;
    }

    /**
     * Sets the value of the zinsberechnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSZinsberechnung }
     *     
     */
    public void setZinsberechnung(CodeGDSZinsberechnung value) {
        this.zinsberechnung = value;
    }

    /**
     * Gets the value of the refAnspruchsnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refAnspruchsnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefAnspruchsnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefAnspruchsnummer() {
        if (refAnspruchsnummer == null) {
            refAnspruchsnummer = new ArrayList<String>();
        }
        return this.refAnspruchsnummer;
    }

    /**
     * Gets the value of the zinssatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZinssatz() {
        return zinssatz;
    }

    /**
     * Sets the value of the zinssatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZinssatz(String value) {
        this.zinssatz = value;
    }

    /**
     * Gets the value of the basiszinssatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasiszinssatz() {
        return basiszinssatz;
    }

    /**
     * Sets the value of the basiszinssatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasiszinssatz(String value) {
        this.basiszinssatz = value;
    }

    /**
     * Gets the value of the zinsmerkmal property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSIntervall }
     *     
     */
    public CodeGDSIntervall getZinsmerkmal() {
        return zinsmerkmal;
    }

    /**
     * Sets the value of the zinsmerkmal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSIntervall }
     *     
     */
    public void setZinsmerkmal(CodeGDSIntervall value) {
        this.zinsmerkmal = value;
    }

    /**
     * Gets the value of the berechnungsgrundlage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerechnungsgrundlage() {
        return berechnungsgrundlage;
    }

    /**
     * Sets the value of the berechnungsgrundlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerechnungsgrundlage(String value) {
        this.berechnungsgrundlage = value;
    }

    /**
     * Gets the value of the zinsbeginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZinsbeginn() {
        return zinsbeginn;
    }

    /**
     * Sets the value of the zinsbeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZinsbeginn(XMLGregorianCalendar value) {
        this.zinsbeginn = value;
    }

    /**
     * Gets the value of the zinsende property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZinsende() {
        return zinsende;
    }

    /**
     * Sets the value of the zinsende property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZinsende(XMLGregorianCalendar value) {
        this.zinsende = value;
    }

    /**
     * Gets the value of the zinsbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getZinsbetrag() {
        return zinsbetrag;
    }

    /**
     * Sets the value of the zinsbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setZinsbetrag(TypeGDSGeldbetrag value) {
        this.zinsbetrag = value;
    }

}
