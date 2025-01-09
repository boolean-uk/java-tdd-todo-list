package com.booleanuk.core;

public class Task {
    String taskName;
    boolean isCompeted;

    public Task(String taskName, boolean isCompeted) {
        this.taskName = taskName;
        this.isCompeted = isCompeted;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public boolean getIsCompleted() {
        return this.isCompeted;
    }
}
