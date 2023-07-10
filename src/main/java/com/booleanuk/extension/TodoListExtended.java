package com.booleanuk.extension;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoListExtended {

    private final List<TaskExtended> tasks;

    public TodoListExtended() {
        tasks = new ArrayList<>();
    }

    public List<TaskExtended> getTasks() {
        return tasks;
    }

    public void updateTaskName(int id, String newName) {
        Optional<TaskExtended> selectedTask = tasks.stream().filter(task -> task.getId() == id).findFirst();
        selectedTask.ifPresent(task -> task.setName(newName));
    }

    public LocalDateTime getTaskCreationDate(int id) {
        Optional<TaskExtended> selectedTask = tasks.stream().filter(task -> task.getId() == id).findFirst();
        return selectedTask.map(TaskExtended::getCreatedAt).orElse(null);
    }
}
