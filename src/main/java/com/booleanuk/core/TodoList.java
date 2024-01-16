package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {
    HashMap<String, Boolean> taskList;

    public TodoList() {
        taskList = new HashMap<>();
    }

    public boolean addTask(String task)  {
        if(taskList.get(task) == null)
        {
            taskList.put(task, false);
            return true;
        }
        return false;
    }
}
