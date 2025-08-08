package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TodoListExtension {
    List<Task> todoList = new ArrayList<>();


    public boolean addTask(Task task){
        if (!todoList.contains(task)){
            todoList.add(task);
            return true;
        }
        return false;

    }
    public Task getTask(int id){
        for(Task task : todoList){
            if (task.getId() == id){
                return task;
            }
        }
        return null;
    }

    public String getName(int id) {
        for (Task task : todoList) {
            if (task.getId() == id) {
                return task.getName();
            }
        } return "";
    }

    public boolean changeStatus(int id) {
        for (Task task : todoList) {
            if (task.getId() == id) {
                task.changeStatus();
                return true;
            }
        }
        return false;
    }


}
