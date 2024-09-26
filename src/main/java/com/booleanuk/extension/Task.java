package com.booleanuk.extension;


import java.time.LocalDateTime;
import java.util.UUID;

public class Task {

    UUID id;
    String name;
    boolean isCompleted;
    final LocalDateTime createdAt;

    public Task(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.isCompleted = false;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }
}
