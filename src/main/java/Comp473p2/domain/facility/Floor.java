package Comp473p2.domain.facility;

import java.util.Date;
import java.util.List;

/**
 * Floor.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Floor extends Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer level;
    private List< Room > rooms;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Floor( Integer level, Detail detail, List< Room > rooms )
    {
        Integer floorCapacity = 0;
        for ( Room room : rooms )
        {
            floorCapacity += room.getCapacity( );
        }
        this.setCapacity( floorCapacity );
        this.level = level;
        this.rooms = rooms;
        this.setDetail( detail );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    @Override
    public String getFacilityInformation( )
    {
        return "Floor ID: " + this.getFacilityId( ) + ", floor level: " + this.getLevel( ) + ", detail: " + this.getDetail( ).getFacilityInformation( );
    }

    public int getAvailableCapacity( )
    {
        Integer capacity = 0;
        Date date = new Date( );
        for ( Room room : rooms )
        {
            if ( room.isInUseDuringInterval( date, date ) )
            {
                capacity++;
            }
        }
        return capacity;
    }

    public Integer getLevel( )
    {
        return level;
    }

    public void setLevel( Integer level )
    {
        this.level = level;
    }

    public List< Room > getRooms( )
    {
        return rooms;
    }

    public Room getRoom( Integer roomNumber )
    {
        return getRooms( ).get( roomNumber );
    }

    public void setRooms( List< Room > rooms )
    {
        this.rooms = rooms;
    }
}