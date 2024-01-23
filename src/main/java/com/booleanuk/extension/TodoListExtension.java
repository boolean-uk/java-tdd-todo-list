package com.booleanuk.extension;

import java.util.ArrayList;

public class TodoListExtension {
    private ArrayList<Task> tasks;
    public TodoListExtension(){
        this.tasks = new ArrayList<>();
    }

    public String addTask(Task task){
        tasks.add(task);
        return "Task added";
    }

    public String getTaskByID(int id){
        for (Task task: tasks){
            if (task.getId() == id){
                return task.toString();
            }
        }
        return "Task not found";
    }

    public boolean updateTaskName(int id, String newName){
        for (Task task : tasks){
            if (task.getId() == id){
                task.setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean updateTaskStatus(int id, String newStatus){
        for (Task task : tasks){
            if (task.getId() == id){
                task.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }


}
