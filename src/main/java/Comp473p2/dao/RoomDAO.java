package Comp473p2.dao;

import Comp473p2.domain.facility.Room;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * RoomDAO.java
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
public class RoomDAO extends SessionManager implements FacilityDAOInterface< Room, Integer >
{
    @Override
    public void persist( Room room )
    {
        getCurrentSession( ).save( room );
    }

    @Override
    public void update( Room room )
    {
        getCurrentSession( ).update( room );
    }

    @Override
    public Room findById( Integer id )
    {
        return ( Room ) getCurrentSession( ).get( Room.class, id );
    }

    @Override
    public void delete( Room room )
    {
        getCurrentSession( ).delete( room );
    }

    @Override
    public List< Room > findAll( )
    {
        return ( List< Room > ) getCurrentSession( ).createQuery( "from Rooms" ).list( );
    }

    @Override
    public void deleteAll( )
    {
        for ( Room room : findAll( ) )
        {
            getCurrentSession( ).delete( room );
        }
    }
}