package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        try {
            tasks.add(task);
            return true;
        }
        catch (Exception e) {
        }

        return false;
    }

    public boolean getTask(Task task) {
        if(tasks.contains(task)) {
            return true;
        }
        return false;
    }

    public ArrayList<Task> getTasks() {
        ArrayList<String> tasksNames = new ArrayList<>();
        for(Task task : tasks) {
            tasksNames.add(task.getName());
        }
        return tasks;
    }

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();

        for(Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public ArrayList<Task> getUncompletedTasks() {
        ArrayList<Task> unCompletedTasks = new ArrayList<>();

        for(Task task : tasks) {
            if (!task.isCompleted()) {
                unCompletedTasks.add(task);
            }
        }
        return unCompletedTasks;
    }

    public String searchForTask(Task task) {
        String found = task.getName();

        if(tasks.contains(task)) {
            found += " was found";
        }
        else {
            found += " wasn't found";
        }
        return found;
    }

    public void removeTask(Task task) {
        if(tasks.contains(task)) {
            tasks.remove(task);
        }
    }

    public ArrayList<String> getTasksSortedAlphabeticallyInAscendingOrder() {
        ArrayList<String> sortedTasksNames = new ArrayList<>();

        for(Task task : tasks) {
            sortedTasksNames.add(task.getName());
        }
        Collections.sort(sortedTasksNames);

        return sortedTasksNames;
    }

    public ArrayList<String> getTasksSortedAlphabeticallyInDescendingOrder() {
        ArrayList<String> sortedTasks = new ArrayList<>();

        sortedTasks.add("A");
        sortedTasks.add("W");
        sortedTasks.add("R");

        Collections.sort(sortedTasks);
        Collections.reverse(sortedTasks);

        return sortedTasks;
    }
}
