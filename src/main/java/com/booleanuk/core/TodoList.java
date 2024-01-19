package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
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
        StringBuilder output = new StringBuilder();
        for (String task : this.tasks.keySet()) {
            if (this.tasks.get(task)) {
                String taskOutput = task + " complete\n";
                output.append(taskOutput);
            }
            else {
                String taskOutput = task + " incomplete\n";
                output.append(taskOutput);
            }
        }
        return output.toString();
    }

    public ArrayList<String> getStatus(boolean status) {
        if(this.tasks.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> output = new ArrayList<>();
        for (String task : this.tasks.keySet()) {
            if (this.tasks.get(task) && status) {
                output.add(task);
            }
            else if (!this.tasks.get(task) && !status) {
                output.add(task);
            }
        }
        return output;
    }

    public ArrayList<String> getTasksOrdered(boolean asc) {
        if (this.tasks.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> output = new ArrayList<>(this.tasks.keySet());
        Collections.sort(output);
        if (!asc) {
            Collections.reverse(output);
        }
        return output;
    }

}
