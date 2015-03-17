package Comp473p2.dao;

import Comp473p2.domain.Occupancy;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * OccupancyDAO.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class OccupancyDAO extends SessionManager implements FacilityDAOInterface< Occupancy, Integer >
{
    public void persist( Occupancy occupancy )
    {
        getCurrentSession( ).save( occupancy );
    }

    public void update( Occupancy occupancy )
    {
        getCurrentSession( ).update( occupancy );
    }

    public Occupancy findById( Integer id )
    {
        return ( Occupancy ) getCurrentSession( ).get( Occupancy.class, id );
    }

    public void delete( Occupancy occupancy )
    {
        getCurrentSession( ).delete( occupancy );
    }

    public List< Occupancy > findAll( )
    {
        return ( List< Occupancy > ) getCurrentSession( ).createQuery( "from Occupancies" ).list( );
    }

    public void deleteAll( )
    {
        for ( Occupancy occupancy : findAll( ) )
        {
            delete( occupancy );
        }
    }
}
