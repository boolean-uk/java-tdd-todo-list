package com.booleanuk.extension;

public class TaskExtended {

    String name;
    boolean isComplete;

    public TaskExtended(String name){
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
