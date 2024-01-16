package com.booleanuk.extension;

import java.util.ArrayList;

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

    public void clear() {
        this.tasks.clear();
    }
}
