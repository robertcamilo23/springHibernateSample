package Comp473p2.exception;

/**
 * InvalidOccupancyException.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class InvalidOccupancyException extends Exception
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private String message = null;

    // ----------------------------
    // Constructor
    // ----------------------------

    public InvalidOccupancyException( )
    {
        super( );
    }

    public InvalidOccupancyException( String message )
    {
        super( message );
        this.message = message;
    }

    public InvalidOccupancyException( Throwable cause )
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