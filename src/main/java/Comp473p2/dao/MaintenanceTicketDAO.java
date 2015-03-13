package Comp473p2.dao;

import Comp473p2.domain.interfaces.FacilityDAOInterface;
import Comp473p2.domain.maintenance.MaintenanceTicket;

import java.util.List;

/**
 * Created by Jessica on 3/13/2015.
 */
public class MaintenanceTicketDAO extends SessionManager implements FacilityDAOInterface< MaintenanceTicket, Integer >
{

    public void persist( MaintenanceTicket maintenanceTicket )
    {
        getCurrentSession( ).save( maintenanceTicket );
    }

    public void update( MaintenanceTicket maintenanceTicket )
    {
        getCurrentSession( ).update( maintenanceTicket );
    }

    public MaintenanceTicket findById( Integer id )
    {
        return ( MaintenanceTicket ) getCurrentSession( ).get( MaintenanceTicket.class, id );
    }

    public void delete( MaintenanceTicket maintenanceTicket )
    {
        getCurrentSession( ).delete( maintenanceTicket );
    }

    public List< MaintenanceTicket > findAll( )
    {
        return ( List< MaintenanceTicket > ) getCurrentSession( ).createQuery( "from MaintenanceTickets" ).list( );
    }

    public void deleteAll( )
    {
        for ( MaintenanceTicket maintenanceTicket : findAll( ) )
        {
            delete( maintenanceTicket );
        }
    }
}

