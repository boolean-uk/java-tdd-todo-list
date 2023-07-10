package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TodoList {
    List<Task> tasks = new ArrayList<>();

    public void add(String taskDescription) {
        Task taskToAdd = new Task(taskDescription);
        tasks.add(taskToAdd);
    }

    public List<String> getTaskNames() {
        return tasks.stream().map(Task::getName).toList();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getTasks(STATUS status) {
        return tasks.stream().filter(
                task -> task.getStatus().equals(status)).toList();
    }

    public boolean changeStatus(long id, STATUS status) {
        Optional<Task> task = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (task.isEmpty()) return false;
        task.get().setStatus(status);
        return true;
    }

    public void remove(long id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public List<Task> getTasksOrderedAsc() {
        return tasks.stream().sorted(Comparator.comparing(Task::getName)).toList();
    }

    public List<Task> getTasksOrderedDesc() {
        return tasks.stream().sorted(Comparator.comparing(Task::getName).reversed()).toList();
    }
}
