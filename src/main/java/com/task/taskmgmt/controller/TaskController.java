package com.task.taskmgmt.controller;
import com.task.taskmgmt.dto.TaskDTO;
import com.task.taskmgmt.model.Task;
import com.task.taskmgmt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Retrieve all tasks for a specific user
    @GetMapping("/user/{userId}")
    public List<TaskDTO> getTasksByUserId(@PathVariable Long userId) {
        return taskService.getTasksByUserId(userId).stream()
                .map(TaskDTO::new)
                .collect(Collectors.toList());
    }

    // Create a new task for a specific user
    @PostMapping("/user/{userId}")
    public TaskDTO createTask(@PathVariable Long userId, @RequestBody TaskDTO taskDTO) {
        Task task = taskService.createTask(userId, taskDTO.toEntity());
        return new TaskDTO(task);
    }

    // Update an existing task
    @PutMapping("/{taskId}")
    public TaskDTO updateTask(@PathVariable Long taskId, @RequestBody TaskDTO taskDTO) {
        Task updatedTask = taskService.updateTask(taskId, taskDTO.toEntity());
        return new TaskDTO(updatedTask);
    }

    // Delete a task
    @DeleteMapping("/{taskId}")
    public String deleteTask(@PathVariable Long taskId) {
        taskService.deleteTask(taskId);
        return "Task with ID " + taskId + " was deleted successfully.";
    }
}

