
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartureArrivalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepartureArrivalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Departure"/&gt;
 *     &lt;enumeration value="Arrival"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DepartureArrivalType")
@XmlEnum
public enum DepartureArrivalType {

    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival");
    private final String value;

    DepartureArrivalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepartureArrivalType fromValue(String v) {
        for (DepartureArrivalType c: DepartureArrivalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
