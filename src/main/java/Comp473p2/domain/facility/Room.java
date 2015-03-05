package Comp473p2.domain.facility;

/**
 * Room.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Room extends Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer number;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Room( Integer number, Integer capacity, Detail detail )
    {
        this.setCapacity( capacity );
        this.setNumber( number );
        this.setDetail( detail );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    @Override
    public String getFacilityInformation( )
    {
        return "Room ID: " + getFacilityId( ) + ", room number: " + getNumber( ) + ", detail: " + getDetail( ).getFacilityInformation( );
    }

    public Integer getNumber( )
    {
        return number;
    }

    public void setNumber( Integer number )
    {
        this.number = number;
    }
}