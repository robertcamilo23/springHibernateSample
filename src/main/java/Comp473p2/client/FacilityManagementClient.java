package Comp473p2.client;

import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Facility;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;
import Comp473p2.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by robert on 3/5/15.
 */
public class FacilityManagementClient
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext( "META-INF/app-context.xml" );
        FacilityService facilityService = ( FacilityService ) context.getBean( "facilityService" );
        facilityService.createBuilding( getBuildingSample( context ) );
    }

    private static Building getBuildingSample( ApplicationContext context )
    {

        Room[] rooms1 = { createRoom( context, 101, 25 ), createRoom( context, 102, 26 ), createRoom( context, 103, 26 ) };
        Room[] rooms2 = { createRoom( context, 201, 30 ), createRoom( context, 202, 15 ), createRoom( context, 203, 26 ) };
        Room[] rooms3 = { createRoom( context, 301, 50 ), createRoom( context, 302, 16 ), createRoom( context, 304, 26 ) };
        Room[] rooms4 = { createRoom( context, 401, 22 ), createRoom( context, 402, 61 ), createRoom( context, 404, 26 ) };
        Room[] rooms5 = { createRoom( context, 501, 18 ), createRoom( context, 502, 10 ), createRoom( context, 504, 26 ) };

        Facility floor1, floor2, floor3, floor4, floor5;
        floor1 = createFloor( context, 1, Arrays.asList( rooms1 ) );
        floor2 = createFloor( context, 2, Arrays.asList( rooms2 ) );
        floor3 = createFloor( context, 3, Arrays.asList( rooms3 ) );
        floor4 = createFloor( context, 4, Arrays.asList( rooms4 ) );
        floor5 = createFloor( context, 5, Arrays.asList( rooms5 ) );

        List< Floor > floors = new ArrayList< Floor >( );
        floors.add( ( Floor ) floor1 );
        floors.add( ( Floor ) floor2 );
        floors.add( ( Floor ) floor3 );
        floors.add( ( Floor ) floor4 );
        floors.add( ( Floor ) floor5 );

        return createBuilding( context, "Corboy        Law    center   ", "25   E.    Pearson  St. ", floors );
    }

    public static Room createRoom( ApplicationContext context, Integer number, Integer capacity )
    {
        Room room = ( Room ) context.getBean( "room" );
        room.setNumber( number );
        room.setCapacity( capacity );
        return room;
    }

    public static Floor createFloor( ApplicationContext context, Integer level, List< Room > rooms )
    {
        Floor floor = ( Floor ) context.getBean( "floor" );
        Integer capacity = 0;
        for ( Room room : rooms )
        {
            capacity += room.getCapacity( );
        }
        floor.setCapacity( capacity );
        floor.setLevel( level );
        floor.setRooms( rooms );
        return floor;
    }

    public static Building createBuilding( ApplicationContext context, String name, String address, List< Floor > floors )
    {
        Building building = ( Building ) context.getBean( "building" );
        Integer capacity = 0;
        for ( Floor floor : floors )
        {
            capacity += floor.getCapacity( );
        }
        building.setCapacity( capacity );
        building.setFloors( floors );
        building.setName( name.toUpperCase( ).trim( ).replaceAll( " +", " " ) );
        building.setAddress( address.toUpperCase( ).trim( ).replaceAll( " +", " " ) );
        return building;
    }
}