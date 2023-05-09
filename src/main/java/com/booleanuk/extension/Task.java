package com.booleanuk.extension;

import java.util.UUID;

public class Task {
    public String id = UUID.randomUUID().toString();
    public String name = "";
    public boolean completed = false;
    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }
}
