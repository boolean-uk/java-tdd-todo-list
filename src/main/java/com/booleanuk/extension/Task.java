package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private static int counter = 1;
    private String name;
    private int id;

    private LocalDateTime currentDateTime;
    private boolean isComplete;
    public Task(String name){
        this.name = name;
        this.isComplete = false;
        this.currentDateTime = LocalDateTime.now();
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getCreationDateAndTime(){
        return currentDateTime;
    }
    public void setId(int id){
        this.id = id;
    }


    public int getId(){
        return this.id;
    }
    public void setComplete(boolean b){
        this.isComplete = b;
    }
    public boolean isComplete(){

        return this.isComplete;
    }
    public String toString(){
        if(isComplete){
            return this.name + ", Completed";
        }
        return this.name + ", Not completed";
    }
}
