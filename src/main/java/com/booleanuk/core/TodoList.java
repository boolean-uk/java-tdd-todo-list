package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public List<Task> tasks = new ArrayList<>();

    public boolean addTask(String newTaskName){
        if (!tasks.contains(newTaskName)){
            Task task = new Task (newTaskName);
            tasks.add(task);
            return true;
        }
        else{
            return false;
        }

    }

    public String[] display(List<Task> arrayTasks){
        String[] returnTaskList = new String[arrayTasks.size()];
        for(int i=0; i < arrayTasks.size(); i++){
            returnTaskList[i] = arrayTasks.get(i).toString();
        }
        return returnTaskList;
    }
    /*
    private String[] displayAll(){
        return display(tasks);
    }

     */

    //private boolean changeStatus(){}





}
