
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelQualifierEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelQualifierEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FuelUplift"/&gt;
 *     &lt;enumeration value="FuelOnboard"/&gt;
 *     &lt;enumeration value="TripFuel"/&gt;
 *     &lt;enumeration value="TakeoffFuel"/&gt;
 *     &lt;enumeration value="Other_"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuelQualifierEnumType")
@XmlEnum
public enum FuelQualifierEnumType {

    @XmlEnumValue("FuelUplift")
    FUEL_UPLIFT("FuelUplift"),
    @XmlEnumValue("FuelOnboard")
    FUEL_ONBOARD("FuelOnboard"),
    @XmlEnumValue("TripFuel")
    TRIP_FUEL("TripFuel"),
    @XmlEnumValue("TakeoffFuel")
    TAKEOFF_FUEL("TakeoffFuel"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    FuelQualifierEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelQualifierEnumType fromValue(String v) {
        for (FuelQualifierEnumType c: FuelQualifierEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
