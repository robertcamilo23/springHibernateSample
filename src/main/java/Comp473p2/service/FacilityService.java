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

	public void createBuilding( Building building )
	{
		buildingDAO.openCurrentSessionWithTransaction( );
		buildingDAO.persist( building );
		buildingDAO.closeCurrentSessionWithTransaction( );
	}

	public Building readBuilding( Integer buildingId )
	{
		buildingDAO.openCurrentSession( );
		Building building = buildingDAO.findById( buildingId );
		buildingDAO.closeCurrentSession( );
		return building;
	}

	public void updateBuilding( Building building )
	{
		buildingDAO.openCurrentSessionWithTransaction( );
		buildingDAO.update( building );
		buildingDAO.closeCurrentSessionWithTransaction( );
	}

	public void deleteBuilding( Building building )
	{
		buildingDAO.openCurrentSessionWithTransaction( );
		buildingDAO.delete( building );
		buildingDAO.closeCurrentSessionWithTransaction( );
	}

	public void deleteBuilding( Integer buildingId )
	{
		deleteBuilding( readBuilding( buildingId ) );
	}

	public void createFloor( Floor floor )
	{

	}

	public void readFloor( Integer floorId )
	{

	}

	public void updateFloor( Floor floor )
	{

	}

	public void deleteFloor( Floor floor )
	{

	}

	public void createRoom( Room room )
	{

	}

	public void readRoom( Integer roomId )
	{

	}

	public void updateRoom( Room room )
	{

	}

	public void deleteRoom( Room room )
	{

	}
}