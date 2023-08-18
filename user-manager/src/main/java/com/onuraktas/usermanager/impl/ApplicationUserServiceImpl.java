package com.onuraktas.usermanager.impl;

import com.onuraktas.usermanager.entity.ApplicationUser;
import com.onuraktas.usermanager.service.ApplicationUserService;
import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import com.onuraktas.usermanager.mapper.ApplicationUserMapper;
import com.onuraktas.usermanager.repository.ApplicationUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {

    private final ApplicationUserRepository applicationUserRepository;

    public ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository){
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public ApplicationUserDto createUser(CreateUserRequest createUserRequest) {
        ApplicationUser applicationUser = ApplicationUserMapper.toEntityFromCreateApplicationUserDto(createUserRequest);

        return ApplicationUserMapper.toDto(applicationUserRepository.save(applicationUser));
    }
}
