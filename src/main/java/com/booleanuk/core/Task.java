package com.booleanuk.core;

public class Task {
    String description;
    boolean status;
    public Task(String description){
        this.description = description;
        status = false;
    }

    public boolean getStatus(){
        return status;
    }
}
