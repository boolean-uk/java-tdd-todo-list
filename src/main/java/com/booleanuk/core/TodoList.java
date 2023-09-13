package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public LinkedHashMap<String, Boolean> todoItems;


    public TodoList() {
        this.todoItems = new LinkedHashMap<>();

    }

    public void addTask(String item, boolean status) {
        todoItems.put(item, status);
//        System.out.println(todoItems);
    }


    public String seeTasks() {
        StringBuilder str = new StringBuilder();
        List<String> keys = new ArrayList<>(todoItems.keySet());

        for (int i = 0; i < keys.size(); i++) {
            str.append(keys.get(i));
            if (i <= keys.size() - 2) {
                str.append(", ");
            }

        }

        return str.toString();
    }

    public void changeStatus(String itemName) {
        if (!todoItems.get(itemName)) {
            System.out.println("the value is " + todoItems.get(itemName));
            todoItems.put(itemName, true);
        } else {
            todoItems.put(itemName, false);
        }
    }

    public String getCompletedTasks() {
        StringBuilder completedTasks = new StringBuilder();
        List<Map.Entry<String, Boolean>> entryList = new ArrayList<>(todoItems.entrySet());

        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<String, Boolean> entry = entryList.get(i);
            if (entry.getValue()) {
                completedTasks.append(entry.getKey());
                if (i < entryList.size() - 1) {
                    completedTasks.append(", ");
                }
            }
        }

        return completedTasks.toString();
    }



    public String getUncompletedTasks() {
        StringBuilder uncompleted = new StringBuilder();

        for (Map.Entry<String, Boolean> entry : todoItems.entrySet()) {
            if (!entry.getValue()) {
                uncompleted.append(entry.getKey()).append(", ");
            }
        }

        if (!uncompleted.isEmpty()) {
            uncompleted.delete(uncompleted.length() - 2, uncompleted.length());
        }

        return uncompleted.toString();
    }









}
