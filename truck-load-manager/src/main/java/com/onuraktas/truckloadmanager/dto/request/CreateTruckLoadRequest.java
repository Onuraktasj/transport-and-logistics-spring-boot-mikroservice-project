package com.onuraktas.truckloadmanager.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateTruckLoadRequest {

    private String title;

    private String description;

    private String startLocation;

    private String finishLocation;

}
