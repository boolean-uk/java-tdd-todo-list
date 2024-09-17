package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TodoListExtension {
    private List<Task> tasks;

    public TodoListExtension() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        this.tasks.add(new Task(taskName));
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public List<Task> getTasksList() {
        return this.tasks;
    }

    public Task getTaskById(int id) {
        for(Task task: tasks){
            if(task.getTaskId() == id){
                return task;
            }
        }
        return null;
    }

    public boolean updateTask(int id, String newName) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setName(newName);
            return true;
        }
        return false;
    }

    public boolean changeStatusById(int id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
            return true;
        }
        return false;
    }

    public String showTasks() {
        StringBuilder sb = new StringBuilder();
        for (Task task : tasks) {
            sb.append(task.toString());
        }
        return sb.toString();
    }
}