package Comp473p2.client;

import Comp473p2.domain.Occupancy;
import Comp473p2.domain.Inspection;
import Comp473p2.domain.enums.InspectionType;
import Comp473p2.domain.facility.*;
import Comp473p2.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by robert on 3/5/15.
 */
public class FacilityManagementClient
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext( "META-INF/app-context.xml" );
//        addRoomDetail( context, 5, 1 );
        addBuilding( context );
    }

    private static void addRoomDetail( ApplicationContext context, Integer detailId, Integer roomId )
    {
        FacilityService facilityService = ( FacilityService ) context.getBean( "facilityService" );
        Detail detail = facilityService.readDetail( detailId );
        facilityService.addRoomDetail( roomId, detail );
    }

    private static void addBuilding( ApplicationContext context )
    {
        FacilityService facilityService = ( FacilityService ) context.getBean( "facilityService" );
        facilityService.createBuilding( getBuildingSample( context ) );
    }

    private static Detail getDetailSample( ApplicationContext context )
    {
        Detail detail = ( Detail ) context.getBean( "detail" );
        return detail;
    }

    private static Building getBuildingSample( ApplicationContext context )
    {

        Room[] rooms1 = { createRoom( context, 101, 25, "Room 101 description" ), createRoom( context, 102, 26, "Room 102 description" ), createRoom( context, 103, 26, "Room 103 description" ) };
        Room[] rooms2 = { createRoom( context, 201, 30, "Room 201 description" ), createRoom( context, 202, 15, "Room 202 description" ), createRoom( context, 203, 26, "Room 203 description" ) };
        Room[] rooms3 = { createRoom( context, 301, 50, "Room 301 description" ), createRoom( context, 302, 16, "Room 302 description" ), createRoom( context, 304, 26, "Room 303 description" ) };
        rooms3[0].setOccupancies(getOccupanciesSample(context));
        rooms3[0].setInspections(getInspections(context));
        Room[] rooms4 = { createRoom( context, 401, 22, "Room 401 description" ), createRoom( context, 402, 61, "Room 402 description" ), createRoom( context, 404, 26, "Room 403 description" ) };
        Room[] rooms5 = { createRoom( context, 501, 18, "Room 501 description" ), createRoom( context, 502, 10, "Room 502 description" ), createRoom( context, 504, 26, "Room 503 description" ) };

        Facility floor1, floor2, floor3, floor4, floor5;
        floor1 = createFloor( context, 1, "Floor 1 description", Arrays.asList( rooms1 ) );
        floor2 = createFloor( context, 2, "Floor 2 description", Arrays.asList( rooms2 ) );
        floor3 = createFloor( context, 3, "Floor 3 description", Arrays.asList( rooms3 ) );
        floor4 = createFloor( context, 4, "Floor 4 description", Arrays.asList( rooms4 ) );
        floor5 = createFloor( context, 5, "Floor 5 description", Arrays.asList( rooms5 ) );

        List< Floor > floors = new ArrayList< Floor >( );
        floors.add( ( Floor ) floor1 );
        floors.add( ( Floor ) floor2 );
        floors.add( ( Floor ) floor3 );
        floors.add( ( Floor ) floor4 );
        floors.add( ( Floor ) floor5 );

        //return createBuilding( context, "Building description", "Corboy        Law    center   ", "25   E.    Pearson  St. ", "", "Chicago",
        //                       "IL", 60611, "7734456945", floors );
        return createBuilding( context, "Building description", "Lewis Towers  ", "55   E.    Pearson  St. ", "", "Chicago",
                               "IL", 60611, "7734456945", floors );
    }

    private static List<Inspection> getInspections(ApplicationContext context) {
        List<Inspection> inspections = new ArrayList<Inspection>();
        inspections.add(createInspection(context, InspectionType.ELECTRICAL, "2015-03-15"));
        inspections.add(createInspection(context, InspectionType.ELEVATOR, "2015-03-05"));
        inspections.add(createInspection(context, InspectionType.FIRE, "2015-02-15"));
        return inspections;
    }

    public static Inspection createInspection( ApplicationContext context, InspectionType type, String dateReceived ) {
        Inspection inspection = ( Inspection ) context.getBean( "inspection" );
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        try {
            date = format.parse(dateReceived);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        inspection.setDate(date);
        inspection.setType(type);
        return inspection;
    }

    public static Room createRoom( ApplicationContext context, Integer number, Integer capacity, String description )
    {
        Room room = ( Room ) context.getBean( "room" );
        room.setNumber( number );
        room.setCapacity( capacity );
        room.setDescription( description );
        return room;
    }

    public static Floor createFloor( ApplicationContext context, Integer level, String description, List< Room > rooms )
    {
        Floor floor = ( Floor ) context.getBean( "floor" );
        Integer capacity = 0;
        for ( Room room : rooms )
        {
            capacity += room.getCapacity( );
        }
        floor.setDescription( description );
        floor.setCapacity( capacity );
        floor.setLevel(level);
        floor.setRooms(rooms);
        return floor;
    }

    public static Building createBuilding( ApplicationContext context, String description, String name,
                                           String addressLine1, String addressLine2, String city, String state,
                                           Integer zip, String phoneNumber, List< Floor > floors )
    {
        Address address = ( Address ) context.getBean( "address" );
        address.setAddressLine1( upperCaseTrimmedWhitesSpaces( addressLine1 ) );
        address.setAddressLine2( upperCaseTrimmedWhitesSpaces( addressLine2 ) );
        address.setCity( upperCaseTrimmedWhitesSpaces( city ) );
        address.setState( upperCaseTrimmedWhitesSpaces( state ) );
        address.setZip( zip );
        address.setPhoneNumber( phoneNumber );

        Building building = ( Building ) context.getBean( "building" );
        Integer capacity = 0;
        for ( Floor floor : floors )
        {
            capacity += floor.getCapacity( );
        }
        building.setCapacity( capacity );
        building.setFloors(floors);
        building.setName( upperCaseTrimmedWhitesSpaces( name ) );
        building.setAddress(address );
        building.setDescription( description );
        return building;
    }

    public static Occupancy createOccupancy( ApplicationContext context, Integer totalCapacity, String startDate,
                                             String endDate, String usage )
    {
        Occupancy occupancy = ( Occupancy ) context.getBean( "occupancy" );
        occupancy.setTotalCapacity( totalCapacity );

        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd" );
        Date date = new Date();
        try { date = format.parse(startDate); } catch (ParseException e) {
            e.printStackTrace(); }
        occupancy.setStartDate(date);

        try
        {
            date = format.parse( startDate );
        }
        catch ( ParseException e )
        {
            e.printStackTrace( );
        }
        occupancy.setStartDate( date );

        try
        {
            date = format.parse( endDate );
        }
        catch ( ParseException e )
        {
            e.printStackTrace( );
        }
        occupancy.setEndDate( date );

        occupancy.setUsage(usage);
        return occupancy;
    }

    private static List< Occupancy > getOccupanciesSample( ApplicationContext context )
    {
        Occupancy occupancy1 = createOccupancy( context, 50, "2014-12-31", "2015-01-01", "New year's party" );
        Occupancy occupancy2 = createOccupancy( context, 25, "2015-03-17", "2015-03-17", "St Patricks day party" );
        Occupancy occupancy3 = createOccupancy( context, 10, "2015-02-14", "2015-02-17", "Valentines party" );

        List< Occupancy > occupancies = new ArrayList< Occupancy >( );
        occupancies.add( occupancy1 );
        occupancies.add( occupancy2 );
        occupancies.add( occupancy3 );

        return occupancies;
    }

    public static String upperCaseTrimmedWhitesSpaces( String s )
    {
        return s.toUpperCase( ).trim( ).replaceAll( " +", " " );
    }
}