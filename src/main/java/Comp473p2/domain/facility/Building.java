package Comp473p2.domain.facility;

import java.util.List;

/**
 * Building.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Building extends Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private String name;
    private String address;
    private List< Floor > floors;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Building( String name, Detail detail, List< Floor > floors, String address )
    {
        Integer buildingCapacity = 0;
        for ( Floor floor : floors )
        {
            buildingCapacity += floor.getCapacity( );
        }
        this.setCapacity( buildingCapacity );
        this.setName( name );
        this.setAddress( address );
        this.setDetail( detail );
        this.setFloors( floors );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    @Override
    public String getFacilityInformation( )
    {
        return "Building ID: " + this.getFacilityId( ) + ", room info: " + this.getName( ) + ", " + this.getAddress( ) + ", detail: " + this.getDetail( ).getFacilityInformation( );
    }

    public String getAvailableCapacity( )
    {
        Integer availableCapacity = 0;
        for ( Floor floor : floors )
        {
            availableCapacity = floor.getAvailableCapacity( );
        }
        return String.format( "%d rooms available", availableCapacity );
    }

    public String getName( )
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getAddress( )
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public List< Floor > getFloors( )
    {
        return floors;
    }

    public Floor getFloor( Integer floorLevel )
    {
        return getFloors( ).get( floorLevel );
    }

    public void setFloors( List< Floor > floors )
    {
        this.floors = floors;
    }
}