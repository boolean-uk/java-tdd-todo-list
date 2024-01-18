package com.booleanuk.core;

import java.util.*;

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
    public void printTasksInAscOrder() {
        List<String> sortedTasks = new ArrayList<>(toDoList.keySet());
        Collections.sort(sortedTasks);

        for (String task : sortedTasks) {
            System.out.println(task);
        }
    }
    public void showTasksInDescOrder() {
        StringBuilder sb = new StringBuilder();
        List<String> tasks = new ArrayList<>(toDoList.keySet());
        tasks.sort(Comparator.reverseOrder());

        for (int i = 0; i < tasks.size(); i++) {
            sb.append(tasks.get(i)).append(" - ").append(toDoList.get(tasks.get(i)));
            if (i < tasks.size() - 1) {
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }


}
