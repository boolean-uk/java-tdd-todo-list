package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TodoList {
    private final HashMap<String, Task> taskList = new HashMap<>();

    public boolean addTask(String name, String description){

    }

    public HashMap<String, Task> getAllTasks() {

    }

    public HashMap<String, Task> getCompleteTasks() {

    }

    public HashMap<String, Task> getIncompleteTasks() {

    }

    public Task searchTask(String name) {

    }

    public boolean removeTask(String name) {

    }

    public ArrayList<String> getAllTasksAscending() {
        ArrayList<String> sortedKeys = new ArrayList<>(getAllTasks().keySet());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }

    public ArrayList<String> getAllTasksDescending() {
        ArrayList<String> sortedKeys = new ArrayList<>(getAllTasks().keySet());
        sortedKeys.sort(Collections.reverseOrder());
        return sortedKeys;
    }

    public boolean changeStatus(String name, TaskStatus status){

    }
}
