package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    public HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<String, Boolean>();
    }

    public boolean addTask(String task) {
        if (task.isBlank()) {
            return false;
        } else {
            return this.tasks.putIfAbsent(task.strip(), false) == null;
        }
    }

    public String getTasks() {
        if (this.tasks.isEmpty()) {
            return "No tasks in your list yet!";
        }
        return "Tasks: " + String.join(", ", this.tasks.keySet());
    }

    public String changeTaskStatus(String task) {
        if (this.tasks.containsKey(task)) {
            this.tasks.put(task, !this.tasks.get(task));
            return String.format("Task '%s' is now set to %s.",
                    task,
                    this.tasks.get(task) ? "complete" : "incomplete");
        } else {
            return "Couldn't update status, task doesn't exist";
        }
    }
}
