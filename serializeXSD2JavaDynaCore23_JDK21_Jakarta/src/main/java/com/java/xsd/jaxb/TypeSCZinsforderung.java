//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:52 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.SC.Zinsforderung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.SC.Zinsforderung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flag.zinsforderung" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="zinsen" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vertraglicherZinssatz" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="basiszinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="andererWert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="zinsbeginn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.SC.Zinsforderung", propOrder = {
    "flagZinsforderung",
    "zinsen"
})
public class TypeSCZinsforderung {

    @XmlElement(name = "flag.zinsforderung", defaultValue = "false")
    protected boolean flagZinsforderung;
    protected TypeSCZinsforderung.Zinsen zinsen;

    /**
     * Gets the value of the flagZinsforderung property.
     * 
     */
    public boolean isFlagZinsforderung() {
        return flagZinsforderung;
    }

    /**
     * Sets the value of the flagZinsforderung property.
     * 
     */
    public void setFlagZinsforderung(boolean value) {
        this.flagZinsforderung = value;
    }

    /**
     * Gets the value of the zinsen property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSCZinsforderung.Zinsen }
     *     
     */
    public TypeSCZinsforderung.Zinsen getZinsen() {
        return zinsen;
    }

    /**
     * Sets the value of the zinsen property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSCZinsforderung.Zinsen }
     *     
     */
    public void setZinsen(TypeSCZinsforderung.Zinsen value) {
        this.zinsen = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="vertraglicherZinssatz" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="basiszinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="andererWert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="zinsbeginn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vertraglicherZinssatz",
        "zinsbeginn"
    })
    public static class Zinsen {

        protected TypeSCZinsforderung.Zinsen.VertraglicherZinssatz vertraglicherZinssatz;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zinsbeginn;

        /**
         * Gets the value of the vertraglicherZinssatz property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSCZinsforderung.Zinsen.VertraglicherZinssatz }
         *     
         */
        public TypeSCZinsforderung.Zinsen.VertraglicherZinssatz getVertraglicherZinssatz() {
            return vertraglicherZinssatz;
        }

        /**
         * Sets the value of the vertraglicherZinssatz property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSCZinsforderung.Zinsen.VertraglicherZinssatz }
         *     
         */
        public void setVertraglicherZinssatz(TypeSCZinsforderung.Zinsen.VertraglicherZinssatz value) {
            this.vertraglicherZinssatz = value;
        }

        /**
         * Gets the value of the zinsbeginn property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZinsbeginn() {
            return zinsbeginn;
        }

        /**
         * Sets the value of the zinsbeginn property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZinsbeginn(XMLGregorianCalendar value) {
            this.zinsbeginn = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="basiszinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="andererWert" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "zinssatz",
            "basiszinssatz",
            "andererWert"
        })
        public static class VertraglicherZinssatz {

            protected BigDecimal zinssatz;
            protected BigDecimal basiszinssatz;
            protected BigDecimal andererWert;

            /**
             * Gets the value of the zinssatz property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getZinssatz() {
                return zinssatz;
            }

            /**
             * Sets the value of the zinssatz property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setZinssatz(BigDecimal value) {
                this.zinssatz = value;
            }

            /**
             * Gets the value of the basiszinssatz property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBasiszinssatz() {
                return basiszinssatz;
            }

            /**
             * Sets the value of the basiszinssatz property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBasiszinssatz(BigDecimal value) {
                this.basiszinssatz = value;
            }

            /**
             * Gets the value of the andererWert property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAndererWert() {
                return andererWert;
            }

            /**
             * Sets the value of the andererWert property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAndererWert(BigDecimal value) {
                this.andererWert = value;
            }

        }

    }

}
