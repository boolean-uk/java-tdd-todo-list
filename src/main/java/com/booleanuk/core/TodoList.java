package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    public HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<String, Boolean>();
    }

    public boolean addTask(String task) {
        return this.tasks.putIfAbsent(task, false) == null;
    }
}
