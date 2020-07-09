
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Kilogram"/&gt;
 *     &lt;enumeration value="Pound"/&gt;
 *     &lt;enumeration value="Ton"/&gt;
 *     &lt;enumeration value="Tonne"/&gt;
 *     &lt;enumeration value="Litre"/&gt;
 *     &lt;enumeration value="USGallon"/&gt;
 *     &lt;enumeration value="ImperialGallon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementUnitType")
@XmlEnum
public enum MeasurementUnitType {

    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("Pound")
    POUND("Pound"),
    @XmlEnumValue("Ton")
    TON("Ton"),
    @XmlEnumValue("Tonne")
    TONNE("Tonne"),
    @XmlEnumValue("Litre")
    LITRE("Litre"),
    @XmlEnumValue("USGallon")
    US_GALLON("USGallon"),
    @XmlEnumValue("ImperialGallon")
    IMPERIAL_GALLON("ImperialGallon");
    private final String value;

    MeasurementUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementUnitType fromValue(String v) {
        for (MeasurementUnitType c: MeasurementUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
