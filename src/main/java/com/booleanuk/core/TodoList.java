package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    public ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public Task addTask(String name) {
        Task task = new Task(name);
        this.tasks.add(task);
        return task;
    }

    public String showTasks(ArrayList<Task> tasksToPrint) {
        StringBuilder tasksString = new StringBuilder("Name\t\t\t\tStatus\n");
        for(Task task : tasksToPrint) {
            tasksString.append(task.getName()).append("\t\t\t\t");
            if(task.getStatus()) {
                tasksString.append("Complete\n");
            } else {
                tasksString.append("Incomplete\n");
            }
        }
        return tasksString.toString();

    }

    public String showCompleteTasks() {
        ArrayList<Task> tasksToPrint = new ArrayList<>();
        for(Task task : this.tasks) {
            if(task.getStatus()) {
                tasksToPrint.add(task);
            }
        }
        return showTasks(tasksToPrint);
    }

    public String showIncompleteTasks() {
        ArrayList<Task> tasksToPrint = new ArrayList<>();
        for(Task task : this.tasks) {
            if(!task.getStatus()) {
                tasksToPrint.add(task);
            }
        }
        return showTasks(tasksToPrint);
    }

    public String search(String name) {
        return "";
    }

    public boolean delete(String name) {
        return false;
    }

    public ArrayList<Task> orderTasksAsc() {
        return new ArrayList<>();
    }

    public ArrayList<Task> orderTasksDesc() {
        return new ArrayList<>();
    }
}
