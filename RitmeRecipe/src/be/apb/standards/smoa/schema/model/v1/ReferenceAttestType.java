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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.id.v1.AbstractAttestIdType;


/**
 * <p>Java class for ReferenceAttestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAttestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractAttestType">
 *       &lt;sequence>
 *         &lt;element name="attestId" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-AttestIdType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceAttestType", propOrder = {
    "attestId"
})
public class ReferenceAttestType
    extends AbstractAttestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AbstractAttestIdType attestId;

    /**
     * Gets the value of the attestId property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractAttestIdType }
     *     
     */
    public AbstractAttestIdType getAttestId() {
        return attestId;
    }

    /**
     * Sets the value of the attestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractAttestIdType }
     *     
     */
    public void setAttestId(AbstractAttestIdType value) {
        this.attestId = value;
    }

}
