package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoList {
    ArrayList<Task> taskList = new ArrayList<Task>();

    public Task addTask( String description)
    {
        Task newTask = new Task(taskList.size(),description);
        taskList.add(newTask);
        return newTask;
    }

    public Task getTask(int i) throws Exception {
        if(taskList.size() == 0 || i < 0 || i >= taskList.size()) throw new Exception("Task not found");
        return taskList.get(i);
    }

    public Task updateDescription(int i, String taskDescription) throws Exception {
        try {
            Task newTask = taskList.get(i);
            newTask.setDescription(taskDescription);
            return newTask;
        } catch(Exception e){
            throw new Exception("Task not found");
        }
    }

    public Task changeTaskStatusById(int i) throws Exception {
        try {
            Task newTask = taskList.get(i);
            newTask.changeTaskStatus();
            return newTask;
        } catch(Exception e){
            throw new Exception("Task not found");
        }
    }
}
