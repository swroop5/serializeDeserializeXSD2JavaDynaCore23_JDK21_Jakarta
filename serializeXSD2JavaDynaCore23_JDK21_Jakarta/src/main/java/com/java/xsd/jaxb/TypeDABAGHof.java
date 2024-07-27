//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
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
 * <p>Java class for Type.DABAG.Hof complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Hof"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.DABAG.Hofart"/&gt;
 *         &lt;element name="name" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeB" minOccurs="0"/&gt;
 *         &lt;element name="amtsgerichtInHoeferolle" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="nummerInHoeferolle" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/&gt;
 *         &lt;element name="datumInHoeferolle" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="hofgrundbuecher" type="{http://www.xjustiz.de}Type.DABAG.Ref.Grundbuchblatt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hofzugehoerigeBuchungsstellen" type="{http://www.xjustiz.de}Type.DABAG.Ref.Buchungsstelle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hofzugehoerigeMiteigentumsanteile" type="{http://www.xjustiz.de}Type.DABAG.Ref.Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Hof", propOrder = {
    "art",
    "name",
    "amtsgerichtInHoeferolle",
    "nummerInHoeferolle",
    "datumInHoeferolle",
    "hofgrundbuecher",
    "hofzugehoerigeBuchungsstellen",
    "hofzugehoerigeMiteigentumsanteile"
})
public class TypeDABAGHof {

    @XmlElement(required = true)
    protected CodeDABAGHofart art;
    protected String name;
    protected String amtsgerichtInHoeferolle;
    protected String nummerInHoeferolle;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumInHoeferolle;
    protected List<TypeDABAGRefGrundbuchblatt> hofgrundbuecher;
    protected List<TypeDABAGRefBuchungsstelle> hofzugehoerigeBuchungsstellen;
    protected List<TypeDABAGRefEigentuemer> hofzugehoerigeMiteigentumsanteile;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDABAGHofart }
     *     
     */
    public CodeDABAGHofart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDABAGHofart }
     *     
     */
    public void setArt(CodeDABAGHofart value) {
        this.art = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the amtsgerichtInHoeferolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtsgerichtInHoeferolle() {
        return amtsgerichtInHoeferolle;
    }

    /**
     * Sets the value of the amtsgerichtInHoeferolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtsgerichtInHoeferolle(String value) {
        this.amtsgerichtInHoeferolle = value;
    }

    /**
     * Gets the value of the nummerInHoeferolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummerInHoeferolle() {
        return nummerInHoeferolle;
    }

    /**
     * Sets the value of the nummerInHoeferolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummerInHoeferolle(String value) {
        this.nummerInHoeferolle = value;
    }

    /**
     * Gets the value of the datumInHoeferolle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumInHoeferolle() {
        return datumInHoeferolle;
    }

    /**
     * Sets the value of the datumInHoeferolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumInHoeferolle(XMLGregorianCalendar value) {
        this.datumInHoeferolle = value;
    }

    /**
     * Gets the value of the hofgrundbuecher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hofgrundbuecher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHofgrundbuecher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefGrundbuchblatt }
     * 
     * 
     */
    public List<TypeDABAGRefGrundbuchblatt> getHofgrundbuecher() {
        if (hofgrundbuecher == null) {
            hofgrundbuecher = new ArrayList<TypeDABAGRefGrundbuchblatt>();
        }
        return this.hofgrundbuecher;
    }

    /**
     * Gets the value of the hofzugehoerigeBuchungsstellen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hofzugehoerigeBuchungsstellen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHofzugehoerigeBuchungsstellen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefBuchungsstelle }
     * 
     * 
     */
    public List<TypeDABAGRefBuchungsstelle> getHofzugehoerigeBuchungsstellen() {
        if (hofzugehoerigeBuchungsstellen == null) {
            hofzugehoerigeBuchungsstellen = new ArrayList<TypeDABAGRefBuchungsstelle>();
        }
        return this.hofzugehoerigeBuchungsstellen;
    }

    /**
     * Gets the value of the hofzugehoerigeMiteigentumsanteile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hofzugehoerigeMiteigentumsanteile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHofzugehoerigeMiteigentumsanteile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeDABAGRefEigentuemer }
     * 
     * 
     */
    public List<TypeDABAGRefEigentuemer> getHofzugehoerigeMiteigentumsanteile() {
        if (hofzugehoerigeMiteigentumsanteile == null) {
            hofzugehoerigeMiteigentumsanteile = new ArrayList<TypeDABAGRefEigentuemer>();
        }
        return this.hofzugehoerigeMiteigentumsanteile;
    }

}