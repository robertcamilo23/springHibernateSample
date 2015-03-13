package Comp473p2.domain.maintenance;

import Comp473p2.domain.enums.MaintenanceStatus;

/**
 * Maintenance.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public abstract class Maintenance
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer facilityId;
    private MaintenanceStatus status;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Maintenance( )
    {

    }

    public Maintenance( Integer facilityId )
    {
        this.facilityId = facilityId;
        status = MaintenanceStatus.OPENED;
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public MaintenanceStatus getStatus( )
    {
        return status;
    }

    public Integer getFacilityId( )
    {
        return facilityId;
    }

    public void setStatus( MaintenanceStatus currentStatus )
    {
        status = currentStatus;
    }

    public void setFacilityId( Integer facilityId )
    {
        this.facilityId = facilityId;
    }
}