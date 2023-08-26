package com.onuraktas.vehiclemanager.controller;


import com.onuraktas.vehiclemanager.dto.entity.VehicleModelDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleModelRequest;
import com.onuraktas.vehiclemanager.service.VehicleModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicleModel")
public class VehicleModelController {

    private final VehicleModelService vehicleModelService;

    public VehicleModelController(VehicleModelService vehicleModelService){
        this.vehicleModelService = vehicleModelService;
    }

    @PostMapping("/create")
    public ResponseEntity<VehicleModelDto> createVehicleModel(@RequestBody CreateVehicleModelRequest request){
        return ResponseEntity.ok(vehicleModelService.createVehicleModel(request));
    }

}
