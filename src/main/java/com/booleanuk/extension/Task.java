package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {

    private String name;
    private boolean completed;
    private final int id; // assigned once, never again.
    private final LocalDateTime createdAt;


    public Task (String name, int id) {
        this.name = name;
        this.completed = false;
        this.id = id;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public boolean isStatus() {
        return this.completed;
    }

    public void setStatus(boolean completed) {
        this.completed = completed;
    }
}
