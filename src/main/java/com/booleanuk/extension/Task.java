package com.booleanuk.extension;

public class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        this.description = description;
        this.completed = false;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[\"" + description + "\", " + (completed ? "complete" : "incomplete") + "]";
    }
}
