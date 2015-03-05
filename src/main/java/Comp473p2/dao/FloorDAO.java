package Comp473p2.dao;

import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * FloorDAO.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 *
 * Based on the example:
 * http://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */
public class FloorDAO extends SessionManager implements FacilityDAOInterface< Floor, Integer >
{
    @Override
    public void persist( Floor floor )
    {
        getCurrentSession( ).save( floor );
    }

    @Override
    public void update( Floor floor )
    {
        getCurrentSession( ).update( floor );
    }

    @Override
    public Floor findById( Integer id )
    {
        return ( Floor ) getCurrentSession( ).get( Floor.class, id );
    }

    @Override
    public void delete( Floor floor )
    {
        getCurrentSession( ).delete( floor );
    }

    @Override
    public List< Floor > findAll( )
    {
        return ( List< Floor > ) getCurrentSession( ).createQuery( "from Floors" ).list( );
    }

    @Override
    public void deleteAll( )
    {
        for ( Floor floor : findAll( ) )
        {
            delete( floor );
        }
    }
}