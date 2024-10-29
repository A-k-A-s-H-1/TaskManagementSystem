package com.task.taskmgmt.service;


import com.task.taskmgmt.model.User;

public interface UserService {
    User registerUser(User user);
    User findByEmail(String email);
}

