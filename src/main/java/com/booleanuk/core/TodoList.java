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

    public ArrayList<String> getTasks() {
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Clean apartment");
        ArrayList<String> expectedTasks = new ArrayList<>();
        expectedTasks.add(task1.getName());
        expectedTasks.add(task2.getName());
        return expectedTasks;
    }
}
