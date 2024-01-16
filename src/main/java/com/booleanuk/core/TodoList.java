package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, String> toDoList;
    public TodoList(){
        this.toDoList = new HashMap<String, String>();
    }

    public boolean addTask(String task){
            if (toDoList.containsKey(task)) {
                return false;
            }
            toDoList.put(task, "incomplete");
            return true;
    }
    public void seeAllTasks(){
        System.out.println(toDoList.toString());
    }


}
