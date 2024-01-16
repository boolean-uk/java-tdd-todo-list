package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task){
        if (!search(task)){
            tasks.add(new Task(task));
        }
    }

    public void remove(String task){
        if (search(task)){
            tasks.removeIf(t -> t.description.equals(task));
        } else {
            System.out.println("Task not in ToDo list.");
        }
    }

    public void changeStatus(String task, boolean newStatus){

    }

    public ArrayList<Task> completeTasks(){
        return null;
    }

    public ArrayList<Task> incompleteTasks(){
        return null;
    }

    public ArrayList<Task> tasksAscending(){
        return null;
    }

    public ArrayList<Task> tasksDescending(){
        return null;
    }

    public boolean status(String task){
        return true;
    }

    public boolean search(String task, ArrayList<Task> tasks){
        for (Task t : tasks){
            if (t.description.equals(task)){
                return true;
            }
        }
        return false;
    }

    public boolean search(String task){
        return search(task, this.tasks);
    }
}
