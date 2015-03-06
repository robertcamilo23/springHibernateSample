package Comp473p2.service;

import Comp473p2.dao.BuildingDAO;
import Comp473p2.dao.FloorDAO;
import Comp473p2.dao.RoomDAO;
import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;
import Comp473p2.domain.interfaces.FacilityCRUD;

/**
 * Created by robert on 3/5/15.
 */
public class FacilityService implements FacilityCRUD
{

    private BuildingDAO buildingDAO = new BuildingDAO( );
    private FloorDAO floorDAO = new FloorDAO( );
    private RoomDAO roomDAO = new RoomDAO( );

    @Override
    public void createBuilding( Building building )
    {
        buildingDAO.openCurrentSessionWithTransaction( );
        buildingDAO.persist( building );
        buildingDAO.closeCurrentSessionWithTransaction( );
    }

    @Override
    public Building readBuilding( Integer buildingId )
    {
        buildingDAO.openCurrentSession( );
        Building building = buildingDAO.findById( buildingId );
        buildingDAO.closeCurrentSession( );
        return building;
    }

    @Override
    public void updateBuilding( Building building )
    {
        buildingDAO.openCurrentSessionWithTransaction( );
        buildingDAO.update( building );
        buildingDAO.closeCurrentSessionWithTransaction( );
    }

    @Override
    public void deleteBuilding( Building building )
    {
        buildingDAO.openCurrentSessionWithTransaction( );
        buildingDAO.delete( building );
        buildingDAO.closeCurrentSessionWithTransaction( );
    }

    @Override
    public void deleteBuilding( Integer buildingId )
    {
        deleteBuilding( readBuilding( buildingId ) );
    }

    @Override
    public void createFloor( Floor floor )
    {

    }

    @Override
    public void readFloor( Integer floorId )
    {

    }

    @Override
    public void updateFloor( Floor floor )
    {

    }

    @Override
    public void deleteFloor( Floor floor )
    {

    }

    @Override
    public void createRoom( Room room )
    {

    }

    @Override
    public void readRoom( Integer roomId )
    {

    }

    @Override
    public void updateRoom( Room room )
    {

    }

    @Override
    public void deleteRoom( Room room )
    {

    }
}