package com.booleanuk.extension;

public class TaskExtension {

    private String name;
    private boolean status;

    public TaskExtension(String name) {
        this.name = name;
        this.status = false;
    }

    public TaskExtension(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
