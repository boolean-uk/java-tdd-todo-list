package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    HashMap<String, String> toDoList;

    public TodoList() {
        this.toDoList = new HashMap<>();
    }

    public boolean addTask(String task) {
        if (toDoList.containsKey(task)) {
            System.out.println("Task already exists");
            return false;
        }
        toDoList.put(task, "incomplete");
        System.out.println("Task added successfully");
        return true;
    }

    public ArrayList<String> showToDoList() {
        ArrayList<String> listOfTasks = new ArrayList<>(toDoList.keySet());

        if (toDoList.isEmpty()) {
            System.out.println("Empty list");
        }
        return listOfTasks;
    }

    public boolean changeStatus(String task, String newStatus) {
        if (toDoList.containsKey(task)) {
            if (newStatus.equals(toDoList.get(task))) {
                System.out.println("Same status");
                return false;
            }
            toDoList.replace(toDoList.get(task), newStatus);
            System.out.println("Status changed successfully");
            return true;
        }
        return false;
    }
}
