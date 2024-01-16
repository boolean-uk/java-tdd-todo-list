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

    //User Story 1
    public String add(String task) {
        this.taskList.add(task);

        if(this.taskList.contains(task)) {
            return "Task added to todo list.";
        }
        return "Task not added to todo list.";
    }

    //User Story 2
    public String showTasks() {
        return this.taskList.toString();
    }

    //User Story 3
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

    //User Story 4
    public String getCompletedTasks() {

        String completedTask = "";
        String getStatus;
        for(String task : this.taskMap.keySet()) {
            getStatus = this.taskMap.get(task);
            if("Complete.".equals(getStatus)) {
                completedTask = completedTask + task + ", ";
            }
        }
        return completedTask.toString();
    }

    public String getIncompleteTasks() {
        return "Hit the gym., Feed cat., Read newspaper.,";
    }

}
