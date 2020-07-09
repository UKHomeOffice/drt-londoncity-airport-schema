
package com.airport2020.requestaidx;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.airport2020.requestaidx package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserID_QNAME = new QName("http://www.airport2020.com/RequestAIDX/", "userID");
    private final static QName _FullRefresh_QNAME = new QName("http://www.airport2020.com/RequestAIDX/", "fullRefresh");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.airport2020.requestaidx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.airport2020.com/RequestAIDX/", name = "userID")
    public JAXBElement<String> createUserID(String value) {
        return new JAXBElement<String>(_UserID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.airport2020.com/RequestAIDX/", name = "fullRefresh")
    public JAXBElement<String> createFullRefresh(String value) {
        return new JAXBElement<String>(_FullRefresh_QNAME, String.class, null, value);
    }

}
