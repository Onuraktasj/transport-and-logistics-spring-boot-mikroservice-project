package com.onuraktas.vehiclemanager.mapper;

import com.onuraktas.vehiclemanager.dto.entity.VehicleDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleRequest;
import com.onuraktas.vehiclemanager.entity.Vehicle;

import java.util.Objects;

public class VehicleMapper {

    public static Vehicle toEntity(VehicleDto vehicleDto){
        if (Objects.isNull(vehicleDto))
            return null;

        return Vehicle.builder()
                .id(vehicleDto.getId())
                .plate(vehicleDto.getPlate())
                .build();
    }

  public static VehicleDto toDto(Vehicle vehicle){
        if (Objects.isNull(vehicle))
            return null;

        return VehicleDto.builder()
                .id(vehicle.getId())
                .plate(vehicle.getPlate())
                .build();
  }

    public static Vehicle toEntityFromCreateVehicleDto(CreateVehicleRequest request){
        if (Objects.isNull(request))
            return null;

        return  Vehicle.builder()
                .plate(request.getPlate())
                .build();
    }
}
