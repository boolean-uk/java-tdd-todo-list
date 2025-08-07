package com.booleanuk.core;

public class Task {
    private String description;
    private boolean status;

    public Task(String description){
        this.description = description;
        this.status = false;
    }

    public Task(String description, boolean status){
        this.description = description;
        this.status = status;
    }

    public void toggleStatus(){
        status = !status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
