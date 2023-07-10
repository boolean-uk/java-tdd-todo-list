package com.booleanuk.core;

public class Task {
    private String name;
    private Boolean status;

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public boolean changeStatus(String task) {
        return true;
    }

    public void addTask(String taskName){}

    public void displayAll(){}
}
