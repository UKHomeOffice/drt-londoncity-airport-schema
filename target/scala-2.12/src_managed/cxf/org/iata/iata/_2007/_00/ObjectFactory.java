
package org.iata.iata._2007._00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iata.iata._2007._00 package. 
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

    private final static QName _FlightLegTypeSpecialAction_QNAME = new QName("http://www.iata.org/IATA/2007/00", "SpecialAction");
    private final static QName _FlightLegTypeLegDataTechnicalStopInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "TechnicalStopInd");
    private final static QName _FlightLegTypeLegDataDepSecurityCheckInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "DepSecurityCheckInd");
    private final static QName _FlightLegTypeLegDataArrSecurityCheckInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "ArrSecurityCheckInd");
    private final static QName _FlightLegTypeLegDataAirportResourcesResourceCrewBusInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "CrewBusInd");
    private final static QName _FlightLegTypeLegDataAirportResourcesResourcePaxBusInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "PaxBusInd");
    private final static QName _FlightLegTypeLegDataAirportResourcesResourcePreClearedGateInd_QNAME = new QName("http://www.iata.org/IATA/2007/00", "PreClearedGateInd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iata.iata._2007._00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaggageLoadType }
     * 
     */
    public BaggageLoadType createBaggageLoadType() {
        return new BaggageLoadType();
    }

    /**
     * Create an instance of {@link FlightLegIdentifierType }
     * 
     */
    public FlightLegIdentifierType createFlightLegIdentifierType() {
        return new FlightLegIdentifierType();
    }

    /**
     * Create an instance of {@link FlightLegType }
     * 
     */
    public FlightLegType createFlightLegType() {
        return new FlightLegType();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData }
     * 
     */
    public FlightLegType.LegData createFlightLegTypeLegData() {
        return new FlightLegType.LegData();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.PublicFlightDisplay }
     * 
     */
    public FlightLegType.LegData.PublicFlightDisplay createFlightLegTypeLegDataPublicFlightDisplay() {
        return new FlightLegType.LegData.PublicFlightDisplay();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AircraftInfo }
     * 
     */
    public FlightLegType.LegData.AircraftInfo createFlightLegTypeLegDataAircraftInfo() {
        return new FlightLegType.LegData.AircraftInfo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources }
     * 
     */
    public FlightLegType.LegData.AirportResources createFlightLegTypeLegDataAirportResources() {
        return new FlightLegType.LegData.AirportResources();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource createFlightLegTypeLegDataAirportResourcesResource() {
        return new FlightLegType.LegData.AirportResources.Resource();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AssociatedFlightLegSchedule }
     * 
     */
    public FlightLegType.LegData.AssociatedFlightLegSchedule createFlightLegTypeLegDataAssociatedFlightLegSchedule() {
        return new FlightLegType.LegData.AssociatedFlightLegSchedule();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CodeShareInfo }
     * 
     */
    public FlightLegType.LegData.CodeShareInfo createFlightLegTypeLegDataCodeShareInfo() {
        return new FlightLegType.LegData.CodeShareInfo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CabinClass }
     * 
     */
    public FlightLegType.LegData.CabinClass createFlightLegTypeLegDataCabinClass() {
        return new FlightLegType.LegData.CabinClass();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.OwnerAirline }
     * 
     */
    public FlightLegType.LegData.OwnerAirline createFlightLegTypeLegDataOwnerAirline() {
        return new FlightLegType.LegData.OwnerAirline();
    }

    /**
     * Create an instance of {@link IATAAIDXFlightLegRS }
     * 
     */
    public IATAAIDXFlightLegRS createIATAAIDXFlightLegRS() {
        return new IATAAIDXFlightLegRS();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link DeadLoadType }
     * 
     */
    public DeadLoadType createDeadLoadType() {
        return new DeadLoadType();
    }

    /**
     * Create an instance of {@link MeasurementType }
     * 
     */
    public MeasurementType createMeasurementType() {
        return new MeasurementType();
    }

    /**
     * Create an instance of {@link FuelDataType }
     * 
     */
    public FuelDataType createFuelDataType() {
        return new FuelDataType();
    }

    /**
     * Create an instance of {@link FuelQualifierType }
     * 
     */
    public FuelQualifierType createFuelQualifierType() {
        return new FuelQualifierType();
    }

    /**
     * Create an instance of {@link TPAExtensionsType }
     * 
     */
    public TPAExtensionsType createTPAExtensionsType() {
        return new TPAExtensionsType();
    }

    /**
     * Create an instance of {@link BaggageLoadType.BagCount }
     * 
     */
    public BaggageLoadType.BagCount createBaggageLoadTypeBagCount() {
        return new BaggageLoadType.BagCount();
    }

    /**
     * Create an instance of {@link FlightLegIdentifierType.Airline }
     * 
     */
    public FlightLegIdentifierType.Airline createFlightLegIdentifierTypeAirline() {
        return new FlightLegIdentifierType.Airline();
    }

    /**
     * Create an instance of {@link FlightLegIdentifierType.DepartureAirport }
     * 
     */
    public FlightLegIdentifierType.DepartureAirport createFlightLegIdentifierTypeDepartureAirport() {
        return new FlightLegIdentifierType.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightLegIdentifierType.ArrivalAirport }
     * 
     */
    public FlightLegIdentifierType.ArrivalAirport createFlightLegIdentifierTypeArrivalAirport() {
        return new FlightLegIdentifierType.ArrivalAirport();
    }

    /**
     * Create an instance of {@link FlightLegIdentifierType.RepeatNumber }
     * 
     */
    public FlightLegIdentifierType.RepeatNumber createFlightLegIdentifierTypeRepeatNumber() {
        return new FlightLegIdentifierType.RepeatNumber();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.OperationalStatus }
     * 
     */
    public FlightLegType.LegData.OperationalStatus createFlightLegTypeLegDataOperationalStatus() {
        return new FlightLegType.LegData.OperationalStatus();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.PublicStatus }
     * 
     */
    public FlightLegType.LegData.PublicStatus createFlightLegTypeLegDataPublicStatus() {
        return new FlightLegType.LegData.PublicStatus();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.PlannedArrivalAptHistory }
     * 
     */
    public FlightLegType.LegData.PlannedArrivalAptHistory createFlightLegTypeLegDataPlannedArrivalAptHistory() {
        return new FlightLegType.LegData.PlannedArrivalAptHistory();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.SpecialEmphasis }
     * 
     */
    public FlightLegType.LegData.SpecialEmphasis createFlightLegTypeLegDataSpecialEmphasis() {
        return new FlightLegType.LegData.SpecialEmphasis();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.IrregularityDelay }
     * 
     */
    public FlightLegType.LegData.IrregularityDelay createFlightLegTypeLegDataIrregularityDelay() {
        return new FlightLegType.LegData.IrregularityDelay();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.SpecialCargo }
     * 
     */
    public FlightLegType.LegData.SpecialCargo createFlightLegTypeLegDataSpecialCargo() {
        return new FlightLegType.LegData.SpecialCargo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AssociatedFlightLegAircraft }
     * 
     */
    public FlightLegType.LegData.AssociatedFlightLegAircraft createFlightLegTypeLegDataAssociatedFlightLegAircraft() {
        return new FlightLegType.LegData.AssociatedFlightLegAircraft();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.RemarkTextCode }
     * 
     */
    public FlightLegType.LegData.RemarkTextCode createFlightLegTypeLegDataRemarkTextCode() {
        return new FlightLegType.LegData.RemarkTextCode();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.OperationTime }
     * 
     */
    public FlightLegType.LegData.OperationTime createFlightLegTypeLegDataOperationTime() {
        return new FlightLegType.LegData.OperationTime();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.PublicFlightDisplay.AirlineType }
     * 
     */
    public FlightLegType.LegData.PublicFlightDisplay.AirlineType createFlightLegTypeLegDataPublicFlightDisplayAirlineType() {
        return new FlightLegType.LegData.PublicFlightDisplay.AirlineType();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AircraftInfo.CrewInfo }
     * 
     */
    public FlightLegType.LegData.AircraftInfo.CrewInfo createFlightLegTypeLegDataAircraftInfoCrewInfo() {
        return new FlightLegType.LegData.AircraftInfo.CrewInfo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AircraftInfo.AgentInfo }
     * 
     */
    public FlightLegType.LegData.AircraftInfo.AgentInfo createFlightLegTypeLegDataAircraftInfoAgentInfo() {
        return new FlightLegType.LegData.AircraftInfo.AgentInfo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition createFlightLegTypeLegDataAirportResourcesResourceAircraftParkingPosition() {
        return new FlightLegType.LegData.AirportResources.Resource.AircraftParkingPosition();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.PassengerGate }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.PassengerGate createFlightLegTypeLegDataAirportResourcesResourcePassengerGate() {
        return new FlightLegType.LegData.AirportResources.Resource.PassengerGate();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate createFlightLegTypeLegDataAirportResourcesResourceRemoteOperationalGate() {
        return new FlightLegType.LegData.AirportResources.Resource.RemoteOperationalGate();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.PublicTerminal }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.PublicTerminal createFlightLegTypeLegDataAirportResourcesResourcePublicTerminal() {
        return new FlightLegType.LegData.AirportResources.Resource.PublicTerminal();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit createFlightLegTypeLegDataAirportResourcesResourceBaggageClaimUnit() {
        return new FlightLegType.LegData.AirportResources.Resource.BaggageClaimUnit();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt createFlightLegTypeLegDataAirportResourcesResourceBaggageMakeupBelt() {
        return new FlightLegType.LegData.AirportResources.Resource.BaggageMakeupBelt();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AirportResources.Resource.CheckInInfo }
     * 
     */
    public FlightLegType.LegData.AirportResources.Resource.CheckInInfo createFlightLegTypeLegDataAirportResourcesResourceCheckInInfo() {
        return new FlightLegType.LegData.AirportResources.Resource.CheckInInfo();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport }
     * 
     */
    public FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport createFlightLegTypeLegDataAssociatedFlightLegScheduleDepartureAirport() {
        return new FlightLegType.LegData.AssociatedFlightLegSchedule.DepartureAirport();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport }
     * 
     */
    public FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport createFlightLegTypeLegDataAssociatedFlightLegScheduleArrivalAirport() {
        return new FlightLegType.LegData.AssociatedFlightLegSchedule.ArrivalAirport();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CodeShareInfo.Airline }
     * 
     */
    public FlightLegType.LegData.CodeShareInfo.Airline createFlightLegTypeLegDataCodeShareInfoAirline() {
        return new FlightLegType.LegData.CodeShareInfo.Airline();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CabinClass.InflightService }
     * 
     */
    public FlightLegType.LegData.CabinClass.InflightService createFlightLegTypeLegDataCabinClassInflightService() {
        return new FlightLegType.LegData.CabinClass.InflightService();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CabinClass.InflightMealService }
     * 
     */
    public FlightLegType.LegData.CabinClass.InflightMealService createFlightLegTypeLegDataCabinClassInflightMealService() {
        return new FlightLegType.LegData.CabinClass.InflightMealService();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.CabinClass.PaxCount }
     * 
     */
    public FlightLegType.LegData.CabinClass.PaxCount createFlightLegTypeLegDataCabinClassPaxCount() {
        return new FlightLegType.LegData.CabinClass.PaxCount();
    }

    /**
     * Create an instance of {@link FlightLegType.LegData.OwnerAirline.Airline }
     * 
     */
    public FlightLegType.LegData.OwnerAirline.Airline createFlightLegTypeLegDataOwnerAirlineAirline() {
        return new FlightLegType.LegData.OwnerAirline.Airline();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "SpecialAction", scope = FlightLegType.class)
    public JAXBElement<String> createFlightLegTypeSpecialAction(String value) {
        return new JAXBElement<String>(_FlightLegTypeSpecialAction_QNAME, String.class, FlightLegType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "TechnicalStopInd", scope = FlightLegType.LegData.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataTechnicalStopInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataTechnicalStopInd_QNAME, Boolean.class, FlightLegType.LegData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "DepSecurityCheckInd", scope = FlightLegType.LegData.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataDepSecurityCheckInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataDepSecurityCheckInd_QNAME, Boolean.class, FlightLegType.LegData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "ArrSecurityCheckInd", scope = FlightLegType.LegData.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataArrSecurityCheckInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataArrSecurityCheckInd_QNAME, Boolean.class, FlightLegType.LegData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "CrewBusInd", scope = FlightLegType.LegData.AirportResources.Resource.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataAirportResourcesResourceCrewBusInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataAirportResourcesResourceCrewBusInd_QNAME, Boolean.class, FlightLegType.LegData.AirportResources.Resource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "PaxBusInd", scope = FlightLegType.LegData.AirportResources.Resource.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataAirportResourcesResourcePaxBusInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataAirportResourcesResourcePaxBusInd_QNAME, Boolean.class, FlightLegType.LegData.AirportResources.Resource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2007/00", name = "PreClearedGateInd", scope = FlightLegType.LegData.AirportResources.Resource.class)
    public JAXBElement<Boolean> createFlightLegTypeLegDataAirportResourcesResourcePreClearedGateInd(Boolean value) {
        return new JAXBElement<Boolean>(_FlightLegTypeLegDataAirportResourcesResourcePreClearedGateInd_QNAME, Boolean.class, FlightLegType.LegData.AirportResources.Resource.class, value);
    }

}
