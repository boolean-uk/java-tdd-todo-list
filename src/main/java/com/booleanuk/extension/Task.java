package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public class Task {
    public String id = UUID.randomUUID().toString();
    public LocalDateTime dateCreated;
    public String name = "";
    public boolean completed = false;
    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
        this.dateCreated = LocalDateTime.now();
    }
}
