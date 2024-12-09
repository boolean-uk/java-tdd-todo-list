package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskCreator {
    public Task createTask(String name) {
        String id = UUID.randomUUID().toString();
        LocalDateTime creationDateTime = LocalDateTime.now();
        return new Task(id, name, creationDateTime);
    }
}


