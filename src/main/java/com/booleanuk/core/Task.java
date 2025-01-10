package com.booleanuk.core;

public class Task {
    private boolean completed = false;    
    private String name;

    public Task(String name) {
        this.name = name;
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
}
