package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<String> items;

    public TodoList() {
        this.items = new ArrayList<>();
    }

    public void addTask(String item) {
        items.add(item);
        System.out.println("The task " + item + "has been added");
//        System.out.println(items);
    }


}
