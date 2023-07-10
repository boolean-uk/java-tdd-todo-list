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

    public String taskExists(int id) {
        if (tasks.stream().anyMatch(task -> task.getId() == id)) {
            return String.format("Task with id %d exists in todo list.", id);
        }
        return String.format("Task with id %d doesn't exist in todo list.", id);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void removeTask(int i) {
    }
}
