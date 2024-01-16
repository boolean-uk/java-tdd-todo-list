package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        return tasks.add(task);
    }

    public ArrayList<Task> showTasks() {
        return tasks;
    }

    public ArrayList<Task> getCompleteTasks() {
        ArrayList<Task> completeTasks = new ArrayList<>();
        for(Task task : tasks) {
            if (task.complete) {
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public ArrayList<Task> getIncompleteTasks() {
        ArrayList<Task> completeTasks = new ArrayList<>();
        for(Task task : tasks) {
            if (!task.complete) {
                completeTasks.add(task);
            }
        }
        return completeTasks;
    }

    public String searchTasks(String taskName) {
        for(Task task : tasks) {
            if(task.name.equals(taskName)) {
                return "Found result for " + taskName;
            }
        }
        return "No results for " + taskName;
    }

    public boolean removeTask(String taskName) {
        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).name.equals(taskName)) {
                tasks.remove(tasks.get(i));
                return true;
            }
        }
        return false;
    }

    public ArrayList<Task> sortTasks(boolean descending) {
         Collections.sort(tasks, new Comparator<Task>() {
             @Override
             public int compare(Task task1, Task task2) {
                 return task1.name.compareToIgnoreCase(task2.name);
             }
         });
         if(descending) {
             Collections.reverse(tasks);
        }
         return tasks;
    }

}
