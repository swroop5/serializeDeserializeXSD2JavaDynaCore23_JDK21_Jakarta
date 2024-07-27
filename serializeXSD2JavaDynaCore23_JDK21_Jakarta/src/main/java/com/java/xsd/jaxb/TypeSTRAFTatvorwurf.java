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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.Tatvorwurf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.Tatvorwurf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="astralID" type="{http://www.xjustiz.de}Code.STRAF.ASTRAL.Typ3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.Tatvorwurf", propOrder = {
    "person",
    "astralID"
})
public class TypeSTRAFTatvorwurf {

    protected List<TypeGDSRefRollennummer> person;
    protected CodeSTRAFASTRALTyp3 astralID;

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGDSRefRollennummer }
     * 
     * 
     */
    public List<TypeGDSRefRollennummer> getPerson() {
        if (person == null) {
            person = new ArrayList<TypeGDSRefRollennummer>();
        }
        return this.person;
    }

    /**
     * Gets the value of the astralID property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSTRAFASTRALTyp3 }
     *     
     */
    public CodeSTRAFASTRALTyp3 getAstralID() {
        return astralID;
    }

    /**
     * Sets the value of the astralID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSTRAFASTRALTyp3 }
     *     
     */
    public void setAstralID(CodeSTRAFASTRALTyp3 value) {
        this.astralID = value;
    }

}