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
    release_year     integer,
    transmission     uuid,
    engine_power     integer,
    brand            varchar(255)
);

comment on table vehicle_model is 'Stores vehicle model information';
comment on column vehicle_model.id is 'Unique identifier for the vehicle model. Type is uuid';
comment on column vehicle_model.model_name is 'Model Name of the vehicle model. Type is varchar(255)';
comment on column vehicle_model.type_id is 'Type Id of the vehicle model. Type is uuid';
comment on column vehicle_model.release_year is 'Release Year of the vehicle model. Type is integer';
comment on column vehicle_model.transmission is 'Transmission of the vehicle model. Type is uuid';
comment on column vehicle_model.engine_power is 'Engine Power of the vehicle model. Type is integer';
comment on column vehicle_model.brand is 'Brand of the vehicle model. Type is varchar(255)';








