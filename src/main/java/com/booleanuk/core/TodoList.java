package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        for(Task task : this.tasks) {
            if(task.getName().equals(name)) {
                return name + " was found";
            }
        }
        return name + " was not found";
    }

    public boolean delete(String name) {
        for(Task task : this.tasks) {
            if(task.getName().equals(name)) {
                this.tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> orderTasksAsc() {
        this.tasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getName().toLowerCase().compareTo(t2.getName().toLowerCase());
            }

        });
        return this.tasks;
    }

    public ArrayList<Task> orderTasksDesc() {
        Collections.reverse(orderTasksAsc());
        return this.tasks;
    }
}
