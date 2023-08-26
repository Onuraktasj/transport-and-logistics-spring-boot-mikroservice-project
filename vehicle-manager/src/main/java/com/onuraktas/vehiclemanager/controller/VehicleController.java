package com.onuraktas.vehiclemanager.controller;

import com.onuraktas.vehiclemanager.dto.entity.VehicleDto;
import com.onuraktas.vehiclemanager.dto.request.CreateVehicleRequest;
import com.onuraktas.vehiclemanager.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @PostMapping("/crate")
    public ResponseEntity<VehicleDto> createVehicle(@RequestBody CreateVehicleRequest createVehicleRequest){
        return ResponseEntity.ok(vehicleService.createVehicle(createVehicleRequest));
    }



}
