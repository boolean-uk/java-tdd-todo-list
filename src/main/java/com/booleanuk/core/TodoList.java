package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getCompletedTasks() {
        return this.tasks
                .stream()
                .filter(
                        task -> task.getStatus().equals(TaskStatus.COMPLETED))
                .collect(Collectors.toList());
    }

    public List<Task> getIncompletedTasks() {
        return this.tasks
                .stream()
                .filter(
                        task -> task.getStatus().equals(TaskStatus.INCOMPLETED))
                .collect(Collectors.toList());
    }


    public List<Task> getTasks() {
        return this.tasks;
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public String search(Task task) {
        Optional<Task> foundTask = tasks.stream()
                .filter(t -> t.getTitle().equals(task.getTitle()))
                .findFirst();
        return foundTask.map(t -> "Task found: " + t.getTitle())
                .orElse("Task not found");
    }

    public List<Task> sortAscending() {
        List<Task> sortedAscTasks = new ArrayList<>(tasks);
        sortedAscTasks.sort(Comparator.comparing(Task::getTitle));
        return sortedAscTasks;
    }

    public List<Task> sortDescending() {
        List<Task> sortedAscTasks = new ArrayList<>(tasks);
        sortedAscTasks.sort(Comparator.comparing(Task::getTitle).reversed());
        return sortedAscTasks;
    }

}
