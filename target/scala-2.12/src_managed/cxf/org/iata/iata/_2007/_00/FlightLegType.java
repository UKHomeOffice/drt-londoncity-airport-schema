
package org.iata.iata._2007._00;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegIdentifier" type="{http://www.iata.org/IATA/2007/00}FlightLegIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAction" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Delete"/&gt;
 *               &lt;enumeration value="LockDown"/&gt;
 *               &lt;enumeration value="DoNotDisplay"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LegData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OperationalStatus" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PublicStatus"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OperatingAlliance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TechnicalStopInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="DepSecurityCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ArrSecurityCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="EstFlightDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *                   &lt;element name="OwnerAirline"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Airline" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OperationalSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PlannedArrivalAptHistory" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SpecialEmphasis" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IrregularityDelay" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CabinClass" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InflightService" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="InflightMealService" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PaxCount" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
 *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="DestinationType" type="{http://www.iata.org/IATA/2007/00}DestinationType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SeatCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SpecialCargo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CodeShareInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Airline" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OriginationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="SharedAlliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AssociatedFlightLegAircraft" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2007/00}FlightLegIdentifierType"&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AssociatedFlightLegSchedule" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DepartureAirport" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ArrivalAirport" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RemarkTextCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RemarkFreeText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AirportResources" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Resource" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AirportZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AircraftParkingPosition"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PassengerGate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RemoteOperationalGate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Runway" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="AircraftTerminal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="PublicTerminal" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CrewBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="PaxBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                       &lt;element name="BaggageClaimUnit" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="AreaLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                               &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="BaggageMakeupBelt" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CheckInInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                 &lt;element name="LastPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PreClearedGateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
 *                                     &lt;attribute name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OperationTime" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="OperationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                           &lt;attribute name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AircraftInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="AircraftSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Registration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CrewInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
 *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AgentInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
 *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FleetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DeadLoad" type="{http://www.iata.org/IATA/2007/00}DeadLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="Baggage" type="{http://www.iata.org/IATA/2007/00}BaggageLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="Fuel" type="{http://www.iata.org/IATA/2007/00}FuelDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ClearanceAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PublicFlightDisplay" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AirlineType" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="FlightClassification" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="InternationalStatus"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="International"/&gt;
 *                       &lt;enumeration value="Domestic"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extension" type="{http://www.iata.org/IATA/2007/00}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLegType", propOrder = {
    "legIdentifier",
    "specialAction",
    "legData",
    "tpaExtension"
})
public class FlightLegType {

