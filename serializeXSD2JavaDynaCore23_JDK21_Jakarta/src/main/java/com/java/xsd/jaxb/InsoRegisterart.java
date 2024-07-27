//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:24:08 PM CEST 
//


package com.java.xsd.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inso.registerart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="inso.registerart"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="GnR"/&gt;
 *     &lt;enumeration value="HRA"/&gt;
 *     &lt;enumeration value="HRB"/&gt;
 *     &lt;enumeration value="PR"/&gt;
 *     &lt;enumeration value="VR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "inso.registerart")
@XmlEnum
public enum InsoRegisterart {

    @XmlEnumValue("GnR")
    GN_R("GnR"),
    HRA("HRA"),
    HRB("HRB"),
    PR("PR"),
    VR("VR");
    private final String value;

    InsoRegisterart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsoRegisterart fromValue(String v) {
        for (InsoRegisterart c: InsoRegisterart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
