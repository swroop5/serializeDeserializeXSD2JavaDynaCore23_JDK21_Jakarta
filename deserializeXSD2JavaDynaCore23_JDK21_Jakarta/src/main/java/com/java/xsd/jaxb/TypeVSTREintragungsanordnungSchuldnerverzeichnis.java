//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:41 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.VSTR.Eintragungsanordnung.Schuldnerverzeichnis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VSTR.Eintragungsanordnung.Schuldnerverzeichnis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.xjustiz.de}Type.VSTR.Eintragungsanordnung.Allgemein"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="korrekturLoeschung" type="{http://www.xjustiz.de}Code.VSTR.KorrekturLoeschung" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VSTR.Eintragungsanordnung.Schuldnerverzeichnis", propOrder = {
    "korrekturLoeschung"
})
public class TypeVSTREintragungsanordnungSchuldnerverzeichnis
    extends TypeVSTREintragungsanordnungAllgemein
{

    protected CodeVSTRKorrekturLoeschung korrekturLoeschung;

    /**
     * Gets the value of the korrekturLoeschung property.
     * 
     * @return
     *     possible object is
     *     {@link CodeVSTRKorrekturLoeschung }
     *     
     */
    public CodeVSTRKorrekturLoeschung getKorrekturLoeschung() {
        return korrekturLoeschung;
    }

    /**
     * Sets the value of the korrekturLoeschung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeVSTRKorrekturLoeschung }
     *     
     */
    public void setKorrekturLoeschung(CodeVSTRKorrekturLoeschung value) {
        this.korrekturLoeschung = value;
    }

}
