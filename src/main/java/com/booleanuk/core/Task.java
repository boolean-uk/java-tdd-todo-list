package com.booleanuk.core;

public class Task {
    private String description;
    private boolean completeStatus;

    public Task(String description){
        this.completeStatus = false;
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getCompleteStatus(){
        return this.completeStatus;
    }

    public boolean completeTask(){
        if (this.completeStatus){
            return false;
        }
        this.completeStatus = true;
        return true;
    }

    public boolean incompleteTask(){
        if (!this.completeStatus){
            return false;
        }
        this.completeStatus = false;
        return true;
    }
}
