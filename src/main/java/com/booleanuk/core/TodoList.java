package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    public HashMap<String, String> taskList;

    public TodoList(){
        this.taskList = new HashMap<>();
    }

    public boolean addTask(String task, String status){
        if(taskList.containsKey(task)){
            System.out.println("Task already exits");
            return false;
        }
        taskList.put(task, status);
        System.out.println("Task added successfully!");
        return true;
    }


}
