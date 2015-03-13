package Comp473p2.dao;

import Comp473p2.domain.Inspection;
import Comp473p2.domain.interfaces.FacilityDAOInterface;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Jessica on 3/13/2015.
 */
public class InspectionDAO extends SessionManager implements FacilityDAOInterface<Inspection, Integer > {

    public void persist( Inspection inspection )
    {
        getCurrentSession( ).save( inspection  );
    }

    public void update( Inspection inspection )
    {
        getCurrentSession( ).update( inspection  );
    }

    public Inspection findById( Integer id )
    {
        return ( Inspection ) getCurrentSession( ).get( Inspection.class, id );
    }

    public void delete( Inspection inspection )
    {
        getCurrentSession( ).delete( inspection  );
    }

    public List< Inspection> findAll( )
    {
        return ( List< Inspection> ) getCurrentSession( ).createQuery( "from Inspections" ).list( );
    }

    public void deleteAll( )
    {
        for ( Inspection inspection : findAll( ) )
        {
            delete( inspection );
        }
    }
}
