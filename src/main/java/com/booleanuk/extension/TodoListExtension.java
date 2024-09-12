package com.booleanuk.extension;

import java.util.ArrayList;


public class TodoListExtension {
    public ArrayList<Task> tasks;

    public TodoListExtension() {
        this.tasks = new ArrayList<Task>();
    }

    public boolean addTask(String task, String timeAndDate) {
        if (task.isBlank()) {
            return false;
        } else {
            return this.tasks.add(new Task(task, timeAndDate));
        }
    }

    public String getTaskById(int id) {
        Task task = this.tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        return task != null
                ? String.format("Task %d: %s - %s", task.getId(), task.getName(), task.getStatus() ? "completed" : "incomplete")
                : "Task not found";
    }

    public boolean updateTaskName(int id, String newName) {
        Task task = this.tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (task != null) {
            return task.setName(newName);
        }
        return false;
    }

    public String changeTaskStatus(int id) {
        Task task = this.tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (task != null) {
            task.toggleStatus();
            return String.format("Task %s updated successfully.", task.getName());
        }
        return "Task not found.";
    }

    public String getTaskTimeAndDate(int id) {
        Task task = this.tasks.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        return task != null
                ? task.getTimeAndDate()
                : "Task not found.";
    }
}
