package com.booleanuk.core;

public class Task {
    private final String title;
    private TaskStatus status;

    public Task(String title) {
        this.title = title;
        this.status = TaskStatus.INCOMPLETED;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
