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
 * <p>Java class for Type.STRAF.HyDaNe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.HyDaNe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gds.ref.sgo" type="{http://www.xjustiz.de}Type.GDS.Ref.SGO"/&gt;
 *         &lt;element name="hydane.herkunftDerDaten" type="{http://www.xjustiz.de}Code.STRAF.Hydane.HerkunftDerDaten.Typ3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.HyDaNe", propOrder = {
    "gdsRefSgo",
    "hydaneHerkunftDerDaten"
})
public class TypeSTRAFHyDaNe {

    @XmlElement(name = "gds.ref.sgo", required = true)
    protected TypeGDSRefSGO gdsRefSgo;
    @XmlElement(name = "hydane.herkunftDerDaten", required = true)
    protected CodeSTRAFHydaneHerkunftDerDatenTyp3 hydaneHerkunftDerDaten;

    /**
     * Gets the value of the gdsRefSgo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public TypeGDSRefSGO getGdsRefSgo() {
        return gdsRefSgo;
    }

    /**
     * Sets the value of the gdsRefSgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefSGO }
     *     
     */
    public void setGdsRefSgo(TypeGDSRefSGO value) {
        this.gdsRefSgo = value;
    }

    /**
     * Gets the value of the hydaneHerkunftDerDaten property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFHydaneHerkunftDerDatenTyp3 }
     *     
     */
    public CodeSTRAFHydaneHerkunftDerDatenTyp3 getHydaneHerkunftDerDaten() {
        return hydaneHerkunftDerDaten;
    }

    /**
     * Sets the value of the hydaneHerkunftDerDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFHydaneHerkunftDerDatenTyp3 }
     *     
     */
    public void setHydaneHerkunftDerDaten(CodeSTRAFHydaneHerkunftDerDatenTyp3 value) {
        this.hydaneHerkunftDerDaten = value;
    }

}