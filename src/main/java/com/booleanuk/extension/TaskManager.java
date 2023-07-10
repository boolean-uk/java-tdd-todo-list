package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {

        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    // I want to be able to get a task by a unique ID.
    public Task getTaskByID(int id) {
        for (Task task : tasks) {
            if (task.getTaskID() == id) {
                return task;
            }
        }
        return null;
    }

    // I want to update the name of a task by providing its ID and a new name.
    public void updateTaskName(int id, String newName) {
        Task task = getTaskByID(id);
        task.setTaskName(newName);
    }

    // I want to be able to change the status of a task by providing its ID.

    // I want to be able to see the date and time that I created each task.

}