    @XmlElement(name = "LegIdentifier")
    protected FlightLegIdentifierType legIdentifier;
    @XmlElementRef(name = "SpecialAction", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
    protected JAXBElement<String> specialAction;
    @XmlElement(name = "LegData")
    protected FlightLegType.LegData legData;
    @XmlElement(name = "TPA_Extension")
    protected TPAExtensionsType tpaExtension;

    /**
     * Gets the value of the legIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link FlightLegIdentifierType }
     *     
     */
    public FlightLegIdentifierType getLegIdentifier() {
        return legIdentifier;
    }

    /**
     * Sets the value of the legIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightLegIdentifierType }
     *     
     */
    public void setLegIdentifier(FlightLegIdentifierType value) {
        this.legIdentifier = value;
    }

    /**
     * Gets the value of the specialAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialAction() {
        return specialAction;
    }

    /**
     * Sets the value of the specialAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialAction(JAXBElement<String> value) {
        this.specialAction = value;
    }

    /**
     * Gets the value of the legData property.
     * 
     * @return
     *     possible object is
     *     {@link FlightLegType.LegData }
     *     
     */
    public FlightLegType.LegData getLegData() {
        return legData;
    }

    /**
     * Sets the value of the legData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightLegType.LegData }
     *     
     */
    public void setLegData(FlightLegType.LegData value) {
        this.legData = value;
    }

    /**
     * Gets the value of the tpaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtension() {
        return tpaExtension;
    }

    /**
     * Sets the value of the tpaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtension(TPAExtensionsType value) {
        this.tpaExtension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OperationalStatus" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PublicStatus"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OperatingAlliance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TechnicalStopInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="DepSecurityCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ArrSecurityCheckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="EstFlightDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
     *         &lt;element name="OwnerAirline"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Airline" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OperationalSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PlannedArrivalAptHistory" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SpecialEmphasis" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IrregularityDelay" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CabinClass" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InflightService" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="InflightMealService" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PaxCount" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
     *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="DestinationType" type="{http://www.iata.org/IATA/2007/00}DestinationType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SeatCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SpecialCargo" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CodeShareInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Airline" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OriginationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="SharedAlliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AssociatedFlightLegAircraft" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2007/00}FlightLegIdentifierType"&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AssociatedFlightLegSchedule" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DepartureAirport" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ArrivalAirport" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RemarkTextCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RemarkFreeText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AirportResources" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Resource" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AirportZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AircraftParkingPosition"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PassengerGate" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RemoteOperationalGate" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Runway" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="AircraftTerminal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="PublicTerminal" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CrewBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="PaxBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                             &lt;element name="BaggageClaimUnit" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="AreaLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                     &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="BaggageMakeupBelt" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CheckInInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                       &lt;element name="LastPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PreClearedGateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
     *                           &lt;attribute name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OperationTime" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="OperationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                 &lt;attribute name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AircraftInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="AircraftSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Registration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CrewInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
     *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AgentInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
     *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FleetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DeadLoad" type="{http://www.iata.org/IATA/2007/00}DeadLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="Baggage" type="{http://www.iata.org/IATA/2007/00}BaggageLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="Fuel" type="{http://www.iata.org/IATA/2007/00}FuelDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ClearanceAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PublicFlightDisplay" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AirlineType" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="FlightClassification" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="InternationalStatus"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="International"/&gt;
     *             &lt;enumeration value="Domestic"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operationalStatus",
        "publicStatus",
        "operatingAlliance",
        "serviceType",
        "technicalStopInd",
        "depSecurityCheckInd",
        "arrSecurityCheckInd",
        "estFlightDuration",
        "ownerAirline",
        "plannedArrivalAptHistory",
        "specialEmphasis",
        "irregularityDelay",
        "cabinClass",
        "specialCargo",
        "codeShareInfo",
        "associatedFlightLegAircraft",
        "associatedFlightLegSchedule",
        "remarkTextCode",
        "remarkFreeText",
        "airportResources",
        "operationTime",
        "aircraftInfo",
        "clearanceAgreement",
        "publicFlightDisplay"
    })
    public static class LegData {

        @XmlElement(name = "OperationalStatus", nillable = true)
        protected List<FlightLegType.LegData.OperationalStatus> operationalStatus;
        @XmlElement(name = "PublicStatus", required = true, nillable = true)
        protected FlightLegType.LegData.PublicStatus publicStatus;
        @XmlElement(name = "OperatingAlliance", required = true, nillable = true)
        protected String operatingAlliance;
        @XmlElement(name = "ServiceType", required = true, nillable = true)
        protected String serviceType;
        @XmlElementRef(name = "TechnicalStopInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
        protected JAXBElement<Boolean> technicalStopInd;
        @XmlElementRef(name = "DepSecurityCheckInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
        protected JAXBElement<Boolean> depSecurityCheckInd;
        @XmlElementRef(name = "ArrSecurityCheckInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
        protected JAXBElement<Boolean> arrSecurityCheckInd;
        @XmlElement(name = "EstFlightDuration", required = true, nillable = true)
        protected Duration estFlightDuration;
        @XmlElement(name = "OwnerAirline", required = true, nillable = true)
        protected FlightLegType.LegData.OwnerAirline ownerAirline;
        @XmlElement(name = "PlannedArrivalAptHistory", nillable = true)
        protected List<FlightLegType.LegData.PlannedArrivalAptHistory> plannedArrivalAptHistory;
        @XmlElement(name = "SpecialEmphasis", nillable = true)
        protected List<FlightLegType.LegData.SpecialEmphasis> specialEmphasis;
        @XmlElement(name = "IrregularityDelay", nillable = true)
        protected List<FlightLegType.LegData.IrregularityDelay> irregularityDelay;
        @XmlElement(name = "CabinClass")
        protected List<FlightLegType.LegData.CabinClass> cabinClass;
        @XmlElement(name = "SpecialCargo", nillable = true)
        protected List<FlightLegType.LegData.SpecialCargo> specialCargo;
        @XmlElement(name = "CodeShareInfo", nillable = true)
        protected List<FlightLegType.LegData.CodeShareInfo> codeShareInfo;
        @XmlElement(name = "AssociatedFlightLegAircraft", nillable = true)
        protected List<FlightLegType.LegData.AssociatedFlightLegAircraft> associatedFlightLegAircraft;
        @XmlElement(name = "AssociatedFlightLegSchedule", nillable = true)
        protected List<FlightLegType.LegData.AssociatedFlightLegSchedule> associatedFlightLegSchedule;
        @XmlElement(name = "RemarkTextCode", nillable = true)
        protected List<FlightLegType.LegData.RemarkTextCode> remarkTextCode;
        @XmlElement(name = "RemarkFreeText", required = true, nillable = true)
        protected String remarkFreeText;
        @XmlElement(name = "AirportResources")
        protected List<FlightLegType.LegData.AirportResources> airportResources;
        @XmlElement(name = "OperationTime", nillable = true)
        protected List<FlightLegType.LegData.OperationTime> operationTime;
        @XmlElement(name = "AircraftInfo")
        protected FlightLegType.LegData.AircraftInfo aircraftInfo;
        @XmlElement(name = "ClearanceAgreement")
        protected String clearanceAgreement;
        @XmlElement(name = "PublicFlightDisplay")
        protected FlightLegType.LegData.PublicFlightDisplay publicFlightDisplay;
        @XmlAttribute(name = "FlightClassification")
        protected String flightClassification;
        @XmlAttribute(name = "InternationalStatus")
        protected String internationalStatus;

        /**
         * Gets the value of the operationalStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationalStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationalStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.OperationalStatus }
         * 
         * 
         */
        public List<FlightLegType.LegData.OperationalStatus> getOperationalStatus() {
            if (operationalStatus == null) {
                operationalStatus = new ArrayList<FlightLegType.LegData.OperationalStatus>();
            }
            return this.operationalStatus;
        }

        /**
         * Gets the value of the publicStatus property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType.LegData.PublicStatus }
         *     
         */
        public FlightLegType.LegData.PublicStatus getPublicStatus() {
            return publicStatus;
        }

        /**
         * Sets the value of the publicStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType.LegData.PublicStatus }
         *     
         */
        public void setPublicStatus(FlightLegType.LegData.PublicStatus value) {
            this.publicStatus = value;
        }

        /**
         * Gets the value of the operatingAlliance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatingAlliance() {
            return operatingAlliance;
        }

        /**
         * Sets the value of the operatingAlliance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatingAlliance(String value) {
            this.operatingAlliance = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceType(String value) {
            this.serviceType = value;
        }

        /**
         * Gets the value of the technicalStopInd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getTechnicalStopInd() {
            return technicalStopInd;
        }

        /**
         * Sets the value of the technicalStopInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setTechnicalStopInd(JAXBElement<Boolean> value) {
            this.technicalStopInd = value;
        }

        /**
         * Gets the value of the depSecurityCheckInd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getDepSecurityCheckInd() {
            return depSecurityCheckInd;
        }

        /**
         * Sets the value of the depSecurityCheckInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setDepSecurityCheckInd(JAXBElement<Boolean> value) {
            this.depSecurityCheckInd = value;
        }

        /**
         * Gets the value of the arrSecurityCheckInd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getArrSecurityCheckInd() {
            return arrSecurityCheckInd;
        }

        /**
         * Sets the value of the arrSecurityCheckInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setArrSecurityCheckInd(JAXBElement<Boolean> value) {
            this.arrSecurityCheckInd = value;
        }

        /**
         * Gets the value of the estFlightDuration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getEstFlightDuration() {
            return estFlightDuration;
        }

        /**
         * Sets the value of the estFlightDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setEstFlightDuration(Duration value) {
            this.estFlightDuration = value;
        }

        /**
         * Gets the value of the ownerAirline property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType.LegData.OwnerAirline }
         *     
         */
        public FlightLegType.LegData.OwnerAirline getOwnerAirline() {
            return ownerAirline;
        }

        /**
         * Sets the value of the ownerAirline property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType.LegData.OwnerAirline }
         *     
         */
        public void setOwnerAirline(FlightLegType.LegData.OwnerAirline value) {
            this.ownerAirline = value;
        }

        /**
         * Gets the value of the plannedArrivalAptHistory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plannedArrivalAptHistory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlannedArrivalAptHistory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.PlannedArrivalAptHistory }
         * 
         * 
         */
        public List<FlightLegType.LegData.PlannedArrivalAptHistory> getPlannedArrivalAptHistory() {
            if (plannedArrivalAptHistory == null) {
                plannedArrivalAptHistory = new ArrayList<FlightLegType.LegData.PlannedArrivalAptHistory>();
            }
            return this.plannedArrivalAptHistory;
        }

        /**
         * Gets the value of the specialEmphasis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialEmphasis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialEmphasis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.SpecialEmphasis }
         * 
         * 
         */
        public List<FlightLegType.LegData.SpecialEmphasis> getSpecialEmphasis() {
            if (specialEmphasis == null) {
                specialEmphasis = new ArrayList<FlightLegType.LegData.SpecialEmphasis>();
            }
            return this.specialEmphasis;
        }

        /**
         * Gets the value of the irregularityDelay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the irregularityDelay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIrregularityDelay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.IrregularityDelay }
         * 
         * 
         */
        public List<FlightLegType.LegData.IrregularityDelay> getIrregularityDelay() {
            if (irregularityDelay == null) {
                irregularityDelay = new ArrayList<FlightLegType.LegData.IrregularityDelay>();
            }
            return this.irregularityDelay;
        }

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.CabinClass }
         * 
         * 
         */
        public List<FlightLegType.LegData.CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<FlightLegType.LegData.CabinClass>();
            }
            return this.cabinClass;
        }

        /**
         * Gets the value of the specialCargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialCargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialCargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.SpecialCargo }
         * 
         * 
         */
        public List<FlightLegType.LegData.SpecialCargo> getSpecialCargo() {
            if (specialCargo == null) {
                specialCargo = new ArrayList<FlightLegType.LegData.SpecialCargo>();
            }
            return this.specialCargo;
        }

        /**
         * Gets the value of the codeShareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codeShareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodeShareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.CodeShareInfo }
         * 
         * 
         */
        public List<FlightLegType.LegData.CodeShareInfo> getCodeShareInfo() {
            if (codeShareInfo == null) {
                codeShareInfo = new ArrayList<FlightLegType.LegData.CodeShareInfo>();
            }
            return this.codeShareInfo;
        }

        /**
         * Gets the value of the associatedFlightLegAircraft property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedFlightLegAircraft property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedFlightLegAircraft().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.AssociatedFlightLegAircraft }
         * 
         * 
         */
        public List<FlightLegType.LegData.AssociatedFlightLegAircraft> getAssociatedFlightLegAircraft() {
            if (associatedFlightLegAircraft == null) {
                associatedFlightLegAircraft = new ArrayList<FlightLegType.LegData.AssociatedFlightLegAircraft>();
            }
            return this.associatedFlightLegAircraft;
        }

        /**
         * Gets the value of the associatedFlightLegSchedule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedFlightLegSchedule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedFlightLegSchedule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.AssociatedFlightLegSchedule }
         * 
         * 
         */
        public List<FlightLegType.LegData.AssociatedFlightLegSchedule> getAssociatedFlightLegSchedule() {
            if (associatedFlightLegSchedule == null) {
                associatedFlightLegSchedule = new ArrayList<FlightLegType.LegData.AssociatedFlightLegSchedule>();
            }
            return this.associatedFlightLegSchedule;
        }

        /**
         * Gets the value of the remarkTextCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remarkTextCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemarkTextCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.RemarkTextCode }
         * 
         * 
         */
        public List<FlightLegType.LegData.RemarkTextCode> getRemarkTextCode() {
            if (remarkTextCode == null) {
                remarkTextCode = new ArrayList<FlightLegType.LegData.RemarkTextCode>();
            }
            return this.remarkTextCode;
        }

        /**
         * Gets the value of the remarkFreeText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarkFreeText() {
            return remarkFreeText;
        }

        /**
         * Sets the value of the remarkFreeText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarkFreeText(String value) {
            this.remarkFreeText = value;
        }

        /**
         * Gets the value of the airportResources property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airportResources property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirportResources().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.AirportResources }
         * 
         * 
         */
        public List<FlightLegType.LegData.AirportResources> getAirportResources() {
            if (airportResources == null) {
                airportResources = new ArrayList<FlightLegType.LegData.AirportResources>();
            }
            return this.airportResources;
        }

        /**
         * Gets the value of the operationTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightLegType.LegData.OperationTime }
         * 
         * 
         */
        public List<FlightLegType.LegData.OperationTime> getOperationTime() {
            if (operationTime == null) {
                operationTime = new ArrayList<FlightLegType.LegData.OperationTime>();
            }
            return this.operationTime;
        }

        /**
         * Gets the value of the aircraftInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType.LegData.AircraftInfo }
         *     
         */
        public FlightLegType.LegData.AircraftInfo getAircraftInfo() {
            return aircraftInfo;
        }

        /**
         * Sets the value of the aircraftInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType.LegData.AircraftInfo }
         *     
         */
        public void setAircraftInfo(FlightLegType.LegData.AircraftInfo value) {
            this.aircraftInfo = value;
        }

        /**
         * Gets the value of the clearanceAgreement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClearanceAgreement() {
            return clearanceAgreement;
        }

        /**
         * Sets the value of the clearanceAgreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClearanceAgreement(String value) {
            this.clearanceAgreement = value;
        }

        /**
         * Gets the value of the publicFlightDisplay property.
         * 
         * @return
         *     possible object is
         *     {@link FlightLegType.LegData.PublicFlightDisplay }
         *     
         */
        public FlightLegType.LegData.PublicFlightDisplay getPublicFlightDisplay() {
            return publicFlightDisplay;
        }

        /**
         * Sets the value of the publicFlightDisplay property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightLegType.LegData.PublicFlightDisplay }
         *     
         */
        public void setPublicFlightDisplay(FlightLegType.LegData.PublicFlightDisplay value) {
            this.publicFlightDisplay = value;
        }

        /**
         * Gets the value of the flightClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightClassification() {
            return flightClassification;
        }

        /**
         * Sets the value of the flightClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightClassification(String value) {
            this.flightClassification = value;
        }

        /**
         * Gets the value of the internationalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternationalStatus() {
            return internationalStatus;
        }

        /**
         * Sets the value of the internationalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternationalStatus(String value) {
            this.internationalStatus = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="AircraftSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Registration" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TailNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CrewInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
         *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                 &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AgentInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
         *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FleetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CallSign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DeadLoad" type="{http://www.iata.org/IATA/2007/00}DeadLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="Baggage" type="{http://www.iata.org/IATA/2007/00}BaggageLoadType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="Fuel" type="{http://www.iata.org/IATA/2007/00}FuelDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "aircraftType",
            "aircraftSubType",
            "registration",
            "tailNumber",
            "crewInfo",
            "agentInfo",
            "fleetNumber",
            "callSign",
            "deadLoad",
            "baggage",
            "fuel"
        })
        public static class AircraftInfo {

            @XmlElement(name = "AircraftType", required = true, nillable = true)
            protected String aircraftType;
            @XmlElement(name = "AircraftSubType", required = true, nillable = true)
            protected String aircraftSubType;
            @XmlElement(name = "Registration", required = true, nillable = true)
            protected String registration;
            @XmlElement(name = "TailNumber", required = true, nillable = true)
            protected String tailNumber;
            @XmlElement(name = "CrewInfo", nillable = true)
            protected List<FlightLegType.LegData.AircraftInfo.CrewInfo> crewInfo;
            @XmlElement(name = "AgentInfo", nillable = true)
            protected List<FlightLegType.LegData.AircraftInfo.AgentInfo> agentInfo;
            @XmlElement(name = "FleetNumber", required = true, nillable = true)
            protected String fleetNumber;
            @XmlElement(name = "CallSign", required = true, nillable = true)
            protected String callSign;
            @XmlElement(name = "DeadLoad")
            protected List<DeadLoadType> deadLoad;
            @XmlElement(name = "Baggage")
            protected List<BaggageLoadType> baggage;
            @XmlElement(name = "Fuel")
            protected List<FuelDataType> fuel;

            /**
             * Gets the value of the aircraftType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAircraftType() {
                return aircraftType;
            }

            /**
             * Sets the value of the aircraftType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAircraftType(String value) {
                this.aircraftType = value;
            }

            /**
             * Gets the value of the aircraftSubType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAircraftSubType() {
                return aircraftSubType;
            }

            /**
             * Sets the value of the aircraftSubType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAircraftSubType(String value) {
                this.aircraftSubType = value;
            }

            /**
             * Gets the value of the registration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistration() {
                return registration;
            }

            /**
             * Sets the value of the registration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistration(String value) {
                this.registration = value;
            }

            /**
             * Gets the value of the tailNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTailNumber() {
                return tailNumber;
            }

            /**
             * Sets the value of the tailNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTailNumber(String value) {
                this.tailNumber = value;
            }

            /**
             * Gets the value of the crewInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the crewInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCrewInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.AircraftInfo.CrewInfo }
             * 
             * 
             */
            public List<FlightLegType.LegData.AircraftInfo.CrewInfo> getCrewInfo() {
                if (crewInfo == null) {
                    crewInfo = new ArrayList<FlightLegType.LegData.AircraftInfo.CrewInfo>();
                }
                return this.crewInfo;
            }

            /**
             * Gets the value of the agentInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the agentInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAgentInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.AircraftInfo.AgentInfo }
             * 
             * 
             */
            public List<FlightLegType.LegData.AircraftInfo.AgentInfo> getAgentInfo() {
                if (agentInfo == null) {
                    agentInfo = new ArrayList<FlightLegType.LegData.AircraftInfo.AgentInfo>();
                }
                return this.agentInfo;
            }

            /**
             * Gets the value of the fleetNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFleetNumber() {
                return fleetNumber;
            }

            /**
             * Sets the value of the fleetNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFleetNumber(String value) {
                this.fleetNumber = value;
            }

            /**
             * Gets the value of the callSign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallSign() {
                return callSign;
            }

            /**
             * Sets the value of the callSign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallSign(String value) {
                this.callSign = value;
            }

            /**
             * Gets the value of the deadLoad property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the deadLoad property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDeadLoad().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DeadLoadType }
             * 
             * 
             */
            public List<DeadLoadType> getDeadLoad() {
                if (deadLoad == null) {
                    deadLoad = new ArrayList<DeadLoadType>();
                }
                return this.deadLoad;
            }

            /**
             * Gets the value of the baggage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the baggage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBaggage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BaggageLoadType }
             * 
             * 
             */
            public List<BaggageLoadType> getBaggage() {
                if (baggage == null) {
                    baggage = new ArrayList<BaggageLoadType>();
                }
                return this.baggage;
            }

            /**
             * Gets the value of the fuel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fuel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFuel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FuelDataType }
             * 
             * 
             */
            public List<FuelDataType> getFuel() {
                if (fuel == null) {
                    fuel = new ArrayList<FuelDataType>();
                }
                return this.fuel;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
             *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
            public static class AgentInfo {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Qualifier")
                protected String qualifier;
                @XmlAttribute(name = "DepartureOrArrival", required = true)
                protected DepartureArrivalType departureOrArrival;
                @XmlAttribute(name = "RepeatIndex")
                protected BigInteger repeatIndex;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the departureOrArrival property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureArrivalType }
                 *     
                 */
                public DepartureArrivalType getDepartureOrArrival() {
                    return departureOrArrival;
                }

                /**
                 * Sets the value of the departureOrArrival property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureArrivalType }
                 *     
                 */
                public void setDepartureOrArrival(DepartureArrivalType value) {
                    this.departureOrArrival = value;
                }

                /**
                 * Gets the value of the repeatIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRepeatIndex() {
                    return repeatIndex;
                }

                /**
                 * Sets the value of the repeatIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRepeatIndex(BigInteger value) {
                    this.repeatIndex = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
             *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *       &lt;attribute name="Airline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class CrewInfo {

                @XmlValue
                protected BigInteger value;
                @XmlAttribute(name = "Qualifier")
                protected String qualifier;
                @XmlAttribute(name = "RepeatIndex")
                protected BigInteger repeatIndex;
                @XmlAttribute(name = "Airline")
                protected String airline;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

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
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the repeatIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRepeatIndex() {
                    return repeatIndex;
                }

                /**
                 * Sets the value of the repeatIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRepeatIndex(BigInteger value) {
                    this.repeatIndex = value;
                }

                /**
                 * Gets the value of the airline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirline() {
                    return airline;
                }

                /**
                 * Sets the value of the airline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirline(String value) {
                    this.airline = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Resource" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="AirportZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AircraftParkingPosition"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PassengerGate" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RemoteOperationalGate" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Runway" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="AircraftTerminal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="PublicTerminal" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CrewBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="PaxBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                   &lt;element name="BaggageClaimUnit" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="AreaLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                           &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="BaggageMakeupBelt" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CheckInInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                             &lt;element name="LastPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PreClearedGateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
         *                 &lt;attribute name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "resource"
        })
        public static class AirportResources {

            @XmlElement(name = "Resource")
            protected List<FlightLegType.LegData.AirportResources.Resource> resource;
            @XmlAttribute(name = "Usage", required = true)
            protected UsageType usage;

            /**
             * Gets the value of the resource property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resource property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.AirportResources.Resource }
             * 
             * 
             */
            public List<FlightLegType.LegData.AirportResources.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<FlightLegType.LegData.AirportResources.Resource>();
                }
                return this.resource;
            }

            /**
             * Gets the value of the usage property.
             * 
             * @return
             *     possible object is
             *     {@link UsageType }
             *     
             */
            public UsageType getUsage() {
                return usage;
            }

            /**
             * Sets the value of the usage property.
             * 
             * @param value
             *     allowed object is
             *     {@link UsageType }
             *     
             */
            public void setUsage(UsageType value) {
                this.usage = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="AirportZone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AircraftParkingPosition"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PassengerGate" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RemoteOperationalGate" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Runway" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="AircraftTerminal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="PublicTerminal" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CrewBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="PaxBusInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *         &lt;element name="BaggageClaimUnit" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="AreaLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *                 &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="BaggageMakeupBelt" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CheckInInfo" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                   &lt;element name="LastPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PreClearedGateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
             *       &lt;attribute name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airportZone",
                "aircraftParkingPosition",
                "passengerGate",
                "remoteOperationalGate",
                "runway",
                "aircraftTerminal",
                "publicTerminal",
                "crewBusInd",
                "paxBusInd",
                "baggageClaimUnit",
                "baggageMakeupBelt",
                "checkInInfo",
                "preClearedGateInd"
            })
            public static class Resource {

                @XmlElement(name = "AirportZone", required = true, nillable = true)
                protected String airportZone;
                @XmlElement(name = "AircraftParkingPosition", required = true, nillable = true)
                protected FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition aircraftParkingPosition;
                @XmlElement(name = "PassengerGate", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.PassengerGate> passengerGate;
                @XmlElement(name = "RemoteOperationalGate", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate> remoteOperationalGate;
                @XmlElement(name = "Runway", required = true, nillable = true)
                protected String runway;
                @XmlElement(name = "AircraftTerminal", required = true, nillable = true)
                protected String aircraftTerminal;
                @XmlElement(name = "PublicTerminal", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.PublicTerminal> publicTerminal;
                @XmlElementRef(name = "CrewBusInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
                protected JAXBElement<Boolean> crewBusInd;
                @XmlElementRef(name = "PaxBusInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
                protected JAXBElement<Boolean> paxBusInd;
                @XmlElement(name = "BaggageClaimUnit", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit> baggageClaimUnit;
                @XmlElement(name = "BaggageMakeupBelt", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt> baggageMakeupBelt;
                @XmlElement(name = "CheckInInfo", nillable = true)
                protected List<FlightLegType.LegData.AirportResources.Resource.CheckInInfo> checkInInfo;
                @XmlElementRef(name = "PreClearedGateInd", namespace = "http://www.iata.org/IATA/2007/00", type = JAXBElement.class)
                protected JAXBElement<Boolean> preClearedGateInd;
                @XmlAttribute(name = "DepartureOrArrival", required = true)
                protected DepartureArrivalType departureOrArrival;
                @XmlAttribute(name = "ChargeType")
                protected String chargeType;

                /**
                 * Gets the value of the airportZone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirportZone() {
                    return airportZone;
                }

                /**
                 * Sets the value of the airportZone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirportZone(String value) {
                    this.airportZone = value;
                }

                /**
                 * Gets the value of the aircraftParkingPosition property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition }
                 *     
                 */
                public FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition getAircraftParkingPosition() {
                    return aircraftParkingPosition;
                }

                /**
                 * Sets the value of the aircraftParkingPosition property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition }
                 *     
                 */
                public void setAircraftParkingPosition(FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition value) {
                    this.aircraftParkingPosition = value;
                }

                /**
                 * Gets the value of the passengerGate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the passengerGate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPassengerGate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.PassengerGate }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.PassengerGate> getPassengerGate() {
                    if (passengerGate == null) {
                        passengerGate = new ArrayList<FlightLegType.LegData.AirportResources.Resource.PassengerGate>();
                    }
                    return this.passengerGate;
                }

                /**
                 * Gets the value of the remoteOperationalGate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remoteOperationalGate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemoteOperationalGate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate> getRemoteOperationalGate() {
                    if (remoteOperationalGate == null) {
                        remoteOperationalGate = new ArrayList<FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate>();
                    }
                    return this.remoteOperationalGate;
                }

                /**
                 * Gets the value of the runway property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRunway() {
                    return runway;
                }

                /**
                 * Sets the value of the runway property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRunway(String value) {
                    this.runway = value;
                }

                /**
                 * Gets the value of the aircraftTerminal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAircraftTerminal() {
                    return aircraftTerminal;
                }

                /**
                 * Sets the value of the aircraftTerminal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAircraftTerminal(String value) {
                    this.aircraftTerminal = value;
                }

                /**
                 * Gets the value of the publicTerminal property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the publicTerminal property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPublicTerminal().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.PublicTerminal }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.PublicTerminal> getPublicTerminal() {
                    if (publicTerminal == null) {
                        publicTerminal = new ArrayList<FlightLegType.LegData.AirportResources.Resource.PublicTerminal>();
                    }
                    return this.publicTerminal;
                }

                /**
                 * Gets the value of the crewBusInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getCrewBusInd() {
                    return crewBusInd;
                }

                /**
                 * Sets the value of the crewBusInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setCrewBusInd(JAXBElement<Boolean> value) {
                    this.crewBusInd = value;
                }

                /**
                 * Gets the value of the paxBusInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getPaxBusInd() {
                    return paxBusInd;
                }

                /**
                 * Sets the value of the paxBusInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setPaxBusInd(JAXBElement<Boolean> value) {
                    this.paxBusInd = value;
                }

                /**
                 * Gets the value of the baggageClaimUnit property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the baggageClaimUnit property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBaggageClaimUnit().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit> getBaggageClaimUnit() {
                    if (baggageClaimUnit == null) {
                        baggageClaimUnit = new ArrayList<FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit>();
                    }
                    return this.baggageClaimUnit;
                }

                /**
                 * Gets the value of the baggageMakeupBelt property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the baggageMakeupBelt property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBaggageMakeupBelt().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt> getBaggageMakeupBelt() {
                    if (baggageMakeupBelt == null) {
                        baggageMakeupBelt = new ArrayList<FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt>();
                    }
                    return this.baggageMakeupBelt;
                }

                /**
                 * Gets the value of the checkInInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the checkInInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCheckInInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FlightLegType.LegData.AirportResources.Resource.CheckInInfo }
                 * 
                 * 
                 */
                public List<FlightLegType.LegData.AirportResources.Resource.CheckInInfo> getCheckInInfo() {
                    if (checkInInfo == null) {
                        checkInInfo = new ArrayList<FlightLegType.LegData.AirportResources.Resource.CheckInInfo>();
                    }
                    return this.checkInInfo;
                }

                /**
                 * Gets the value of the preClearedGateInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getPreClearedGateInd() {
                    return preClearedGateInd;
                }

                /**
                 * Sets the value of the preClearedGateInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setPreClearedGateInd(JAXBElement<Boolean> value) {
                    this.preClearedGateInd = value;
                }

                /**
                 * Gets the value of the departureOrArrival property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureArrivalType }
                 *     
                 */
                public DepartureArrivalType getDepartureOrArrival() {
                    return departureOrArrival;
                }

                /**
                 * Sets the value of the departureOrArrival property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureArrivalType }
                 *     
                 */
                public void setDepartureOrArrival(DepartureArrivalType value) {
                    this.departureOrArrival = value;
                }

                /**
                 * Gets the value of the chargeType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeType() {
                    return chargeType;
                }

                /**
                 * Sets the value of the chargeType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeType(String value) {
                    this.chargeType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
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
                public static class AircraftParkingPosition {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Qualifier")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "NMTOKEN")
                    protected String qualifier;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQualifier() {
                        return qualifier;
                    }

                    /**
                     * Sets the value of the qualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQualifier(String value) {
                        this.qualifier = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="AreaLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *       &lt;attribute name="ServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
                public static class BaggageClaimUnit {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Qualifier")
                    protected String qualifier;
                    @XmlAttribute(name = "AreaLocation")
                    protected String areaLocation;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;
                    @XmlAttribute(name = "ServiceClass")
                    protected String serviceClass;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQualifier() {
                        return qualifier;
                    }

                    /**
                     * Sets the value of the qualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQualifier(String value) {
                        this.qualifier = value;
                    }

                    /**
                     * Gets the value of the areaLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAreaLocation() {
                        return areaLocation;
                    }

                    /**
                     * Sets the value of the areaLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAreaLocation(String value) {
                        this.areaLocation = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
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

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                public static class BaggageMakeupBelt {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="FirstPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *         &lt;element name="LastPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "firstPosition",
                    "lastPosition"
                })
                public static class CheckInInfo {

                    @XmlElement(name = "FirstPosition")
                    protected String firstPosition;
                    @XmlElement(name = "LastPosition")
                    protected String lastPosition;
                    @XmlAttribute(name = "Qualifier")
                    protected String qualifier;
                    @XmlAttribute(name = "Location")
                    protected String location;
                    @XmlAttribute(name = "Class")
                    protected String clazz;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;

                    /**
                     * Gets the value of the firstPosition property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFirstPosition() {
                        return firstPosition;
                    }

                    /**
                     * Sets the value of the firstPosition property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFirstPosition(String value) {
                        this.firstPosition = value;
                    }

                    /**
                     * Gets the value of the lastPosition property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLastPosition() {
                        return lastPosition;
                    }

                    /**
                     * Sets the value of the lastPosition property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLastPosition(String value) {
                        this.lastPosition = value;
                    }

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQualifier() {
                        return qualifier;
                    }

                    /**
                     * Sets the value of the qualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQualifier(String value) {
                        this.qualifier = value;
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

                    /**
                     * Gets the value of the clazz property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClazz() {
                        return clazz;
                    }

                    /**
                     * Sets the value of the clazz property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClazz(String value) {
                        this.clazz = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                public static class PassengerGate {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                public static class PublicTerminal {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
                public static class RemoteOperationalGate {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "RepeatIndex")
                    protected BigInteger repeatIndex;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the repeatIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRepeatIndex() {
                        return repeatIndex;
                    }

                    /**
                     * Sets the value of the repeatIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRepeatIndex(BigInteger value) {
                        this.repeatIndex = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2007/00}FlightLegIdentifierType"&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AssociatedFlightLegAircraft
            extends FlightLegIdentifierType
        {

            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DepartureAirport" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ArrivalAirport" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "departureAirport",
            "arrivalAirport"
        })
        public static class AssociatedFlightLegSchedule {

            @XmlElement(name = "DepartureAirport")
            protected FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport departureAirport;
            @XmlElement(name = "ArrivalAirport")
            protected FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport arrivalAirport;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the departureAirport property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport }
             *     
             */
            public FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport getDepartureAirport() {
                return departureAirport;
            }

            /**
             * Sets the value of the departureAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport }
             *     
             */
            public void setDepartureAirport(FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport value) {
                this.departureAirport = value;
            }

            /**
             * Gets the value of the arrivalAirport property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport }
             *     
             */
            public FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport getArrivalAirport() {
                return arrivalAirport;
            }

            /**
             * Sets the value of the arrivalAirport property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport }
             *     
             */
            public void setArrivalAirport(FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport value) {
                this.arrivalAirport = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class ArrivalAirport {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class DepartureAirport {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="InflightService" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="InflightMealService" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PaxCount" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
         *                 &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
         *                 &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *                 &lt;attribute name="DestinationType" type="{http://www.iata.org/IATA/2007/00}DestinationType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SeatCapacity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inflightService",
            "inflightMealService",
            "paxCount",
            "seatCapacity"
        })
        public static class CabinClass {

            @XmlElement(name = "InflightService", nillable = true)
            protected List<FlightLegType.LegData.CabinClass.InflightService> inflightService;
            @XmlElement(name = "InflightMealService", nillable = true)
            protected List<FlightLegType.LegData.CabinClass.InflightMealService> inflightMealService;
            @XmlElement(name = "PaxCount", nillable = true)
            protected List<FlightLegType.LegData.CabinClass.PaxCount> paxCount;
            @XmlElement(name = "SeatCapacity", required = true, nillable = true)
            protected String seatCapacity;
            @XmlAttribute(name = "Class")
            protected String clazz;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the inflightService property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inflightService property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInflightService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.CabinClass.InflightService }
             * 
             * 
             */
            public List<FlightLegType.LegData.CabinClass.InflightService> getInflightService() {
                if (inflightService == null) {
                    inflightService = new ArrayList<FlightLegType.LegData.CabinClass.InflightService>();
                }
                return this.inflightService;
            }

            /**
             * Gets the value of the inflightMealService property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inflightMealService property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInflightMealService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.CabinClass.InflightMealService }
             * 
             * 
             */
            public List<FlightLegType.LegData.CabinClass.InflightMealService> getInflightMealService() {
                if (inflightMealService == null) {
                    inflightMealService = new ArrayList<FlightLegType.LegData.CabinClass.InflightMealService>();
                }
                return this.inflightMealService;
            }

            /**
             * Gets the value of the paxCount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paxCount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaxCount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightLegType.LegData.CabinClass.PaxCount }
             * 
             * 
             */
            public List<FlightLegType.LegData.CabinClass.PaxCount> getPaxCount() {
                if (paxCount == null) {
                    paxCount = new ArrayList<FlightLegType.LegData.CabinClass.PaxCount>();
                }
                return this.paxCount;
            }

            /**
             * Gets the value of the seatCapacity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatCapacity() {
                return seatCapacity;
            }

            /**
             * Sets the value of the seatCapacity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatCapacity(String value) {
                this.seatCapacity = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
            public static class InflightMealService {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RepeatIndex")
                protected BigInteger repeatIndex;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the repeatIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRepeatIndex() {
                    return repeatIndex;
                }

                /**
                 * Sets the value of the repeatIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRepeatIndex(BigInteger value) {
                    this.repeatIndex = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
            public static class InflightService {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RepeatIndex")
                protected BigInteger repeatIndex;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the repeatIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRepeatIndex() {
                    return repeatIndex;
                }

                /**
                 * Sets the value of the repeatIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRepeatIndex(BigInteger value) {
                    this.repeatIndex = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;integer"&gt;
             *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="Usage" use="required" type="{http://www.iata.org/IATA/2007/00}UsageType" /&gt;
             *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
             *       &lt;attribute name="DestinationType" type="{http://www.iata.org/IATA/2007/00}DestinationType" /&gt;
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
            public static class PaxCount {

                @XmlValue
                protected BigInteger value;
                @XmlAttribute(name = "Qualifier")
                protected String qualifier;
                @XmlAttribute(name = "Usage", required = true)
                protected UsageType usage;
                @XmlAttribute(name = "RepeatIndex")
                protected BigInteger repeatIndex;
                @XmlAttribute(name = "DestinationType")
                protected DestinationType destinationType;

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
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQualifier(String value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the usage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UsageType }
                 *     
                 */
                public UsageType getUsage() {
                    return usage;
                }

                /**
                 * Sets the value of the usage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UsageType }
                 *     
                 */
                public void setUsage(UsageType value) {
                    this.usage = value;
                }

                /**
                 * Gets the value of the repeatIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRepeatIndex() {
                    return repeatIndex;
                }

                /**
                 * Sets the value of the repeatIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRepeatIndex(BigInteger value) {
                    this.repeatIndex = value;
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

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Airline" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OriginationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="SharedAlliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airline",
            "flightNumber",
            "originationDate",
            "sharedAlliance"
        })
        public static class CodeShareInfo {

            @XmlElement(name = "Airline")
            protected FlightLegType.LegData.CodeShareInfo.Airline airline;
            @XmlElement(name = "FlightNumber")
            protected String flightNumber;
            @XmlElement(name = "OriginationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar originationDate;
            @XmlElement(name = "SharedAlliance")
            protected String sharedAlliance;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the airline property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType.LegData.CodeShareInfo.Airline }
             *     
             */
            public FlightLegType.LegData.CodeShareInfo.Airline getAirline() {
                return airline;
            }

            /**
             * Sets the value of the airline property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType.LegData.CodeShareInfo.Airline }
             *     
             */
            public void setAirline(FlightLegType.LegData.CodeShareInfo.Airline value) {
                this.airline = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the originationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getOriginationDate() {
                return originationDate;
            }

            /**
             * Sets the value of the originationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setOriginationDate(XMLGregorianCalendar value) {
                this.originationDate = value;
            }

            /**
             * Gets the value of the sharedAlliance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSharedAlliance() {
                return sharedAlliance;
            }

            /**
             * Sets the value of the sharedAlliance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSharedAlliance(String value) {
                this.sharedAlliance = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class Airline {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="DepartureOrArrival" use="required" type="{http://www.iata.org/IATA/2007/00}DepartureArrivalType" /&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reasonCode",
            "duration"
        })
        public static class IrregularityDelay {

            @XmlElement(name = "ReasonCode")
            protected String reasonCode;
            @XmlElement(name = "Duration")
            protected Duration duration;
            @XmlAttribute(name = "DepartureOrArrival", required = true)
            protected DepartureArrivalType departureOrArrival;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the reasonCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonCode() {
                return reasonCode;
            }

            /**
             * Sets the value of the reasonCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonCode(String value) {
                this.reasonCode = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link Duration }
             *     
             */
            public Duration getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setDuration(Duration value) {
                this.duration = value;
            }

            /**
             * Gets the value of the departureOrArrival property.
             * 
             * @return
             *     possible object is
             *     {@link DepartureArrivalType }
             *     
             */
            public DepartureArrivalType getDepartureOrArrival() {
                return departureOrArrival;
            }

            /**
             * Sets the value of the departureOrArrival property.
             * 
             * @param value
             *     allowed object is
             *     {@link DepartureArrivalType }
             *     
             */
            public void setDepartureOrArrival(DepartureArrivalType value) {
                this.departureOrArrival = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class OperationalStatus {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="OperationQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *       &lt;attribute name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class OperationTime {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OperationQualifier")
            protected String operationQualifier;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;
            @XmlAttribute(name = "TimeType")
            protected String timeType;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the operationQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationQualifier() {
                return operationQualifier;
            }

            /**
             * Sets the value of the operationQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationQualifier(String value) {
                this.operationQualifier = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

            /**
             * Gets the value of the timeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimeType() {
                return timeType;
            }

            /**
             * Sets the value of the timeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimeType(String value) {
                this.timeType = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Airline" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OperationalSuffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airline",
            "flightNumber",
            "operationalSuffix"
        })
        public static class OwnerAirline {

            @XmlElement(name = "Airline")
            protected FlightLegType.LegData.OwnerAirline.Airline airline;
            @XmlElement(name = "FlightNumber")
            protected String flightNumber;
            @XmlElement(name = "OperationalSuffix", required = true, nillable = true)
            protected String operationalSuffix;

            /**
             * Gets the value of the airline property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType.LegData.OwnerAirline.Airline }
             *     
             */
            public FlightLegType.LegData.OwnerAirline.Airline getAirline() {
                return airline;
            }

            /**
             * Sets the value of the airline property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType.LegData.OwnerAirline.Airline }
             *     
             */
            public void setAirline(FlightLegType.LegData.OwnerAirline.Airline value) {
                this.airline = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the operationalSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationalSuffix() {
                return operationalSuffix;
            }

            /**
             * Sets the value of the operationalSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationalSuffix(String value) {
                this.operationalSuffix = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class Airline {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class PlannedArrivalAptHistory {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AirlineType" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airlineType",
            "flightNumber"
        })
        public static class PublicFlightDisplay {

            @XmlElement(name = "AirlineType")
            protected FlightLegType.LegData.PublicFlightDisplay.AirlineType airlineType;
            @XmlElement(name = "FlightNumber")
            protected String flightNumber;

            /**
             * Gets the value of the airlineType property.
             * 
             * @return
             *     possible object is
             *     {@link FlightLegType.LegData.PublicFlightDisplay.AirlineType }
             *     
             */
            public FlightLegType.LegData.PublicFlightDisplay.AirlineType getAirlineType() {
                return airlineType;
            }

            /**
             * Sets the value of the airlineType property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightLegType.LegData.PublicFlightDisplay.AirlineType }
             *     
             */
            public void setAirlineType(FlightLegType.LegData.PublicFlightDisplay.AirlineType value) {
                this.airlineType = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            public static class AirlineType {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class PublicStatus {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class RemarkTextCode {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Qualifier")
            protected String qualifier;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQualifier(String value) {
                this.qualifier = value;
            }

            /**
             * Gets the value of the codeContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Sets the value of the codeContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class SpecialCargo {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="RepeatIndex" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class SpecialEmphasis {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "RepeatIndex")
            protected BigInteger repeatIndex;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the repeatIndex property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRepeatIndex() {
                return repeatIndex;
            }

            /**
             * Sets the value of the repeatIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRepeatIndex(BigInteger value) {
                this.repeatIndex = value;
            }

        }

    }

}
