package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, String> list;
    public String defaultStatus = "Incomplete";

    public TodoList() {
        this.list = new HashMap<>();
    }
    public boolean addToTodo(String taskName) {
        this.list.put(taskName, this.defaultStatus);
        return true;
    }
}
