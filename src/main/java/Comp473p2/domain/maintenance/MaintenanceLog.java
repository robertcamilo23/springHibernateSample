package Comp473p2.domain.maintenance;

import java.util.LinkedList;
import java.util.List;

/**
 * MaintenanceLog.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class MaintenanceLog
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private int facilityId;
    private List< Maintenance > log;

    // ----------------------------
    // Constructor
    // ----------------------------

    public MaintenanceLog( int facilityId )
    {
        this.facilityId = facilityId;
        log = new LinkedList< Maintenance >( );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public List< Maintenance > getMaintenanceRequests( )
    {
        return log;
    }
}