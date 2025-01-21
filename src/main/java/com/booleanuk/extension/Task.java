package com.booleanuk.extension;

public class Task {
    private static int nextId = 1;
    private int id;
    private String name;
    private boolean status;
    private String time;

    public Task(String name, boolean status, String time) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.status = status;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
