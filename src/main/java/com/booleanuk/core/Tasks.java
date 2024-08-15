package com.booleanuk.core;

public class Tasks {

    private String name;
    private boolean statusForTask;

    public Tasks(String name, boolean statusForTask) {
        this.name = name;
        this.statusForTask = statusForTask;
    }

    public String getTask() {
        return name;
    }

    public boolean isStatusForTask() {
        return statusForTask;
    }

    public void setTask(String task) {
        this.name = task;
    }

    public void setStatusForTask(boolean statusForTask) {
        this.statusForTask = statusForTask;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.statusForTask;
    }
}
