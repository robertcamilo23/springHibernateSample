package Comp473p2.domain.maintenance;

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
    private MaintenanceTicket maintenanceTicket;
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

    public MaintenanceTicket getMaintenanceTicket( )
    {
        return maintenanceTicket;
    }

    public void setMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {
        this.maintenanceTicket = maintenanceTicket;
    }
}