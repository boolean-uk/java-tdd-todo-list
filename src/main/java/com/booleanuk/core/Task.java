package com.booleanuk.core;

public class Task {

    private String name;
    private boolean completed;

    public Task() {
    }

    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }
}
