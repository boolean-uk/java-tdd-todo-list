package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        tasks.add(task);
        return true;
    }
}
