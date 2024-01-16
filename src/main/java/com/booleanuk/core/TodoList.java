package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, String> toDoList;
    public TodoList(){
        this.toDoList = new HashMap<String, String>();
    }

    public boolean addTask(String task){
            if (toDoList.containsKey(task)) {
                return false;
            }
            toDoList.put(task, "incomplete");
            return true;
    }
    public String changeStatus(String task) {
        if (toDoList.containsKey(task)) {
            String currentStatus = toDoList.get(task);
            String newStatus = currentStatus.equals("incomplete") ? "complete" : "incomplete";
            toDoList.put(task, newStatus);
            return newStatus;
        }
        return "Task not found";
    }
    public void seeAllTasks(){
        System.out.println(toDoList.toString());
    }
    public void getCompleteTask() {
        StringBuilder sb = new StringBuilder();
        for (String task : toDoList.keySet()) {
            if ("complete".equals(toDoList.get(task))) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(task);
            }
        }
        String out = sb.toString();
        System.out.println(out);
    }
    public void getIncompleteTask() {
        StringBuilder sb = new StringBuilder();
        for (String task : toDoList.keySet()) {
            if ("incomplete".equals(toDoList.get(task))) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(task);
            }
        }
        String out = sb.toString();
        System.out.println(out);
    }

    public String searchTask(String task) {
        if (toDoList.containsKey(task)) {
            return "Task found: " + task;
        } else {
            return "Task not found";
        }
    }
    public boolean removeTask(String task) {
        if (toDoList.containsKey(task)) {
            toDoList.remove(task);
            return true;
        }
        return false;
    }

}
