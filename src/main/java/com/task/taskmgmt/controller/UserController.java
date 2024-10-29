package com.task.taskmgmt.controller;

import com.task.taskmgmt.dto.UserDTO;
import com.task.taskmgmt.model.User;
import com.task.taskmgmt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO registerUser(@RequestBody UserDTO userDTO) {
        User user = userService.registerUser(userDTO.toEntity());
        return new UserDTO(user);
    }

    @GetMapping("/{email}")
    public UserDTO getUserByEmail(@PathVariable String email) {
        User user = userService.findByEmail(email);
        return new UserDTO(user);
    }
}

