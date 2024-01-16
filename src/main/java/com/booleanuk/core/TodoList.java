package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public boolean add(String task) {
        if (task == null) {
            return false;
        } else {
            return todoList.add(task);
        }
    }
}
