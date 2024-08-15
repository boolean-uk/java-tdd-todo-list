package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskExtension {

    private String name;
    private final String description;
    private final String id;
    private final LocalDateTime createdAt;

    public TaskExtension(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = generateId();
        this.createdAt = generateCreatedAt();
    }

    private LocalDateTime generateCreatedAt() {
        return LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    private String generateId() {
        return UUID.randomUUID().toString();
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

}
