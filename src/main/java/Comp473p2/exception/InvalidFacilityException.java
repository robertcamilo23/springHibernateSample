package Comp473p2.exception;

/**
 * InvalidFacilityException.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class InvalidFacilityException extends Exception
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private String message = null;

    // ----------------------------
    // Constructor
    // ----------------------------

    public InvalidFacilityException( )
    {
        super( );
    }

    public InvalidFacilityException( String message )
    {
        super( message );
        this.message = message;
    }

    public InvalidFacilityException( Throwable cause )
    {
        super( cause );
    }

    // ----------------------------
    // Methods
    // ----------------------------

    @Override
    public String toString( )
    {
        return message;
    }

    @Override
    public String getMessage( )
    {
        return message;
    }
}