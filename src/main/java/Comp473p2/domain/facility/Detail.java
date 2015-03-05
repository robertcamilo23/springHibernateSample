package Comp473p2.domain.facility;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
    private List< String > details;

    public Detail( )
    {
        details = new ArrayList< String >( );
    }

    public Detail( String detail )
    {
        details = new ArrayList< String >( );
        details.add( detail );
    }

    public void addFacilityDetail( String detail )
    {
        String timestamp = new SimpleDateFormat( "yyyyMMdd_HHmmss" ).format( Calendar.getInstance( ).getTime( ) );
        details.add( timestamp + " " + detail );
    }

    public String getFacilityInformation( )
    {
        String facilityInformation = "";
        for ( String detail : details )
        {
            facilityInformation += detail + "\n";
        }
        return facilityInformation;
    }
}