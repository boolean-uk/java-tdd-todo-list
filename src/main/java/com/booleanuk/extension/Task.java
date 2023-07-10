package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    String name;
    UUID id;
    boolean status;
    LocalDateTime time;

    public Task(String name, boolean status) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.status = status;
        this.time = LocalDateTime.now();;
    }
}
