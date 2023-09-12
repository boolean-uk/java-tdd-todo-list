package com.booleanuk.core;

public class Task {
    String description;
    boolean completion;

    public Task(String description, boolean completion) {
        this.description = description;
        this.completion = completion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompletion() {
        return completion;
    }

    public void setCompletion(boolean completion) {
        this.completion = completion;
    }

    @Override
    public String toString() {
        return this.description + "  ~~Completed: " + this.completion;
    }
}
