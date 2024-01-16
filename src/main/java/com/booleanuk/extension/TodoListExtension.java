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

        int taskId = taskIdMap.size() + 1;  // Generate a unique ID
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
            taskIdMap.remove(taskToUpdate.getName()); // Remove old entry from taskIdMap
            taskToUpdate.setName(name);               // Update task name
            taskIdMap.put(id, taskToUpdate);        // Put updated task back into taskIdMap
        }
    }

    // Other methods remain mostly unchanged

    // Nested Task class to represent tasks with ID, name, and status
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
