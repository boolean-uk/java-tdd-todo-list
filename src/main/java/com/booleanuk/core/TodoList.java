package com.booleanuk.core;

import java.util.ArrayList;

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
            if(tasks.get(i).name ==  taskName) {
                tasks.remove(tasks.get(i));
                return true;
            }
        }
        return false;
    }

}
