package com.booleanuk.core;

import java.util.Map;

public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        completed = false;
    }

    public String getName() {
        return this.name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return this.completed;
    }
}
