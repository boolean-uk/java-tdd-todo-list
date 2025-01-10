package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private boolean completed = false;    
    private String name;
    private int id = -1;
    private LocalDateTime timeCreated = LocalDateTime.now();

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, int id) {
        this.name = name;
        this.id = id;
    }


    void complete() {
        completed = true;
    }

    boolean isComplete() {
        return completed;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    void changeName(String newName) {
        name = newName;
    }

    void setStatus(boolean completed) {
        this.completed = completed;
    }

    LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    void setId(int id) {
        this.id = id;
    }
}
