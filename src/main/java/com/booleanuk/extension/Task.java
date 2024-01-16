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

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getId() {
        return id;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "[\"" + description + "\", " + (completed ? "complete" : "incomplete") + "]";
    }
}
