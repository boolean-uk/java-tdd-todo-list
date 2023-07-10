package com.booleanuk.core;

public class Task {
    Status status = Status.INCOMPLETE;
    String description;

    public Task() {
    }

    public Task(Status status, String description) {
        this.status = status;
        this.description = description;
    }
}
