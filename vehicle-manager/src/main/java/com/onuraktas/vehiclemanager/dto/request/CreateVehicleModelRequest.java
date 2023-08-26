package com.onuraktas.vehiclemanager.dto.request;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateVehicleModelRequest {

    private String modelName;

    private Integer releaseYear;

    private String transmission;

    private String axle;

    private Integer enginePower;

    private String brand;
}
