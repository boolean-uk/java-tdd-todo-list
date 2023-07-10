package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public List<Task> tasks = new ArrayList<>();

    public boolean addTask(Task newTaskName){
        if (!tasks.contains(newTaskName)){
            tasks.add(tasks.size(),newTaskName);
            return true;
        }
        else{
            return false;
        }

    }

    //private String[] displayAll(){}
    //private boolean changeStatus(){}





}
