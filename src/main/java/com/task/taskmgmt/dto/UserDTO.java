package com.task.taskmgmt.dto;

import com.task.taskmgmt.model.User;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

    public User toEntity() {
        User user = new User();
        user.setUsername(this.username);
        user.setEmail(this.email);
        return user;
    }
}

