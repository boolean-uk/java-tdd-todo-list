package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoList {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String name) {
        var isPresent = tasks.stream()
                .map(Task::name)
                .toList()
                .contains(name);

        if (isPresent) {
            throw new IllegalStateException(String.format("[%s]:\tTask already exists", name));
        }

        tasks.add(Task.of(name));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void toggleTaskStatus(String name) {
        // TODO
    }

    public List<Task> getAllTasksByStatus(TaskStatus status) {
        // TODO
        return null;
    }

    public Optional<Task> getOneTaskByName(String name) {
        // TODO
        return null;
    }

    public void removeOneTaskByName(String name) {
        // TODO
    }

    public List<Task> getAllTasksSorted(SortingOrder sortingOrder) {
        // TODO
        return null;
    }

    public void clear() {
        tasks.clear();
    }
}
