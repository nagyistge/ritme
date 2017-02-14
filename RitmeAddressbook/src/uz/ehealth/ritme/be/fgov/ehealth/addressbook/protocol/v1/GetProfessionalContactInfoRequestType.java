//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.13 at 03:52:20 PM CEST 
//


package uz.ehealth.ritme.be.fgov.ehealth.addressbook.protocol.v1;

import uz.ehealth.ritme.be.fgov.ehealth.commons.protocol.v2.RequestType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Find contact data for a specific healthcare professional
 * 
 * <p>Java class for GetProfessionalContactInfoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProfessionalContactInfoRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:commons:protocol:v2}RequestType">
 *       &lt;choice>
 *         &lt;element name="NIHII" type="{urn:be:fgov:ehealth:addressbook:core:v1}NIHIIType"/>
 *         &lt;element name="SSIN" type="{urn:be:fgov:ehealth:addressbook:core:v1}SSINType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("ALL") //Generated file
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProfessionalContactInfoRequestType", propOrder = {
    "nihii",
    "ssin"
})
public class GetProfessionalContactInfoRequestType
    extends RequestType
{

    @XmlElement(name = "NIHII")
    protected String nihii;
    @XmlElement(name = "SSIN")
    protected String ssin;

    /**
     * Gets the value of the nihii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIHII() {
        return nihii;
    }

    /**
     * Sets the value of the nihii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIHII(String value) {
        this.nihii = value;
    }

    /**
     * Gets the value of the ssin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSIN() {
        return ssin;
    }

    /**
     * Sets the value of the ssin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSIN(String value) {
        this.ssin = value;
    }

}