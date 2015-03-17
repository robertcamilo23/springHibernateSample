package Comp473p2.domain.facility;

import java.util.Set;

/**
 * Detail.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Detail
{

    private Integer detailID;
    private String detail;
    private Set< Room > rooms;

    public Detail( )
    {
    }

    public Integer getDetailID( )
    {
        return detailID;
    }

    public void setDetailID( Integer detailID )
    {
        this.detailID = detailID;
    }

    public String getDetail( )
    {
        return detail;
    }

    public void setDetail( String detail )
    {
        this.detail = detail;
    }

    public Set< Room > getRooms( )
    {
        return rooms;
    }

    public void setRooms( Set< Room > rooms )
    {
        this.rooms = rooms;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( !( obj instanceof Detail ) )
        {
            return false;
        }
        return this.getDetailID( ).equals( ( ( Detail ) obj ).getDetailID( ) );
    }
}