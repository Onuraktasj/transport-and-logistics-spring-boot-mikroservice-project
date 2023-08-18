package com.onuraktas.truckloadmanager.impl;

import com.onuraktas.truckloadmanager.dto.entity.TruckLoadDto;
import com.onuraktas.truckloadmanager.dto.request.CreateTruckLoadRequest;
import com.onuraktas.truckloadmanager.entity.TruckLoad;
import com.onuraktas.truckloadmanager.mapper.TruckLoadMapper;
import com.onuraktas.truckloadmanager.repository.TruckLoadRepository;
import com.onuraktas.truckloadmanager.service.TruckLoadService;
import org.springframework.stereotype.Service;

@Service
public class TruckLoadServiceImpl implements TruckLoadService {

    private final TruckLoadRepository truckLoadRepository;

    public TruckLoadServiceImpl(TruckLoadRepository truckLoadRepository){
        this.truckLoadRepository = truckLoadRepository;
    }


    @Override
    public TruckLoadDto createTruckLoad(CreateTruckLoadRequest request) {
        TruckLoad truckLoad = TruckLoadMapper.toEntityFromCreateTruckLoadDto(request);

        return TruckLoadMapper.toDto(truckLoadRepository.save(truckLoad));

    }
}
