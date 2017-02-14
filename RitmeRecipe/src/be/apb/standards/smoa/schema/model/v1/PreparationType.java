//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.code.v1.AbstractPharmFormCodeType;
import be.apb.standards.smoa.schema.v1.QuantityType;


/**
 * Magistrale and Officinale Bereiding
 * 
 * <p>Java class for PreparationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreparationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractPreparationType">
 *       &lt;sequence>
 *         &lt;element name="substance" type="{http://www.apb.be/standards/smoa/schema/model/v1}PreparationSubstanceType" maxOccurs="unbounded"/>
 *         &lt;element name="quantity" type="{http://www.apb.be/standards/smoa/schema/v1}QuantityType"/>
 *         &lt;element name="pharmForm" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-PharmFormCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreparationType", propOrder = {
    "substance",
    "quantity",
    "pharmForm"
})
public class PreparationType
    extends AbstractPreparationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<PreparationSubstanceType> substance;
    @XmlElement(required = true)
    protected QuantityType quantity;
    protected AbstractPharmFormCodeType pharmForm;

    /**
     * Gets the value of the substance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreparationSubstanceType }
     * 
     * 
     */
    public List<PreparationSubstanceType> getSubstance() {
        if (substance == null) {
            substance = new ArrayList<PreparationSubstanceType>();
        }
        return this.substance;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the pharmForm property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPharmFormCodeType }
     *     
     */
    public AbstractPharmFormCodeType getPharmForm() {
        return pharmForm;
    }

    /**
     * Sets the value of the pharmForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPharmFormCodeType }
     *     
     */
    public void setPharmForm(AbstractPharmFormCodeType value) {
        this.pharmForm = value;
    }

}