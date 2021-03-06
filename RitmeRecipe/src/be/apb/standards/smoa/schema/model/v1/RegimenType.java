//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.model.v1;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import be.apb.standards.smoa.schema.code.v1.AbstractWeekDayCodeType;


/**
 * ordered day regimen of administration applicable either on a precised day or on basis of the frequency 
 * 
 * <p>Java class for RegimenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegimenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.apb.be/standards/smoa/schema/model/v1}AbstractRegimenType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="daynumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *           &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="weekday" type="{http://www.apb.be/standards/smoa/schema/code/v1}Abstract-WeekDayCodeType"/>
 *         &lt;/choice>
 *         &lt;element name="daytime" type="{http://www.apb.be/standards/smoa/schema/model/v1}RegimenDayTimeType"/>
 *         &lt;element name="quantity" type="{http://www.apb.be/standards/smoa/schema/model/v1}RegimenAdministrationQuantityType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegimenType", propOrder = {
    "daynumberOrDateOrWeekday"
})
public class RegimenType
    extends AbstractRegimenType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "quantity", required = true, type = RegimenAdministrationQuantityType.class),
        @XmlElement(name = "date", required = true, type = XMLGregorianCalendar.class),
        @XmlElement(name = "daynumber", required = true, type = BigInteger.class),
        @XmlElement(name = "weekday", required = true, type = AbstractWeekDayCodeType.class),
        @XmlElement(name = "daytime", required = true, type = RegimenDayTimeType.class)
    })
    protected List<Object> daynumberOrDateOrWeekday;

    /**
     * Gets the value of the daynumberOrDateOrWeekday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daynumberOrDateOrWeekday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaynumberOrDateOrWeekday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegimenAdministrationQuantityType }
     * {@link XMLGregorianCalendar }
     * {@link BigInteger }
     * {@link AbstractWeekDayCodeType }
     * {@link RegimenDayTimeType }
     * 
     * 
     */
    public List<Object> getDaynumberOrDateOrWeekday() {
        if (daynumberOrDateOrWeekday == null) {
            daynumberOrDateOrWeekday = new ArrayList<Object>();
        }
        return this.daynumberOrDateOrWeekday;
    }

}
