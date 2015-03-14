package Comp473p2.domain;

import java.util.Date;

/**
 * Occupancy.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Occupancy
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer occupancyId;
    private Integer totalCapacity;
    private Date startDate;
    private Date endDate;
    private String usage;

    // ----------------------------
    // Getters & Setters
    // ----------------------------

    public Integer getOccupancyId( )
    {
        return occupancyId;
    }

    public void setOccupancyId( Integer occupancyId )
    {
        this.occupancyId = occupancyId;
    }

    public Integer getTotalCapacity( )
    {
        return totalCapacity;
    }

    public void setTotalCapacity( Integer totalCapacity )
    {
        this.totalCapacity = totalCapacity;
    }

    public Date getStartDate( )
    {
        return startDate;
    }

    public void setStartDate( Date startDate )
    {
        this.startDate = startDate;
    }

    public Date getEndDate( )
    {
        return endDate;
    }

    public void setEndDate( Date endDate )
    {
        this.endDate = endDate;
    }

    public String getUsage( )
    {
        return usage;
    }

    public void setUsage( String usage )
    {
        this.usage = usage;
    }
}