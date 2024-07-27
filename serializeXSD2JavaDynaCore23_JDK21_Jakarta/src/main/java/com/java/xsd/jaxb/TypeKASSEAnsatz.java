//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:56 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Der Datentyp enthält die fachlichen Anforderungen eines Kostentatbestands.
 * 
 * <p>Java class for Type.KASSE.Ansatz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Ansatz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kvNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *         &lt;element name="umschluesselung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="gebuehrenwert" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="gebuehrensatz" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bezeichnung.auslagen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="hoehe.gebuehrensatzAuslagen" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/&gt;
 *         &lt;element name="anteil.rechnungsposten" type="{http://www.xjustiz.de}Type.KASSE.Betragsanteil"/&gt;
 *         &lt;element name="klassifikation" type="{http://www.xjustiz.de}Code.KASSE.Klassifikation"/&gt;
 *         &lt;element name="erloesart" type="{http://www.xjustiz.de}Code.KASSE.Erloesart"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Ansatz", propOrder = {
    "kvNummer",
    "umschluesselung",
    "bezeichnung",
    "gebuehrenwert",
    "gebuehrensatz",
    "bezeichnungAuslagen",
    "hoeheGebuehrensatzAuslagen",
    "betrag",
    "anteilRechnungsposten",
    "klassifikation",
    "erloesart"
})
public class TypeKASSEAnsatz {

    @XmlElement(required = true)
    protected String kvNummer;
    protected String umschluesselung;
    protected String bezeichnung;
    protected Double gebuehrenwert;
    protected Double gebuehrensatz;
    @XmlElement(name = "bezeichnung.auslagen")
    protected String bezeichnungAuslagen;
    @XmlElement(name = "hoehe.gebuehrensatzAuslagen")
    protected Double hoeheGebuehrensatzAuslagen;
    protected TypeGDSGeldbetrag betrag;
    @XmlElement(name = "anteil.rechnungsposten", required = true)
    protected TypeKASSEBetragsanteil anteilRechnungsposten;
    @XmlElement(required = true)
    protected CodeKASSEKlassifikation klassifikation;
    @XmlElement(required = true)
    protected CodeKASSEErloesart erloesart;

    /**
     * Gets the value of the kvNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvNummer() {
        return kvNummer;
    }

    /**
     * Sets the value of the kvNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvNummer(String value) {
        this.kvNummer = value;
    }

    /**
     * Gets the value of the umschluesselung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmschluesselung() {
        return umschluesselung;
    }

    /**
     * Sets the value of the umschluesselung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmschluesselung(String value) {
        this.umschluesselung = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the gebuehrenwert property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGebuehrenwert() {
        return gebuehrenwert;
    }

    /**
     * Sets the value of the gebuehrenwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGebuehrenwert(Double value) {
        this.gebuehrenwert = value;
    }

    /**
     * Gets the value of the gebuehrensatz property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGebuehrensatz() {
        return gebuehrensatz;
    }

    /**
     * Sets the value of the gebuehrensatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGebuehrensatz(Double value) {
        this.gebuehrensatz = value;
    }

    /**
     * Gets the value of the bezeichnungAuslagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungAuslagen() {
        return bezeichnungAuslagen;
    }

    /**
     * Sets the value of the bezeichnungAuslagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungAuslagen(String value) {
        this.bezeichnungAuslagen = value;
    }

    /**
     * Gets the value of the hoeheGebuehrensatzAuslagen property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHoeheGebuehrensatzAuslagen() {
        return hoeheGebuehrensatzAuslagen;
    }

    /**
     * Sets the value of the hoeheGebuehrensatzAuslagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHoeheGebuehrensatzAuslagen(Double value) {
        this.hoeheGebuehrensatzAuslagen = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setBetrag(TypeGDSGeldbetrag value) {
        this.betrag = value;
    }

    /**
     * Gets the value of the anteilRechnungsposten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKASSEBetragsanteil }
     *     
     */
    public TypeKASSEBetragsanteil getAnteilRechnungsposten() {
        return anteilRechnungsposten;
    }

    /**
     * Sets the value of the anteilRechnungsposten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKASSEBetragsanteil }
     *     
     */
    public void setAnteilRechnungsposten(TypeKASSEBetragsanteil value) {
        this.anteilRechnungsposten = value;
    }

    /**
     * Gets the value of the klassifikation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeKASSEKlassifikation }
     *     
     */
    public CodeKASSEKlassifikation getKlassifikation() {
        return klassifikation;
    }

    /**
     * Sets the value of the klassifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeKASSEKlassifikation }
     *     
     */
    public void setKlassifikation(CodeKASSEKlassifikation value) {
        this.klassifikation = value;
    }

    /**
     * Gets the value of the erloesart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeKASSEErloesart }
     *     
     */
    public CodeKASSEErloesart getErloesart() {
        return erloesart;
    }

    /**
     * Sets the value of the erloesart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeKASSEErloesart }
     *     
     */
    public void setErloesart(CodeKASSEErloesart value) {
        this.erloesart = value;
    }

}