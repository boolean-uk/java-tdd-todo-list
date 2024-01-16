package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> tasks;

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

}
