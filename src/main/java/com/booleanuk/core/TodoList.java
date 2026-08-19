package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TodoList {
    List<Task> todoList;

    public TodoList() {
        todoList = new ArrayList<>();
    }

    public List<Task> getList() {
        return todoList;
    }

    public void addTask(Task task) {
        todoList.add(task);
    }

    public String displayList(List<Task> list) {
        String result = "";

        for (Task task : list) {
            result += task.isComplete() ? "☑ " : "☐ ";
            result += task.getName() + "\n";
        }

        return result.trim();
    }

    public String displayList() {
        return displayList(todoList);
    }

    public List<Task> getAllTasks() {
        return todoList;
    }

    public List<Task> getCompleteTasks() {
        return todoList.stream()
            .filter(task -> task.isComplete())
            .toList();
    }

    public List<Task> getIncompleteTasks() {
        return todoList.stream()
            .filter(task -> !task.isComplete())
            .toList();
    }

    public void removeTask(String name) {
        todoList.removeIf(task -> task.getName() == name);
    }

    public void removeTask(Task task) {
        todoList.remove(task);
    }

    public List<Task> sortListAlphabeticallyAscending() {
        return todoList.stream()
            .sorted(Comparator.comparing(Task::getName))
            .toList();
    }

    public List<Task> sortListAlphabeticallyDescending() {
        return todoList.stream()
            .sorted(Comparator.comparing(Task::getName)
            .reversed())
            .toList();
    }

    public String search(String name) {
        return todoList.stream().anyMatch(task -> task.getName().equals(name)) 
            ? "Task exists!" 
            : "Task does not exist :-(";
    }
}
