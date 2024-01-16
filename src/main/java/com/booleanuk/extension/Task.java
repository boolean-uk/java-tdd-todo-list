package com.booleanuk.extension;

public class Task {
    private String name;
    private int Id;
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

        return this.isComplete;
    }
}
