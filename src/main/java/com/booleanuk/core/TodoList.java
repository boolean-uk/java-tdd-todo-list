package com.booleanuk.core;

import java.util.*;

public class TodoList {
    private HashMap<String, Boolean> tasks;

    public TodoList(HashMap<String, Boolean> tasks) {
        this.tasks = new HashMap<>(tasks);
    }

    public Boolean add(String name) {
        Boolean status = false;
        if (!tasks.containsKey(name)) {
            tasks.put(name, status);
            return true;
        }
        return false;
    }

    public String listTasks() {
        String output;
        if (tasks.isEmpty()) {
            output = "Todo-list is empty";
            return output;
        }
        output = tasks.keySet().toString();
        return output;
    }

    public Boolean updateTaskStatus(String name) {
        if (!tasks.containsKey(name)) {
            return false;
        }
        if (tasks.get(name).equals(false)) {
            tasks.put(name, true);
            return true;
        } else if (tasks.get(name).equals(true)) {
            tasks.put(name, false);
            return true;
        }
        return false;
    }

    public String listCompletedTasks() {
        if (tasks.containsValue(true)) {
            StringBuilder completed = new StringBuilder();
            for (Map.Entry<String, Boolean> task : tasks.entrySet()) {
                if (task.getValue()) {
                    completed.append(task.getKey()).append(", ");
                }
            }
            return completed.toString();
        }
        return "You have no completed tasks";
    }

    public String listNotCompletedTasks() {
        if (tasks.containsValue(false)) {
            StringBuilder completed = new StringBuilder();
            for (Map.Entry<String, Boolean> task : tasks.entrySet()) {
                if (!task.getValue()) {
                    completed.append(task.getKey()).append(", ");
                }
            }
            return completed.toString();
        }
        return "You have no incomplete tasks";
    }

    public String searchForTask(String task) {
        if (!tasks.containsKey(task)) {
            return "Task could not be found";
        }
        return "Here's your task: " + task;
    }

    public String removeTask(String task) {
        if (!tasks.containsKey(task)) {
            return "This task is not on your todolist";
        }
        tasks.remove(task);
        if (!tasks.containsKey(task)) {
            return "Task removed successfully";
        }
        return "Could not remove task";
    }

    public String listAscending() {
        if (!tasks.isEmpty()) {
            StringBuilder ascending = new StringBuilder();
            List<String> tasksNames = new ArrayList<>(tasks.keySet());
            Collections.sort(tasksNames);
            for (String task : tasksNames) {
                ascending.append(task).append(", ");
            }
            return ascending.toString();
        }
        return "Your todolist is empty";
    }

    public String listDescending() {
        if (!tasks.isEmpty()) {
            StringBuilder ascending = new StringBuilder();
            List<String> tasksNames = new ArrayList<>(tasks.keySet());
            Collections.sort(tasksNames, Collections.reverseOrder());
            for (String task : tasksNames) {
                ascending.append(task).append(", ");
            }
            return ascending.toString();
        }
        return "Your todolist is empty";
    }
}
