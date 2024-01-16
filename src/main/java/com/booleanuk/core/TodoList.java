package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> tasks;

    public TodoList() {
        tasks = new HashMap<>();
    }
    public boolean addTask(String task) {
        if(tasks.containsKey(task)) {
            return false;
        }
        tasks.put(task, false);
        return true;
    }

}
