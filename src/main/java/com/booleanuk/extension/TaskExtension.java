package com.booleanuk.extension;

public class TaskExtension {

    public String name;
    public boolean status;
    public int ID;

    public TaskExtension(String name) {
        this.name = name;
        this.status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
