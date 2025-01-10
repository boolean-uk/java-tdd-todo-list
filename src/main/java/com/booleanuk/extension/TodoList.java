package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int idCounter = 1; // gives unique ids to tasks

    ArrayList<Task> addTask(Task t) {
        t.setId(idCounter++);
        tasks.add(t);
        return tasks;
    }

    void completeTask(String taskName) {
        for (Task t : tasks) {
            if (t.getName().equals(taskName)) {
                t.complete();
            }
        }
    }

    ArrayList<Task> getAll() {
        return tasks;
    }

    ArrayList<Task> getCompleted() {
        ArrayList<Task> completed = new ArrayList<>();

        for (Task t : tasks) {
            if (t.isComplete())
                completed.add(t);
        }

        return completed;
    }

    ArrayList<Task> getIncompleted() {
        ArrayList<Task> incompleted = new ArrayList<>();

        for (Task t : tasks) {
            if (!t.isComplete())
                incompleted.add(t);
        }

        return incompleted;
    }

    ArrayList<Task> getAllAscending() {
        ArrayList<Task> ascending = new ArrayList<>(tasks);
        Collections.sort(ascending, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getName().compareToIgnoreCase(t2.getName());
            }
        });
        return ascending;
    }

    ArrayList<Task> getAllDescending() {
        ArrayList<Task> descending = getAllAscending();
        Collections.reverse(descending);
        return descending;
    }

    boolean search(String taskName) {
        for (Task t : tasks) {
            if (t.getName().equals(taskName))
                return true;
        }
        return false;
    }

    Task removeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName().equals(taskName)) {
                return tasks.remove(i);
            }
        }
        return null;
    }

    Task getTaskId(int id) {
        for (Task t : tasks) {
            if (t.getId() == id)
                return t;
        }
        return null;
    }

    Task changeTaskName(int id, String newName) {
        Task t = getTaskId(id);

        if (t != null) {
            t.changeName(newName);
            return t;
        }

        return null;
    }

    Task setTaskStatus(boolean completed, int id) {
        Task t = getTaskId(id);

        if (t != null) {
            t.setStatus(completed);
            return t;
        }

        return null;
    }
}
