//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:35 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.STRAF.BFJ.BewaehrungszeitDauer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.BFJ.BewaehrungszeitDauer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="dauer" type="{http://www.xjustiz.de}Type.STRAF.Dauer"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.BFJ.BewaehrungszeitDauer", propOrder = {
    "dauer",
    "datum"
})
public class TypeSTRAFBFJBewaehrungszeitDauer {

    protected TypeSTRAFDauer dauer;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;

    /**
     * Gets the value of the dauer property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public TypeSTRAFDauer getDauer() {
        return dauer;
    }

    /**
     * Sets the value of the dauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFDauer }
     *     
     */
    public void setDauer(TypeSTRAFDauer value) {
        this.dauer = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

}
