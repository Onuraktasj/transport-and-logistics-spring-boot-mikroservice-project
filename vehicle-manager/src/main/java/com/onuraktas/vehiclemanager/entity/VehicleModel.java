package com.onuraktas.vehiclemanager.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
@Schema(description = "Vehicle Model Classes")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

   private String modelName;

   private Integer releaseYear;
   
   private String transmission;

   private String  axle;

   private Integer enginePower;

   private String brand;
}
