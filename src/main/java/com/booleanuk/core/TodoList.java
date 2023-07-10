package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }
    public String searchTaskByName(String name){
        for (Task task : tasks){
            if(task.getName().equals(name))
                return task.toString();
        }
        return "Task not found";
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public String removeTask(String name){
        for (Task task : tasks){
            if(task.getName().equals(name)){
                tasks.remove(task);
                return "Task removed";
            }
        }
        return "Task not found";
    }

    public String displayInAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName))
                .collect(Collectors.toList());
        return displayAll();
    }

    public String displayInReverseAlphabeticalOrder(){
        List<Task> sortedList = tasks.stream()
                .sorted(Comparator.comparing(Task::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        return displayAll();
    }
}
