//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:44:10 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Eintragungsgrundlagentyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Eintragungsgrundlagentyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="codeliste" type="{http://www.xjustiz.de}Code.DABAG.Eintragungsgrundlagentyp"/&gt;
 *         &lt;element name="nichtGelisteterWert" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Eintragungsgrundlagentyp", propOrder = {
    "codeliste",
    "nichtGelisteterWert"
})
public class TypeDABAGEintragungsgrundlagentyp {

    protected CodeDABAGEintragungsgrundlagentyp codeliste;
    protected String nichtGelisteterWert;

    /**
     * Gets the value of the codeliste property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDABAGEintragungsgrundlagentyp }
     *     
     */
    public CodeDABAGEintragungsgrundlagentyp getCodeliste() {
        return codeliste;
    }

    /**
     * Sets the value of the codeliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDABAGEintragungsgrundlagentyp }
     *     
     */
    public void setCodeliste(CodeDABAGEintragungsgrundlagentyp value) {
        this.codeliste = value;
    }

    /**
     * Gets the value of the nichtGelisteterWert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNichtGelisteterWert() {
        return nichtGelisteterWert;
    }

    /**
     * Sets the value of the nichtGelisteterWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNichtGelisteterWert(String value) {
        this.nichtGelisteterWert = value;
    }

}
