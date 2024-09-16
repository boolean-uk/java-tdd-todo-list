package com.booleanuk.extension;

import com.booleanuk.core.TodoList;

import java.util.HashMap;

public class TaskContainer {

    HashMap<Integer, HashMap<String, String>> taskMap;
    HashMap<String, String> todolist = new HashMap<>();

    public TaskContainer() {
        this.taskMap = new HashMap<>();
    }

    public void createMap() {
        int count = 1;

        for (String key : todolist.keySet()) {
            HashMap<String, String> task = new HashMap<>();
            task.put(key, todolist.get(key));
            taskMap.put(count, task);
            count++;
        }
    }

    public HashMap<String, String> getTaskById(int id) {
        HashMap<String, String> task = taskMap.get(id);
        if (taskMap.containsKey(id)) {
            System.out.println("task found");
        } else {
            System.out.println("id doesn't exist");
        }
        return task;
    }

    public boolean updateTaskName(int id, String newName) {
        HashMap<String, String> task = getTaskById(id);
        String oldName = task.keySet().iterator().next();
        if (!newName.equals(oldName) && taskMap.containsKey(id)) {
            task.remove(oldName);
            task.put(newName, task.get(oldName));
            System.out.println("name changed successfully");
            return true;
        }
        System.out.println("same name");
        return false;
    }

    public boolean updateStatus(int id, String newStatus) {
        HashMap<String, String> task = getTaskById(id);
        String oldStatus = task.values().iterator().next();
        String name = task.keySet().iterator().next();
        if (!newStatus.equals(oldStatus) && taskMap.containsKey(id)) {
            task.remove(name);
            task.put(name, newStatus);
            System.out.println("status changed successfully");
            return true;
        }
        System.out.println("same status");
        return false;
    }
}
