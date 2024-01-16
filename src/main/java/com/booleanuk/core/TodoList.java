package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, String> taskList;

    public TodoList() {
        this.taskList = new HashMap<>();
    }

    public boolean add(String task) {
        if (taskList.containsKey(task)){
            return false;
        }else {
            taskList.put(task, "Incomplete");
            return true;
        }
    }

    public String viewTask() {
        return "Task:"+ taskList;
    }

}
