package com.task.taskmgmt.controller;

import com.task.taskmgmt.dto.RoleDTO;
import com.task.taskmgmt.model.Role;
import com.task.taskmgmt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Create a new role
    @PostMapping
    public RoleDTO createRole(@RequestBody RoleDTO roleDTO) {
        Role role = new Role();
        role.setRoleName(roleDTO.getName());
        Role createdRole = roleService.createRole(role);
        return new RoleDTO(createdRole);
    }

    // Get a role by name
    @GetMapping("/{name}")
    public RoleDTO getRoleByName(@PathVariable String name) {
        Role role = roleService.findByName(name);
        return new RoleDTO(role);
    }
}
