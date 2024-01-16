package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> todos;

    public TodoList() {
        this.todos = new HashMap<>();
    }

    public boolean add(String todo) {
        if (todo.isBlank() || this.todos.containsKey(todo)) {
            return false;
        }
        this.todos.put(todo, false);
        return true;
    }
}
