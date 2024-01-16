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

    public String changeTaskStatus(String task, String newStatus) {
        newStatus = "";
        String currentStatus = this.taskMap.get(task);
        if (this.taskMap.containsKey(task)) {
            if ("Complete.".equals(currentStatus)) {
                newStatus = "Incomplete.";
                this.taskMap.put(task, newStatus);
                return "Task status changed to incomplete.";

            } else if ("Incomplete.".equals(currentStatus)) {
                newStatus = "Complete.";
                this.taskMap.put(task, newStatus);
                return "Task status changed to complete.";
            }
        }
        return task;
    }

}
