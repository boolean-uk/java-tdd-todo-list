package com.booleanuk.core;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TodoList {
    ArrayList<Task> tasks;
    HashMap<String, Boolean> completedTasks;
//    int toDoCapacity;
//    List<Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
//        this.toDoCapacity = 10;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }


    public ArrayList<Task> getCompletedTasks(){
        ArrayList<Task> getCompletedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.isComplete) {
                getCompletedTasks.add(task);
            }
        }
        return getCompletedTasks;
    }
    public void changeCompleteValue(Task task) {
        task.isComplete = !task.isComplete;
    }
    public void changeCompleteValue(String taskName) {
        for (Task task : tasks) {
            if (task.equals(taskName)) {
                task.isComplete = !task.isComplete;
                break;
            }
        }
    }

    public String searchTaskDoesNotExist(Task task){
        if(tasks.contains(task)) {
            return "Task is found in your list!";
        }
        return "Task is not found in your list!";
    }

    public ArrayList<Task> getNotCompletedTasks(){
        ArrayList<Task> getNotCompletedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (!task.isComplete) {
                getNotCompletedTasks.add(task);
            }
        }
        return getNotCompletedTasks;
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }
    public ArrayList<String> sortTasksInAscendingOrder() {
        ArrayList<String> sortedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            sortedTasks.add(task.name);
        }
        Collections.sort(sortedTasks);
        return sortedTasks;
    }

    public ArrayList<String> sortTasksInDescendingOrder() {
        ArrayList<String> sortedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            sortedTasks.add(task.name);
        }
        Collections.sort(sortedTasks, Collections.reverseOrder());
        return sortedTasks;
    }

}
