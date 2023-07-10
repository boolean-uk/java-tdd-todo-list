package com.booleanuk.core;

public class Task {

    private String taskName;
    private boolean status;

    public Task(String taskName) {
        this.taskName = taskName;
        status = false;
    }


    public String printTaskName(){
        return taskName;
    }



}
