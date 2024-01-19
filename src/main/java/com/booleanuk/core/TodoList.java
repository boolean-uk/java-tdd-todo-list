package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

    public void remove(String task) {
        todoList.remove(task);
    }

    public boolean viewTasks() {
        if (todoList.isEmpty()) {
            return false;
        } else {
            for (Map.Entry<String, String> s : todoList.entrySet()) {
                System.out.println(s);
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

    public String getIncompleteTasks() {
        ArrayList<String> incompleteTasks = new ArrayList<>();

        for (Map.Entry<String, String> entry : todoList.entrySet()) {
            if (entry.getValue().equals("Incomplete")) {
                incompleteTasks.add(entry.getKey());
            }
        }

        if (incompleteTasks.isEmpty()) {
            return "None of your tasks are complete";
        } else {
            return String.join(", ", incompleteTasks);
        }
    }

    public String searchForTask(String task) {
        if (!todoList.containsKey(task)) {
            return "This task does not exist in your list";
        } else {
            return "This task is in your list";
        }
    }

    public String ascendingOrder() {
        ArrayList<String> ascendingOrder = new ArrayList<>(todoList.keySet());
        Collections.sort(ascendingOrder);

        if (ascendingOrder.isEmpty()) {
            return "The list is empty!";
        } else {
            return String.join(", ", ascendingOrder);
        }
    }

    public String descendingOrder() {
        ArrayList<String> descendingOrder = new ArrayList<>(todoList.keySet());
        descendingOrder.sort(Collections.reverseOrder());

        if (descendingOrder.isEmpty()) {
            return "The list is empty!";
        } else {
            return String.join(", ", descendingOrder);
        }
    }
}