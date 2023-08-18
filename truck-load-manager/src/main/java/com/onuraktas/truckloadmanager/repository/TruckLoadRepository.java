package com.onuraktas.truckloadmanager.repository;

import com.onuraktas.truckloadmanager.entity.TruckLoad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TruckLoadRepository extends JpaRepository<TruckLoad,UUID> {
}
