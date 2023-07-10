package com.booleanuk.core;

public class Task {
    private int id;
    private String description;
    private boolean isComplete;

    public Task(int id,String description) {
        this.id = id;
        this.description = description;
        this.isComplete = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void changeTaskStatus() {
        isComplete = !isComplete;
    }
}
