package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.time.LocalDateTime;

public class TaskExtended extends Task {
    private final LocalDateTime createdAt;

    public TaskExtended(String name) {
        super(name);
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
