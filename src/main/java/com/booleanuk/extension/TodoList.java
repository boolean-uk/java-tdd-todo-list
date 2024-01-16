package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    private int counter;
    private ArrayList<Task> tasks;

    public TodoList() {
        this.counter = 0;
        this.tasks = new ArrayList<>();
    }

    public int add(String description) {
        tasks.add(new Task(counter, description));
        return counter++;
    }

    public boolean remove(Task task) {
        return tasks.remove(task);
    }

    public Task getTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == (id)) {
                return task;
            }
        }
        return null;
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

    public ArrayList<Task> getAlphabeticalTasks(boolean ascending) {
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
