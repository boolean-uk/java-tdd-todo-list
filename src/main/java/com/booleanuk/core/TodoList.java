package com.booleanuk.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TodoList {

    Map<String, String> toDoList;

    public TodoList() {
        toDoList = new HashMap<>();
    }

    public void add(String task) {
        toDoList.put(task, "incomplete");
    }

    public Map<String, String> allTasks() {
        return toDoList;
    }

    public void changeStatusOfTask(String task) {
        if(toDoList.containsKey(task)) {
            if(toDoList.get(task).equals("complete")) {
                toDoList.put(task, "incomplete");
            }else if(toDoList.get(task).equals("incomplete")) {
                toDoList.put(task, "complete");
            }
        }
    }

    public List<String> completeTasks() {
        return toDoList.entrySet().stream().filter(e -> "complete".equals(e.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public List<String> inCompleteTasks() {
        return toDoList.entrySet().stream().filter(e -> "incomplete".equals(e.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
    }

}
