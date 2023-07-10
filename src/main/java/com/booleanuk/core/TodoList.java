package com.booleanuk.core;

import com.booleanuk.shared.SortingOrder;
import com.booleanuk.shared.TaskStatus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
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
        var task = getOneTaskByName(name)
                .orElseThrow(() -> new NoSuchElementException(String.format("[%s]: task not found", name)));

        task.toggleStatus();

        System.err.println("Status has been changed: " + task.status());
    }

    public List<Task> getAllTasksByStatus(TaskStatus status) {
        return tasks.stream()
                .filter(t -> t.status().equals(status))
                .toList();
    }

    public Optional<Task> getOneTaskByName(String name) {
        for (var t : tasks) {
            if (t.name().equals(name)) {
                return Optional.of(t);
            }
        }

        return Optional.empty();
    }

    public void removeOneTaskByName(String name) {
        var taskOpt = getOneTaskByName(name);

        if (taskOpt.isEmpty()) {
            return;
        }

        tasks.remove(taskOpt.get());
    }

    public List<Task> getAllTasksSorted(SortingOrder sortingOrder) {
        var comparator = switch (sortingOrder) {
            case Ascending -> Comparator.comparing(Task::name);
            case Descending -> Comparator.comparing(Task::name).reversed();
        };

        tasks.sort(comparator);

        return tasks;
    }

    public void clear() {
        tasks.clear();
    }
}
