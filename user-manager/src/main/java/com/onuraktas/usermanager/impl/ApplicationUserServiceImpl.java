package com.onuraktas.usermanager.impl;

import com.onuraktas.usermanager.entity.ApplicationUser;
import com.onuraktas.usermanager.service.ApplicationUserService;
import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import com.onuraktas.usermanager.mapper.ApplicationUserMapper;
import com.onuraktas.usermanager.repository.ApplicationUserRepository;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

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

    @Override
    public List<ApplicationUserDto> getAllUser() {
        return ApplicationUserMapper.toDtoList(applicationUserRepository.findAll());
    }

    @Override
    public ApplicationUserDto getUser(UUID id) {
        return ApplicationUserMapper.toDto(applicationUserRepository.findById(id).orElseThrow(()-> new NotFoundException("User not found")));
    }

    @Override
    public ApplicationUserDto updateUser(UUID id, ApplicationUserDto applicationUserDto) {
        if (!Objects.equals(id,ApplicationUserMapper.toEntity(applicationUserDto).getId()))
            throw new IllegalArgumentException("Ids do not match");
        if (!this.applicationUserRepository.existsById(id))
            throw new NotFoundException("User Not Found");

        return ApplicationUserMapper.toDto(applicationUserRepository.save(ApplicationUserMapper.toEntity(applicationUserDto)));
    }


}
