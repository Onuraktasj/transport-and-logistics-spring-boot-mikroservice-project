package com.onuraktas.vehiclemanager.impl;

import com.onuraktas.vehiclemanager.dto.entity.VehicleModelDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleModelRequest;
import com.onuraktas.vehiclemanager.entity.VehicleModel;
import com.onuraktas.vehiclemanager.mapper.VehicleModelMapper;
import com.onuraktas.vehiclemanager.repository.VehicleModelRepository;
import com.onuraktas.vehiclemanager.service.VehicleModelService;
import org.springframework.stereotype.Service;

@Service
public class VehicleModelServiceImpl implements VehicleModelService {

    private final VehicleModelRepository vehicleModelRepository;

    public VehicleModelServiceImpl(VehicleModelRepository vehicleModelRepository){
        this.vehicleModelRepository = vehicleModelRepository;
    }

    @Override
    public VehicleModelDto createVehicleModel(CreateVehicleModelRequest request) {

        VehicleModel vehicleModel = VehicleModelMapper.toEntityFromCreateVehicleModeDto(request);

        return VehicleModelMapper.toDto(vehicleModelRepository.save(vehicleModel));
    }
}
