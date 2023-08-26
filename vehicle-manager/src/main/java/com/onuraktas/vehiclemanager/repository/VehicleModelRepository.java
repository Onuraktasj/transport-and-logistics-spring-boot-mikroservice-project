package com.onuraktas.vehiclemanager.repository;

import com.onuraktas.vehiclemanager.entity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, UUID> {
}
