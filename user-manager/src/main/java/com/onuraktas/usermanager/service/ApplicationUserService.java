package com.onuraktas.usermanager.service;

import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ApplicationUserService {

    ApplicationUserDto createUser(CreateUserRequest createUserRequest);
    List<ApplicationUserDto> getAllUser();

    ApplicationUserDto getUser(UUID id);

    ApplicationUserDto updateUser(UUID id,ApplicationUserDto applicationUserDto);

}
