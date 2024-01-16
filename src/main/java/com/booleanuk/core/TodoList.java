package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> todoList;

    public TodoList(){
        this.todoList = new ArrayList<>();
    }

    public String add(String name){
        return "";
    }

    public ArrayList<String> getToDos(){
        return new ArrayList<>();
    }

    public boolean changeCompletion(String name) {
        return false;
    }

    public ArrayList<String> getTasksByCompletion(){
        return new ArrayList<>();
    }

    public boolean getTask(String name) {
        return false;
    }

    public String remove(){
        return "";
    }

    public ArrayList<String> getListAlphabeticly(String order){
        return new ArrayList<>();
    }
}
