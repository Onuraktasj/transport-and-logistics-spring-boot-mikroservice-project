package com.onuraktas.truckloadmanager.service;

import com.onuraktas.truckloadmanager.dto.entity.TruckLoadDto;
import com.onuraktas.truckloadmanager.dto.request.CreateTruckLoadRequest;


public interface TruckLoadService {

    TruckLoadDto createTruckLoad(CreateTruckLoadRequest request);
}
