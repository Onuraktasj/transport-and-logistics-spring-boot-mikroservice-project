package com.onuraktas.usermanager.dto.entity;

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
public class ApplicationUserDto {

    private UUID id;

    private String fullName;

    private String email;

    private String linkedinAccount;

    private String websiteUrl;
}
