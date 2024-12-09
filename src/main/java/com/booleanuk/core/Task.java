package com.booleanuk.core;

public class Task {
    String name;
    String isComplete = "incomplete";

    public Task(String name){
        this.name = name;
    }

    public boolean getIsComplete() {
        if(isComplete.equals("complete")){
            return true;
        }else{
            return false;
        }
    }

    public void setIsComplete() {
        if (getIsComplete()){
            isComplete = "incomplete";
        }else{
            isComplete = "complete";
        }
    }

}
