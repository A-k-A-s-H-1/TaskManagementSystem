package com.task.taskmgmt.service;


import com.task.taskmgmt.model.Role;

public interface RoleService {
    Role findByName(String name);
    Role createRole(Role role);
}

