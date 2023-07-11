package com.booleanuk.core;

import java.util.Collections;
import java.util.*;


public class TodoList {
    private final List<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public int add(String task) {
        tasks.add(task);
        System.out.println("Added a new task!");
        return tasks.size();
    }

    public String seeAll() {
        return tasks.toString();
    }

    public String statusChange(String task, boolean complete) {
        int index = tasks.indexOf(task);
        if (index != -1) {
            tasks.set(index, complete ? task + " [Complete]" : task + " [Incomplete]");
        }
        System.out.println("Successfully changed the status!");
        return tasks.toString();
    }

    public String getComplete() {
        List<String> completeTasks = new ArrayList<>();
        for (String task : tasks) {
            if (task.endsWith("[Complete]")) {
                completeTasks.add(task);
            }
        }
        return completeTasks.toString();
    }

    public String getIncomplete() {
        List<String> incompleteTasks = new ArrayList<>();
        for (String task : tasks) {
            if (task.endsWith("[Incomplete]")) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks.toString();
    }

    public String search(String task) {
        if (tasks.contains(task)) {
            return "Task was found.";
        } else {
            return "Task was not found.";
        }
    }

    public int remove(String task) {
        tasks.remove(task);
        return tasks.size();
    }

    public String sortAscend() {
        List<String> sortedTasks = new ArrayList<>(tasks);
        Collections.sort(sortedTasks);
        return sortedTasks.toString();
    }

    public String sortDescend() {
        List<String> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.reverseOrder());
        return sortedTasks.toString();
    }
}


