create table if not exists vehicle
(
    id               uuid primary key default gen_random_uuid(),
    plate            varchar(16),
    model_id         uuid,
    is_active        boolean default true
);

comment on table vehicle is 'Stores vehicle information';
comment on column vehicle.id is 'Unique identifier for the vehicle. Type is uuid';
comment on column vehicle.model_id is 'Unique identifier for the vehicle model. Type is uuid. Foreign key to vehicle_model.id';
comment on column vehicle.is_active is 'Indicates whether the vehicle is active or not. Type is boolean and default is true';

create table if not exists vehicle_model
(
    id               uuid primary key default gen_random_uuid(),
    model_name       varchar(255),
    type_id          uuid,
    manufacturer_id  uuid,
    release_year     integer,
    fuel_type        uuid,
    transmission     uuid,
    engine_power     integer,
    is_active        boolean default true
);

create table if not exists vehicle_type
(
    id                  uuid primary key default gen_random_uuid(),
    type                varchar(32),
    description         text,
    is_active boolean   default true
);

create table if not exists vehicle_manufecturer
(
    id               uuid primary key default gen_random_uuid(),
    name             varchar(255),
    country          varchar(32),
    is_active        boolean default true
);

create table if not exists vehicle_fuel_type
(
    id               uuid primary key default gen_random_uuid(),
    fuel_type        varchar(32),
    is_active        boolean default true
);

create table if not exists vehicle_transmission
(
    id               uuid primary key default gen_random_uuid(),
    tranmission_type varchar(32),
    is_active        boolean default true
);