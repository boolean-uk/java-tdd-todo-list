package com.booleanuk.extension;

import java.util.UUID;

public class Task {
    String taskName;
    boolean isCompeted;
    UUID id = UUID.randomUUID();

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
