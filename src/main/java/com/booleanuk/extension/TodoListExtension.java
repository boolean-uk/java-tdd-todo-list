package com.booleanuk.extension;

import java.util.HashMap;
import java.util.Map;

public class TodoListExtension {
    private final Map<Integer, Task> taskIdMap;  // Map to store task IDs
    private final Map<String, Task> todoList;    // Map to store tasks

    public TodoListExtension() {
        this.taskIdMap = new HashMap<>();
        this.todoList = new HashMap<>();
    }

    public void add(String taskName, String status) {
        if (taskName == null) {
            return;
        }

        int taskId = taskIdMap.size() + 1;
        Task task = new Task(taskId, taskName, status);

        todoList.put(taskName, task);
        taskIdMap.put(taskId, task);
    }

    public String getTask(int id) {
        String taskName = "";
        Task task = taskIdMap.get(id);

        if (task != null) {
            taskName = task.getName();
        }

        return taskName;
    }

    public void updateTask(int id, String name) {
        if (name != null && taskIdMap.containsKey(id)) {
            Task taskToUpdate = taskIdMap.get(id);
            taskIdMap.remove(taskToUpdate.getName());
            taskToUpdate.setName(name);
            taskIdMap.put(id, taskToUpdate);
        }
    }

    public void updateStatus(int id, String status) {
        if (status != null && taskIdMap.containsKey(id)) {
            Task taskToUpdate = taskIdMap.get(id);
            taskToUpdate.setStatus(status);
        }
    }

    public String taskStatus(int id) {
        Task taskStatus = taskIdMap.get(id);
        if (taskStatus != null) {
            return taskStatus.getStatus();
        } else {
            return "Task not found";
        }
    }

    private static class Task {
        private final int id;
        private String name;
        private String status;

        public Task(int id, String name, String status) {
            this.id = id;
            this.name = name;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
