package com.booleanuk.core;

public class Task {
    public boolean isComplete;
    public String name;

    public Task(String name){
        this.isComplete = false;
        this.name = name;
    }

    public Task(String name, boolean isComplete){
        this.isComplete = isComplete;
        this.name = name;
    }

    public String toString(){
        // this will output the print and a - with a true or a false
        String toTestResult = this.name + " - " + this.isComplete;
        return toTestResult;
    }
}
