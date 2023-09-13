package com.booleanuk.core;

import java.util.*;

public class TodoList {

    public LinkedHashMap<String, Boolean> todoItems;

    public TodoList() {
        this.todoItems = new LinkedHashMap<>();
    }

    public void addTask(String item) {
        todoItems.put(item, false);
        System.out.println(todoItems);
    }


    public String seeTasks() {
        StringBuilder str = new StringBuilder();
        List<String> keys = new ArrayList<>(todoItems.keySet());

        for (int i = 0; i < keys.size(); i++) {
            str.append(keys.get(i));
            if(i <= keys.size() -2){
                str.append(", ");
            }

        }

        return str.toString();
    }


}
