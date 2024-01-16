package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    public ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public Task addTask(String name) {
        return new Task("a");
    }

    public String showTasks(ArrayList<Task> tasksToPrint) {
        return "";
    }

    public String showCompleteTasks() {
        return "";
    }

    public String showIncompleteTasks() {
        return "";
    }

    public String search(String name) {
        return "";
    }

    public boolean delete(String name) {
        return false;
    }

    public ArrayList<Task> orderTasksAsc() {
        return new ArrayList<>();
    }

    public ArrayList<Task> orderTasksDesc() {
        return new ArrayList<>();
    }
}
