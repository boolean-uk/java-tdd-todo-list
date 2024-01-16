package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {

    public HashMap<String, String> list;
    public HashMap<String, String> listComplete;
    public HashMap<String, String> listIncomplete;

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

    public void changeStatus(String key) {
        if(this.list.get(key).equals("Incomplete")) {
            this.list.put(key, "Complete");
        } else {
            this.list.put(key, "Incomplete");
        }
    }

    public void statusComplete(String key) {
        this.list.put(key, "Complete");
    }
    public void statusIncomplete(String key) {
        this.list.put(key, "Incomplete");
    }

    public String displayCompleteTodo() {
        this.listComplete = new HashMap<>();

        for (String task : this.list.keySet())
            if (this.list.get(task).equals("Complete")) {
                listComplete.put(task, "Complete");

            }
        return this.listComplete.keySet().toString();
    }

    public String displayIncompleteTodo() {
        this.listIncomplete = new HashMap<>();

        for (String task : this.list.keySet())
            if (this.list.get(task).equals("Incomplete")) {
                listIncomplete.put(task, "Incomplete");

            }
        return this.listIncomplete.keySet().toString();
    }

    public boolean searchTodo(String taskName) {
        return this.list.containsKey(taskName);
    }

    public boolean removeTask(String taskName) {
        if(this.list.containsKey(taskName)) {
            this.list.remove(taskName);
            return true;
        } else {
            return false;
        }

    }


}
