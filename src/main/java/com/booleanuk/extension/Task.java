package com.booleanuk.extension;

public class Task {
    private static int counter = 1;
    private String name;
    private int id;
    private boolean isComplete;
    public Task(String name){
        this.name = name;
        this.id = generateUniqueId();
        this.isComplete = false;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private synchronized int generateUniqueId() {
        return counter++;
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
