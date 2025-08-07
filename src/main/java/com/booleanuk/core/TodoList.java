package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks = new ArrayList<>();

    public void add(String desc) {
        tasks.add(new Task(desc));
    }

    public void add(String desc, boolean status) {
        tasks.add(new Task(desc, status));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getCompleteTasks() {
        List<Task> complete = new ArrayList<>();
        for(Task task: tasks){
            if (task.getStatus())
                complete.add(task);
        }
        return complete;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> complete = new ArrayList<>();
        for(Task task: tasks){
            if (!task.getStatus())
                complete.add(task);
        }
        return complete;
    }

    public Task search(String search) {
        for(Task task: tasks){
            if (task.getDescription().equals(search))
                return task;
        }
        return null;
    }

    public boolean remove(String description) {
        Task task = search(description);
        if (task == null)
            return false;
        tasks.remove(task);
        return true;
    }

    public List<Task> getAlphAsc() {
        tasks.sort((a, b) -> a.getDescription().compareTo(b.getDescription()));
        return tasks;
    }

    public List<Task> getAlphDesc() {
        tasks.sort((a, b) -> b.getDescription().compareTo(a.getDescription()));
        return tasks;
    }
}
