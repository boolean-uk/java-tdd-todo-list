package com.booleanuk.extension;

public class Task {
    String name;
    boolean status;
    int id;

    public Task(String name, int id) {
        this.name = name;
        this.id = id;
        this.status = false;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {return this.id;}

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus() {
        this.status = !this.status;
    }
}
