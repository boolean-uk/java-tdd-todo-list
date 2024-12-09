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

    public int renameTask(int id, String description) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setDescription(description);
                return id;
            }
        }
        return -1;
    }

    public int setCompletionStatus(int id, boolean completion) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(completion);
                return id;
            }
        }
        return -1;
    }

    public void clear() {
        this.tasks.clear();
    }
}
