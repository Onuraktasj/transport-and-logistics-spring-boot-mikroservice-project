package com.onuraktas.usermanager.mapper;

import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import com.onuraktas.usermanager.entity.ApplicationUser;

import java.util.List;
import java.util.Objects;

public class ApplicationUserMapper {


    public static ApplicationUser toEntity(ApplicationUserDto applicationUserDto){
        if (Objects.isNull(applicationUserDto))
            return null;

        return ApplicationUser.builder()
                .id(applicationUserDto.getId())
                .fullName(applicationUserDto.getFullName())
                .email(applicationUserDto.getEmail())
                .linkedinAccount(applicationUserDto.getLinkedinAccount())
                .websiteUrl(applicationUserDto.getWebsiteUrl())
                .build();
    }


  public static ApplicationUserDto toDto(ApplicationUser applicationUser){
      if (Objects.isNull(applicationUser))
          return null;

      return ApplicationUserDto.builder()
              .id(applicationUser.getId())
              .fullName(applicationUser.getFullName())
              .email(applicationUser.getEmail())
              .linkedinAccount(applicationUser.getLinkedinAccount())
              .websiteUrl(applicationUser.getWebsiteUrl())
              .build();
  }


  public static ApplicationUser toEntityFromCreateApplicationUserDto(CreateUserRequest createUserRequest){
        if (Objects.isNull(createUserRequest))
            return null;

        return ApplicationUser.builder()
                .fullName(createUserRequest.getFullName())
                .email(createUserRequest.getEmail())
                .linkedinAccount(createUserRequest.getLinkedinAccount())
                .websiteUrl(createUserRequest.getWebsiteUrl())
                .build();

  }

  public static List<ApplicationUserDto> toDtoList(List<ApplicationUser> applicationUserList){
        return applicationUserList.stream().parallel()
                .map(ApplicationUserMapper::toDto)
                .toList();
  }
}
