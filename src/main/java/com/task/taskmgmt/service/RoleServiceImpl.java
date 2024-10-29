package com.task.taskmgmt.service;


import com.task.taskmgmt.model.Role;
import com.task.taskmgmt.repository.RoleRepository;
import com.task.taskmgmt.util.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(UserRole.valueOf(name))
                .orElseThrow(() -> new EntityNotFoundException("Role not found: " + name));
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
}

