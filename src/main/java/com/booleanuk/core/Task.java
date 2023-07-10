package com.booleanuk.core;

public class Task {
    String name;
    boolean status=false;
    public Task(String name){
        this.name=name;
    }
    public void changeStatus(){
        status=!status;
    }
}
