package com.booleanuk.core;

public class Task {
    String name;
    boolean status;

    public Task(String name) {
        this.name = name;
        status = false;
    }

    public String getName() {
        return "";
    }


    public boolean getStatus() {
        return false;
    }

    public void setStatus() {
        status = !status;
    }
}
