package com.booleanuk.core;

public class Task {

    String name;
    boolean isComplete;

    public Task(String name){
        this.name = name;
        this.isComplete = false;
    }

    public String getName(){
        return this.name;
    }

    public void changeCompletion(){
        this.isComplete = !this.isComplete;
    }
}
