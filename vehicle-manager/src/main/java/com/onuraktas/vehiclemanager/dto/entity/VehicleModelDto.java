package com.onuraktas.vehiclemanager.dto.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleModelDto {

    private UUID id;

    private String modelName;

    private Integer releaseYear;

    private String transmission;

    private String axle;

    private Integer enginePower;

    private String brand;
}
