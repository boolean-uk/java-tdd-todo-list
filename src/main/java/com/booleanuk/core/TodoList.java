package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        try {
            tasks.add(task);
            return true;
        }
        catch (Exception e) {
        }

        return false;
    }

    public boolean getTask(Task task) {
        if(tasks.contains(task)) {
            return true;
        }
        return false;
    }
}
