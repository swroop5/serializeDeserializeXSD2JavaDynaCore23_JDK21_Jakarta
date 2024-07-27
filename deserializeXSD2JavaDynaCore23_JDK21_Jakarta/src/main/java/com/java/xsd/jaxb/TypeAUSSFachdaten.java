//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:45 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Archivspezifische Fachdaten zum Aussonderungsobjekt
 * 
 * <p>Java class for Type.AUSS.Fachdaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.AUSS.Fachdaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archivspezifischeMetadaten" type="{http://www.xjustiz.de}Type.AUSS.MetadatenAussonderung" minOccurs="0"/&gt;
 *         &lt;element name="bewertungsvorschlagGrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="allgemeineDaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten" minOccurs="0"/&gt;
 *         &lt;element name="fachlicheDaten" type="{http://www.xjustiz.de}Type.AUSS.FachlicheDaten" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.AUSS.Fachdaten", propOrder = {
    "archivspezifischeMetadaten",
    "bewertungsvorschlagGrund",
    "allgemeineDaten",
    "fachlicheDaten"
})
public class TypeAUSSFachdaten {

    protected TypeAUSSMetadatenAussonderung archivspezifischeMetadaten;
    protected String bewertungsvorschlagGrund;
    protected TypeGDSGrunddaten allgemeineDaten;
    protected TypeAUSSFachlicheDaten fachlicheDaten;

    /**
     * Gets the value of the archivspezifischeMetadaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAUSSMetadatenAussonderung }
     *     
     */
    public TypeAUSSMetadatenAussonderung getArchivspezifischeMetadaten() {
        return archivspezifischeMetadaten;
    }

    /**
     * Sets the value of the archivspezifischeMetadaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAUSSMetadatenAussonderung }
     *     
     */
    public void setArchivspezifischeMetadaten(TypeAUSSMetadatenAussonderung value) {
        this.archivspezifischeMetadaten = value;
    }

    /**
     * Gets the value of the bewertungsvorschlagGrund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBewertungsvorschlagGrund() {
        return bewertungsvorschlagGrund;
    }

    /**
     * Sets the value of the bewertungsvorschlagGrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBewertungsvorschlagGrund(String value) {
        this.bewertungsvorschlagGrund = value;
    }

    /**
     * Gets the value of the allgemeineDaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getAllgemeineDaten() {
        return allgemeineDaten;
    }

    /**
     * Sets the value of the allgemeineDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setAllgemeineDaten(TypeGDSGrunddaten value) {
        this.allgemeineDaten = value;
    }

    /**
     * Gets the value of the fachlicheDaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAUSSFachlicheDaten }
     *     
     */
    public TypeAUSSFachlicheDaten getFachlicheDaten() {
        return fachlicheDaten;
    }

    /**
     * Sets the value of the fachlicheDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAUSSFachlicheDaten }
     *     
     */
    public void setFachlicheDaten(TypeAUSSFachlicheDaten value) {
        this.fachlicheDaten = value;
    }

}