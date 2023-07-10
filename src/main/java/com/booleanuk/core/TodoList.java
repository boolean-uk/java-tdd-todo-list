package com.booleanuk.core;

import java.util.*;

public class TodoList {

    private List<Task> tasks = new ArrayList<>();



    public int add(Task task) {

        tasks.add(task);
        return task.getId();
    }

    public List<String> getAll() {
        return tasks.stream().map(Task::toString).toList();
    }


    public boolean toggleTaskStatus(int id) {
        return getById(id).toggleStatus();
    }

    public Task getById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElseThrow();
    }

    public List<Task> getTasksAscending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);

        sortedTasks.sort(Comparator.comparing(Task::getName));

        return sortedTasks;

    }
}
