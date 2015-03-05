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
    private MaintenanceTicket fulfilledBy;

    // ----------------------------
    // Constructor
    // ----------------------------

    public MaintenanceRequest( int facilityId )
    {
        super( facilityId );
        fulfilledBy = null;
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public Integer getRequestId( )
    {
        return requestId;
    }

    public String getDescription( )
    {
        return description;
    }

    public void setRequestId( Integer requestId )
    {
        this.requestId = requestId;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }
}