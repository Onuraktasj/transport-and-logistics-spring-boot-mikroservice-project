package com.onuraktas.vehiclemanager.dto.request;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateVehicleRequest{
    String plate;
}
