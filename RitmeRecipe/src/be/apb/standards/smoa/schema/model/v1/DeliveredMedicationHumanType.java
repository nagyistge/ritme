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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import be.apb.standards.smoa.schema.v1.MetaDataListType;


/**
 * <p>Java class for DeliveredMedicationHumanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveredMedicationHumanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractDeliveredMedicationHumanType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.apb.be/standards/smoa/schema/model/v1}DeliveredMedicationGroup"/>
 *         &lt;element name="delayedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="delayedRequestDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-HumanPrescription"/>
 *         &lt;element name="metaDataList" type="{http://www.apb.be/standards/smoa/schema/v1}MetaDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveredMedicationHumanType", propOrder = {
    "dguid",
    "deliveryDate",
    "quantity",
    "lotNumber",
    "uniqueBarcode",
    "abstractCareProvider",
    "abstractMedicationConsumer",
    "abstractMedicinalProduct",
    "magistral",
    "abstractAttest",
    "narcotic",
    "psychotrope",
    "hypnotic",
    "delayedDelivery",
    "delayedRequestDate",
    "abstractHumanPrescription",
    "metaDataList"
})
public class DeliveredMedicationHumanType
    extends AbstractDeliveredMedicationHumanType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "dGUID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dguid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    protected int quantity;
    protected String lotNumber;
    protected Integer uniqueBarcode;
    @XmlElementRef(name = "abstract-CareProvider", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractCareProviderType> abstractCareProvider;
    @XmlElementRef(name = "abstract-MedicationConsumer", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractMedicationConsumerType> abstractMedicationConsumer;
    @XmlElementRef(name = "abstract-MedicinalProduct", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractMedicinalProductType> abstractMedicinalProduct;
    protected MagistralType magistral;
    @XmlElementRef(name = "abstract-Attest", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractAttestType> abstractAttest;
    protected Boolean narcotic;
    protected Boolean psychotrope;
    protected Boolean hypnotic;
    protected boolean delayedDelivery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delayedRequestDate;
    @XmlElementRef(name = "abstract-HumanPrescription", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractHumanPrescriptionType> abstractHumanPrescription;
    protected MetaDataListType metaDataList;

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

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the uniqueBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueBarcode() {
        return uniqueBarcode;
    }

    /**
     * Sets the value of the uniqueBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueBarcode(Integer value) {
        this.uniqueBarcode = value;
    }

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

    /**
     * Gets the value of the abstractMedicationConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerUrgentieTrousseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMedicationConsumerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerPatientGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerPatientType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerAnimalOwnerType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractMedicationConsumerType> getAbstractMedicationConsumer() {
        return abstractMedicationConsumer;
    }

    /**
     * Sets the value of the abstractMedicationConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerUrgentieTrousseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMedicationConsumerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerPatientGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerPatientType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicationConsumerAnimalOwnerType }{@code >}
     *     
     */
    public void setAbstractMedicationConsumer(JAXBElement<? extends AbstractMedicationConsumerType> value) {
        this.abstractMedicationConsumer = ((JAXBElement<? extends AbstractMedicationConsumerType> ) value);
    }

    /**
     * Gets the value of the abstractMedicinalProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractMedicinalProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicinalProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferenceMedicinalProductType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractMedicinalProductType> getAbstractMedicinalProduct() {
        return abstractMedicinalProduct;
    }

    /**
     * Sets the value of the abstractMedicinalProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractMedicinalProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicinalProduct }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferenceMedicinalProductType }{@code >}
     *     
     */
    public void setAbstractMedicinalProduct(JAXBElement<? extends AbstractMedicinalProductType> value) {
        this.abstractMedicinalProduct = ((JAXBElement<? extends AbstractMedicinalProductType> ) value);
    }

    /**
     * Gets the value of the magistral property.
     * 
     * @return
     *     possible object is
     *     {@link MagistralType }
     *     
     */
    public MagistralType getMagistral() {
        return magistral;
    }

    /**
     * Sets the value of the magistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagistralType }
     *     
     */
    public void setMagistral(MagistralType value) {
        this.magistral = value;
    }

    /**
     * Gets the value of the abstractAttest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAttestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferenceAttestType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractAttestType> getAbstractAttest() {
        return abstractAttest;
    }

    /**
     * Sets the value of the abstractAttest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractAttestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReferenceAttestType }{@code >}
     *     
     */
    public void setAbstractAttest(JAXBElement<? extends AbstractAttestType> value) {
        this.abstractAttest = ((JAXBElement<? extends AbstractAttestType> ) value);
    }

    /**
     * Gets the value of the narcotic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNarcotic() {
        return narcotic;
    }

    /**
     * Sets the value of the narcotic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNarcotic(Boolean value) {
        this.narcotic = value;
    }

    /**
     * Gets the value of the psychotrope property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPsychotrope() {
        return psychotrope;
    }

    /**
     * Sets the value of the psychotrope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPsychotrope(Boolean value) {
        this.psychotrope = value;
    }

    /**
     * Gets the value of the hypnotic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHypnotic() {
        return hypnotic;
    }

    /**
     * Sets the value of the hypnotic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHypnotic(Boolean value) {
        this.hypnotic = value;
    }

    /**
     * Gets the value of the delayedDelivery property.
     * 
     */
    public boolean isDelayedDelivery() {
        return delayedDelivery;
    }

    /**
     * Sets the value of the delayedDelivery property.
     * 
     */
    public void setDelayedDelivery(boolean value) {
        this.delayedDelivery = value;
    }

    /**
     * Gets the value of the delayedRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayedRequestDate() {
        return delayedRequestDate;
    }

    /**
     * Sets the value of the delayedRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayedRequestDate(XMLGregorianCalendar value) {
        this.delayedRequestDate = value;
    }

    /**
     * Gets the value of the abstractHumanPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractHumanPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeferredPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PatientPrescriptionType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractHumanPrescriptionType> getAbstractHumanPrescription() {
        return abstractHumanPrescription;
    }

    /**
     * Sets the value of the abstractHumanPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractHumanPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeferredPrescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PatientPrescriptionType }{@code >}
     *     
     */
    public void setAbstractHumanPrescription(JAXBElement<? extends AbstractHumanPrescriptionType> value) {
        this.abstractHumanPrescription = ((JAXBElement<? extends AbstractHumanPrescriptionType> ) value);
    }

    /**
     * Gets the value of the metaDataList property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataListType }
     *     
     */
    public MetaDataListType getMetaDataList() {
        return metaDataList;
    }

    /**
     * Sets the value of the metaDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataListType }
     *     
     */
    public void setMetaDataList(MetaDataListType value) {
        this.metaDataList = value;
    }

}