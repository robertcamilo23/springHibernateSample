package Comp473p2.domain.maintenance;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * MaintenanceTicket.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class MaintenanceTicket extends Maintenance
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer ticketId;
    private MaintenanceRequest fulfills;
    private Double cost;
    private Double hoursBilled;
    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance( Locale.ENGLISH );

    // ----------------------------
    // Constructor
    // ----------------------------

    public MaintenanceTicket()
    {

    }

    public MaintenanceTicket( int facilityId, MaintenanceRequest maintenanceRequest )
    {
        super( facilityId );
        ticketId = maintenanceRequest.getRequestId( );
        fulfills = maintenanceRequest;
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public String ticketTotalCost( )
    {
        return currencyFormat.format( cost * hoursBilled );
    }

    public Double totalCostDouble( )
    {
        return cost * hoursBilled;
    }

    public void setTicketId( Integer ticketId )
    {
        this.ticketId = ticketId;
    }

    public void setCost( Double cost )
    {
        this.cost = cost;
    }

    public void setHoursBilled( Double hoursBilled )
    {
        this.hoursBilled = hoursBilled;
    }

    public void setMaintenanceRequest( MaintenanceRequest fulfills )
    {
        this.fulfills = fulfills;
    }

    public Integer getTicketId( )
    {
        return ticketId;
    }

    public Double getCost( )
    {
        return cost;
    }

    public Double getHoursBilled( )
    {
        return hoursBilled;
    }

    public MaintenanceRequest getMaintenanceRequest( )
    {
        return fulfills;
    }
}