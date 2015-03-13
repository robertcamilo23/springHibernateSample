package Comp473p2.domain.facility;

import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.maintenance.Maintenance;

import java.util.List;

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
    private List< Detail > details;
    private List< Inspection > inspections;
    private List< Occupancy > occupancies;
    private List< Maintenance > maintenanceLog;

    // ----------------------------
    // Getters & Setters
    // ----------------------------

    public Integer getNumber( )
    {
        return number;
    }

    public void setNumber( Integer number )
    {
        this.number = number;
    }

    public List< Inspection > getInspection( )
    {
        return inspections;
    }

    public void setInspections( List< Inspection > inspections )
    {
        this.inspections = inspections;
    }

    public List< Occupancy > getOccupancies( )
    {
        return occupancies;
    }

    public void setOccupancies( List< Occupancy > occupancies )
    {
        this.occupancies = occupancies;
    }

    public List< Maintenance > getMaintenanceLog( )
    {
        return maintenanceLog;
    }

    public void setMaintenanceLog( List< Maintenance > maintenanceLog )
    {
        this.maintenanceLog = maintenanceLog;
    }

    public List< Detail > getDetails( )
    {
        return details;
    }

    public void setDetails( List< Detail > details )
    {
        this.details = details;
    }
}