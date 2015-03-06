package Comp473p2.domain.facility;

import Comp473p2.domain.Occupancy;

import java.util.List;

/**
 * Facility.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public abstract class Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer facilityId;
    private Integer capacity;
    //    private Detail detail;
    //    private List< Maintenance > maintenanceLog;
    private List< Occupancy > occupancies;
    //    private List< Inspection > inspections;

    // ----------------------------
    // Getters & Setters
    // ----------------------------

    public Integer getFacilityId( )
    {
        return facilityId;
    }

    public void setFacilityId( Integer facilityId )
    {
        this.facilityId = facilityId;
    }

    public Integer getCapacity( )
    {
        return capacity;
    }

    public void setCapacity( Integer capacity )
    {
        this.capacity = capacity;
    }

    public List< Occupancy > getOccupancies( )
    {
        return occupancies;
    }

    public void setOccupancies( List< Occupancy > occupancies )
    {
        this.occupancies = occupancies;
    }
}