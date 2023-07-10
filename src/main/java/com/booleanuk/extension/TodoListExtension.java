package com.booleanuk.extension;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TodoListExtension {
    List<TaskExtension> tasks;

    public TodoListExtension() {
        tasks = new ArrayList<>();
    }

    public void add(TaskExtension task) {
        this.tasks.add(task);
    }

    public TaskExtension getTaskById(UUID id) {
        return this.tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElseThrow();
    }

    public void renameTask(UUID id, String nameAfter) {
        this.tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElseThrow().setTitle(nameAfter);

    }
}

