package Comp473p2.domain.maintenance;

import java.util.List;

/**
 * MaintenanceRequest.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class MaintenanceRequest extends Maintenance
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer requestId;
    private String description;
    // private MaintenanceTicket fulfilledBy;
    private List<MaintenanceTicket> maintenanceTickets;
    // ----------------------------
    // Constructor
    // ----------------------------

    public MaintenanceRequest( )
    {

    }

    public MaintenanceRequest( int facilityId )
    {
        super( facilityId );
        //fulfilledBy = null;
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public Integer getRequestId( )
    {
        return requestId;
    }

    public void setRequestId( Integer requestId )
    {
        this.requestId = requestId;
    }

    public String getDescription( )
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public List<MaintenanceTicket> getMaintenanceTickets() { return maintenanceTickets; }

    public void setMaintenanceTickets(List<MaintenanceTicket> maintenanceTickets) { this.maintenanceTickets = maintenanceTickets; }
}