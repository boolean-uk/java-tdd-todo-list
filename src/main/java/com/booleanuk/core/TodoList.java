package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> taskList = new ArrayList<Task>();

    public Task addTask( String description)
    {
        Task newTask = new Task(taskList.size(),description);
        taskList.add(newTask);
        return newTask;
    }

    public ArrayList<Task> getTasks()
    {
        return taskList;
    }




}
