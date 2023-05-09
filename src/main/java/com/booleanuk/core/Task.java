package com.booleanuk.core;

public class Task {

    private String name;
    private boolean completed;

    public Task() {
    }

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void toggleCompleted() {
        this.completed = !this.completed;
    }

    public boolean isCompleted() {
        return completed;
    }
}
