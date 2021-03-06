//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.10 at 05:20:59 PM CEST 
//


package be.apb.standards.smoa.schema.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-DAYPERIOD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-DAYPERIOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AFTERBREAKFAST"/>
 *     &lt;enumeration value="AFTERDINNER"/>
 *     &lt;enumeration value="AFTERLUNCH"/>
 *     &lt;enumeration value="AFTERMEAL"/>
 *     &lt;enumeration value="AFTERNOON"/>
 *     &lt;enumeration value="BEFOREBREAKFAST"/>
 *     &lt;enumeration value="BEFOREDINNER"/>
 *     &lt;enumeration value="BEFORELUNCH"/>
 *     &lt;enumeration value="BETWEENBREAKFASTANDLUNCH"/>
 *     &lt;enumeration value="BETWEENDINNERANDSLEEP"/>
 *     &lt;enumeration value="BETWEENLUNCHANDDINNER"/>
 *     &lt;enumeration value="BETWEENMEALS"/>
 *     &lt;enumeration value="DURINGBREAKFAST"/>
 *     &lt;enumeration value="DURINGDINNER"/>
 *     &lt;enumeration value="DURINGLUNCH"/>
 *     &lt;enumeration value="EVENING"/>
 *     &lt;enumeration value="MORNING"/>
 *     &lt;enumeration value="NIGHT"/>
 *     &lt;enumeration value="THEHOUROFSLEEP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-DAYPERIOD")
@XmlEnum
public enum CDDAYPERIOD {

    AFTERBREAKFAST,
    AFTERDINNER,
    AFTERLUNCH,
    AFTERMEAL,
    AFTERNOON,
    BEFOREBREAKFAST,
    BEFOREDINNER,
    BEFORELUNCH,
    BETWEENBREAKFASTANDLUNCH,
    BETWEENDINNERANDSLEEP,
    BETWEENLUNCHANDDINNER,
    BETWEENMEALS,
    DURINGBREAKFAST,
    DURINGDINNER,
    DURINGLUNCH,
    EVENING,
    MORNING,
    NIGHT,
    THEHOUROFSLEEP;

    public String value() {
        return name();
    }

    public static CDDAYPERIOD fromValue(String v) {
        return valueOf(v);
    }

}
