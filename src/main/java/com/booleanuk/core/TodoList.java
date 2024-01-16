package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> todoList;

    public TodoList() {
        this.todoList = new HashMap<>();
    }

    public HashMap<String, Boolean> addTask(String task) {
        this.todoList.put(task, false);
        return this.todoList;
    }

    public void showAllTasks() {
        for (String task : this.todoList.keySet()) {
            System.out.print(task + "\n");
        }
    }

    public String changeTaskStatus(String task) {
        if (this.todoList.get(task)) {
            this.todoList.replace(task, false);
            return "Task has been marked as incomplete.";
        }
        this.todoList.replace(task, true);
        return "Task has been marked as complete.";
    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();
        for (String task : this.todoList.keySet()) {
            if (this.todoList.get(task)) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public ArrayList<String> getIncompleteTasks() {
        ArrayList<String> incompleteTasks = new ArrayList<>();
        for (String task : this.todoList.keySet()) {
            if (!this.todoList.get(task)) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public boolean doesTaskExist(String task) {
        if (this.todoList.containsKey(task)) {
            return true;
        }
        System.out.print("Task does not exist!\n");
        return false;
    }

    public boolean removeTask(String task) {
        if (this.todoList.containsKey(task)) {
            return !this.todoList.remove(task);
        }
        return false;
    }

    public static void main(String[] args) {
//        TodoList test = new TodoList();
//
//        test.addTask("Do the dishes");
//        test.addTask("Clean the bathroom");
//        test.addTask("Train for 60 minutes");
//        test.addTask("Cook dinner");
//
//        System.out.println(test);


        String one = "brave";
        String two = "a";
        System.out.println(two.compareToIgnoreCase(one));
    }

}
