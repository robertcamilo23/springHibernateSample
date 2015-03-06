package Comp473p2.domain.facility;

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
    // Getters & Setters
    // ----------------------------

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

    public void setRooms( List< Room > rooms )
    {
        this.rooms = rooms;
    }
}