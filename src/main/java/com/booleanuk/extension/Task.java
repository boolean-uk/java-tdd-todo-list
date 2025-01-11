package com.booleanuk.extension;

public class Task {

    private static int counter = 0;
    private final int id;
    private String name;
    private boolean completed;

    public Task(String name){
        this.name = name;
        this.completed = false;
        this.id = counter += 1;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public boolean getStatus(){
        return this.completed;
    }

    public void setStatus(boolean status){
        this.completed = status;
    }


}
