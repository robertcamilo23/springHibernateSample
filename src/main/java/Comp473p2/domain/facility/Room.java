package Comp473p2.domain.facility;

import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.maintenance.MaintenanceRequest;

import java.util.List;
import java.util.Set;

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
    private Set< Detail > details;
    private List< Inspection > inspections;
    private List< Occupancy > occupancies;
    private List< MaintenanceRequest > maintenanceRequests;

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

    public List< Inspection > getInspections( )
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

    public List< MaintenanceRequest > getMaintenanceRequests( )
    {
        return maintenanceRequests;
    }

    public void setMaintenanceRequests( List< MaintenanceRequest > maintenanceRequests )
    {
        this.maintenanceRequests = maintenanceRequests;
    }

    public void addMaintenanceRequest( MaintenanceRequest request )
    {
        this.maintenanceRequests.add( request );
    }

    public Set< Detail > getDetails( )
    {
        return details;
    }

    public void setDetails( Set< Detail > details )
    {
        this.details = details;
    }

    public void addDetail( Detail detail )
    {
        this.details.add( detail );
    }

    public void removeDetail( Detail detail )
    {
        this.details.remove( detail );
    }
    
    public void addOccupancy( Occupancy occupancy )
    {
        this.occupancies.add( occupancy );
    }

    public void removeOccupancy( Occupancy occupancy )
    {
        this.occupancies.remove( occupancy );
    }

}