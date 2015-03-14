package Comp473p2.service;

import Comp473p2.dao.BuildingDAO;
import Comp473p2.dao.DetailDAO;
import Comp473p2.dao.FloorDAO;
import Comp473p2.dao.RoomDAO;
import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Detail;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;
import Comp473p2.domain.interfaces.DetailCRUD;
import Comp473p2.domain.interfaces.FacilityCRUD;
import Comp473p2.domain.maintenance.MaintenanceRequest;
import Comp473p2.domain.maintenance.MaintenanceTicket;

/**
 * Created by robert on 3/5/15.
 */
public class FacilityService implements FacilityCRUD, DetailCRUD
{

    private BuildingDAO buildingDAO = new BuildingDAO( );
    private FloorDAO floorDAO = new FloorDAO( );
    private RoomDAO roomDAO = new RoomDAO( );
    private DetailDAO detailDAO = new DetailDAO( );

    /** Buildings */
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

    /** Floors */
    public void createFloor( Floor floor )
    {
        floorDAO.openCurrentSessionWithTransaction( );
        floorDAO.persist( floor );
        floorDAO.closeCurrentSessionWithTransaction( );
    }

    public Floor readFloor( Integer floorId )
    {
        floorDAO.openCurrentSession( );
        Floor floor = floorDAO.findById( floorId );
        floorDAO.closeCurrentSession( );
        return floor;
    }

    public void updateFloor( Floor floor )
    {
        floorDAO.openCurrentSessionWithTransaction( );
        floorDAO.update( floor );
        floorDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteFloor( Floor floor )
    {
        floorDAO.openCurrentSessionWithTransaction( );
        floorDAO.delete( floor );
        floorDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteFloor( Integer floorId )
    {
        deleteFloor( readFloor( floorId ) );
    }

    /** Rooms */
    public void createRoom( Room room )
    {
        roomDAO.openCurrentSessionWithTransaction( );
        roomDAO.persist( room );
        roomDAO.closeCurrentSessionWithTransaction( );
    }

    public Room readRoom( Integer roomId )
    {
        roomDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        roomDAO.closeCurrentSession( );
        return room;
    }

    public void updateRoom( Room room )
    {
        roomDAO.openCurrentSessionWithTransaction( );
        roomDAO.update( room );
        roomDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteRoom( Room room )
    {
        roomDAO.openCurrentSessionWithTransaction( );
        roomDAO.delete( room );
        roomDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteRoom( Integer roomId )
    {
        deleteRoom( readRoom( roomId ) );
    }

    /** Maintenance Request table */
    public void createMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {

    }

    public void readMaintenanceRequest( Integer requestId )
    {

    }

    public void updateMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {

    }

    public void deleteMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {

    }

    public void deleteMaintenanceRequest( Integer requestId )
    {

    }

    /** Maintenance Ticket table */
    public void createMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {

    }

    public void readMaintenanceTicket( Integer requestId )
    {

    }

    public void updateMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {

    }

    public void deleteMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {

    }

    public void deleteMaintenanceTicket( Integer requestId )
    {

    }

    /** Occupancy table */
    public void createOccupancy( Occupancy occupancy )
    {

    }

    public void readOccupancy( Integer occupancyId )
    {

    }

    public void updateOccupancy( Occupancy occupancy )
    {

    }

    public void deleteOccupancy( Occupancy occupancy )
    {

    }

    public void deleteOccupancy( Integer occupancyId )
    {

    }

    /** Inspection table */
    public void createInspection( Inspection inspection )
    {

    }

    public void readInspection( Integer inspectionId )
    {

    }

    public void updateInspection( Inspection inspection )
    {

    }

    public void deleteInspection( Inspection inspection )
    {

    }

    public void deleteInspection( Integer inspectionId )
    {

    }

    public void createDetail( Detail detail )
    {
        detailDAO.openCurrentSessionWithTransaction( );
        detailDAO.persist( detail );
        detailDAO.closeCurrentSessionWithTransaction( );
    }

    public void addRoomDetail( Integer roomId, Detail detail )
    {
        roomDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        room.addDetail( detail );
        roomDAO.closeCurrentSession( );
        updateRoom( room );
    }

    public Detail readDetail( Integer detailId )
    {
        detailDAO.openCurrentSession( );
        Detail detail = detailDAO.findById( detailId );
        detailDAO.closeCurrentSession( );
        return detail;
    }

    public void updateDetail( Detail detail )
    {
        detailDAO.openCurrentSessionWithTransaction( );
        detailDAO.update( detail );
        detailDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteDetail( Detail detail )
    {
        detailDAO.openCurrentSessionWithTransaction( );
        detailDAO.delete( detail );
        detailDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteDetail( Integer detailId )
    {
        deleteDetail( readDetail( detailId ) );
    }
}