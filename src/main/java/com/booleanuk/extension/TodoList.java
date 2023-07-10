package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class TodoList {
    private List<Task> tasks = new ArrayList<>();
    public boolean add(Task task) {
        if (tasks.contains(task)) return false;
        tasks.add(task);
        return true;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void showTasks() {
        tasks.forEach(System.out::println);
    }

    public List<Task> getCompletedTasks() {
        return tasks.stream()
                .filter(task -> task.getStatus() == TaskStatus.COMPLETE)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "tasks=" + tasks +
                '}';
    }

    public void setStatus(int id, TaskStatus taskStatus) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus(taskStatus);
            }
        }
    }

    public List<Task> getIncompleteTasks() {
        return tasks.stream().filter(task -> task.getStatus().equals(TaskStatus.INCOMPLETE)).toList();
    }

    public Task search(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findAny().orElseThrow(() -> new NoSuchElementException("No task with id " + id + " found"));
    }

    public void remove(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void showAllTasksSortedAlphabetically(boolean ascending) {
        tasks.stream()
                .sorted((task1, task2) -> {
                    if (ascending) {
                        return task1.getDescription().compareTo(task2.getDescription());
                    } else {
                        return task2.getDescription().compareTo(task1.getDescription());
                    }
                })
                .forEach(System.out::println);
    }

    public void changeTaskName(int id, String description) {
        Task task = search(id);
        task.setDescription(description);
    }

    public LocalDateTime getTaskCreationDate(int id) {
        Task task = search(id);
        return task.getLocalDateTime();
    }
}
