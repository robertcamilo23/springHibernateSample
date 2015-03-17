-- tables
-- Table Addresses
CREATE TABLE Addresses (
    Buildings_id int    NOT NULL  AUTO_INCREMENT,
    address_line_1 varchar(100)    NOT NULL ,
    address_line_2 varchar(100)    NOT NULL ,
    city varchar(50)    NOT NULL ,
    state varchar(50)    NOT NULL ,
    zip int    NOT NULL ,
    phone_number varchar(25)    NOT NULL ,
    CONSTRAINT Addresses_pk PRIMARY KEY (Buildings_id)
);

-- Table Buildings
CREATE TABLE Buildings (
    id int    NOT NULL  AUTO_INCREMENT,
    capacity int    NOT NULL ,
    name varchar(50)    NOT NULL ,
    description text    NOT NULL ,
    UNIQUE INDEX Buildings_ak_name (name),
    CONSTRAINT Buildings_pk PRIMARY KEY (id)
);

-- Table Details
CREATE TABLE Details (
    id int    NOT NULL  AUTO_INCREMENT,
    detail varchar(100)    NOT NULL ,
    UNIQUE INDEX Details_ak_1 (detail),
    CONSTRAINT Details_pk PRIMARY KEY (id)
);

-- Table Floors
CREATE TABLE Floors (
    id int    NOT NULL  AUTO_INCREMENT,
    capacity int    NOT NULL ,
    description text    NOT NULL ,
    level int    NOT NULL ,
    Buildings_id int    NOT NULL ,
    idx int    NOT NULL ,
    CONSTRAINT Floors_pk PRIMARY KEY (id)
);

-- Table Inspections
CREATE TABLE Inspections (
    id int    NOT NULL  AUTO_INCREMENT,
    date date    NOT NULL ,
    type enum('FIRE', 'ELEVATOR', 'ELECTRICAL')    NOT NULL ,
    Rooms_id int    NOT NULL ,
    idx int    NOT NULL ,
    CONSTRAINT Inspections_pk PRIMARY KEY (id)
);

-- Table MaintenanceRequests
CREATE TABLE MaintenanceRequests (
    requestId int    NOT NULL  AUTO_INCREMENT,
    description text    NOT NULL ,
    status enum('OPENED', 'ASSIGNED', 'COMPLETE')    NOT NULL ,
    ticketId int    NOT NULL ,
    Rooms_id int    NOT NULL ,
    idx int    NOT NULL ,
    CONSTRAINT MaintenanceRequests_pk PRIMARY KEY (requestId)
);

-- Table MaintenanceTickets
CREATE TABLE MaintenanceTickets (
    ticketId int    NOT NULL  AUTO_INCREMENT,
    hourlyCost double(5,2)    NOT NULL ,
    hoursBilled double(5,2)    NOT NULL ,
    status enum('OPENED', 'ASSIGNED', 'COMPLETE')    NOT NULL ,
    CONSTRAINT MaintenanceTickets_pk PRIMARY KEY (ticketId)
);

-- Table Occupancies
CREATE TABLE Occupancies (
    id int    NOT NULL  AUTO_INCREMENT,
    start_date timestamp    NOT NULL ,
    end_date timestamp    NOT NULL ,
    description varchar(250)    NOT NULL ,
    total_capacity int    NOT NULL ,
    Rooms_id int    NOT NULL ,
    idx int    NOT NULL ,
    CONSTRAINT Occupancies_pk PRIMARY KEY (id)
);

-- Table Rooms
CREATE TABLE Rooms (
    id int    NOT NULL  AUTO_INCREMENT,
    capacity int    NOT NULL ,
    description text    NOT NULL ,
    number int    NOT NULL ,
    Floors_id int    NOT NULL ,
    idx int    NOT NULL ,
    CONSTRAINT Rooms_pk PRIMARY KEY (id)
);

-- Table RoomsXDetails
CREATE TABLE RoomsXDetails (
    Rooms_id int    NOT NULL ,
    Details_id int    NOT NULL ,
    CONSTRAINT RoomsXDetails_pk PRIMARY KEY (Rooms_id,Details_id)
);

-- foreign keys
-- Reference:  Addresses_Buildings (table: Addresses)


ALTER TABLE Addresses ADD CONSTRAINT Addresses_Buildings FOREIGN KEY Addresses_Buildings (Buildings_id)
    REFERENCES Buildings (id);
-- Reference:  Floors_Buildings (table: Floors)


ALTER TABLE Floors ADD CONSTRAINT Floors_Buildings FOREIGN KEY Floors_Buildings (Buildings_id)
    REFERENCES Buildings (id);
-- Reference:  Inspections_Rooms (table: Inspections)


ALTER TABLE Inspections ADD CONSTRAINT Inspections_Rooms FOREIGN KEY Inspections_Rooms (Rooms_id)
    REFERENCES Rooms (id);
-- Reference:  MaintenanceRequests_MaintenanceTickets (table: MaintenanceRequests)


ALTER TABLE MaintenanceRequests ADD CONSTRAINT MaintenanceRequests_MaintenanceTickets FOREIGN KEY MaintenanceRequests_MaintenanceTickets (ticketId)
    REFERENCES MaintenanceTickets (ticketId);
-- Reference:  MaintenanceRequests_Rooms (table: MaintenanceRequests)


ALTER TABLE MaintenanceRequests ADD CONSTRAINT MaintenanceRequests_Rooms FOREIGN KEY MaintenanceRequests_Rooms (Rooms_id)
    REFERENCES Rooms (id);
-- Reference:  Occupancies_Rooms (table: Occupancies)


ALTER TABLE Occupancies ADD CONSTRAINT Occupancies_Rooms FOREIGN KEY Occupancies_Rooms (Rooms_id)
    REFERENCES Rooms (id);
-- Reference:  RoomsXDetails_Details (table: RoomsXDetails)


ALTER TABLE RoomsXDetails ADD CONSTRAINT RoomsXDetails_Details FOREIGN KEY RoomsXDetails_Details (Details_id)
    REFERENCES Details (id);
-- Reference:  RoomsXDetails_Rooms (table: RoomsXDetails)


ALTER TABLE RoomsXDetails ADD CONSTRAINT RoomsXDetails_Rooms FOREIGN KEY RoomsXDetails_Rooms (Rooms_id)
    REFERENCES Rooms (id);
-- Reference:  Rooms_Floors (table: Rooms)


ALTER TABLE Rooms ADD CONSTRAINT Rooms_Floors FOREIGN KEY Rooms_Floors (Floors_id)
    REFERENCES Floors (id);

-- End of file.