package com.booleanuk.extension;

import java.time.LocalDate;
import java.util.HashMap;

public class TodoListExtension {

    private HashMap<Integer, TodoListExtension> tasks = new HashMap<>();
    private int id;
    private String name;
    private String status;
    private LocalDate createdAt;

    public TodoListExtension(int id, String name, String status, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
        tasks.put(id, this);
    }

    // I want to be able to get a task by a unique ID.
    public TodoListExtension getTaskById(int id) {
        return tasks.get(id);
    }

    // I want to update the name of a task by providing its ID and a new name
    public boolean updateTaskName(int id, String updatedName) {
        TodoListExtension task = getTaskById(id);
        if (task != null) {
            task.name = updatedName;
            return true;
        }
        return false;
    }

    // I want to be able to change the status of a task by providing its ID.
    public boolean updateTaskStatus(int id, String updatedStatus) {
        TodoListExtension task = getTaskById(id);
        if (task != null) {
            task.status = updatedStatus;
            return true;
        }
        return false;
    }

    // I want to be able to see the date and time that I created each task.
    public LocalDate getTaskCreationDateTime(int id) {
        TodoListExtension task = getTaskById(id);
        if (task != null) {
            return task.createdAt;
        }
        return null;
    }

    public String getName() {
        return name;
    }


    public String getStatus() {
        return status;
    }
}
