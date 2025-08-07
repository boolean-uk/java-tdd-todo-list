package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        for (Task t : tasks) {
            if (t.getName().equals(task.getName())) {
                return false;
            }
        }
        tasks. add(task);
        return true;
    }

    public List<Task> getAllTasks(){
        return this.tasks;
    }

    public boolean toggleStatus(String name) {
        for (Task t : tasks) {
            if (t.getName().equals(name)) {
                t.setCompleted(!t.isCompleted());
                return true;
            }
        }
        return false;
    }

    public List<Task> getCompleteTasks() {
        List<Task> completed = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.isCompleted()) {
                completed.add(task);
            }
        }
        return completed;
    }

    public List<Task> getIncompleteTasks(){
        List<Task> incompleted = new ArrayList<>();
        for (Task task : this.tasks) {
            if (!task.isCompleted()){
                incompleted.add(task);
            }
        }
        return incompleted;
    }

    public String findTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                return task.getName();
            }

        }
        return "Task not found!";
    }

    public boolean removeTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public List<Task> getTasksSortedAscending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getName));
        return sortedTasks;
    }

    public List<Task> getTasksSortedDescending() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getName).reversed());
        return sortedTasks;
    }



}
