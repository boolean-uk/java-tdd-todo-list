package com.booleanuk.extension;
import java.util.HashMap;
import java.util.Map;

public class TodoListExtension {

    private HashMap<Integer, String[]> toDoList;
    private int nextId;

    public TodoListExtension() {
        this.toDoList = new HashMap<>();
        this.nextId = 1; // Start ID from 1
    }

    public boolean addTask(String task) {
        if (toDoList.values().stream().anyMatch(t -> t[0].equals(task))) {
            return false;
        }
        toDoList.put(nextId++, new String[]{task, "incomplete"});
        return true;
    }

    public String changeStatus(int id) {
        if (toDoList.containsKey(id)) {
            String[] task = toDoList.get(id);
            task[1] = task[1].equals("incomplete") ? "complete" : "incomplete";
            return task[1];
        }
        return "Task not found";
    }

    public void seeAllTasks() {
        toDoList.forEach((id, task) -> System.out.println("ID: " + id + ", Task: " + task[0] + ", Status: " + task[1]));
    }

    public void getCompleteTask() {
        toDoList.forEach((id, task) -> {
            if ("complete".equals(task[1])) {
                System.out.println("ID: " + id + ", Task: " + task[0]);
            }
        });
    }

    public void getIncompleteTask() {
        toDoList.forEach((id, task) -> {
            if ("incomplete".equals(task[1])) {
                System.out.println("ID: " + id + ", Task: " + task[0]);
            }
        });
    }

    public String searchTask(String taskDescription) {
        return toDoList.entrySet().stream()
                .filter(entry -> entry.getValue()[0].equals(taskDescription))
                .findFirst()
                .map(entry -> "Task found: ID: " + entry.getKey() + ", Task: " + entry.getValue()[0])
                .orElse("Task not found");
    }

    public boolean removeTask(int id) {
        if (toDoList.containsKey(id)) {
            toDoList.remove(id);
            return true;
        }
        return false;
    }

    public void printTasksInAscOrder() {
        toDoList.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Task: " + entry.getValue()[0]));
    }

    public void showTasksInDescOrder() {
        toDoList.entrySet().stream()
                .sorted(Map.Entry.<Integer, String[]>comparingByKey().reversed())
                .forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Task: " + entry.getValue()[0] + " - " + entry.getValue()[1]));
    }

    public String getTaskById(int id) {
        if (toDoList.containsKey(id)) {
            String[] task = toDoList.get(id);
            return "ID: " + id + ", Task: " + task[0] + ", Status: " + task[1];
        }
        return "Task not found";
    }
    public boolean updateTaskName(int id, String newName) {
        if (toDoList.containsKey(id)) {
            toDoList.get(id)[0] = newName; // Update the task name
            return true;
        }
        return false;
    }
}


