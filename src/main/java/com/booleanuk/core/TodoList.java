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
}
