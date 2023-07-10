package com.booleanuk.core;

public class Task {
    private String name;
    private String description;
    private TaskStatus status;

    public Task(String name) {
        this.name = name;
        this.description = "";
        this.status = TaskStatus.INCOMPLETE;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = TaskStatus.INCOMPLETE;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public boolean setStatus(TaskStatus taskStatus) {
        if (this.status == taskStatus){
            return false;
        } else {
            this.status = taskStatus;
            return true;
        }
    }
}
