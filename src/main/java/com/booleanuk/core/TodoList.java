package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TodoList {
    public final List<Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    public boolean addTask(String taskDescription){
        for(Task task : tasks){
            if (task.getDescription().equalsIgnoreCase(taskDescription)){
                return false;
            }
        }

        Task newTask = new Task(taskDescription);
        tasks.add(newTask);
        return true;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);

    }

    public String searchTask(String taskName) {
        for(Task task : tasks){
            if (task.getDescription().equalsIgnoreCase(taskName)) {
                return "The task was found";
            }
        }
        return "The task was not found";

    }

    public boolean removeTask(String taskName) {
        for(Task task : tasks){
            if (task.getDescription().equalsIgnoreCase(taskName)) {
                tasks.remove(taskName);
                return true;
            }
        }
        return false;

    }

    public List<Task> sortListAscending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getDescription));
        return sortedTasks;
    }

    public List<Task> sortListDescending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getDescription).reversed());
        return sortedTasks;
    }

}



