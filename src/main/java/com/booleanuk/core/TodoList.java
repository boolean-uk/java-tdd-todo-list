package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> tasks;

    public TodoList(){
        this.tasks = new HashMap<>();
    }

    public Boolean addTask(String task) {
        if (!this.tasks.containsKey(task)){
            this.tasks.put(task, false);
            return true;
        } else {
            return false;
        }
    }
    public String showTasks() {
        return this.tasks.toString();
    }
    public String changeTaskStatus(String task) {
        if (this.tasks.containsKey(task)){
            boolean currentStatus = this.tasks.get(task);
            boolean newStatus = !currentStatus;
            this.tasks.put(task, newStatus);
            return task + " changed to " + newStatus;
        }
        return task + " Not found";
    }
}