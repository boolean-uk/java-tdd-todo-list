package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getAllTasks(){
        return tasks;
    }

}
