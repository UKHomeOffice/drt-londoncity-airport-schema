
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FuelQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuelQualifierType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/2007/00&gt;FuelQualifierEnumType"&gt;
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelQualifierType", propOrder = {
    "value"
})
public class FuelQualifierType {

    @XmlValue
    protected FuelQualifierEnumType value;
    @XmlAttribute(name = "extension")
    protected String extension;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FuelQualifierEnumType }
     *     
     */
    public FuelQualifierEnumType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelQualifierEnumType }
     *     
     */
    public void setValue(FuelQualifierEnumType value) {
        this.value = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
