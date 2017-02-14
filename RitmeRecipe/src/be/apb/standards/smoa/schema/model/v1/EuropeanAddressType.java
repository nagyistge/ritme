//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import be.apb.standards.smoa.schema.v1.CDADDRESS;
import be.apb.standards.smoa.schema.v1.CDCOUNTRY;


/**
 * <p>Java class for EuropeanAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EuropeanAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractAddressType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.apb.be/standards/smoa/schema/v1}CD-COUNTRY" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="housenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postboxnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="usage" use="required" type="{http://www.apb.be/standards/smoa/schema/v1}CD-ADDRESS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EuropeanAddressType", propOrder = {
    "country",
    "zip",
    "city",
    "street",
    "housenumber",
    "postboxnumber",
    "lastChanged"
})
public class EuropeanAddressType
    extends AbstractAddressType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CDCOUNTRY country;
    @XmlElement(required = true)
    protected String zip;
    protected String city;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected String housenumber;
    protected String postboxnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChanged;
    @XmlAttribute(required = true)
    protected CDADDRESS usage;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CDCOUNTRY }
     *     
     */
    public CDCOUNTRY getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDCOUNTRY }
     *     
     */
    public void setCountry(CDCOUNTRY value) {
        this.country = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the housenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousenumber() {
        return housenumber;
    }

    /**
     * Sets the value of the housenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousenumber(String value) {
        this.housenumber = value;
    }

    /**
     * Gets the value of the postboxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostboxnumber() {
        return postboxnumber;
    }

    /**
     * Sets the value of the postboxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostboxnumber(String value) {
        this.postboxnumber = value;
    }

    /**
     * Gets the value of the lastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChanged() {
        return lastChanged;
    }

    /**
     * Sets the value of the lastChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChanged(XMLGregorianCalendar value) {
        this.lastChanged = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link CDADDRESS }
     *     
     */
    public CDADDRESS getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDADDRESS }
     *     
     */
    public void setUsage(CDADDRESS value) {
        this.usage = value;
    }

}