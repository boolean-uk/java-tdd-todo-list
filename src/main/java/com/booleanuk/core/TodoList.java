package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public String add(String task) {
        return "Task added to todo list.";
    }

}
