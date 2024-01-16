package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> tasks;

    public TodoList() {
        tasks = new HashMap<>();
    }
    public boolean addTask(String task) {
        if(tasks.containsKey(task)) {
            return false;
        }
        tasks.put(task, false);
        return true;
    }

    public String seeList() {
        String list = "";
        for(String task: tasks.keySet()) {
            list += task + "\n";
        }
        return list.substring(0, list.length()-1);
    }

    public boolean updateTaskStatus(String task, boolean newStatus) {
        if(!tasks.containsKey(task)) {
            return false;
        }
        tasks.put(task, newStatus);
        return true;
    }

}
