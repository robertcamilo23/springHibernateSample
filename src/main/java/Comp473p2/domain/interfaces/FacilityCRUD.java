package Comp473p2.domain.interfaces;

import Comp473p2.domain.Inspection;
import Comp473p2.domain.Occupancy;
import Comp473p2.domain.facility.Building;
import Comp473p2.domain.facility.Floor;
import Comp473p2.domain.facility.Room;
import Comp473p2.domain.maintenance.MaintenanceRequest;
import Comp473p2.domain.maintenance.MaintenanceTicket;

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

    /** Maintenance Request table */
    public void createMaintenanceRequest( MaintenanceRequest maintenanceRequest );

    public void readMaintenanceRequest( Integer requestId );

    public void updateMaintenanceRequest( MaintenanceRequest maintenanceRequest );

    public void deleteMaintenanceRequest( MaintenanceRequest maintenanceRequest );

    public void deleteMaintenanceRequest( Integer requestId );

    /** Maintenance Ticket table */
    public void createMaintenanceTicket( MaintenanceTicket maintenanceTicket );

    public void readMaintenanceTicket( Integer requestId );

    public void updateMaintenanceTicket( MaintenanceTicket maintenanceTicket );

    public void deleteMaintenanceTicket( MaintenanceTicket maintenanceTicket );

    public void deleteMaintenanceTicket( Integer requestId );

    /** Occupancy table */
    public void createOccupancy( Occupancy occupancy );

    public Occupancy readOccupancy( Integer occupancyId );

    public void updateOccupancy( Occupancy occupancy );

    public void deleteOccupancy( Occupancy occupancy );

    public void deleteOccupancy( Integer occupancyId );

    /** Inspection table */
    public void createInspection( Inspection inspection );

    public Inspection readInspection( Integer inspectionId );

    public void updateInspection( Inspection inspection );

    public void deleteInspection( Inspection inspection );

    public void deleteInspection( Integer inspectionId );
}