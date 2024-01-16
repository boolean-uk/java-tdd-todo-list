package com.booleanuk.core;

public class Task implements Comparable<Task>{
    String description;
    boolean status;
    public Task(String description){
        this.description = description;
        status = false;
    }

    public boolean getStatus(){
        return status;
    }

    public int compareTo(Task otherTask){
        return this.description.compareTo(otherTask.description);
    }

    public int compareTo(String task){
        return this.description.compareTo(task);
    }

    public String toString(){
        return description;
    }
}
