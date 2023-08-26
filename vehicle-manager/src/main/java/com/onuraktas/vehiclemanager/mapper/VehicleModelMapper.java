package com.onuraktas.vehiclemanager.mapper;

import com.onuraktas.vehiclemanager.dto.entity.VehicleModelDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleModelRequest;
import com.onuraktas.vehiclemanager.entity.VehicleModel;

import java.util.Objects;

public class VehicleModelMapper {

    public static VehicleModel toEntity(VehicleModelDto vehicleModelDto){
        if (Objects.isNull(vehicleModelDto))
            return null;
        return VehicleModel.builder()
                .id(vehicleModelDto.getId())
                .modelName(vehicleModelDto.getModelName())
                .releaseYear(vehicleModelDto.getReleaseYear())
                .transmission(vehicleModelDto.getTransmission())
                .axle(vehicleModelDto.getAxle())
                .enginePower(vehicleModelDto.getEnginePower())
                .brand(vehicleModelDto.getBrand())
                .build();
    }

    public static VehicleModelDto toDto(VehicleModel vehicleModel){
        if (Objects.isNull(vehicleModel))
            return null;
        return VehicleModelDto.builder()
                .id(vehicleModel.getId())
                .modelName(vehicleModel.getModelName())
                .releaseYear(vehicleModel.getReleaseYear())
                .transmission(vehicleModel.getTransmission())
                .axle(vehicleModel.getAxle())
                .enginePower(vehicleModel.getEnginePower())
                .brand(vehicleModel.getBrand())
                .build();
    }

    public static VehicleModel toEntityFromCreateVehicleModeDto(CreateVehicleModelRequest request){
        if (Objects.isNull(request))
            return null;
        return VehicleModel.builder()
                .modelName(request.getModelName())
                .releaseYear(request.getReleaseYear())
                .transmission(request.getTransmission())
                .axle(request.getAxle())
                .enginePower(request.getEnginePower())
                .brand(request.getBrand())
                .build();
    }
}
