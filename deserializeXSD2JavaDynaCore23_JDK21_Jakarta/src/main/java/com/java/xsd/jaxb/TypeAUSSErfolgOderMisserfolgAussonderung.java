//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:45 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Information zum erfolgreichen oder nicht erfolgreichen Import eines auszusondernden Schriftgutobjekts.
 * 
 * <p>Java class for Type.AUSS.ErfolgOderMisserfolgAussonderung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.AUSS.ErfolgOderMisserfolgAussonderung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idsgo" type="{http://www.xjustiz.de}Type.GDS.Xdomea.stringUUIDType"/&gt;
 *         &lt;element name="erfolgreich" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fehlermeldung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="archivkennung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.AUSS.ErfolgOderMisserfolgAussonderung", propOrder = {
    "idsgo",
    "erfolgreich",
    "fehlermeldung",
    "archivkennung"
})
public class TypeAUSSErfolgOderMisserfolgAussonderung {

    @XmlElement(required = true)
    protected String idsgo;
    protected boolean erfolgreich;
    protected String fehlermeldung;
    protected String archivkennung;

    /**
     * Gets the value of the idsgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsgo() {
        return idsgo;
    }

    /**
     * Sets the value of the idsgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsgo(String value) {
        this.idsgo = value;
    }

    /**
     * Gets the value of the erfolgreich property.
     * 
     */
    public boolean isErfolgreich() {
        return erfolgreich;
    }

    /**
     * Sets the value of the erfolgreich property.
     * 
     */
    public void setErfolgreich(boolean value) {
        this.erfolgreich = value;
    }

    /**
     * Gets the value of the fehlermeldung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFehlermeldung() {
        return fehlermeldung;
    }

    /**
     * Sets the value of the fehlermeldung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFehlermeldung(String value) {
        this.fehlermeldung = value;
    }

    /**
     * Gets the value of the archivkennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivkennung() {
        return archivkennung;
    }

    /**
     * Sets the value of the archivkennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivkennung(String value) {
        this.archivkennung = value;
    }

}
