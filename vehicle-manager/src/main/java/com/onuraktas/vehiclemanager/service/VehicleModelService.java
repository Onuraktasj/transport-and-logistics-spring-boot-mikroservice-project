package com.onuraktas.vehiclemanager.service;


import com.onuraktas.vehiclemanager.dto.entity.VehicleModelDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleModelRequest;

public interface VehicleModelService {

    VehicleModelDto createVehicleModel(CreateVehicleModelRequest request);
}
