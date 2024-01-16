package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    ArrayList<String> toDoList;
    ArrayList<Boolean> taskComplete;

    public TodoList() {
        toDoList = new ArrayList<>();
        taskComplete = new ArrayList<>();
    }

    public boolean addTask(String task) {
        if (!toDoList.contains(task)) {
            toDoList.add(task);
            taskComplete.add(false);
            return true;
        }
        return false;
    }

    public boolean displayTasks() {
        if (toDoList.size() == 0){
            return false;
        }

        for (String task: toDoList) {
            System.out.println(task);
        }
        return true;
    }

    public boolean taskStatus(String task, boolean status) {
        if (toDoList.contains(task)) {
            int idx = toDoList.indexOf(task);
            taskComplete.set(idx, status);
            return taskComplete.get(idx);
        }
        return false;
    }

    public ArrayList<String> displayCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();

        for (int i = 0; i < taskComplete.size(); i++) {
            if (taskComplete.get(i)) {
                completedTasks.add(toDoList.get(i));
            }
        }
        return completedTasks;
    }

    public ArrayList<String> displayIncompletedTasks() {
        ArrayList<String> incompletedTasks = new ArrayList<>();

        for (int i = 0; i < taskComplete.size(); i++) {
            if (!taskComplete.get(i)) {
                incompletedTasks.add(toDoList.get(i));
            }
        }
        return incompletedTasks;
    }

    public String searchTasks(String task) {
        String message = "Not Found";

        if (toDoList.contains(task)) {
                message = "Found";
        }
        return message;
    }

    public boolean removeTask(String task) {
        if (toDoList.contains(task)) {
            int idx = toDoList.indexOf(task);
            toDoList.remove(idx);
            taskComplete.remove(idx);
            return true;
        }
        return false;
    }

    public ArrayList<String> alphabetizeUp() {
        ArrayList<String> alphabetizedList = toDoList;
        Collections.sort(alphabetizedList);
        return alphabetizedList;
    }

    public ArrayList<String> alphabetizeDown() {
        ArrayList<String> alphabetizedList = toDoList;
        Collections.sort(alphabetizedList);
        Collections.reverse(alphabetizedList);
        return alphabetizedList;
    }





}
