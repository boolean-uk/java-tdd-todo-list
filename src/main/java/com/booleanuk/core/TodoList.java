package com.booleanuk.core;

import java.util.*;

public class TodoList {

    private List<Task> tasks = new ArrayList<>();
    private int lastId = 0;


    public int add(Task task) {
        task.setId(++lastId);
        tasks.add(task);
        return task.getId();
    }

    public List<String> getAll() {
        return tasks.stream().map(Task::toString).toList();
    }


    public boolean toggleTaskStatus(int id) {
        return getById(id).toggleStatus();
    }

    public Task getById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElseThrow();
    }

    public List<Task> getTasksAscending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);

        sortedTasks.sort(Comparator.comparing(Task::getName));

        return sortedTasks;

    }

    public List<Task> getTasksDescending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);

        sortedTasks.sort(Comparator.comparing(Task::getName).reversed());

        return sortedTasks;
    }

    public List<Task> getCompleteTasks() {
        return tasks.stream().filter(Task::isComplete).toList();
    }

    public List<Task> getIncompleteTasks() {
        return tasks.stream().filter(task -> !task.isComplete()).toList();
    }

    public boolean taskExists(int id) {
        return tasks.stream().anyMatch(task -> task.getId() == id);
    }
}
