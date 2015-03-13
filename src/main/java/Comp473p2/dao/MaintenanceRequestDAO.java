package Comp473p2.dao;

import Comp473p2.domain.interfaces.FacilityDAOInterface;
import Comp473p2.domain.maintenance.MaintenanceRequest;

import java.util.List;

/**
 * Created by Jessica on 3/13/2015.
 */
public class MaintenanceRequestDAO extends SessionManager implements FacilityDAOInterface< MaintenanceRequest, Integer >
{

    public void persist( MaintenanceRequest maintenanceRequest )
    {
        getCurrentSession( ).save( maintenanceRequest );
    }

    public void update( MaintenanceRequest maintenanceRequest )
    {
        getCurrentSession( ).update( maintenanceRequest );
    }

    public MaintenanceRequest findById( Integer id )
    {
        return ( MaintenanceRequest ) getCurrentSession( ).get( MaintenanceRequest.class, id );
    }

    public void delete( MaintenanceRequest maintenanceRequest )
    {
        getCurrentSession( ).delete( maintenanceRequest );
    }

    public List< MaintenanceRequest > findAll( )
    {
        return ( List< MaintenanceRequest > ) getCurrentSession( ).createQuery( "from MaintenanceRequests" ).list( );
    }

    public void deleteAll( )
    {
        for ( MaintenanceRequest maintenanceRequest : findAll( ) )
        {
            delete( maintenanceRequest );
        }
    }
}
