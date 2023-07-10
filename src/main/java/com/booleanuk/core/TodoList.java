package com.booleanuk.core;

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

    public boolean removeTask(int id) {
        try {
            Task task = getTask(id);
            taskList.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeAllTasks() {
        if(taskList.size() == 0) return false;
        else {
            taskList.removeAll(taskList);
            return true;
        }
    }

    public ArrayList<Task> sortTasksAsc() {
        Collections.sort(taskList);
        return taskList;
    }

    public ArrayList<Task> sortTasksDsc() {
        Collections.sort(taskList, Comparator.reverseOrder());
        return taskList;
    }

}
