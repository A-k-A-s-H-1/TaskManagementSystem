package com.task.taskmgmt.service;


import com.task.taskmgmt.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasksByUserId(Long userId);
    Task createTask(Long userId, Task task);
    Task updateTask(Long taskId, Task task);
    void deleteTask(Long taskId);
}

