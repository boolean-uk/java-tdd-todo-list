package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        return tasks.add(task);
    }

    public ArrayList<Task> showTasks() {
        return tasks;
    }


}
