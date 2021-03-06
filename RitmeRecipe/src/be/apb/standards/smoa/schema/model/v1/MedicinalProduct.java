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
import javax.xml.bind.annotation.XmlType;
import be.apb.standards.smoa.schema.code.v1.AbstractActiveSubstanceCodeType;
import be.apb.standards.smoa.schema.code.v1.AbstractDiseaseCodeType;
import be.apb.standards.smoa.schema.code.v1.AbstractMedicinalProductCategoryCodeType;
import be.apb.standards.smoa.schema.code.v1.AbstractPharmFormCodeType;
import be.apb.standards.smoa.schema.id.v1.AbstractMedicinalProductIdType;


/**
 * 
 * 				Hoofdbron: http://www.fagg-afmps.be/nl/binaries/HUM-2011%2E01%2E26_tcm290-27043.zip
 * 			
 * 
 * <p>Java class for MedicinalProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicinalProduct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractMedicinalProductType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.apb.be/standards/smoa/schema/id/v1}Abstract-MedicinalProductIdType" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disease" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-DiseaseCodeType" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-MedicinalProductCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="activeSubstance" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-ActiveSubstanceCodeType" minOccurs="0"/>
 *         &lt;element name="activeSubstanceQuantity" type="{http://www.apb.be/standards/smoa/schema/model/v1}ActiveSubstanceQuantityType" minOccurs="0"/>
 *         &lt;element name="licenseOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pharmForm" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-PharmFormCodeType" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{http://www.apb.be/standards/smoa/schema/v1}MedicinalProductSerialNumberType" minOccurs="0"/>
 *         &lt;element name="uniqueBarcode" type="{http://www.apb.be/standards/smoa/schema/v1}MedicinalProductUniqueBarcodeType" minOccurs="0"/>
 *         &lt;element name="batch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSubstitutionAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nationalLicensedMedicine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emeaRegisteredMedicine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="narcotic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="psychotrope" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hypnotic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adUsVetOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicinalProduct", propOrder = {
    "id",
    "productName",
    "disease",
    "category",
    "activeSubstance",
    "activeSubstanceQuantity",
    "licenseOwner",
    "licenseNumber",
    "pharmForm",
    "serialNumber",
    "uniqueBarcode",
    "batch",
    "isSubstitutionAllowed",
    "nationalLicensedMedicine",
    "emeaRegisteredMedicine",
    "narcotic",
    "psychotrope",
    "hypnotic",
    "adUsVetOnly"
})
public class MedicinalProduct
    extends AbstractMedicinalProductType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AbstractMedicinalProductIdType id;
    protected String productName;
    protected AbstractDiseaseCodeType disease;
    protected AbstractMedicinalProductCategoryCodeType category;
    protected AbstractActiveSubstanceCodeType activeSubstance;
    protected ActiveSubstanceQuantityType activeSubstanceQuantity;
    protected String licenseOwner;
    protected String licenseNumber;
    protected AbstractPharmFormCodeType pharmForm;
    protected String serialNumber;
    protected Integer uniqueBarcode;
    protected String batch;
    protected Boolean isSubstitutionAllowed;
    protected Boolean nationalLicensedMedicine;
    protected Boolean emeaRegisteredMedicine;
    protected Boolean narcotic;
    protected Boolean psychotrope;
    protected Boolean hypnotic;
    protected Boolean adUsVetOnly;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMedicinalProductIdType }
     *     
     */
    public AbstractMedicinalProductIdType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMedicinalProductIdType }
     *     
     */
    public void setId(AbstractMedicinalProductIdType value) {
        this.id = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the disease property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractDiseaseCodeType }
     *     
     */
    public AbstractDiseaseCodeType getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractDiseaseCodeType }
     *     
     */
    public void setDisease(AbstractDiseaseCodeType value) {
        this.disease = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMedicinalProductCategoryCodeType }
     *     
     */
    public AbstractMedicinalProductCategoryCodeType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMedicinalProductCategoryCodeType }
     *     
     */
    public void setCategory(AbstractMedicinalProductCategoryCodeType value) {
        this.category = value;
    }

    /**
     * Gets the value of the activeSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractActiveSubstanceCodeType }
     *     
     */
    public AbstractActiveSubstanceCodeType getActiveSubstance() {
        return activeSubstance;
    }

    /**
     * Sets the value of the activeSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractActiveSubstanceCodeType }
     *     
     */
    public void setActiveSubstance(AbstractActiveSubstanceCodeType value) {
        this.activeSubstance = value;
    }

    /**
     * Gets the value of the activeSubstanceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveSubstanceQuantityType }
     *     
     */
    public ActiveSubstanceQuantityType getActiveSubstanceQuantity() {
        return activeSubstanceQuantity;
    }

    /**
     * Sets the value of the activeSubstanceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveSubstanceQuantityType }
     *     
     */
    public void setActiveSubstanceQuantity(ActiveSubstanceQuantityType value) {
        this.activeSubstanceQuantity = value;
    }

    /**
     * Gets the value of the licenseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseOwner() {
        return licenseOwner;
    }

    /**
     * Sets the value of the licenseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseOwner(String value) {
        this.licenseOwner = value;
    }

    /**
     * Gets the value of the licenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
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

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
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
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatch(String value) {
        this.batch = value;
    }

    /**
     * Gets the value of the isSubstitutionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubstitutionAllowed() {
        return isSubstitutionAllowed;
    }

    /**
     * Sets the value of the isSubstitutionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubstitutionAllowed(Boolean value) {
        this.isSubstitutionAllowed = value;
    }

    /**
     * Gets the value of the nationalLicensedMedicine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNationalLicensedMedicine() {
        return nationalLicensedMedicine;
    }

    /**
     * Sets the value of the nationalLicensedMedicine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNationalLicensedMedicine(Boolean value) {
        this.nationalLicensedMedicine = value;
    }

    /**
     * Gets the value of the emeaRegisteredMedicine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmeaRegisteredMedicine() {
        return emeaRegisteredMedicine;
    }

    /**
     * Sets the value of the emeaRegisteredMedicine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmeaRegisteredMedicine(Boolean value) {
        this.emeaRegisteredMedicine = value;
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
     * Gets the value of the adUsVetOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdUsVetOnly() {
        return adUsVetOnly;
    }

    /**
     * Sets the value of the adUsVetOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdUsVetOnly(Boolean value) {
        this.adUsVetOnly = value;
    }

}
