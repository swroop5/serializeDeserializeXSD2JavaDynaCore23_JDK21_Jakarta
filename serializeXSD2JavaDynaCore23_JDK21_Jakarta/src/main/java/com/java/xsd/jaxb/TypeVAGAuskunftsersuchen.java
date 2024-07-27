//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:28 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.VAG.Auskunftsersuchen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VAG.Auskunftsersuchen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anfrage.ID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="datumDesAuskunftsersuchens" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="familie" type="{http://www.xjustiz.de}Type.VAG.Familie"/&gt;
 *         &lt;element name="versicherter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="andererEhegatte" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="empfaengerDesAuskunftsersuchens" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/&gt;
 *         &lt;element name="frist" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="betriebsnummer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"&gt;
 *               &lt;maxLength value="15"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ausschlusszeitraum" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="auskunftMitErgaenzendenAnlagen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VAG.Auskunftsersuchen", propOrder = {
    "anfrageID",
    "datumDesAuskunftsersuchens",
    "familie",
    "versicherter",
    "andererEhegatte",
    "empfaengerDesAuskunftsersuchens",
    "frist",
    "betriebsnummer",
    "ausschlusszeitraum",
    "auskunftMitErgaenzendenAnlagen"
})
public class TypeVAGAuskunftsersuchen {

    @XmlElement(name = "anfrage.ID", required = true)
    protected String anfrageID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDesAuskunftsersuchens;
    @XmlElement(required = true)
    protected TypeVAGFamilie familie;
    @XmlElement(required = true)
    protected TypeGDSRefRollennummer versicherter;
    @XmlElement(required = true)
    protected TypeGDSRefRollennummer andererEhegatte;
    @XmlElement(required = true)
    protected TypeGDSRefRollennummer empfaengerDesAuskunftsersuchens;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger frist;
    @XmlElement(required = true)
    protected String betriebsnummer;
    protected List<TypeGDSXdomeaZeitraumType> ausschlusszeitraum;
    @XmlElement(defaultValue = "false")
    protected Boolean auskunftMitErgaenzendenAnlagen;

    /**
     * Gets the value of the anfrageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnfrageID() {
        return anfrageID;
    }

    /**
     * Sets the value of the anfrageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnfrageID(String value) {
        this.anfrageID = value;
    }

    /**
     * Gets the value of the datumDesAuskunftsersuchens property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDesAuskunftsersuchens() {
        return datumDesAuskunftsersuchens;
    }

    /**
     * Sets the value of the datumDesAuskunftsersuchens property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDesAuskunftsersuchens(XMLGregorianCalendar value) {
        this.datumDesAuskunftsersuchens = value;
    }

    /**
     * Gets the value of the familie property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVAGFamilie }
     *     
     */
    public TypeVAGFamilie getFamilie() {
        return familie;
    }

    /**
     * Sets the value of the familie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVAGFamilie }
     *     
     */
    public void setFamilie(TypeVAGFamilie value) {
        this.familie = value;
    }

    /**
     * Gets the value of the versicherter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getVersicherter() {
        return versicherter;
    }

    /**
     * Sets the value of the versicherter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setVersicherter(TypeGDSRefRollennummer value) {
        this.versicherter = value;
    }

    /**
     * Gets the value of the andererEhegatte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getAndererEhegatte() {
        return andererEhegatte;
    }

    /**
     * Sets the value of the andererEhegatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setAndererEhegatte(TypeGDSRefRollennummer value) {
        this.andererEhegatte = value;
    }

    /**
     * Gets the value of the empfaengerDesAuskunftsersuchens property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public TypeGDSRefRollennummer getEmpfaengerDesAuskunftsersuchens() {
        return empfaengerDesAuskunftsersuchens;
    }

    /**
     * Sets the value of the empfaengerDesAuskunftsersuchens property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefRollennummer }
     *     
     */
    public void setEmpfaengerDesAuskunftsersuchens(TypeGDSRefRollennummer value) {
        this.empfaengerDesAuskunftsersuchens = value;
    }

    /**
     * Gets the value of the frist property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrist() {
        return frist;
    }

    /**
     * Sets the value of the frist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrist(BigInteger value) {
        this.frist = value;
    }

    /**
     * Gets the value of the betriebsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetriebsnummer() {
        return betriebsnummer;
    }

    /**
     * Sets the value of the betriebsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetriebsnummer(String value) {
        this.betriebsnummer = value;
    }

    /**
     * Gets the value of the ausschlusszeitraum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ausschlusszeitraum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusschlusszeitraum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSXdomeaZeitraumType }
     * 
     * 
     */
    public List<TypeGDSXdomeaZeitraumType> getAusschlusszeitraum() {
        if (ausschlusszeitraum == null) {
            ausschlusszeitraum = new ArrayList<TypeGDSXdomeaZeitraumType>();
        }
        return this.ausschlusszeitraum;
    }

    /**
     * Gets the value of the auskunftMitErgaenzendenAnlagen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuskunftMitErgaenzendenAnlagen() {
        return auskunftMitErgaenzendenAnlagen;
    }

    /**
     * Sets the value of the auskunftMitErgaenzendenAnlagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuskunftMitErgaenzendenAnlagen(Boolean value) {
        this.auskunftMitErgaenzendenAnlagen = value;
    }

}
