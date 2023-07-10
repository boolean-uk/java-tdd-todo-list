package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

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
                .toList();
    }

    public List<Task> getIncompletedTasks() {
        return this.tasks
                .stream()
                .filter(
                        task -> task.getStatus().equals(TaskStatus.INCOMPLETED))
                .toList();
    }

}
