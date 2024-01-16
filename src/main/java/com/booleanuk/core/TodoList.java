package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> todoList;

    public TodoList() {
        this.todoList = new HashMap<>();
    }

    public HashMap<String, Boolean> addTask(String task) {
        this.todoList.put(task, false);
        return this.todoList;
    }

}
