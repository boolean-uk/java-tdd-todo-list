package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void removeTask(Task task){
        this.tasks.remove(task);
    }

    public String search(Task task){
        return "";
    }

}
