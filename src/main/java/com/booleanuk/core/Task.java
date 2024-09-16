package com.booleanuk.core;

public class Task {

    public String name;
    public boolean status;

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }
}
