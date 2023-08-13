package com.onuraktas.usermanager.service;

import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationUserService {

    ApplicationUserDto createVehicle(CreateUserRequest createUserRequest);

}
