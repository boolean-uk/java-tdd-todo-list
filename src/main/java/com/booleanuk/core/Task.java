package com.booleanuk.core;

public class Task {
    public String name;
    public Boolean status;

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    @Override
    public String toString() {
        return name + (status ? " Completed" : " Uncompleted");
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

    @Override
    public String toString() {
        return name + (status ? " Completed" : " Uncompleted");
    }
}
