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
import javax.xml.datatype.XMLGregorianCalendar;
import be.apb.standards.smoa.schema.id.v1.AbstractPrescriptionIdType;


/**
 * <p>Java class for PatientPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientPrescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractPatientPrescriptionType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-PrescriptionIdType"/>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-Patient"/>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baby" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executableFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="executableUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}abstract-CareProvider"/>
 *         &lt;element name="recipeLines" type="{http://www.apb.be/standards/smoa/schema/model/v1}recipeLinesComplexType" minOccurs="0"/>
 *         &lt;element ref="{http://www.apb.be/standards/smoa/schema/model/v1}kmehrPrescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientPrescriptionType", propOrder = {
    "id",
    "abstractPatient",
    "child",
    "baby",
    "prescriptionDate",
    "executableFrom",
    "executableUntil",
    "abstractCareProvider",
    "recipeLines",
    "kmehrPrescription"
})
public class PatientPrescriptionType
    extends AbstractPatientPrescriptionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected AbstractPrescriptionIdType id;
    @XmlElementRef(name = "abstract-Patient", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractPatientType> abstractPatient;
    protected Boolean child;
    protected Boolean baby;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prescriptionDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executableFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executableUntil;
    @XmlElementRef(name = "abstract-CareProvider", namespace = "http://www.apb.be/standards/smoa/schema/model/v1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractCareProviderType> abstractCareProvider;
    protected RecipeLinesComplexType recipeLines;
    protected KmehrPrescriptionType kmehrPrescription;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public AbstractPrescriptionIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPrescriptionIdType }
     *     
     */
    public void setId(AbstractPrescriptionIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the abstractPatient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractPatientType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinSetPatient }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaxSetPatient }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractPatientType> getAbstractPatient() {
        return abstractPatient;
    }

    /**
     * Sets the value of the abstractPatient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractPatientType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinSetPatient }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaxSetPatient }{@code >}
     *     
     */
    public void setAbstractPatient(JAXBElement<? extends AbstractPatientType> value) {
        this.abstractPatient = ((JAXBElement<? extends AbstractPatientType> ) value);
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChild(Boolean value) {
        this.child = value;
    }

    /**
     * Gets the value of the baby property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaby() {
        return baby;
    }

    /**
     * Sets the value of the baby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaby(Boolean value) {
        this.baby = value;
    }

    /**
     * Gets the value of the prescriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the value of the prescriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrescriptionDate(XMLGregorianCalendar value) {
        this.prescriptionDate = value;
    }

    /**
     * Gets the value of the executableFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutableFrom() {
        return executableFrom;
    }

    /**
     * Sets the value of the executableFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutableFrom(XMLGregorianCalendar value) {
        this.executableFrom = value;
    }

    /**
     * Gets the value of the executableUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutableUntil() {
        return executableUntil;
    }

    /**
     * Sets the value of the executableUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecutableUntil(XMLGregorianCalendar value) {
        this.executableUntil = value;
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
     * Gets the value of the recipeLines property.
     * 
     * @return
     *     possible object is
     *     {@link RecipeLinesComplexType }
     *     
     */
    public RecipeLinesComplexType getRecipeLines() {
        return recipeLines;
    }

    /**
     * Sets the value of the recipeLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipeLinesComplexType }
     *     
     */
    public void setRecipeLines(RecipeLinesComplexType value) {
        this.recipeLines = value;
    }

    /**
     * Gets the value of the kmehrPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link KmehrPrescriptionType }
     *     
     */
    public KmehrPrescriptionType getKmehrPrescription() {
        return kmehrPrescription;
    }

    /**
     * Sets the value of the kmehrPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link KmehrPrescriptionType }
     *     
     */
    public void setKmehrPrescription(KmehrPrescriptionType value) {
        this.kmehrPrescription = value;
    }

}