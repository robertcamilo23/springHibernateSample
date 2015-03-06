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
    // Getters & Setters
    // ----------------------------

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

    public void setFloors( List< Floor > floors )
    {
        this.floors = floors;
    }
}