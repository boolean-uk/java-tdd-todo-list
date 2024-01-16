package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    HashMap<String, Task> todoList;

    public TodoList(){
        this.todoList = new HashMap<>();
    }

    public String add(String name){
        if(getToDos().contains(name)){
            return "Task already in list";
        }
        this.todoList.put(name, new Task(name));
        return name + "Added to tasks";
    }

    public ArrayList<String> getToDos(){
        ArrayList<String> listOfNames = new ArrayList<>();
        for(Task task : this.todoList.values()){
            listOfNames.add(task.getName());
        }
        return listOfNames;
    }

    public boolean changeCompletion(String name) {
        return false;
    }

    public ArrayList<String> getTasksByCompletion(){
        return new ArrayList<>();
    }

    public String getTask(String name) {
        if(!getToDos().contains(name)){
            return "Task not in list";
        }
        return this.todoList.get(name).getName();
    }

    public String remove(){
        return "";
    }

    public ArrayList<String> getListAlphabeticly(String order){
        return new ArrayList<>();
    }
}
