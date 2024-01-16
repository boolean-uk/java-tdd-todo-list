package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> toDoList;
    ArrayList<Boolean> taskComplete;

    public TodoList() {
        toDoList = new ArrayList<>();
        taskComplete = new ArrayList<>();
    }

    public boolean addTask(String task) {
        if (!toDoList.contains(task)) {
            toDoList.add(task);
            taskComplete.add(false);
            return true;
        }
        return false;
    }

}
