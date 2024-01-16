package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();
        for(Map.Entry<String, Boolean> e: tasks.entrySet()) {
            if(e.getValue()) {
                completedTasks.add(e.getKey());
            }
        }
        return completedTasks;
    }
}
