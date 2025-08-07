package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {

        for (Task t : tasks) {
            if (t.getName().equalsIgnoreCase(task.getName())) {
                return false;
            }
        }
        tasks.add(task);
        return true;
    }

    public Task getTaskById(String id) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
    public boolean updateTaskName(String id, String newName) {
        for (Task t : tasks) {
            if (t.getName().equalsIgnoreCase(newName)) {
                return false;
            }
        }
        Task task = getTaskById(id);
        if (task != null) {
            task.setName(newName);
            return true;
        }
        return false;
    }

    public boolean toggleStatusById(String id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.toggleCompleted();
            return true;
        }
        return false;
    }

    public List<Task> getAllTasks() {

        return this.tasks;
    }
}
