package com.onuraktas.truckloadmanager.controller;

import com.onuraktas.truckloadmanager.dto.entity.TruckLoadDto;
import com.onuraktas.truckloadmanager.dto.request.CreateTruckLoadRequest;
import com.onuraktas.truckloadmanager.service.TruckLoadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/truck")
public class TruckLoadController {
    
    private final TruckLoadService truckLoadService;

    public TruckLoadController(TruckLoadService truckLoadService){
        this.truckLoadService = truckLoadService;
    }
    
    @PostMapping("/create")
    public ResponseEntity<TruckLoadDto> createTruckLoad(@RequestBody CreateTruckLoadRequest request){
        return ResponseEntity.ok(truckLoadService.createTruckLoad(request));
    }
}
