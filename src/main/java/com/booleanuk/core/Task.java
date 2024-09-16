package com.booleanuk.core;

public class Task {
    private static int nextId = 0;
    private int id;
    private String description;
    private TaskStatus status;

    public Task(String description) {
        id = nextId;
        nextId++;
        this.description = description;
        status = TaskStatus.INCOMPLETE;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
