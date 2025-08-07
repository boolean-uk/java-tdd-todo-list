package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TodoList {
    private HashMap<String, Boolean> taskMap;

    public TodoList(){
        this.taskMap = new HashMap<>();
    }

    public HashMap<String, Boolean> getTaskMap(){
        return taskMap;
    }

    public boolean add(String task){
        if(task.isEmpty() || task.trim().isEmpty() || taskMap.containsKey(task))
            return false;

        taskMap.put(task, false);

        return true;
    }

    public ArrayList<String> showTasks(){
        return new ArrayList<>(taskMap.keySet());
    }

    public boolean changeStatus(String task, boolean complete){
        if (taskMap.containsKey(task)) {
            taskMap.put(task, complete);
            return true;
        }
        return false;
    }

    public ArrayList<String> getCompleted(){
        ArrayList<String> completed = new ArrayList<>();
        for(String task : taskMap.keySet()){
            if(taskMap.get(task)){
                completed.add(task);
            }
        }
        return completed;
    }

    public ArrayList<String> getIncompleted(){
        ArrayList<String> inComplete = new ArrayList<>();
        for(String task : taskMap.keySet()){
            if(!taskMap.get(task)){
                inComplete.add(task);
            }
        }
        return inComplete;
    }

    public String search(String task){
        if(taskMap.isEmpty())
            return "No tasks";

        if(taskMap.containsKey(task)){
            return task;
        }

        return "Task wasn't found";
    }

    public boolean remove(String task){
        if(taskMap.containsKey(task)) {
            taskMap.remove(task);
            return true;
        }
        return false;
    }

    public ArrayList<String> tasksAscending(){
        ArrayList<String> sortedTasks = new ArrayList<>(taskMap.keySet());
        Collections.sort(sortedTasks);
        return sortedTasks;
    }

    public ArrayList<String> tasksDescending(){
        ArrayList<String> sortedTasks = new ArrayList<>(taskMap.keySet());
        Collections.sort(sortedTasks);
        Collections.reverse(sortedTasks);
        return sortedTasks;
    }

}
