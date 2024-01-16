package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<>();
    }

    public boolean add(String task) {
        if (this.tasks.containsKey(task)) {
            return false;
        }
        this.tasks.put(task, false);
        return true;
    }

    public boolean remove(String task) {
        if (this.tasks.containsKey(task)) {
            this.tasks.remove(task);
            return true;
        }
        return false;
    }

}
