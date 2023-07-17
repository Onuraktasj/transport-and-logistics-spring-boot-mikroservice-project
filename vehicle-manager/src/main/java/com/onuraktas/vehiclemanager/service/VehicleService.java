package com.onuraktas.vehiclemanager.service;

import com.onuraktas.vehiclemanager.dto.entity.VehicleDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleRequest;

public interface VehicleService {

    VehicleDto createVehicle(CreateVehicleRequest createVehicleRequest);

}
