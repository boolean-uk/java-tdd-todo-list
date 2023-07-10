package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    String name;
    int id;
    boolean status;
    LocalDateTime time;

    public Task(String name, int id) {
        this.name = name;
        this.id = id;
        this.status = false;
        this.time = LocalDateTime.now();;
    }
}
