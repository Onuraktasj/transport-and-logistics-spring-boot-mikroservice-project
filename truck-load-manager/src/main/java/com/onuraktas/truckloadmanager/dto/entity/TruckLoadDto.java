package com.onuraktas.truckloadmanager.dto.entity;

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
public class TruckLoadDto {

    private UUID id;

    private String title;

    private UUID userId;

    private UUID vehicleId;

    private String description;

    private String startLocation;

    private String finishLocation;

}
