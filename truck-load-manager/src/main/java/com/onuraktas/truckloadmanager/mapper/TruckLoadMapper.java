package com.onuraktas.truckloadmanager.mapper;

import com.onuraktas.truckloadmanager.dto.entity.TruckLoadDto;
import com.onuraktas.truckloadmanager.dto.request.CreateTruckLoadRequest;
import com.onuraktas.truckloadmanager.entity.TruckLoad;

import java.util.Objects;

public class TruckLoadMapper {

    public static TruckLoad toEntity(TruckLoadDto truckLoadDto){
        if (Objects.isNull(truckLoadDto))
            return null;
        return TruckLoad.builder()
                .id(truckLoadDto.getId())
                .title(truckLoadDto.getTitle())
                .userId(truckLoadDto.getUserId())
                .vehicleId(truckLoadDto.getVehicleId())
                .description(truckLoadDto.getDescription())
                .startLocation(truckLoadDto.getStartLocation())
                .finishLocation(truckLoadDto.getFinishLocation())
                .build();
    }

    public static TruckLoadDto toDto(TruckLoad truckLoad){
        if (Objects.isNull(truckLoad))
            return null;

        return TruckLoadDto.builder()
                .id(truckLoad.getId())
                .title(truckLoad.getTitle())
                .userId(truckLoad.getUserId())
                .vehicleId(truckLoad.getVehicleId())
                .description(truckLoad.getDescription())
                .startLocation(truckLoad.getStartLocation())
                .finishLocation(truckLoad.getFinishLocation())
                .build();
    }

    public static TruckLoad toEntityFromCreateTruckLoadDto (CreateTruckLoadRequest request){
        if (Objects.isNull(request))
            return null;

        return TruckLoad.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .startLocation(request.getStartLocation())
                .finishLocation(request.getFinishLocation())
                .build();
    }
}
