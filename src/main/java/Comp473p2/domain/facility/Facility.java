package Comp473p2.domain.facility;

import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.maintenance.Maintenance;
import Comp473p2.domain.maintenance.MaintenanceRequest;
import Comp473p2.domain.maintenance.MaintenanceTicket;
import Comp473p2.exception.InvalidOccupancyException;

import java.util.ArrayList;
import java.util.Date;
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
    private Detail detail;
    private List< Maintenance > maintenanceLog;
    private List< Occupancy > occupancies;
    private List< Inspection > inspections;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Facility( )
    {
        this.setCapacity( 0 );
        this.setMaintenanceLog( new ArrayList< Maintenance >( ) );
        this.setOccupancies( new ArrayList< Occupancy >( ) );
        this.setInspections( new ArrayList< Inspection >( ) );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    public abstract String getFacilityInformation( );

    public void addFacilityDetail( Detail detail )
    {
        this.setDetail( detail );
    }

    public void makeFacilityMaintenanceRequest( String request )
    {
        MaintenanceRequest maintenanceRequest = new MaintenanceRequest( this.getFacilityId( ) );
        maintenanceRequest.setDescription( request );
        getMaintenanceLog( ).add( maintenanceRequest );
    }

    public void makeFacilityMaintenanceTicket( MaintenanceRequest request, Double cost, Double hours )
    {
        MaintenanceTicket maintenanceTicket = new MaintenanceTicket( this.getFacilityId( ), request );
        maintenanceTicket.setCost( cost );
        maintenanceTicket.setHoursBilled( hours );
        getMaintenanceLog( ).add( maintenanceTicket );
    }

    public Boolean isInUseDuringInterval( Date start, Date finish )
    {
        for ( Occupancy o : occupancies )
        {
            if ( o.getStartDate( ).before( start ) && o.getEndDate( ).after( start ) )
            {
                return true;
            }
            else if ( o.getStartDate( ).before( finish ) )
            {
                return true;
            }
        }
        return false;
    }

    public void assignFacilityToUse( Date start, Date finish, String usage )
    {
        occupancies.add( new Occupancy( start, finish, this.getCapacity( ), usage ) );
    }

    public void vacateFacility( Occupancy occupancy )
    {
        occupancies.remove( occupancy );
    }

    public List< Inspection > listInspections( )
    {
        return inspections;
    }

    public String listActualUsage( )
    {
        for ( Occupancy occupancy : occupancies )
        {
            if ( occupancy.getStartDate( ).before( new Date( ) ) && occupancy.getEndDate( ).after( new Date( ) ) )
            {
                return occupancy.getUsage( );
            }
        }
        return "The facility is not in use";
    }

    public Double calcUsageRate( Date start, Date finish )
    {
        // Finding occupancies between start and finish
        List< Occupancy > beforeStart = new ArrayList< Occupancy >( );
        List< Occupancy > beforeFinish = new ArrayList< Occupancy >( );
        for ( Occupancy o : occupancies )
        {
            if ( o.getStartDate( ).before( start ) && o.getEndDate( ).after( start ) )
            {
                beforeStart.add( o );
            }
            else if ( o.getStartDate( ).before( finish ) && o.getEndDate( ).after( start ) )
            {
                beforeFinish.add( o );
            }
        }
        Long totalTimeOccupied = 0L;
        for ( Occupancy o : beforeStart )
        {
            totalTimeOccupied += o.getEndDate( ).getTime( ) - start.getTime( );
        }
        for ( Occupancy o : beforeFinish )
        {
            if ( finish.before( o.getEndDate( ) ) )
            {
                totalTimeOccupied += finish.getTime( ) - o.getStartDate( ).getTime( );
            }
            else
            {
                totalTimeOccupied += o.getEndDate( ).getTime( ) - o.getStartDate( ).getTime( );
            }
        }
        Long totalTimeStartFinish = finish.getTime( ) - start.getTime( );
        return totalTimeOccupied.doubleValue( ) / totalTimeStartFinish;
    }

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

    public Detail getDetail( )
    {
        return detail;
    }

    public void setDetail( Detail detail )
    {
        this.detail = detail;
    }

    public List< Occupancy > getOccupancies( )
    {
        return occupancies;
    }

    public void setOccupancies( List< Occupancy > occupancies )
    {
        this.occupancies = occupancies;
    }

    public void addOccupancy( Occupancy occupancy )
    {
        if ( occupancy.getTotalCapacity( ) <= getCapacity( ) )
        {
            occupancies.add( occupancy );
        }
        else
        {
            try
            {
                throw new InvalidOccupancyException( "Occupancy size exceeds capacity" );
            }
            catch ( InvalidOccupancyException e )
            {
                e.printStackTrace( );
            }
        }
    }

    public void setInspections( List< Inspection > inspections )
    {
        this.inspections = inspections;
    }

    public Integer getCapacity( )
    {
        return capacity;
    }

    public void setCapacity( Integer capacity )
    {
        this.capacity = capacity;
    }

    public List< Maintenance > getMaintenanceLog( )
    {
        return maintenanceLog;
    }

    public void setMaintenanceLog( List< Maintenance > maintenanceLog )
    {
        this.maintenanceLog = maintenanceLog;
    }
}