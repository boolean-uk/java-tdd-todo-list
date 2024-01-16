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
        getTask(name).changeCompletion();
        return getTask(name).isComplete;
    }

    public ArrayList<String> getTasksByCompletion(){
        return new ArrayList<>();
    }

    public Task getTask(String name) {
        if(getToDos().contains(name)){
            return this.todoList.get(name);
        }
        return null;
    }

    public String remove(){
        return "";
    }

    public ArrayList<String> getListAlphabeticly(String order){
        return new ArrayList<>();
    }
}
