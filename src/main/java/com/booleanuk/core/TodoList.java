package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public void changeCompleteValue(Task task) {
        task.complete = !task.complete;
    }

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.complete) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks() {
        ArrayList<Task> incompleteTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (!task.complete) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public String searchTaskByName(Task task){
        if (tasks.contains(task)){
            return "Task found!";
        }
        return "Task was not found!";
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    public ArrayList<String> sortTasksAscending() {
        ArrayList<String> sortedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            sortedTasks.add(task.name);
        }
        Collections.sort(sortedTasks);
        return sortedTasks;
    }

    public ArrayList<String> sortTasksDescending() {
        ArrayList<String> sortedTasks = new ArrayList<>();
        for (Task task : this.tasks) {
            sortedTasks.add(task.name);
        }
        sortedTasks.sort(Collections.reverseOrder());
        return sortedTasks;
    }


}

