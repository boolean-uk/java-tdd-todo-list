package com.booleanuk.extension;

import java.util.*;

public class TodoList {

    HashMap<String, Task> tasks;

    public TodoList() {
        tasks = new HashMap<>();
    }
    public boolean addTask(String name, String id) {
        if(tasks.containsKey(id)) {
            return false;
        }
        tasks.put(id, new Task(id, name));
        return true;
    }

    public String seeList() {
        String list = "";
        for(Task task: tasks.values()) {
            list += task.name + "\n";
        }
        return list.substring(0, list.length()-1);
    }
//
//    public boolean updateTaskStatus(String task, boolean newStatus) {
//        if(!tasks.containsKey(task)) {
//            return false;
//        }
//        tasks.put(task, newStatus);
//        return true;
//    }
//
//    public ArrayList<String> getCompletedTasks() {
//        return getTasks(true);
//    }
//
//    public ArrayList<String> getUncompletedTasks() {
//        return getTasks(false);
//    }
//
//    private ArrayList<String> getTasks(boolean status) {
//        ArrayList<String> tasksWithTheSuppliedStatus = new ArrayList<>();
//        for(Map.Entry<String, Boolean> e: tasks.entrySet()) {
//            if(e.getValue() == status) {
//                tasksWithTheSuppliedStatus.add(e.getKey());
//            }
//        }
//        return tasksWithTheSuppliedStatus;
//    }
//
//    public String doesTaskExist(String task) {
//        return tasks.containsKey(task)? "The task exists!" : "The task doesn't exist!";
//    }
//
//    public boolean remove(String task) {
//        if(!tasks.containsKey(task)) {
//            return false;
//        }
//        tasks.remove(task);
//        return true;
//    }
//
//    public ArrayList<String> getListInAlphabeticalOrder(boolean ascending) {
//        ArrayList<String> keys = new ArrayList<>(tasks.keySet());
//        Collections.sort(keys);
//        if(ascending) {
//            return keys;
//        }
//        Collections.reverse(keys);
//        return keys;
//    }
}
