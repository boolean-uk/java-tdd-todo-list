package com.booleanuk.core;

import java.util.*;

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
        return getTasks(true);
    }

    public ArrayList<String> getUncompletedTasks() {
        return getTasks(false);
    }

    private ArrayList<String> getTasks(boolean status) {
        ArrayList<String> tasksWithTheSuppliedStatus = new ArrayList<>();
        for(Map.Entry<String, Boolean> e: tasks.entrySet()) {
            if(e.getValue() == status) {
                tasksWithTheSuppliedStatus.add(e.getKey());
            }
        }
        return tasksWithTheSuppliedStatus;
    }

    public boolean doesTaskExist(String task) {
        return tasks.containsKey(task);
    }

    public boolean remove(String task) {
        if(!tasks.containsKey(task)) {
            return false;
        }
        tasks.remove(task);
        return true;
    }

    public ArrayList<String> getListInAlphabeticalOrder(boolean ascending) {
        ArrayList<String> keys = new ArrayList<>(tasks.keySet());
        Collections.sort(keys);
        if(ascending) {
            return keys;
        }
        Collections.reverse(keys);
        return keys;
    }
}
