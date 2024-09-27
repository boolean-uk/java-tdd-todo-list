package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class TodoList {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String name) {
        tasks.add(Task.of(name));
    }

    public void updateTaskName(long id, String newName) {
        var task = getTask(id)
                .orElseThrow(() -> new NoSuchElementException(String.format("[%d]: task not found", id)));

        task.setName(newName);
    }


    public void toggleTaskStatus(long id) {
        var task = getTask(id).
                orElseThrow(() -> new NoSuchElementException(String.format("[%d]: task not found", id)));

        task.toggleStatus();

        System.err.printf("[%d] Status had been changed: %s", id, task.getStatus());
    }

    public Optional<Task> getTask(long id) {
        for (var t : tasks) {
            if (t.getId() == id) {
                return Optional.of(t);
            }
        }

        return Optional.empty();
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void clear() {
        tasks.clear();
    }
}
