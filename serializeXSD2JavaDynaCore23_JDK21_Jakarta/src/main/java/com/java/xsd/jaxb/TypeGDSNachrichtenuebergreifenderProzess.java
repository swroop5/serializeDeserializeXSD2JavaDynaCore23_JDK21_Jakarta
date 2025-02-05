//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:17 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Elemente dieses Types dienen der Übermittlung von Informationen zu einem mehrere Nachrichten umfassenden Geschäftsprozess. Sofern diese Informationen für die automatisierte Abarbeitung des Geschäftsprozesses nicht ausreichen, müssen unter den Kommunikationspartnern bilateral weitere Regeln abgestimmt sein. Dies gilt insbesondere für den Fall, dass der Versand zusammengehöriger Dokumente (z.B. einer Akte) auf mehrere Nachrichten verteilt werden soll. Dieses sogenannte fachliche Splitting darf nur nach vorheriger Abstimmung mit der BLK-AG IT-Standards erfolgen.
 * 
 * <p>Java class for Type.GDS.NachrichtenuebergreifenderProzess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.NachrichtenuebergreifenderProzess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prozessID" type="{http://www.xjustiz.de}Type.GDS.Xdomea.stringUUIDType"/&gt;
 *         &lt;element name="nachrichtenNummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="nachrichtenAnzahl" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.NachrichtenuebergreifenderProzess", propOrder = {
    "prozessID",
    "nachrichtenNummer",
    "nachrichtenAnzahl"
})
public class TypeGDSNachrichtenuebergreifenderProzess {

    @XmlElement(required = true)
    protected String prozessID;
    protected BigInteger nachrichtenNummer;
    protected BigInteger nachrichtenAnzahl;

    /**
     * Gets the value of the prozessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProzessID() {
        return prozessID;
    }

    /**
     * Sets the value of the prozessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProzessID(String value) {
        this.prozessID = value;
    }

    /**
     * Gets the value of the nachrichtenNummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNachrichtenNummer() {
        return nachrichtenNummer;
    }

    /**
     * Sets the value of the nachrichtenNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNachrichtenNummer(BigInteger value) {
        this.nachrichtenNummer = value;
    }

    /**
     * Gets the value of the nachrichtenAnzahl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNachrichtenAnzahl() {
        return nachrichtenAnzahl;
    }

    /**
     * Sets the value of the nachrichtenAnzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNachrichtenAnzahl(BigInteger value) {
        this.nachrichtenAnzahl = value;
    }

}
