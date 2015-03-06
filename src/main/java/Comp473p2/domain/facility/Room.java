package Comp473p2.domain.facility;

/**
 * Room.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Room extends Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer number;

    // ----------------------------
    // Getters & Setters
    // ----------------------------

    public Integer getNumber( )
    {
        return number;
    }

    public void setNumber( Integer number )
    {
        this.number = number;
    }
}