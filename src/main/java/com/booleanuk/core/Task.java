package com.booleanuk.core;

public class Task implements Comparable<Task>{
    public String description;
    public boolean status;
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

    public boolean equals(String task){
        return this.description.equals(task);
    }

    public String toString(){
        return description;
    }
}
