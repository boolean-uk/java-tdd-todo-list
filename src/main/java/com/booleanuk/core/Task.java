package com.booleanuk.core;

public class Task {
    String name;
    boolean isComplete;

    public Task(String name) {
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean getTaskStatus() {
        return this.isComplete;
    }

    public void changeStatus() {
        this.isComplete = !this.isComplete;
    }
}
