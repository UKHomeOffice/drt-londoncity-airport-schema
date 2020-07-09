
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Local"/&gt;
 *     &lt;enumeration value="Transfer"/&gt;
 *     &lt;enumeration value="Transit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DestinationType")
@XmlEnum
public enum DestinationType {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer"),
    @XmlEnumValue("Transit")
    TRANSIT("Transit");
    private final String value;

    DestinationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestinationType fromValue(String v) {
        for (DestinationType c: DestinationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
