package com.booleanuk.core;

import java.util.*;


public class TodoList {
    private final HashMap<Integer, Task> taskHashMap;
    private int idCounter;
    TodoList() {
        taskHashMap = new HashMap<Integer, Task>();
        idCounter = 0;
    }
    public boolean contains(Task task) {
        return taskHashMap.containsValue(task);
    }
    public boolean add(String description, boolean isComplete) {
        for(Task task : taskHashMap.values()) {
            if(task.getDescription().equals(description))
                return false;
        }
        taskHashMap.put(idCounter++, new Task(description, isComplete));
        return true;
    }
    public boolean add(Task task) {
        if(taskHashMap.containsValue(task))
            return false;
        taskHashMap.put(idCounter++, task);
        return true;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Task task : taskHashMap.values())
            sb.append(task);
        return sb.toString();
    }
    public void changeStatus(String taskDescription, boolean newStatus) {
        for(Task task : taskHashMap.values())
            if(task.getDescription().equals(taskDescription))
            {
                task.setCompletion(newStatus);
                return;
            }
    }

    public String getTasksByCompletion(boolean isComplete) {
        StringBuilder sb = new StringBuilder();
        for(Task task : taskHashMap.values())
            if(task.getCompletion() == isComplete)
                sb.append(task);
        return sb.toString();
    }

    public Task search(String taskDescription) {
        for(Task task : taskHashMap.values())
            if(task.getDescription().equals(taskDescription))
                return task;
        System.out.println("Task with matching description not found.");
        return null;
    }

    public void remove(String taskDescription) {
        taskHashMap.entrySet().removeIf(entry -> (entry.getValue().getDescription().equals(taskDescription)));
    }
    public void remove(Task task) {
        taskHashMap.entrySet().removeIf(entry -> (entry.getValue().equals(task)));
    }
    public List<Task> getInAlphabeticalOrder(boolean ascending) {
        List<Task> list = new LinkedList<>(taskHashMap.values());
        list.sort(Comparator.comparing(Task::getDescription));
        if(!ascending) Collections.reverse(list);
        return list;
    }
}
