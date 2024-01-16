package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Integer> list = new HashMap<String, Integer>();


    public String add(String task){
        if (list.containsKey(task)){
            return "Task already in TodoList";
        }
        list.put(task, 0);
        return task+ " added to TodoList";
    }

    public String remove(String task){
        if (!list.containsKey(task)){
            return task + " not in TodoList";
        }
        list.remove(task);
        return task + " removed from TodoList";
    }

    public String show(){
        return "";
    }

    public String status(){
        return "";
    }

    public String showComplete(){
        return "";
    }

    public String showIncomplete(){
        return "";
    }

    public String search(){
        return "";
    }


    public String sort(){
        return "";
    }


}
