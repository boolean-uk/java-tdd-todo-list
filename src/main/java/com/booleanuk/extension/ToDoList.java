package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Task> listOfTasks = new ArrayList<>();

    public Task addTask(String taskName) {
        Task newTask = new Task (listOfTasks.size(), taskName);
        listOfTasks.add(newTask);
        return newTask;
    }


    public Task getTaskById(int id) throws Exception{
        if(listOfTasks.size() == 0 || id > listOfTasks.size() || id < 0) {
            throw new Exception("Task with id: " + id + " not exist");
        }else {
            return listOfTasks.get(id);
        }
    }

    public Task updateTaskNameByProvidingIdAndNewName(int id, String newName) throws Exception{
        if(listOfTasks.size() == 0 || id > listOfTasks.size() || id < 0) {
            throw new Exception("Task with id: " + id + " not exist");
        }else {
            Task newTask = listOfTasks.get(id);
            newTask.setTaskName(newName);
            return newTask;
        }
    }

    public Task changeTaskStatusByProvidingId(int id) throws Exception{
        if(listOfTasks.size() == 0 || id > listOfTasks.size() || id < 0) {
            throw new Exception("Task with id: " + id + " not exist");
        } else {
            Task newTask = listOfTasks.get(id);
            newTask.changeStatusOfTask(id);
            return newTask;
        }
    }


}
