package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;

public class TodoList {

    ArrayList<Task> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public boolean add(Task task) {
        if(this.todoList.contains(task)) {
            return false;
        }else {
            this.todoList.add(task);
            return true;
        }
    }

    public ArrayList<Task> viewList() {
        return this.todoList;
    }

    public void changeTaskStatus(Task task) {
        task.changeStatus();
    }

    public ArrayList<Task> getComplete() {
        ArrayList<Task> completed = new ArrayList<>();
        for (Task task: this.todoList) {
            if(task.isComplete) completed.add(task);
        }
        return completed;
    }
    public ArrayList<Task> getInComplete() {
        ArrayList<Task> completed = new ArrayList<>();
        for (Task task: this.todoList) {
            if(!task.isComplete) completed.add(task);
        }
        return completed;
    }

    public Task searchTask(String name) {
        for (Task task: this.todoList) {
            if(task.getName() == name) {
                return task;
            }
        }
        return null;
    }

    public void removeTask(Task inputTask) {
        this.todoList.removeIf(task -> inputTask.getName().equals(task.getName()));
    }

    public void sortAscending() {
        this.todoList.sort((Comparator.comparing(Task::getName)));
    }

    public void sortDescending() {
        this.todoList.sort((Comparator.comparing(Task::getName)).reversed());
    }
}
