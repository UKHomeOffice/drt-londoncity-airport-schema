
package org.iata.iata._2007._00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuelDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/2007/00}FuelQualifierType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.iata.org/IATA/2007/00}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelDataType", propOrder = {
    "type",
    "quantity"
})
public class FuelDataType {

    @XmlElement(name = "Type")
    protected FuelQualifierType type;
    @XmlElement(name = "Quantity")
    protected MeasurementType quantity;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FuelQualifierType }
     *     
     */
    public FuelQualifierType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelQualifierType }
     *     
     */
    public void setType(FuelQualifierType value) {
        this.type = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setQuantity(MeasurementType value) {
        this.quantity = value;
    }

}
