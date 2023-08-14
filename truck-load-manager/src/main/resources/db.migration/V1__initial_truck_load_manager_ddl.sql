create table if not exists truck_load
(
    id              uuid primary key default gen_random_uuid(),
    title           varchar(255),
    user_id         uuid,
    vehicle_id      uuid,
    description     varchar(255),
    start_location  varchar(255),
    finish_location varchar(255)
);
comment on table truck_load is 'Stores truck load information';
comment on column truck_load.id is 'Unique identifier for the truck load. Type is uuid';
comment on column truck_load.title is 'Title of the truck load. Type is varchar(255)';
comment on column truck_load.user_id is 'Unique identifier for the application user. Type is uuid. Foreign key to application_user.id';
comment on column truck_load.vehicle_id is 'Unique identifier for the vehicle. Type is uuid. Foreign key to vehicle.id';
comment on column truck_load.description is 'Description of the truck load. Type is varchar(255)';
comment on column truck_load.start_location is 'Start Location of the truck load. Type is varchar(255)';
comment on column truck_load.finish_location is 'Finish Location of the truck load. Type is varchar(255)';


create table if not exists load_type
(
    id             uuid primary key  default  gen_random_uuid(),
    weight         decimal,
    height         decimal,
    load_length    decimal,
    width          decimal,
    description    varchar(255),
    enum_load_type varchar(255)
);

comment on table load_type is 'Stores load type information';
comment on column load_type.id is 'Unique identifier for the load type. Type is uuid';
comment on column load_type.weight is 'Weight of the load type. Type is decimal';
comment on column load_type.height is 'Height of the load type. Type is decimal';
comment on column load_type.load_length is 'Load length of the load type. Type is decimal';
comment on column load_type.width is 'Width of the load type. Type is decimal';
comment on column load_type.description is 'Description of the load type. Type is varchar(255)';
comment on column load_type.enum_load_type is 'Load type of the load type. Type is varchar(255)';
