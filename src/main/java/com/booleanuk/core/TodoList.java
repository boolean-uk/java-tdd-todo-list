package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoList {
    public HashMap<String, String> todoList;

    public TodoList() {
        this.todoList = new HashMap<>();
    }

    public boolean add(String task, String status) {
        if (task == null) {
            return false;
        } else {
            todoList.put(task, status);
        }
        return true;
    }

    public boolean viewTasks() {
        if (todoList.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < todoList.size(); i++) {
                System.out.print(todoList.get(i));
            }
            return true;
        }
    }

    public void changeStatus(String task, String status) {
        if (!todoList.containsKey(task)) {
        } else {
            todoList.put(task, status);
        }
    }

    public String viewStatus(String task) {
        return todoList.getOrDefault(task, "This task does not exist");
    }

    public String getCompleteTasks() {
        ArrayList<String> completeTasks = new ArrayList<>();

        for (Map.Entry<String, String> entry : todoList.entrySet()) {
            if (entry.getValue().equals("Complete")) {
                completeTasks.add(entry.getKey());
            }
        }

        if (completeTasks.isEmpty()) {
            return "None of your tasks are complete";
        } else {
            return String.join(", ", completeTasks);
        }
    }
}
