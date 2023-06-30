package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TodoList {

    private final List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getTaskById(UUID taskId) {
        for (Task task : tasks) {
            if (task.id.equals(taskId)) {
                return task;
            }
        }
        return null;
    }

    public void updateTaskName(UUID taskId, String newName) {
        for (Task task : tasks) {
            if (task.id.equals(taskId)) {
                task.name = newName;
                break;
            }
        }
    }

    public void setTaskStatus(UUID taskId, boolean isComplete) {
        for (Task task : tasks) {
            if (task.id.equals(taskId)) {
                task.isCompleted = isComplete;
                break;
            }
        }
    }

    public LocalDateTime getTaskCreationDateTime(UUID taskId) {
        for (Task task : tasks) {
            if (task.id.equals(taskId)) {
                return task.createdAt;
            }
        }
        return null;
    }
}
