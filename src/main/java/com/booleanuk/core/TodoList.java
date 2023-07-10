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

    public String getAllTasks(boolean isCompleted){
        return tasks.stream().filter(task -> task.isCompleted == isCompleted).toList().toString();
    }

    public String search(String name) {
        for(Task task : tasks) {
            if(task.name.equals(name))
                return "found";
        }
        return "not found";
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }
}
