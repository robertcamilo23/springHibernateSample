package Comp473p2.dao;

import Comp473p2.domain.facility.Detail;
import Comp473p2.domain.interfaces.FacilityDAOInterface;

import java.util.List;

/**
 * Created by robert on 3/13/15.
 */
public class DetailDAO extends SessionManager implements FacilityDAOInterface< Detail, Integer >
{
    @Override
    public void persist( Detail detail )
    {
        getCurrentSession( ).save( detail );
    }

    @Override
    public void update( Detail detail )
    {
        getCurrentSession( ).update( detail );
    }

    @Override
    public Detail findById( Integer id )
    {
        return ( Detail ) getCurrentSession( ).get( Detail.class, id );
    }

    @Override
    public void delete( Detail detail )
    {
        getCurrentSession( ).delete( detail );
    }

    @Override
    public List< Detail > findAll( )
    {
        return ( List< Detail > ) getCurrentSession( ).createQuery( " from Details " ).list( );
    }

    @Override
    public void deleteAll( )
    {
        for ( Detail detail : findAll( ) )
        {
            delete( detail );
        }
    }
}