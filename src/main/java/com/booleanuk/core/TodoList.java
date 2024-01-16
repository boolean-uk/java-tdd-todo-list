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

    public ArrayList<Task> getTasks(boolean completion) {
        ArrayList<Task> tmpArray = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted() == completion) {
                tmpArray.add(task);
            }
        }
        return tmpArray;
    }

    public void clear() {
        this.tasks.clear();
    }
}
