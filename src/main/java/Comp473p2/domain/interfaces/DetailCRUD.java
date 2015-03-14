package Comp473p2.domain.interfaces;

import Comp473p2.domain.facility.Detail;

/**
 * Created by robert on 3/13/15.
 */
public interface DetailCRUD
{
    public void createDetail( Detail detail );

    public Detail readDetail( Integer detailId );

    public void updateDetail( Detail detail );

    public void deleteDetail( Detail detail );

    public void deleteDetail( Integer detailId );
}