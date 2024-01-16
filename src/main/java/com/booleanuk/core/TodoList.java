package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList(){
        tasks = new ArrayList<>();
    }

    public void add(String task){
        if (!contains(task)){
            tasks.add(new Task(task));
        }
    }

    public void remove(String task){
        if (contains(task)){
            tasks.remove(find(task));
        } else {
            System.out.println("Task not in ToDo list.");
        }
    }

    public void changeStatus(String task, boolean newStatus){
        find(task).status = newStatus;
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
        return find(task).status;
    }

    public boolean contains(String task, ArrayList<Task> tasks){
        for (Task t : tasks){
            if (t.description.equals(task)){
                return true;
            }
        }
        return false;
    }

    public boolean contains(String task){
        return contains(task, this.tasks);
    }

    public Task find(String task){
        for (Task t : tasks){
            if (t.description.equals(task)){
                return t;
            }
        }
        return null;
    }
}
