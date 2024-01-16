package com.booleanuk.core;

public class Task {
    String name;
    boolean complete;

    public Task(String name, boolean complete) {
        this.name = name;
        this.complete = complete;
    }

    public Task(String name) {
        this.name = name;
        this.complete = false;
    }

    public void setComplete() {
        complete = true;
    }

    public void setIncomplete() {
        complete = false;
    }



}
