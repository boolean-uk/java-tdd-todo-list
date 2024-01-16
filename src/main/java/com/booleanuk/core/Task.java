package com.booleanuk.core;

public class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "[\"" + description + "\", " + (completed ? "complete" : "incomplete") + "]";
    }
}
