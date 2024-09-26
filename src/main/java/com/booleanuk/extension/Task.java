package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    String description;
    String status;
    LocalDateTime creationTime;

    Task(String description, String status) {
        this.description = description;
        this.status = status;
        this.creationTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Status: " + status + ", Created on: " + creationTime;
    }
}
