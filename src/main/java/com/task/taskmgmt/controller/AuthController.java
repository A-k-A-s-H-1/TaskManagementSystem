package com.task.taskmgmt.controller;


import com.task.taskmgmt.dto.AuthRequest;
import com.task.taskmgmt.dto.AuthResponse;
import com.task.taskmgmt.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public AuthResponse authenticateUser(@RequestBody AuthRequest authRequest) {
        String token = authService.authenticateUser(authRequest.getEmail(), authRequest.getPassword());
        return new AuthResponse(token);
    }
}

