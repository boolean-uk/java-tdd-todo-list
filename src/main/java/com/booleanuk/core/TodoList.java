package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<TodoList> taskList;
    private String task;
    private boolean status;

    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public boolean getStatus() {
        return status;
    }

    public void add(String task){

    }

    public String showAll(){

        return "";
    }

    public void changeStatus(String task){

    }

    public String showCompletedTasks() {

        return"";
    }

    public String showIncompleteTasks() {

        return"";
    }

    public String search(String task){

        return"";
    }

    public void removeTask(String task){

    }

    public void sortListAsc(){

    }

    public void sortListDesc(){
        //Reverse sortListAsc();
    }
}
