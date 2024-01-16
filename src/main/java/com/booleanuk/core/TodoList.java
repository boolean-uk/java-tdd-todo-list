package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<>();
    }

    public boolean add(String task) {
        if (this.tasks.containsKey(task)) {
            return false;
        }
        this.tasks.put(task, false);
        return true;
    }

    public boolean remove(String task) {
        if (this.tasks.containsKey(task)) {
            this.tasks.remove(task);
            return true;
        }
        return false;
    }

    public boolean changeStatus(String task) {
        if (this.tasks.containsKey(task)) {
            boolean status = this.tasks.get(task);
            this.tasks.replace(task, !status);
            return true;
        }
        return false;
    }

    public String getTask(String task) {
        if(this.tasks.containsKey(task)) {
            boolean status = this.tasks.get(task);
            if(status) {
                return task + " is complete.";
            }
            else {
                return task + " is incomplete.";
            }
        }
        return task + " wasn't found.";
    }

    public String getTasks() {
        if(this.tasks.isEmpty()) {
            return "";
        }
        String output = "";
        for (String task : this.tasks.keySet()) {
            if (this.tasks.get(task)) {
                output += task + " complete\n";
            }
            else {
                output += task + " incomplete\n";
            }
        }
        return output;
    }

}
