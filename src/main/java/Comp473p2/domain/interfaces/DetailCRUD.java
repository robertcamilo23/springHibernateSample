package Comp473p2.domain.interfaces;

import Comp473p2.domain.facility.Detail;

/**
 * DetailCRUD.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public interface DetailCRUD
{
    public void createDetail( Detail detail );

    public Detail readDetail( Integer detailId );

    public void updateDetail( Detail detail );

    public void deleteDetail( Detail detail );

    public void deleteDetail( Integer detailId );
}