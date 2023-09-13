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



}
