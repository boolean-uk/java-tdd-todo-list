package com.booleanuk.core;

public class Task {

    private String name;
    private Boolean completed;

    Task(String name){
        this.name = name;
        this.completed = false;
    }

    public String getName(){return name;}
    public Boolean getCompleted(){return completed;}
    public void setCompleted(Boolean bool){completed = bool;}
}
