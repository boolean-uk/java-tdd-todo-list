package com.booleanuk.extension;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Task {
    String name;
    int taskId;
    boolean completed;
    long  timeCreated;
    public Task(String name){
        this.completed = false;
        this.name = name;
        this.timeCreated = System.currentTimeMillis();
        this.taskId = new Random().nextInt(1000000);
    }
    public Task(String name, int id){
        this.completed = false;
        this.name = name;
        this.taskId = id;
        this.timeCreated = System.currentTimeMillis();
    }
    public Task(){
        this.completed = false;
        this.name = "undefined";
        this.timeCreated = System.currentTimeMillis();
        this.taskId = new Random().nextInt(1000000);
    }
    public boolean isCompleted(){
        return this.completed;
    }
    public void setCompleted(boolean arg){
        this.completed = arg;
    }
    public String getTimeCreated(){
        Instant instant = Instant.ofEpochMilli(this.timeCreated);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
    public String toString(){
        return this.name+"\nCreated at:\t"+this.getTimeCreated()+"\nTask ID:\t "+this.taskId +"\nDone?\t"+this.isCompleted();
    }
}
