package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }
    public boolean addTask(Task task){
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
    public String taskExists(String name){
        return "";
    }
    public String getTodoList(){
        StringBuilder sb = new StringBuilder();
        for(Task t : tasks){
            if(t.isComplete()){
                sb.append(t.getName()).append(", Completed\n");
            }
            else{
                sb.append(t.getName()).append(", Not Complete\n");
            }

        }
        return sb.toString();
    }
    public boolean toggleStatus(String name){
        for(Task t: tasks){
            if(t.getName().equals(name)){
                t.setComplete(true);
                return true;
            }
        }
        return false;
    }
    public String getCompletedTasks(){
        StringBuilder sb = new StringBuilder("Completed Tasks\n");
        int count = 0;
        if(!tasks.isEmpty()){
            for(Task t : tasks){
                System.out.println(t.getName());
                if(t.isComplete()){
                    count++;
                    sb.append(t.getName()).append("\n");
                }
            }
            if(count > 0){
                return sb.toString();
            }
            else{
                return "There are no completed tasks";
            }

        }
        else{
            return "Task list is empty";
        }

    }
    public String getIncompleteTasks(){
        StringBuilder sb = new StringBuilder("Incomplete Tasks\n");
        int count = 0;
        if(!tasks.isEmpty()){
            for(Task t : tasks){
                if(!t.isComplete()){
                    count++;
                    sb.append(t.getName()).append("\n");
                }
            }
            if(count >0){
                return sb.toString();
            }
            else {
                return "There are no incomplete tasks";
            }
        }
        else{
            return "Task list is empty";
        }
    }
}
