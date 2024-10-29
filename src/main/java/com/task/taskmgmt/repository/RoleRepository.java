package com.task.taskmgmt.repository;


import com.task.taskmgmt.model.Role;
import com.task.taskmgmt.util.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(UserRole roleName);
}

