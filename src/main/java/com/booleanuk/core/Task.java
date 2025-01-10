package com.booleanuk.core;

public class Task {
    String name;
    boolean complete;

    public Task(String name) {
        this.name = name;
        this.complete = false;

    }

    public void changeStatus(boolean status) {
        this.complete = status;
    }
}
