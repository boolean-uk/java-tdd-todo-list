package com.booleanuk.core;

public class Task {
    private String name;
    private boolean complete;

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void changeStatus(boolean status) {
        complete = status;
    }
}
