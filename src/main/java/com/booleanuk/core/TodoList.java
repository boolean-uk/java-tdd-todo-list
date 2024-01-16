package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    ArrayList<String> taskList;
    HashMap<String, String> taskMap;

    public TodoList() {
        taskList = new ArrayList<>();
        taskMap = new HashMap<>();
    }

    public String add(String task) {
        this.taskList.add(task);

        if(this.taskList.contains(task)) {
            return "Task added to todo list.";
        }
        return "Task not added to todo list.";
    }

    public String showTasks() {
        return this.taskList.toString();
    }

    public String changeTaskStatus(String task, String status) {
        return "Task status changed to incomplete.";
    }

}
