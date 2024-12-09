package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private String id;
    private String name;
    private TaskStatus status;
    private LocalDateTime creationDateTime;

    public Task(String id, String name, LocalDateTime creationDateTime) {
        this.id = id;
        this.name = name;
        this.status = TaskStatus.IN_PROGRESS;
        this.creationDateTime = creationDateTime;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }
}
