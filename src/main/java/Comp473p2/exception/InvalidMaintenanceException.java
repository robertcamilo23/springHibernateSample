package Comp473p2.exception;

/**
 * InvalidMaintenanceException.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class InvalidMaintenanceException extends Exception
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private String message = null;

    // ----------------------------
    // Constructor
    // ----------------------------

    public InvalidMaintenanceException( )
    {
        super( );
    }

    public InvalidMaintenanceException( String message )
    {
        super( message );
        this.message = message;
    }

    public InvalidMaintenanceException( Throwable cause )
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