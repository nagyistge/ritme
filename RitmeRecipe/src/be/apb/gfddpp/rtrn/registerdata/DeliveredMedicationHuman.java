//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.25 at 02:36:51 PM CEST 
//


package be.apb.gfddpp.rtrn.registerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveredMedicationHuman complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveredMedicationHuman">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveredMedicationHuman", propOrder = {
    "cnk",
    "dguid"
})
public class DeliveredMedicationHuman {

    @XmlElement(name = "CNK", required = true)
    protected String cnk;
    @XmlElement(name = "DGUID", required = true)
    protected String dguid;

    /**
     * Gets the value of the cnk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNK() {
        return cnk;
    }

    /**
     * Sets the value of the cnk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNK(String value) {
        this.cnk = value;
    }

    /**
     * Gets the value of the dguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGUID() {
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
    public void setDGUID(String value) {
        this.dguid = value;
    }

}
