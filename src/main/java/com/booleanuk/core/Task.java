package com.booleanuk.core;

public class Task {
    private String task;
    private boolean status;


    public Task(String task,boolean status){
        this.task=task;
        this.status = status;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task){
        this.task=task;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status){
        this.status=status;
    }


    @Override
    public String toString() {
        return "Task: " +
                task +
                ", " + status;
    }
}
