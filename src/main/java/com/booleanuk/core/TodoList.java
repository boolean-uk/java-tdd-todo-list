package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks = new ArrayList<>();


    public boolean addTask(Task task) {
        if(tasks.contains(task)) return false;
        else{
            tasks.add(task);
            return true;
        }
    }

    public String getAllTasks() {
        return tasks.toString();
    }
}
