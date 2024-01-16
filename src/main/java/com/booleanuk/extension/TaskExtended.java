package com.booleanuk.extension;

public class TaskExtended {

    String name;
    boolean isComplete;
    int Id;
    String timeCreated;

    public TaskExtended(String name){
        this.name = name;
        this.isComplete = false;
    }

    public String getName(){
        return this.name;
    }
    public void setName(int id){

    }

    public String getTimeCreated(){
        return "";
    }
    public void changeCompletion(){
        this.isComplete = !this.isComplete;
    }


}
