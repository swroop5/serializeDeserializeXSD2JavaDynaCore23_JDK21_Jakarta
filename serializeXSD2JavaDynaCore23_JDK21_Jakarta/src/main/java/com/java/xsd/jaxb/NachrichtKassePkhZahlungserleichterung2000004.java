//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.22 at 07:43:56 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/&gt;
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/&gt;
 *         &lt;element name="fachdaten"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="kostenfachdaten" type="{http://www.xjustiz.de}Type.KASSE.Kostenfachdaten" minOccurs="0"/&gt;
 *                   &lt;element name="kassenanordnung" type="{http://www.xjustiz.de}Type.KASSE.Kassenanordnungsgrunddaten" minOccurs="0"/&gt;
 *                   &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.KASSE.Entscheidung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="zahlungsbestimmungen" type="{http://www.xjustiz.de}Type.KASSE.Zahlungsbestimmungen" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="rechtsbehelfe" type="{http://www.xjustiz.de}Type.KASSE.Rechtsbehelfe" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.kasse.pkh-zahlungserleichterung.2000004")
public class NachrichtKassePkhZahlungserleichterung2000004 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtKassePkhZahlungserleichterung2000004 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtKassePkhZahlungserleichterung2000004 .Fachdaten }
     *     
     */
    public NachrichtKassePkhZahlungserleichterung2000004 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtKassePkhZahlungserleichterung2000004 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtKassePkhZahlungserleichterung2000004 .Fachdaten value) {
        this.fachdaten = value;
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
     *         &lt;element name="kostenfachdaten" type="{http://www.xjustiz.de}Type.KASSE.Kostenfachdaten" minOccurs="0"/&gt;
     *         &lt;element name="kassenanordnung" type="{http://www.xjustiz.de}Type.KASSE.Kassenanordnungsgrunddaten" minOccurs="0"/&gt;
     *         &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.KASSE.Entscheidung" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="zahlungsbestimmungen" type="{http://www.xjustiz.de}Type.KASSE.Zahlungsbestimmungen" maxOccurs="unbounded"/&gt;
     *         &lt;element name="rechtsbehelfe" type="{http://www.xjustiz.de}Type.KASSE.Rechtsbehelfe" minOccurs="0"/&gt;
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
        "kostenfachdaten",
        "kassenanordnung",
        "entscheidung",
        "zahlungsbestimmungen",
        "rechtsbehelfe"
    })
    public static class Fachdaten {

        protected TypeKASSEKostenfachdaten kostenfachdaten;
        protected TypeKASSEKassenanordnungsgrunddaten kassenanordnung;
        protected List<TypeKASSEEntscheidung> entscheidung;
        @XmlElement(required = true)
        protected List<TypeKASSEZahlungsbestimmungen> zahlungsbestimmungen;
        protected TypeKASSERechtsbehelfe rechtsbehelfe;

        /**
         * Gets the value of the kostenfachdaten property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEKostenfachdaten }
         *     
         */
        public TypeKASSEKostenfachdaten getKostenfachdaten() {
            return kostenfachdaten;
        }

        /**
         * Sets the value of the kostenfachdaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEKostenfachdaten }
         *     
         */
        public void setKostenfachdaten(TypeKASSEKostenfachdaten value) {
            this.kostenfachdaten = value;
        }

        /**
         * Gets the value of the kassenanordnung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEKassenanordnungsgrunddaten }
         *     
         */
        public TypeKASSEKassenanordnungsgrunddaten getKassenanordnung() {
            return kassenanordnung;
        }

        /**
         * Sets the value of the kassenanordnung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEKassenanordnungsgrunddaten }
         *     
         */
        public void setKassenanordnung(TypeKASSEKassenanordnungsgrunddaten value) {
            this.kassenanordnung = value;
        }

        /**
         * Gets the value of the entscheidung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the entscheidung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntscheidung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeKASSEEntscheidung }
         * 
         * 
         */
        public List<TypeKASSEEntscheidung> getEntscheidung() {
            if (entscheidung == null) {
                entscheidung = new ArrayList<TypeKASSEEntscheidung>();
            }
            return this.entscheidung;
        }

        /**
         * Gets the value of the zahlungsbestimmungen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the zahlungsbestimmungen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZahlungsbestimmungen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeKASSEZahlungsbestimmungen }
         * 
         * 
         */
        public List<TypeKASSEZahlungsbestimmungen> getZahlungsbestimmungen() {
            if (zahlungsbestimmungen == null) {
                zahlungsbestimmungen = new ArrayList<TypeKASSEZahlungsbestimmungen>();
            }
            return this.zahlungsbestimmungen;
        }

        /**
         * Gets the value of the rechtsbehelfe property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSERechtsbehelfe }
         *     
         */
        public TypeKASSERechtsbehelfe getRechtsbehelfe() {
            return rechtsbehelfe;
        }

        /**
         * Sets the value of the rechtsbehelfe property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSERechtsbehelfe }
         *     
         */
        public void setRechtsbehelfe(TypeKASSERechtsbehelfe value) {
            this.rechtsbehelfe = value;
        }

    }

}
