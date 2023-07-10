package com.booleanuk.core;

import java.util.*;

public class TodoList {
    private final HashMap<String, Task> todoList = new HashMap<>();

    public boolean addTask(String name, String description){
        if (todoList.containsKey(name))
            return false;
        todoList.put(name, new Task(name, description));
        return true;
    }

    public Set<String> getAllTasks() {
        return todoList.keySet();
    }

    public Set<String> getCompleteTasks() {
        Set<String> completeTasksSet = new HashSet<>();
        for (String string : todoList.keySet()) {
            if (todoList.get(string).getStatus() == TaskStatus.COMPLETE) {
                completeTasksSet.add(string);
            }
        }
        return completeTasksSet;
    }

    public Set<String> getIncompleteTasks() {
        Set<String> incompleteTasksSet = new HashSet<>();
        for (String string : todoList.keySet()) {
            if (todoList.get(string).getStatus() == TaskStatus.INCOMPLETE) {
                incompleteTasksSet.add(string);
            }
        }
        return incompleteTasksSet;
    }

    public Task searchTask(String name) {
        return todoList.getOrDefault(name, null);
    }

    public boolean removeTask(String name) {
        return todoList.remove(name) != null;
    }

    public ArrayList<String> getAllTasksAscending() {
        ArrayList<String> sortedKeys = new ArrayList<>(getAllTasks());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }

    public ArrayList<String> getAllTasksDescending() {
        ArrayList<String> sortedKeys = new ArrayList<>(getAllTasks());
        sortedKeys.sort(Collections.reverseOrder());
        return sortedKeys;
    }

    public boolean changeStatus(String name, TaskStatus status){
        return todoList.get(name).setStatus(status);
    }
}
