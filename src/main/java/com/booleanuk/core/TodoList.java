package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public HashMap<String, String> list;
    public String defaultStatus = "Incomplete";
//    public String displayText = list.keySet().toString();

    public TodoList() {
        this.list = new HashMap<>();
    }
    public boolean addToTodo(String taskName) {
        this.list.put(taskName, this.defaultStatus);
        return true;
    }

    public String displayTodo() {
        return list.keySet().toString();

    }

    public void printTodo() {
        System.out.println(displayTodo());
    }

//    public void changeStatus(String key) {
//        if(this.list.get(key).equals("Incomplete")) {
//            this.list.put(key, "Complete");
//        } else {
//            this.list.put(key, "Incomplete");
//        }
//    }

    public void statusComplete(String key) {
        this.list.put(key, "Complete");
    }
    public void statusIncomplete(String key) {
        this.list.put(key, "Incomplete");
    }
}
