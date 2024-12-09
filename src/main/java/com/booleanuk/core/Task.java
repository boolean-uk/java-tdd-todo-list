package com.booleanuk.core;

public class Task {
    Status status = Status.INCOMPLETE;
    String description;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
    }

    public Task(Status status, String description) {
        this.status = status;
        this.description = description;
    }

    public void changeStatus() {
        if (status == Status.INCOMPLETE) {
            status = Status.COMPLETE;
        } else {
            status = Status.INCOMPLETE;
        }
    }
}
