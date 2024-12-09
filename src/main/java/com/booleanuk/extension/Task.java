package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    String text;
    boolean isCompleted;
    LocalDateTime dateOfCreation;

    public Task(String text) {
        this.text = text;
        this.isCompleted = false;
        this.dateOfCreation = LocalDateTime.now();
    }
}
