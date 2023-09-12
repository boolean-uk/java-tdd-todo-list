package com.booleanuk.extension;

public class Task {
    String name;
    boolean status;

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    public String getName() {
        return this.name;
    }


    public boolean getStatus() {
        return this.status;
    }

    public void setStatus() {
        this.status = !this.status;
    }
}
