package com.booleanuk.extension;

import java.util.*;

public class TodoList {

    HashMap<String, Task> tasks;

    public TodoList() {
        tasks = new HashMap<>();
    }
    public boolean addTask(String name, String id) {
        if(tasks.containsKey(id)) {
            return false;
        }
        tasks.put(id, new Task(id, name));
        return true;
    }

    public String seeList() {
        String list = "";
        for(Task task: tasks.values()) {
            list += task.name + "\n";
        }
        return list.substring(0, list.length()-1);
    }

    public boolean updateTaskStatus(String id, boolean newStatus) {
        if(!tasks.containsKey(id)) {
            return false;
        }
        Task task = tasks.get(id);
        task.status = newStatus;
        tasks.put(id, task);
        return true;
    }

    public ArrayList<String> getCompletedTasks() {
        return getTasks(true);
    }

    public ArrayList<String> getUncompletedTasks() {
        return getTasks(false);
    }

    private ArrayList<String> getTasks(boolean status) {
        ArrayList<String> tasksWithTheSuppliedStatus = new ArrayList<>();
        for(Task task: tasks.values()) {
            if(task.status == status) {
                tasksWithTheSuppliedStatus.add(task.name);
            }
        }
        return tasksWithTheSuppliedStatus;
    }

    public String doesTaskExist(String id) {
        return tasks.containsKey(id)? "The task exists!" : "The task doesn't exist!";
    }

    public boolean remove(String id) {
        if(!tasks.containsKey(id)) {
            return false;
        }
        tasks.remove(id);
        return true;
    }

    public ArrayList<String> getListInAlphabeticalOrder(boolean ascending) {

        ArrayList<String> taskNames = new ArrayList<>();

        for(Task t: tasks.values()) {
            taskNames.add(t.name);
        }

        Collections.sort(taskNames);
        if(ascending) {
            return taskNames;
        }
        Collections.reverse(taskNames);
        return taskNames;
    }
}
