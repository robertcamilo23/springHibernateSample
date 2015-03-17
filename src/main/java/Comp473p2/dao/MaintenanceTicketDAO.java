package Comp473p2.dao;

import Comp473p2.domain.interfaces.FacilityDAOInterface;
import Comp473p2.domain.maintenance.MaintenanceTicket;

import java.util.List;

/**
 * MaintenanceTicketDAO.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
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

