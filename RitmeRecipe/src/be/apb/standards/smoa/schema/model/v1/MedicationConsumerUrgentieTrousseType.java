//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicationConsumerUrgentieTrousseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationConsumerUrgentieTrousseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractMedicationConsumerUrgentieTrousseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-CareProvider"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationConsumerUrgentieTrousseType", propOrder = {
    "abstractCareProvider"
})
public class MedicationConsumerUrgentieTrousseType
    extends AbstractMedicationConsumerUrgentieTrousseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "abstract-CareProvider", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractCareProviderType> abstractCareProvider;

    /**
     * Gets the value of the abstractCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaxSetCareProviderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCareProviderType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCareProviderType> getAbstractCareProvider() {
        return abstractCareProvider;
    }

    /**
     * Sets the value of the abstractCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaxSetCareProviderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCareProviderType }{@code >}
     *     
     */
    public void setAbstractCareProvider(JAXBElement<? extends AbstractCareProviderType> value) {
        this.abstractCareProvider = ((JAXBElement<? extends AbstractCareProviderType> ) value);
    }

}
