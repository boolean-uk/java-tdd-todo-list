package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public String seeStatus(boolean status){
        StringBuilder tasksWithStatus = new StringBuilder();

        for (Map.Entry<String, Boolean> entry : this.tasks.entrySet()) {
            if (entry.getValue() == status) {
                tasksWithStatus.append(entry.getKey()).append("\n");
            }
        }
        if (!tasksWithStatus.isEmpty()) {
            return tasksWithStatus.toString();
        }
        return "No tasks with status: " + status;
    }
    public String getTask(String task) {
        if (this.tasks.containsKey(task)){
            String status = String.valueOf(this.tasks.get(task));
            return task + "=" + status;
        }
        return task + " wasn't found";
    }
}