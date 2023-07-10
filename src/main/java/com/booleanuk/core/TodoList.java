package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks = new ArrayList<>();






    public void addTask(Task task){
        tasks.add(task);
    }


    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public String showTasks() {
        StringBuilder tasksInString = new StringBuilder();

        for (Task task :
                tasks) {
            tasksInString.append(task.printTaskName()).append("\n");
        }

        return tasksInString.toString();
    }
}
