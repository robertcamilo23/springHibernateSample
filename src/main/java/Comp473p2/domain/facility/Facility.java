package Comp473p2.domain.facility;

/**
 * Facility.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public abstract class Facility
{
    // ----------------------------
    // Attributes
    // ----------------------------

    private Integer facilityId;
    private Integer capacity;
    private String description;

    // ----------------------------
    // Getters & Setters
    // ----------------------------

    public Integer getFacilityId( )
    {
        return facilityId;
    }

    public void setFacilityId( Integer facilityId )
    {
        this.facilityId = facilityId;
    }

    public Integer getCapacity( )
    {
        return capacity;
    }

    public void setCapacity( Integer capacity )
    {
        this.capacity = capacity;
    }

    public String getDescription( )
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }
}