package com.booleanuk.core;

import java.util.*;

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

    public String searchTaskByName(String name) {
        if (tasks.stream().anyMatch(x -> x.name.equals(name))) {
            return "Task found!";
        } else {
            return "Error not found";
        }
    }

    public List<Task> getTaskOrderedNameAsc() {
        List<Task> orderedTasks = tasks;
        orderedTasks.sort(Comparator.comparing(o -> o.name));
        return orderedTasks;
    }

    public List<Task> getTaskOrderedNameDesc() {
        List<Task> orderedTasks = tasks;
        orderedTasks.sort(Comparator.comparing(o -> o.name));
        Collections.reverse(orderedTasks);
        return orderedTasks;
    }
}
