package com.booleanuk.core;

import java.time.LocalDateTime;

public class Task {
    private final long id;
    private String name;
    private STATUS status = STATUS.NEW;
    private final LocalDateTime creationDate = LocalDateTime.now();

    private static int nextId = 1;

    public Task(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public STATUS getStatus() {
        return status;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
}
