package com.onuraktas.usermanager.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@EqualsAndHashCode @ToString
@Builder
public class CreateUserRequest {

    private String fullName;

    private String email;

    private String linkedinAccount;

    private String websiteUrl;
}
