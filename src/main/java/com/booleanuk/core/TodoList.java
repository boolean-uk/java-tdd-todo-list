package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public Boolean addTask(String task) {
        return this.tasks.add(task);
    }
}
