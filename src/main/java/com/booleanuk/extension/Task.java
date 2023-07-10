package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private static int nextId = 0;
    private int id;
    private String description;
    private TaskStatus status;
    private LocalDateTime localDateTime;

    public Task(String description) {
        id = nextId;
        nextId++;
        this.description = description;
        status = TaskStatus.INCOMPLETE;
        localDateTime = LocalDateTime.now();
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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
