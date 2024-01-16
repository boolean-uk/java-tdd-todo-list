package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> tasks;

    public TodoList(){
        this.tasks = new HashMap<>();
    }

    public Boolean addTask(String task) {
        if (!this.tasks.containsKey(task)){
            this.tasks.put(task, true);
            return true;
        } else {
            return false;
        }
    }
    public String showTasks() {
        return this.tasks.toString();
    }
}
