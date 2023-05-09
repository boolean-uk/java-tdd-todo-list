package com.booleanuk.core;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TodoList {

    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void add(String name) {
        tasks.add(new Task(name));
    }

    public void toggleCompleted(int id) {
        Optional<Task> selectedTask = tasks.stream().filter(task -> task.getId() == id).findFirst();
        if (selectedTask.isPresent()) {
            selectedTask.get().toggleCompleted();
        }
    }

    public List<Task> getTasks(boolean completed) {
        return tasks.stream().filter(task -> task.getCompleted() == completed).toList();
    }

    public Task getTask(int id) {
        Optional<Task> selectedTask = tasks.stream().filter(task -> task.getId() == id).findFirst();
        if (!selectedTask.isPresent()) {
            System.out.println("Task not found");
        }
        return selectedTask.isPresent() ? selectedTask.get() : null;
    }

    public void remove(int id) {
        tasks.remove(getTask(id));
    }

    public void sortAscending() {
        Collections.sort(tasks);
    }

    public void sortDescending() {
        Collections.sort(tasks, Collections.reverseOrder());
    }
}
