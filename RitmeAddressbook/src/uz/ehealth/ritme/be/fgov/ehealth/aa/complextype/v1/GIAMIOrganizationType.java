//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.13 at 03:52:20 PM CEST 
//


package uz.ehealth.ritme.be.fgov.ehealth.aa.complextype.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Info on organization known in CLC.
 * 
 * <p>Java class for GIAMIOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GIAMIOrganizationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:be:fgov:ehealth:aa:complextype:v1}GIAMIEntityType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:be:fgov:ehealth:aa:complextype:v1}GIAMIQuality" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("ALL") //Generated file
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GIAMIOrganizationType", propOrder = {
    "giamiQuality"
})
public class GIAMIOrganizationType
    extends GIAMIEntityType
{

    @XmlElement(name = "GIAMIQuality")
    protected List<GIAMIEntityType> giamiQuality;

    /**
     * Gets the value of the giamiQuality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giamiQuality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGIAMIQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GIAMIEntityType }
     * 
     * 
     */
    public List<GIAMIEntityType> getGIAMIQuality() {
        if (giamiQuality == null) {
            giamiQuality = new ArrayList<GIAMIEntityType>();
        }
        return this.giamiQuality;
    }

}
