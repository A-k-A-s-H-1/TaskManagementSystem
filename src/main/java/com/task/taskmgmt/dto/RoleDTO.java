package com.task.taskmgmt.dto;


import com.task.taskmgmt.model.Role;
import com.task.taskmgmt.util.UserRole;
import lombok.Data;

@Data
public class RoleDTO {
    private UserRole name;

    public RoleDTO(Role role) {
        this.name = role.getRoleName();
    }
}

