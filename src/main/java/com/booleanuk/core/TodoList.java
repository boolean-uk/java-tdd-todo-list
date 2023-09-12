package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoList {

    public HashMap<String, Boolean> todoItems;

    public TodoList() {
        this.todoItems = new HashMap<>();
    }

    public void addTask(String item) {
        todoItems.put(item, false);
        System.out.println(todoItems);
    }


}
