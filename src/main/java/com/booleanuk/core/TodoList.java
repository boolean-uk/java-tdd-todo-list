package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public String searchTask(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                return "The task was found.";
            }
        }
        return "The task could not be found.";
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public String displayAllTasks() {
        if (tasks.isEmpty()) {
            return "No tasks were found.";
        }

        StringBuilder result = new StringBuilder();
        for (Task task : tasks) {
            result.append(task.getName()).append(", ").append(task.isCompleted() ? "complete" : "incomplete").append("\n");
        }
        return result.toString();
    }

    public boolean updateTask(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.setCompleted(!task.isCompleted());
                return true;
            }
        }
        return false;
    }
    public void setTaskStatus(int taskId, boolean complete) {
        if (taskId >= 0 && taskId < tasks.size()) {
            tasks.get(taskId).setCompleted(complete);
        }
    }
    public List<Task> getCompleteTasks() {
        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }
    public List<Task> getIncompleteTasks() {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }
    public void removeTask(int taskId) {
        if (taskId >= 0 && taskId < tasks.size()) {
            tasks.remove(taskId);
        }
    }
    public List<Task> getAllTasksOrderedAscending() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getName))
                .collect(Collectors.toList());
    }
    public List<Task> getAllTasksOrderedDescending() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getName).reversed())
                .collect(Collectors.toList());
    }


}
