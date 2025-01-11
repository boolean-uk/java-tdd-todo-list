package com.booleanuk.core;

public class Task {

    String name;
    boolean completed;

    public Task(String name){
        this.name = name;
        this.completed = false;
    }

    public String getName(){
        return this.name;
    }

    public boolean getStatus(){
        return this.completed;
    }

    public void setStatus(boolean status){
        this.completed = status;
    }
}
