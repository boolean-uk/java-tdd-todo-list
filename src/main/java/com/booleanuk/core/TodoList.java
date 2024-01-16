package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean add(Task task) {
        return tasks.add(task);
    }

    public boolean remove(Task task) {
        return tasks.remove(task);
    }

    public Task getTask(String description) {
        for (Task task : tasks) {
            // Only exact match
            if (task.getDescription().equals(description)) {
                return task;
            }
        }
        return null;
    }

    public ArrayList<Task> getTasks() {
        if (tasks.isEmpty()) {
            return null;
        }
        return tasks;
    }

    public ArrayList<Task> getTasks(boolean completion) {
        if (tasks.isEmpty()) {
            return null;
        }

        ArrayList<Task> tmpArray = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted() == completion) {
                tmpArray.add(task);
            }
        }
        return tmpArray;
    }

    public ArrayList<Task> getAlphabeticalTasks(boolean ascending) {
        if (tasks.isEmpty()) {
            return null;
        }

        ArrayList<Task> tmpArray = tasks;
        tmpArray.sort(Comparator.comparing(Task::getDescription));
        if (!ascending) {
            Collections.reverse(tmpArray);
        }
        return tmpArray;
    }

    public void clear() {
        this.tasks.clear();
    }
}
