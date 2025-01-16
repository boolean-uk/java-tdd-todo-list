package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public boolean add(Task task) {
        if(tasks.contains(task)) {
            return false;
        } else {
            tasks.add(task);
            return true;
        }
    }

    public ArrayList<Task> viewTasks() {
        return tasks;
    }

    public ArrayList<Task> viewIncompleteTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if(!tasks.get(i).isComplete()) {
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    public ArrayList<Task> viewCompleteTasks() {
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).isComplete()) {
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    public Task search(Task task) {
        if(tasks.contains(task)) {
          return task;
        }
        System.out.println("The task was not found!");
        return null;
    }

    public void remove (Task task) {
        if(tasks.contains(task)) {
            tasks.remove(task);
        }
    }

    public ArrayList<String> viewAlphabeticalAsc() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            result.add(tasks.get(i).getName());
        }
        result.sort(null);
        return result;
    }

    public ArrayList<String> viewAlphabeticalDesc() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            result.add(tasks.get(i).getName());
        }
        result.sort(Comparator.reverseOrder());
        return result;
    }
}
