package Comp473p2.domain.interfaces;

import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;

/**
 * Created by robert on 3/5/15.
 */
public interface FacilityCRUD
{
    /** Buildings table */
    public void createBuilding( Building building );

    public Building readBuilding( Integer buildingId );

    public void updateBuilding( Building building );

    public void deleteBuilding( Building building );
    
    public void deleteBuilding( Integer buildingId );

    /** Floors table */
    public void createFloor( Floor floor );

    public Floor readFloor( Integer floorId );

    public void updateFloor( Floor floor );

    public void deleteFloor( Floor floor );

    public void deleteFloor( Integer floorId );


    /** Rooms table */
    public void createRoom( Room room );

    public Room readRoom( Integer roomId );

    public void updateRoom( Room room );

    public void deleteRoom( Room room );

    public void deleteRoom( Integer roomId );
}