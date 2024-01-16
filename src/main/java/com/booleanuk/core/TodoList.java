package com.booleanuk.core;

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
