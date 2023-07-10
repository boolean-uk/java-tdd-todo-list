package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {

    Map<String, String> toDoList;

    public TodoList() {
        toDoList = new HashMap<>();
    }

    public Map<String, String> getToDoList() {
        return toDoList;
    }

    public void add(String task) {
        toDoList.put(task, "incomplete");
    }

}
