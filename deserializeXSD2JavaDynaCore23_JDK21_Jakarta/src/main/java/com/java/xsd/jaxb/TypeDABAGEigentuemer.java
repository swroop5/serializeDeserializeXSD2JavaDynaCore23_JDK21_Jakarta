//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Eigentuemer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Eigentuemer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xjustiz.de}Type.DABAG.Eintragungsbeteiligter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anteil" type="{http://www.xjustiz.de}Type.DABAG.Anteil" minOccurs="0"/&gt;
 *         &lt;element name="belastungMiteigentumsanteil" type="{http://www.xjustiz.de}Type.DABAG.Identifikation.Belastung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Eigentuemer", propOrder = {
    "anteil",
    "belastungMiteigentumsanteil"
})
public class TypeDABAGEigentuemer
    extends TypeDABAGEintragungsbeteiligter
{

    protected TypeDABAGAnteil anteil;
    protected List<TypeDABAGIdentifikationBelastung> belastungMiteigentumsanteil;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public TypeDABAGAnteil getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public void setAnteil(TypeDABAGAnteil value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the belastungMiteigentumsanteil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the belastungMiteigentumsanteil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelastungMiteigentumsanteil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGIdentifikationBelastung }
     * 
     * 
     */
    public List<TypeDABAGIdentifikationBelastung> getBelastungMiteigentumsanteil() {
        if (belastungMiteigentumsanteil == null) {
            belastungMiteigentumsanteil = new ArrayList<TypeDABAGIdentifikationBelastung>();
        }
        return this.belastungMiteigentumsanteil;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
