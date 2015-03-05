package Comp473p2.domain.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 * FacilityDAOInterface.java
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
public interface FacilityDAOInterface< T, Id extends Serializable >
{
    public void persist( T entity );

    public void update( T entity );

    public T findById( Id id );

    public void delete( T entity );

    public List< T > findAll( );

    public void deleteAll( );
}