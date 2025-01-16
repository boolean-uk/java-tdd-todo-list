package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> tasks;

    public TodoList(HashMap<String, Boolean> tasks){
        this.tasks = tasks;
    }


    // Task 1
    public boolean add(String taskName){
        if(!this.tasks.containsKey(taskName)){
            this.tasks.put(taskName, false);
            return true;
        }
        return false;
    }


    // Task 2
    public String listTasks(){
        if(this.tasks.isEmpty()){
            return "The todolist does not contain any tasks!";
        }
        String listOfTasks = "";
        for(String task : this.tasks.keySet()){
            listOfTasks += task + ", ";
        }
        return listOfTasks;
    }


    // Task 3
    public boolean updateTaskStatus(String task, Boolean status){
        if(this.tasks.containsKey(task)){
            this.tasks.put(task, status);
            return true;
        }
        return false;
    }


    // Task 4
    public String getCompletedTasks(){
        String completedTasks = "";
        for(String task : this.tasks.keySet()){
            if(this.tasks.get(task).equals(true)){
                completedTasks += task + ", ";
            }
        }
        if(!completedTasks.equals("")){
            return completedTasks;
        }
        return "There are no completed tasks!";
    }


    // Task 5
    public String getUncompletedTasks(){
        String uncompletedTasks = "";
        for(String task : this.tasks.keySet()){
            if(this.tasks.get(task).equals(false)){
                uncompletedTasks += task + ", ";
            }
        }
        if(!uncompletedTasks.equals("")){
            return uncompletedTasks;
        }
        return "There are no uncompleted tasks!";
    }


    // Task 6
    public String SearchTask(String task){
        if(this.tasks.containsKey(task)){
            return "The task exist!";
        }
        return "The task does not exist!";
    }


    // Task 7
    public Boolean removeTask(String task){
        if(this.tasks.containsKey(task)){
            this.tasks.remove(task);
            return true;
        }
        return false;
    }


    // Task 8
    public String taskDescending(){
        if(this.tasks.isEmpty()){
            return "The todolist does not contain any tasks!";
        }
        else{
            ArrayList<String> sortedKeys = new ArrayList<>(this.tasks.keySet());
            Collections.sort(sortedKeys);
            Collections.reverse(sortedKeys);
            String tasksDescending = "";

            for(String task : sortedKeys){
                if(!task.equals(sortedKeys.getLast())){
                    tasksDescending += task + ", ";
                }
                else{
                    tasksDescending +=  task;
                }
            }
            return tasksDescending;
        }
    }


    // Task 9
    public String taskAscending(){
        if(this.tasks.isEmpty()){
            return "The todolist does not contain any tasks!";
        }
        else{
            ArrayList<String> sortedKeys = new ArrayList<>(this.tasks.keySet());
            Collections.sort(sortedKeys);
            String tasksAscending = "";

            for(String task : sortedKeys){
                if(!task.equals(sortedKeys.getLast())){
                    tasksAscending += task + ", ";
                }
                else{
                    tasksAscending +=  task;
                }
            }
            return tasksAscending;
        }
    }
}
