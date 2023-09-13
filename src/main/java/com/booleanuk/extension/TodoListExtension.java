package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TodoListExtension {

    public HashMap<String, String> toDoList = new HashMap<>();
    public HashMap<Integer, String> tasksID = new HashMap<>();
    public HashMap<String, String> taskCreationTime = new HashMap<>();
    int nextTasksID = 1;

    public String addTask(String taskName, String status) {
        if (!toDoList.containsKey(taskName)) {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            toDoList.put(taskName, status);
            tasksID.put(nextTasksID, taskName);
            taskCreationTime.put(taskName, formattedTime);
            nextTasksID++;
            return "Done";
        }
        return "Task already exists";
    }

    public void printTasks() {
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            System.out.println("Task: " + entry.getKey() + " - Category: " + entry.getValue());
        }
    }

    public String changeStatus(String taskName, String status) {
        if (toDoList.containsKey(taskName)) {
            toDoList.put(taskName, status);
            return "Status changed";
        }
        return "Non-existent task";
    }

    public ArrayList<String> getCompletedTasks() {
        ArrayList<String> completedTasks = new ArrayList<>();

        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            if (entry.getValue().equals("Completed")) {
                completedTasks.add(entry.getKey());
            }
        }
        return completedTasks;
    }

    public ArrayList<String> getUncompletedTasks() {
        ArrayList<String> uncompletedTasks = new ArrayList<>();

        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            if (entry.getValue().equals("Uncompleted")) {
                uncompletedTasks.add(entry.getKey());
            }
        }
        return uncompletedTasks;
    }

    public String searchTasks(String taskName) {
        if (toDoList.containsKey(taskName)) {
            return toDoList.get(taskName);
        }
        return "The task was not found";
    }

    public String removeTask(String taskName) {
        if (toDoList.containsKey(taskName)) {
            toDoList.remove(taskName);
            tasksID.entrySet().removeIf(entry -> taskName.equals(entry.getValue()));
            taskCreationTime.entrySet().removeIf(entry -> taskName.equals(entry.getKey()));
            return "Done";
        }
        return "The task does not exist";
    }

    public ArrayList<String> ascendingSort() {
        ArrayList<String> tasks = new ArrayList<>();
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            tasks.add(entry.getKey());
        }
        Collections.sort(tasks);
        return tasks;
    }

    public ArrayList<String> descendingSort() {
        ArrayList<String> tasks = new ArrayList<>();
        for (Map.Entry<String,String> entry: toDoList.entrySet()) {
            tasks.add(entry.getKey());
        }
        tasks.sort(Collections.reverseOrder());
        return tasks;
    }

    public String searchWithId(int id) {
        if (tasksID.containsKey(id)) {
            return tasksID.get(id);
        }
        return "Task was not found";
    }

    public String updateNameWithId(int id, String newTaskName) {
       if (tasksID.get(id) != null ) {
           String prevTaskName = tasksID.get(id);
           if (toDoList.containsKey(prevTaskName) && taskCreationTime.containsKey(prevTaskName)) {
               LocalDateTime currentTime = LocalDateTime.now();
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
               String formattedTime = currentTime.format(formatter);

               String status = toDoList.get(prevTaskName);
               toDoList.put(newTaskName, status);
               tasksID.put(id, newTaskName);
               taskCreationTime.put(newTaskName, formattedTime);
               return "Done";
           }
       }
       return "Task was not found";
    }

    public String changeStatusWithId(int id, String newStatus) {
        if (tasksID.containsKey(id)) {
            String taskName = tasksID.get(id);
            if (toDoList.containsKey(taskName)) {
                toDoList.put(taskName, newStatus);
                return "Done";
            }
        }
        return "Task was not found";
    }

    public String tasksCreationTimeFn(String task) {
        if (taskCreationTime.containsKey(task)) {
            return taskCreationTime.get(task);
        }
        return "Task was not found";
    }

}
