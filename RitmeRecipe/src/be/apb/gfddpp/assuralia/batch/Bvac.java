//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.26 at 03:16:40 PM CEST 
//


package be.apb.gfddpp.assuralia.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bvac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bvac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CBFA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BvacDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EncryptedSymmetricKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="SingleMessageSealed" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bvac", propOrder = {
    "cbfa",
    "sguid",
    "bvacDocumentId",
    "encryptedSymmetricKey",
    "singleMessageSealed"
})
public class Bvac {

    @XmlElement(name = "CBFA", required = true)
    protected String cbfa;
    @XmlElement(name = "SGUID", required = true)
    protected String sguid;
    @XmlElement(name = "BvacDocumentId", required = true)
    protected String bvacDocumentId;
    @XmlElement(name = "EncryptedSymmetricKey", required = true)
    protected byte[] encryptedSymmetricKey;
    @XmlElement(name = "SingleMessageSealed", required = true)
    protected byte[] singleMessageSealed;

    /**
     * Gets the value of the cbfa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBFA() {
        return cbfa;
    }

    /**
     * Sets the value of the cbfa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBFA(String value) {
        this.cbfa = value;
    }

    /**
     * Gets the value of the sguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGUID() {
        return sguid;
    }

    /**
     * Sets the value of the sguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGUID(String value) {
        this.sguid = value;
    }

    /**
     * Gets the value of the bvacDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBvacDocumentId() {
        return bvacDocumentId;
    }

    /**
     * Sets the value of the bvacDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBvacDocumentId(String value) {
        this.bvacDocumentId = value;
    }

    /**
     * Gets the value of the encryptedSymmetricKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedSymmetricKey() {
        return encryptedSymmetricKey;
    }

    /**
     * Sets the value of the encryptedSymmetricKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedSymmetricKey(byte[] value) {
        this.encryptedSymmetricKey = ((byte[]) value);
    }

    /**
     * Gets the value of the singleMessageSealed property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSingleMessageSealed() {
        return singleMessageSealed;
    }

    /**
     * Sets the value of the singleMessageSealed property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSingleMessageSealed(byte[] value) {
        this.singleMessageSealed = ((byte[]) value);
    }

}
