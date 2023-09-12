package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public HashMap<String, String> toDoList = new HashMap<>();

    public String addTask(String taskName, String status) {
        if (!toDoList.containsKey(taskName)) {
            toDoList.put(taskName, status);
            return "Done";
        }
        return "Task already exists";
    }

    public void printTasks() {
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            System.out.println("Task: " + entry.getKey() + " - Category: " + entry.getValue());
        }
    }

    public String changeStatus(String taskName, String status) {
        if (toDoList.containsKey(taskName)) {
            toDoList.put(taskName, status);
            return "Status changed";
        }
        return "Non-existent task";
    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();

        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            if (entry.getValue().equals("Completed")) {
                completedTasks.add(entry.getKey());
            }
        }
        return completedTasks;
    }

    public ArrayList<String> getUncompletedTasks() {
        ArrayList<String> uncompletedTasks = new ArrayList<>();

        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            if (entry.getValue().equals("Uncompleted")) {
                uncompletedTasks.add(entry.getKey());
            }
        }
        return uncompletedTasks;
    }

    public String searchTasks(String taskName) {
        if (toDoList.containsKey(taskName)) {
            return toDoList.get(taskName);
        }
        return "The task was not found";
    }

    public String removeTask(String taskName) {
        if (toDoList.containsKey(taskName)) {
            toDoList.remove(taskName);
            return "Done";
        }
        return "The task does not exist";
    }

    public ArrayList<String> ascendingSort() {
        ArrayList<String> tasks = new ArrayList<>();
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            tasks.add(entry.getKey());
        }
        Collections.sort(tasks);
        return tasks;
    }

    public ArrayList<String> descendingSort() {
        ArrayList<String> tasks = new ArrayList<>();
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            tasks.add(entry.getKey());
        }
        tasks.sort(Collections.reverseOrder());
        return tasks;
    }

}
