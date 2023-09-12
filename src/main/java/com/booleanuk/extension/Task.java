package com.booleanuk.extension;

public class Task {
    private static int nextId = 1;
    private int id;
    private String name;
    private boolean status;

    public Task(String name) {
        this.id = nextId++;
        this.name = name;
        this.status = false;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Task.nextId = nextId;
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

    public boolean setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void toggleStatus() {

    }
}
