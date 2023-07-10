package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TodoList {
    List<Task> tasks = new ArrayList<>();

    public boolean addTask(String text) {
        if (tasks.stream()
                .anyMatch(task ->
                        Objects.equals(task.text, text)
                )) {
            return false;
        }

        return tasks.add(new Task(text));
    }

    public String displayTasks() {
        StringBuilder result = new StringBuilder();
        result.append("Tasks to do: \n");
        tasks.forEach(task -> result.append("Completed: ")
                .append(task.isCompleted)
                .append(" | ")
                .append(task.text)
                .append("\n"));
        return result.toString();
    }
}
