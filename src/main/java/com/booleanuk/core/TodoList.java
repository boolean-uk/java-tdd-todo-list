package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Objects;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String name) {
        Task newTask = new Task(name);
        this.tasks.add(newTask);
    }

    public String getTasks() {
        if (tasks.size() == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (Task task: this.tasks){
            result.append(task.getName()).append("\n");
        }
        return String.valueOf(result).substring(0,result.length()-1);
    }

    public boolean setStatus(String name){
        for (Task task : this.tasks) {
            if (Objects.equals(task.getName(), name)) {
                task.setStatus();
                return true;
            }
        }
        return false;
    }

    public String getComplete() {
        StringBuilder result = new StringBuilder();
        for (Task task : this.tasks) {
            if (task.getStatus()) {
                result.append(task.getName()).append("\n");
            }
        }
        if (result.length() == 0){
            return "";
        }
        return String.valueOf(result).substring(0,result.length()-1);
    }

    public String getIncomplete() {
        if (this.tasks.size() == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (Task task : this.tasks) {
            if (!task.getStatus()) {
                result.append(task.getName()).append("\n");
            }
        }
        if (result.length() == 0){
            return "";
        }
        return String.valueOf(result).substring(0,result.length()-1);
    }

    public Task search(String name){
        return null;
    }

    public boolean remove(String name){
        return true;
    }
}
