package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private final String id;
    private String name;
    private boolean completed;
    private final LocalDateTime createdAt;

    public Task(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toggleCompleted() {
        this.completed = !this.completed;
    }
}
