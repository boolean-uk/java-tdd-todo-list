package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public boolean add(Task task) {
        if (tasks.contains(task)) return false;

        tasks.add(task);

        return true;
    }

    public List<Task> tasks() {
        return this.tasks;
    }

    public boolean update(Task task, boolean status) {
        // doesnt exists
        int position = tasks.indexOf(task);
        if (position == -1) return false;

        Task t = tasks.get(position);

        if (t.completed && status) return false;

        if (!t.completed && !status) return false;

        t.completed = status;

        return true;
    }

    public List<Task> completedTasks() {
        return tasks.stream().filter(t -> t.completed).collect(Collectors.toList());
    }

    public List<Task> incompleteTasks() {
        return tasks.stream().filter(t -> !t.completed).collect(Collectors.toList());
    }

    public String contains(Task task) {
        return tasks.contains(task) ?
            "Task is already in the list" :
            "Task is not in the list";
    }

    public boolean remove(Task task) {
        return tasks.remove(task);
    }

    public List<Task> sortAlphabeticallyAscending() {
        return tasks.stream().sorted(Comparator.comparing(t -> t.name)).collect(Collectors.toList());
    }

    public List<Task> sortAlphabeticallyDescending() {
        ArrayList<Task> sortedList = new ArrayList<>(tasks);

        sortedList.sort(Comparator.comparing(t -> t.name, Comparator.reverseOrder()));

        return sortedList;
    }
}
