package Comp473p2.dao;

import Comp473p2.domain.Occupancy;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * Created by Jessica on 3/14/2015.
 */
public class OccupancyDAO extends SessionManager implements FacilityDAOInterface< Occupancy, Integer > {
    public void persist( Occupancy occupancy )
    {
        getCurrentSession( ).save( occupancy );
    }

    public void update( Occupancy occupancy  )
    {
        getCurrentSession( ).update( occupancy );
    }

    public Occupancy findById( Integer id )
    {
        return ( Occupancy ) getCurrentSession( ).get( Occupancy.class, id );
    }

    public void delete( Occupancy occupancy  )
    {
        getCurrentSession( ).delete( occupancy   );
    }

    public List< Occupancy > findAll( )
    {
        return ( List< Occupancy > ) getCurrentSession( ).createQuery( "from Occupancies" ).list( );
    }

    public void deleteAll( )
    {
        for ( Occupancy occupancy  : findAll( ) )
        {
            delete( occupancy   );
        }
    }
}
