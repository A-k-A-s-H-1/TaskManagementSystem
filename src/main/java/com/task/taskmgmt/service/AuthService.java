package com.task.taskmgmt.service;


import com.task.taskmgmt.security.JwtUtil;

public class AuthService {
    private final JwtUtil jwtUtil;

    // Inject repositories and JwtUtil in constructor

    public String authenticateUser(String email, String password) {
        // Authenticate and generate JWT token
    }
}
