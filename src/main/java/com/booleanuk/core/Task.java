package com.booleanuk.core;

public class Task {
    private String name;
    private boolean isComplete;
    public Task(String name){
        this.name = name;
        this.isComplete = false;
    }
    public String getName(){
        return name;
    }
    public void setComplete(boolean b){
        this.isComplete = b;
    }
    public boolean isComplete(){

        return isComplete;
    }
}
