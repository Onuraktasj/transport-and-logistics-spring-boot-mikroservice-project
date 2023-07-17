package com.onuraktas.vehiclemanager.impl;

import com.onuraktas.vehiclemanager.dto.entity.VehicleDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleRequest;
import com.onuraktas.vehiclemanager.entity.Vehicle;
import com.onuraktas.vehiclemanager.mapper.VehicleMapper;
import com.onuraktas.vehiclemanager.repository.VehicleRepository;
import com.onuraktas.vehiclemanager.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;


    public VehicleServiceImpl(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public VehicleDto createVehicle(CreateVehicleRequest createVehicleRequest) {
        Vehicle vehicle = VehicleMapper.toEntityFromCreateVehicleDto(createVehicleRequest);

        return VehicleMapper.toDto(vehicleRepository.save(vehicle));

    }
}


