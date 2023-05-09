package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getCompleteTasks() {
        return tasks.stream().filter(x -> x.status == true).toList();
    }

    public List<Task> getIncompleteTasks() {
        return tasks.stream().filter(x -> x.status == false).toList();
    }

    public String searchTaskByName(String) {
        return "Error not found";
    }
}
