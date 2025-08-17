package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TodoList {
    HashMap<String, Boolean> tasks = new LinkedHashMap<>();


    public Boolean addTask(String name) {
        if (name == null)
            return false;

        String nTrim = name.trim();
        if (nTrim.isEmpty())
            return false;

        if (tasks.containsKey(nTrim))
            return false;


        tasks.put(nTrim, false);
            return true;

        }



    public ArrayList<String> getTasks() {
        return new ArrayList<>(tasks.keySet());
    }



    public Boolean changeStatus(String name) {
        if (name == null)
            return false;
        String nTrim = name.trim();

        if (nTrim.isEmpty())
            return false;

        Boolean status = tasks.get(nTrim);
        if (status == null)
            return false;

        tasks.put(nTrim, !status);
        return true;

    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> doneTasks = new ArrayList<>();
        for (HashMap.Entry<String, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue() == true) {
                doneTasks.add(entry.getKey());
            }

        }
        return doneTasks;
    }

    public ArrayList<String> getIncompleteTasks() {
        ArrayList<String> doneTasks = new ArrayList<>();
        for (HashMap.Entry<String, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue() == false) {
                doneTasks.add(entry.getKey());
            }
        }
        return doneTasks;
    }

    public String search(String name){
        String nTrim = name.trim();
        if (tasks.containsKey(nTrim)) {
            return nTrim;
        }
        return "Task not found";
    }

    public boolean deleteTask(String name){
        if (name == null) {
            return false;
        }
        String nTrim = name.trim();
        if (nTrim.isEmpty()) {
            return false;
        }
        return tasks.remove(nTrim) != null;
    }

    public ArrayList<String> sortTasksAscOrder(){
        ArrayList<String> sortedTasks = new ArrayList<>(tasks.keySet());
        Collections.sort(sortedTasks);
        return sortedTasks;
    }

    public ArrayList<String> sortTasksDescOrder(){
        ArrayList<String> sortedTasks = new ArrayList<>(tasks.keySet());
        sortedTasks.sort(Collections.reverseOrder());
        return sortedTasks;
    }



}
