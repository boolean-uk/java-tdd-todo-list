package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }
    public boolean addTask(Task task){
        boolean taskExists;
        if(taskExists(task)){
            return false;
        }
        tasks.add(task);
        return true;
    }
    public boolean taskExists(Task task){
        boolean exists = false;
        if(!tasks.isEmpty()){
            for(Task t: tasks){
                if(t.getName().equals(task.getName())){
                    exists = true;
                    break;
                }
            }
        }
        return exists;
    }
}
