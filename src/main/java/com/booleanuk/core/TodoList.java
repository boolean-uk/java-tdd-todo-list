package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks = new ArrayList<>();
    public boolean add(Task task) {
        if (tasks.contains(task)) return false;
        tasks.add(task);
        return true;
    }

    public void showTasks() {
        tasks.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "tasks=" + tasks +
                '}';
    }
}
