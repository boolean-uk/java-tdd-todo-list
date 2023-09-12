package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, String> toDoList;

    public TodoList() {
        this.toDoList = new HashMap<>();
    }

    public boolean addTask(String task) {
        if (toDoList.containsKey(task)) {
            System.out.println("Task already exists");
            return false;
        }
        toDoList.put(task, "incomplete");
        System.out.println("Task added successfully");
        return true;
    }
}
