package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    ArrayList<String> tasks;
    HashMap<String, Boolean> tasks2;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public String add(String task) {
        this.tasks.add(task);

        if(this.tasks.contains(task)) {
            return "Task added to todo list.";
        }
        return "Task not added to todo list.";
    }

    public String showTasks() {
        return this.tasks.toString();
    }

}
