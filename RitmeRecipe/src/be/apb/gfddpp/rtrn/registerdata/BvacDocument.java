//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.27 at 05:56:16 PM CEST 
//


package be.apb.gfddpp.rtrn.registerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bvacDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bvacDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dguid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bvacDocument", propOrder = {
    "dguid"
})
public class BvacDocument {

    @XmlElement(required = true)
    protected String dguid;

    /**
     * Gets the value of the dguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDguid() {
        return dguid;
    }

    /**
     * Sets the value of the dguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDguid(String value) {
        this.dguid = value;
    }

}