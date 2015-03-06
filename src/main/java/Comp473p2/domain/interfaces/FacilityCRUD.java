package Comp473p2.domain.interfaces;

import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;

/**
 * Created by robert on 3/5/15.
 */
public interface FacilityCRUD
{
    public void createBuilding( Building building );

    public Building readBuilding( Integer buildingId );

    public void updateBuilding( Building building );

    public void deleteBuilding( Building building );
    
    public void deleteBuilding( Integer buildingId );
    
    public void createFloor( Floor floor );

    public void readFloor( Integer floorId );

    public void updateFloor( Floor floor );

    public void deleteFloor( Floor floor );

    public void createRoom( Room room );

    public void readRoom( Integer roomId );

    public void updateRoom( Room room );

    public void deleteRoom( Room room );
}