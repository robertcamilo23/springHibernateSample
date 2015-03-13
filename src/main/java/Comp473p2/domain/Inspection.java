package Comp473p2.domain;

import Comp473p2.domain.enums.InspectionType;

import java.util.Date;

/**
 * Inspection.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Inspection
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private InspectionType type;
    private Date date;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Inspection()
    {

    }

    public Inspection( InspectionType type, Date date )
    {
        this.type = type;
        this.date = date;
    }

    public Date getDate( )
    {
        return date;
    }

    public void setDate( Date newDate )
    {
        date = newDate;
    }

    public InspectionType getType( )
    {
        return type;
    }

    public void setType( InspectionType newType )
    {
        type = newType;
    }
}