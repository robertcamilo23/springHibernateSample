package Comp473p2.service;

import Comp473p2.dao.*;
import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.enums.MaintenanceStatus;
import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Detail;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;
import Comp473p2.domain.interfaces.DetailCRUD;
import Comp473p2.domain.interfaces.FacilityCRUD;
import Comp473p2.domain.maintenance.MaintenanceRequest;
import Comp473p2.domain.maintenance.MaintenanceTicket;

/**
 * FacilityService.java
 *
 * @author:
 *
 * Jessica de la Cruz - jdelacruz2@luc.edu
 * Robert Martinez - rmartinezpaez@luc.edu
 * Raymond Harris - rharris4@luc.edu
 * Loyola University Chicago
 */
public class FacilityService implements FacilityCRUD, DetailCRUD
{

    private BuildingDAO buildingDAO = new BuildingDAO( );
    private FloorDAO floorDAO = new FloorDAO( );
    private RoomDAO roomDAO = new RoomDAO( );
    private InspectionDAO inspectionDAO = new InspectionDAO( );
    private DetailDAO detailDAO = new DetailDAO( );
    private OccupancyDAO occupancyDAO = new OccupancyDAO( );
    private MaintenanceRequestDAO requestDAO = new MaintenanceRequestDAO( );
    private MaintenanceTicketDAO ticketDAO = new MaintenanceTicketDAO( );

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

    /** MaintenanceRequests table */
    public void createMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {
        requestDAO.openCurrentSessionWithTransaction( );
        requestDAO.persist( maintenanceRequest );
        requestDAO.closeCurrentSessionWithTransaction( );
    }

    public MaintenanceRequest readMaintenanceRequest( Integer requestId )
    {
        requestDAO.openCurrentSession( );
        MaintenanceRequest request = requestDAO.findById( requestId );
        requestDAO.closeCurrentSession( );
        return request;
    }

    public void updateMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {
        requestDAO.openCurrentSessionWithTransaction( );
        requestDAO.update( maintenanceRequest );
        requestDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteMaintenanceRequest( MaintenanceRequest maintenanceRequest )
    {
        requestDAO.openCurrentSessionWithTransaction( );
        requestDAO.delete( maintenanceRequest );
        requestDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteMaintenanceRequest( Integer requestId )
    {
        deleteMaintenanceRequest( readMaintenanceRequest( requestId ) );
    }

    public void addMaintenanceRequest( Integer roomId, MaintenanceRequest request )
    {
        roomDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        room.addMaintenanceRequest( request );
        roomDAO.closeCurrentSession( );
        updateRoom( room );
    }

    /** MaintenanceTickets table */
    public void createMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {
        ticketDAO.openCurrentSessionWithTransaction( );
        ticketDAO.persist( maintenanceTicket );
        ticketDAO.closeCurrentSessionWithTransaction( );
    }

    public MaintenanceTicket readMaintenanceTicket( Integer ticketId )
    {
        ticketDAO.openCurrentSession( );
        MaintenanceTicket ticket = ticketDAO.findById( ticketId );
        ticketDAO.closeCurrentSession( );
        return ticket;
    }

    public void updateMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {
        ticketDAO.openCurrentSessionWithTransaction( );
        ticketDAO.update( maintenanceTicket );
        ticketDAO.closeCurrentSessionWithTransaction( );
    }

    public void updateMaintenanceTicketStatus( MaintenanceStatus status, Integer ticketId )
    {
        ticketDAO.openCurrentSessionWithTransaction();
        MaintenanceTicket ticket = ticketDAO.findById( ticketId );
        ticket.setStatus( status );
        ticketDAO.closeCurrentSessionWithTransaction();
    }

    public void deleteMaintenanceTicket( MaintenanceTicket maintenanceTicket )
    {
        ticketDAO.openCurrentSessionWithTransaction( );
        ticketDAO.delete( maintenanceTicket );
        ticketDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteMaintenanceTicket( Integer ticketId )
    {
        deleteMaintenanceTicket( readMaintenanceTicket( ticketId ) );
    }

    public void addMaintenanceTicket( Integer requestId, MaintenanceTicket ticket )
    {
        requestDAO.openCurrentSession( );
        MaintenanceRequest request = requestDAO.findById( requestId );
        request.setMaintenanceTicket( ticket );
        ticket.setStatus( MaintenanceStatus.OPENED );
        roomDAO.closeCurrentSession( );
        updateMaintenanceRequest( request );
    }

    /** Occupancies table */
    public void createOccupancy( Occupancy occupancy )
    {
        occupancyDAO.openCurrentSessionWithTransaction( );
        occupancyDAO.persist( occupancy );
        occupancyDAO.closeCurrentSessionWithTransaction( );
    }

    public Occupancy readOccupancy( Integer occupancyId )
    {
        occupancyDAO.openCurrentSession( );
        Occupancy occupancy = occupancyDAO.findById( occupancyId );
        occupancyDAO.closeCurrentSession( );
        return occupancy;
    }

    public void updateOccupancy( Occupancy occupancy )
    {
        occupancyDAO.openCurrentSessionWithTransaction( );
        occupancyDAO.update( occupancy );
        occupancyDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteOccupancy( Occupancy occupancy )
    {
        occupancyDAO.openCurrentSessionWithTransaction( );
        occupancyDAO.delete( occupancy );
        occupancyDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteOccupancy( Integer occupancyId )
    {
        deleteOccupancy( readOccupancy( occupancyId ) );
    }


    public void addRoomOccupancy( Integer roomId, Occupancy occupancy )
    {
        roomDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        room.addOccupancy( occupancy );
        roomDAO.closeCurrentSession( );
        updateRoom( room );
    }

    public void removeRoomOccupancy( Integer roomId, Integer occupancyId )
    {
        roomDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        room.removeOccupancy( readOccupancy( occupancyId ) );
        roomDAO.closeCurrentSession( );
        updateRoom( room );
    }

    /** Inspections table */
    public void createInspection( Inspection inspection )
    {
        inspectionDAO.openCurrentSessionWithTransaction( );
        inspectionDAO.update( inspection );
        inspectionDAO.closeCurrentSessionWithTransaction( );
    }

    public Inspection readInspection( Integer inspectionId )
    {
        inspectionDAO.openCurrentSession( );
        Inspection inspection = inspectionDAO.findById( inspectionId );
        inspectionDAO.closeCurrentSession( );
        return inspection;
    }

    public void updateInspection( Inspection inspection )
    {
        inspectionDAO.openCurrentSessionWithTransaction( );
        inspectionDAO.update( inspection );
        inspectionDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteInspection( Inspection inspection )
    {
        inspectionDAO.openCurrentSessionWithTransaction( );
        inspectionDAO.update( inspection );
        inspectionDAO.closeCurrentSessionWithTransaction( );
    }

    public void deleteInspection( Integer inspectionId )
    {
        deleteInspection( readInspection( inspectionId ) );
    }

    /** Details table */
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

    public void removeRoomDetail( Integer roomId, Integer detailId )
    {
        roomDAO.openCurrentSession( );
        detailDAO.openCurrentSession( );
        Room room = roomDAO.findById( roomId );
        Detail detail = detailDAO.findById( detailId );
        room.removeDetail( detail );
        roomDAO.closeCurrentSession( );
        detailDAO.closeCurrentSession( );
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