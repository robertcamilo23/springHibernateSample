package Comp473p2.domain.facility;

/**
 * Address.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class Address
{
    private Integer addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private Integer zip;
    private String phoneNumber;

    public Address( )
    {
    }

    public Integer getAddressId( )
    {
        return addressId;
    }

    public void setAddressId( Integer addressId )
    {
        this.addressId = addressId;
    }

    public String getAddressLine1( )
    {
        return addressLine1;
    }

    public void setAddressLine1( String addressLine1 )
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2( )
    {
        return addressLine2;
    }

    public void setAddressLine2( String addressLine2 )
    {
        this.addressLine2 = addressLine2;
    }

    public String getCity( )
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }

    public String getState( )
    {
        return state;
    }

    public void setState( String state )
    {
        this.state = state;
    }

    public Integer getZip( )
    {
        return zip;
    }

    public void setZip( Integer zip )
    {
        this.zip = zip;
    }

    public String getPhoneNumber( )
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }
}