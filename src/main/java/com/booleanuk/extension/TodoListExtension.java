package com.booleanuk.extension;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TodoListExtension {
    List<TaskExtension> tasks;

    public TodoListExtension() {
        tasks = new ArrayList<>();
    }

    public void add(TaskExtension task) {
        this.tasks.add(task);
    }

    public List<TaskExtension> getCompletedTasks() {
        return this.tasks
                .stream()
                .filter(
                        task -> task.getStatus().equals(TaskStatusExtension.COMPLETED))
                .toList();
    }

    public List<TaskExtension> getIncompletedTasks() {
        return this.tasks
                .stream()
                .filter(
                        task -> task.getStatus().equals(TaskStatusExtension.INCOMPLETED))
                .toList();
    }


    public List<TaskExtension> getTasks() {
        return this.tasks;
    }

    public void removeTask(com.booleanuk.core.Task task) {
        this.tasks.remove(task);
    }

    public String search(TaskExtension task) {
        Optional<TaskExtension> foundTask = tasks.stream()
                .filter(t -> t.getTitle().equals(task.getTitle()))
                .findFirst();
        return foundTask.map(t -> "Task found: " + t.getTitle())
                .orElse("Task not found");
    }

    public List<TaskExtension> sortAscending() {
        List<TaskExtension> sortedAscTasks = new ArrayList<>(tasks);
        sortedAscTasks.sort(Comparator.comparing(TaskExtension::getTitle));
        return sortedAscTasks;
    }

    public List<TaskExtension> sortDescending() {
        List<TaskExtension> sortedAscTasks = new ArrayList<>(tasks);
        sortedAscTasks.sort(Comparator.comparing(TaskExtension::getTitle).reversed());
        return sortedAscTasks;
    }

    public Optional<TaskExtension> getTaskById(UUID id) {
        return this.tasks.stream().filter(task -> task.getId().equals(id)).findFirst();

    }
}

