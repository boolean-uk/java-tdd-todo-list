package com.booleanuk.extension;

import java.time.format.DateTimeFormatter;

public class TaskExtended {

    String name;
    boolean isComplete;
    int id;
    int order = 1000;
    String timeCreated;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm : yyyy-MM-dd");

    public TaskExtended(String name, String timeCreated){
        this(name);
        this.timeCreated = timeCreated;
    }
    public TaskExtended(String name){
        this.name = name;
        this.isComplete = false;
        this.id = order;
        order ++;
        this.timeCreated = java.time.LocalDateTime.now().format(formatter);
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    public int setId(){
        return this.id;
    }

    public void setName(int id, String name){
        if (this.id == id){
            this.name = name;
        }
    }

    public String getTimeCreated(){

        return this.timeCreated;
    }
    public void changeCompletion(){
        this.isComplete = !this.isComplete;
    }


}
