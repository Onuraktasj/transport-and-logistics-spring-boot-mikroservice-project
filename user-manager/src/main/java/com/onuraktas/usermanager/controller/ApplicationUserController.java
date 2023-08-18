package com.onuraktas.usermanager.controller;

import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import com.onuraktas.usermanager.service.ApplicationUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApplicationUserController {

    private final ApplicationUserService applicationUserService;

    public ApplicationUserController(ApplicationUserService applicationUserService){
        this.applicationUserService = applicationUserService;
    }

    @PostMapping("/crate")
    public ResponseEntity<ApplicationUserDto> crateUser(@RequestBody CreateUserRequest createUserRequest){
        return ResponseEntity.ok(applicationUserService.createUser(createUserRequest));
    }
}
