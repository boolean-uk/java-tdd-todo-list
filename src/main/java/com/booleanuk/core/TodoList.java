package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean add(Task task) {
        return tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void clear() {
        this.tasks.clear();
    }
}
