package com.booleanuk.core;

public class Task {
    public boolean complete;
    public String name;

    public Task(String name){
        this.complete = false;
        this.name = name;
    }

    public Task(String name, boolean complete){
        this.complete = complete;
        this.name = name;
    }
}
