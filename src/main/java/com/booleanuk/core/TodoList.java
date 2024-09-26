package com.booleanuk.core;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TodoList {
    public List<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskDescription) {
        tasks.add(taskDescription.trim() + ":incomplete");
    }

    public boolean containsTask(String taskDescription) {
        return tasks.contains(taskDescription);
    }

    public List<String> viewAllTasks() {

        return new ArrayList<>(tasks);
    }

    public void changeTaskStatus(int taskId, boolean complete) {
        if (taskId >= 0 && taskId < tasks.size()) {
            String[] taskParts = tasks.get(taskId).split(":");

            if (taskParts.length == 2) {
                String taskDescription = taskParts[0];
                String updatedTask = taskDescription + (complete ? ":complete" : ":incomplete");
                tasks.set(taskId, updatedTask);
            } else {
                System.err.println("Invalid task format: " + tasks.get(taskId));
            }
        }
    }

    public List<String> viewCompleteTasks() {

        List<String> completeTasks = new ArrayList<>();

        for (String task : tasks) {
            if (task.endsWith(":complete")) {
                completeTasks.add(task);
            }
        }

        return completeTasks;
    }

    public List<String> getIncompleteTasks() {
        List<String> incompleteTasks = new ArrayList<>();

        for (String task : tasks) {
            if (task.endsWith(":incomplete")) {
                incompleteTasks.add(task);
            }
        }

        return incompleteTasks;
    }
    public String searchTask(String taskDescription) {
            for (String task : tasks) {
                if (task.startsWith(taskDescription.trim())) {
                    return "Task found: " + task;
                }
            }
            return "Task not found: " + taskDescription;
        }

    public void removeTask(String taskDescription) {
        tasks.removeIf(task -> task.startsWith(taskDescription + ":"));
    }

    public List<String> viewAllTasksOrdered() {
        tasks.sort(String::compareTo);
        return tasks;
    }
    public List<String> viewAllTasksOrderedDescending() {
        tasks.sort((s1, s2) -> s2.compareTo(s1));
        return tasks;
    }
}
