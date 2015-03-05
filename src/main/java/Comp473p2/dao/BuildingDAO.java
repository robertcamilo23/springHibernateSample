package Comp473p2.dao;

import Comp473p2.domain.facility.Building;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * BuildingDAO.java
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
public class BuildingDAO extends SessionManager implements FacilityDAOInterface< Building, Integer >
{
    @Override
    public void persist( Building building )
    {
        getCurrentSession( ).save( building );
    }

    @Override
    public void update( Building building )
    {
        getCurrentSession( ).update( building );
    }

    @Override
    public Building findById( Integer id )
    {
        return ( Building ) getCurrentSession( ).get( Building.class, id );
    }

    @Override
    public void delete( Building building )
    {
        getCurrentSession( ).delete( building );
    }

    @Override
    public List< Building > findAll( )
    {
        return ( List< Building > ) getCurrentSession( ).createQuery( "from Buildings" ).list( );
    }

    @Override
    public void deleteAll( )
    {
        for ( Building building : findAll( ) )
        {
            delete( building );
        }
    }
}