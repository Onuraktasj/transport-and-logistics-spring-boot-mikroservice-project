package com.onuraktas.usermanager.controller;

import com.onuraktas.usermanager.dto.entity.ApplicationUserDto;
import com.onuraktas.usermanager.dto.request.CreateUserRequest;
import com.onuraktas.usermanager.service.ApplicationUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/getAll")
    public ResponseEntity<List<ApplicationUserDto>> getAllUser(){
        return ResponseEntity.ok(applicationUserService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationUserDto> getUser(@PathVariable (value = "id")UUID id){
        return ResponseEntity.ok(applicationUserService.getUser(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApplicationUserDto> updateUser(@PathVariable (value = "id") UUID id, @RequestBody  ApplicationUserDto applicationUserDto){
        return ResponseEntity.ok(applicationUserService.updateUser(id,applicationUserDto));
    }
}
