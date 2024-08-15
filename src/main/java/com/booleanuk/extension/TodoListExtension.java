package com.booleanuk.extension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoListExtension {

    private Map<TaskExtension, Boolean> tasks;

    public TodoListExtension() {
        this.tasks = new HashMap<>();
    }
    public boolean addTask(TaskExtension task, boolean isCompleted) {
        if (task == null) {
            return false;
        }
        tasks.put(task, isCompleted);
        return true;
    }

    public boolean removeTask(TaskExtension task) {
        if (task == null || !tasks.containsKey(task)) {
            return false;
        }
        tasks.remove(task);
        return true;
    }

    public List<TaskExtension> getAllTasks(boolean ascendingOrder) {
        List<TaskExtension> allTasks = new ArrayList<>(tasks.keySet());
        if (ascendingOrder) {
            allTasks.sort((task1, task2) -> task1.getName().compareTo(task2.getName()));
        } else {
            allTasks.sort((task1, task2) -> task2.getName().compareTo(task1.getName()));
        }

        System.out.println("All tasks:");
        for (TaskExtension task : allTasks) {
            System.out.println(task.getName() + "\nDescription: " + task.getDescription());
        }
        return allTasks;
    }

    public boolean changeTaskStatus(String id, boolean isCompleted) {
        if (id == null) {
            return false;
        }
       for (TaskExtension task : tasks.keySet()) {
           if (task.getId().equals(id)) {
               tasks.put(task, isCompleted);
               return true;
           }
       }
       return false;
    }

    public List<TaskExtension> getCompleteTasks() {
        List<TaskExtension> completedTasks = new ArrayList<>();
        for (Map.Entry<TaskExtension, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue()) {
                completedTasks.add(entry.getKey());
            }
        }
        return completedTasks;
    }

    public List<TaskExtension> getIncompleteTasks() {
        List<TaskExtension> incompleteTasks = new ArrayList<>();
        for (Map.Entry<TaskExtension, Boolean> entry : tasks.entrySet()) {
            if (!entry.getValue()) {
                incompleteTasks.add(entry.getKey());
            }
        }
        return incompleteTasks;
    }

    public boolean searchTask(TaskExtension task) {
        if (task == null || tasks.get(task) == null) {
            System.out.println("Task not found");
            return false;
        }
        Boolean isCompleted = tasks.get(task);
        System.out.println("Task found: " + task.getName() + ", " + task.getDescription() + ", Completed: " + isCompleted);
        return true;
    }

    public boolean getTask(String id) {
        for (TaskExtension task : tasks.keySet()) {
            if (task.getId().equals(id)) {
                System.out.println("Task found: " + task.getName() + ", " + task.getDescription());
                return true;
            }
        }
        System.out.println("Task not found");
        return false;
    }

    public boolean updateTaskName(String id, String name) {
        for (TaskExtension task : tasks.keySet()) {
            if (task.getId().equals(id)) {
                task.setName(name);
                System.out.println("Task name updated to: " + name);
                return true;
            }
        }
        System.out.println("Task not found");
        return false;
    }
}