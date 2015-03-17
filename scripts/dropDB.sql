-- foreign keys
ALTER TABLE Addresses DROP FOREIGN KEY Addresses_Buildings;
ALTER TABLE Floors DROP FOREIGN KEY Floors_Buildings;
ALTER TABLE Inspections DROP FOREIGN KEY Inspections_Rooms;
ALTER TABLE MaintenanceRequests DROP FOREIGN KEY MaintenanceRequests_MaintenanceTickets;
ALTER TABLE MaintenanceRequests DROP FOREIGN KEY MaintenanceRequests_Rooms;
ALTER TABLE Occupancies DROP FOREIGN KEY Occupancies_Rooms;
ALTER TABLE RoomsXDetails DROP FOREIGN KEY RoomsXDetails_Details;
ALTER TABLE RoomsXDetails DROP FOREIGN KEY RoomsXDetails_Rooms;
ALTER TABLE Rooms DROP FOREIGN KEY Rooms_Floors;

-- tables
-- Table Addresses
DROP TABLE Addresses;
-- Table Buildings
DROP TABLE Buildings;
-- Table Details
DROP TABLE Details;
-- Table Floors
DROP TABLE Floors;
-- Table Inspections
DROP TABLE Inspections;
-- Table MaintenanceRequests
DROP TABLE MaintenanceRequests;
-- Table MaintenanceTickets
DROP TABLE MaintenanceTickets;
-- Table Occupancies
DROP TABLE Occupancies;
-- Table Rooms
DROP TABLE Rooms;
-- Table RoomsXDetails
DROP TABLE RoomsXDetails;

-- End of file.