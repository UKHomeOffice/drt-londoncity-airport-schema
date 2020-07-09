
package org.iata.iata._2007._00;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BaggageLoadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageLoadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Weight" type="{http://www.iata.org/IATA/2007/00}MeasurementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DestinationType" type="{http://www.iata.org/IATA/2007/00}DestinationType" /&gt;
 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageLoadType", propOrder = {
    "bagCount",
    "weight"
})
public class BaggageLoadType {

    @XmlElement(name = "BagCount")
    protected List<BaggageLoadType.BagCount> bagCount;
    @XmlElement(name = "Weight")
    protected MeasurementType weight;
    @XmlAttribute(name = "ServiceClass")
    protected String serviceClass;
    @XmlAttribute(name = "DestinationType")
    protected DestinationType destinationType;
    @XmlAttribute(name = "RepeatIndex")
    protected String repeatIndex;

    /**
     * Gets the value of the bagCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageLoadType.BagCount }
     * 
     * 
     */
    public List<BaggageLoadType.BagCount> getBagCount() {
        if (bagCount == null) {
            bagCount = new ArrayList<BaggageLoadType.BagCount>();
        }
        return this.bagCount;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setWeight(MeasurementType value) {
        this.weight = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

    /**
     * Gets the value of the destinationType property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * Sets the value of the destinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestinationType(DestinationType value) {
        this.destinationType = value;
    }

    /**
     * Gets the value of the repeatIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatIndex() {
        return repeatIndex;
    }

    /**
     * Sets the value of the repeatIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatIndex(String value) {
        this.repeatIndex = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
     *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class BagCount {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlAttribute(name = "Location")
        protected String location;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

    }

}
