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

    public ArrayList<Task> getCompleteTasks()
    {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : taskList)
        {
            if (task.isComplete())
            {
                result.add(task);
            }
        }
        return result;
    }
    public ArrayList<Task> getIncompleteTasks()
    {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : taskList)
        {
            if (!task.isComplete())
            {
                result.add(task);
            }
        }
        return result;
    }


    public Task getTask(int i) throws Exception {
        if(taskList.size() == 0 || i < 0 || i >= taskList.size()) throw new Exception("Task not found");
        return taskList.get(i);
    }
}
