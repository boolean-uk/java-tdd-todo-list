package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TodoList {

    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void changeStatusOfTask(String content) {
        Task task = tasks.stream()
                .filter(t -> t.getContent().equals(content))
                .findFirst()
                .get();
        task.complete = !task.isComplete();
    }

    public List<Task> getAllCompletedTasks() {
        return tasks.stream().filter(task -> task.isComplete()).toList();
    }

    public List<Task> getAllUncompletedTasks() {
        return tasks.stream().filter(task -> !task.isComplete()).toList();
    }

    public String searchForATask(String content) {
        for (Task task : tasks) {
            if (task.getContent().equals(content)) {
                return "";
            }
        }
        return "It wasn't found";
    }

    public void removeTask(String content) {
        Task task = tasks.stream()
                .filter(t -> t.getContent().equals(content))
                .findFirst()
                .get();
        tasks.remove(task);
    }

    public List<Task> allTasksOrderedAsc() {
        Collections.sort(tasks, (o1, o2) -> o1.getContent().compareToIgnoreCase(o2.getContent()));
        return tasks;
    }

    public List<Task> allTasksOrderedDesc() {
        Collections.reverse(allTasksOrderedAsc());
        return tasks;
    }



}
