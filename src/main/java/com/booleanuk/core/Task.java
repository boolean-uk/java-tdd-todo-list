package com.booleanuk.core;

public class Task {

    private String name;
    private boolean completed;


    public Task (String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean isStatus() {
        return this.completed;
    }

    public void setStatus(boolean completed) {
        this.completed = completed;
    }
}
