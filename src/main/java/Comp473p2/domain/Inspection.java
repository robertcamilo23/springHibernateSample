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

    private Integer inspectionId;
    private InspectionType type;
    private Date date;

    // ----------------------------
    // Constructor
    // ----------------------------

    public Inspection( )
    {
    }

    public Inspection( InspectionType type, Date date, Integer id )
    {
        this.type = type;
        this.date = date;
        this.inspectionId = id;
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

    public Integer getInspectionId( )
    {
        return inspectionId;
    }

    public void setInspectionId( Integer newInspectionID )
    {
        inspectionId = newInspectionID;
    }
}