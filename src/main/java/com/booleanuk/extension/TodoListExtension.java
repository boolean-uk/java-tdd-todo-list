package com.booleanuk.extension;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class TodoListExtension {
    private final Map<Integer, Task> taskIdMap;  // Map to store task IDs
    private final Map<String, Task> todoList;    // Map to store tasks

    public TodoListExtension() {
        this.taskIdMap = new HashMap<>();
        this.todoList = new HashMap<>();
    }

    public boolean add(String taskName, String status) {
        if (taskName == null) {
            return false;
        }

        int taskId = taskIdMap.size() + 1;
        Date timeCreated = new Date();
        Task task = new Task(taskId, taskName, status, timeCreated);

        todoList.put(taskName, task);
        taskIdMap.put(taskId, task);

        return true;
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

    public String getDate(int id) {
        Task taskDate = taskIdMap.get(id);
        if (taskDate != null) {
            return taskDate.getFormattedDate();
        } else {
            return "Task not found";
        }
    }

    public String getTime(int id) {
        Task taskTime = taskIdMap.get(id);
        if (taskTime != null) {
            return taskTime.getFormattedTime();
        } else {
            return "Task not found";
        }
    }

    private static class Task {
        private final int id;
        private String name;
        private String status;
        private final Date timeCreated;
        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM.dd.yyyy HH:mm:ss");


        public Task(int id, String name, String status, Date timeCreated) {
            this.id = id;
            this.name = name;
            this.status = status;
            this.timeCreated = timeCreated;
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

        private String getFormattedDate() {
            SimpleDateFormat timeFormat = new SimpleDateFormat("dd.MM.yyyy");
            return timeFormat.format(timeCreated);
        }

        private String getFormattedTime() {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            return timeFormat.format(timeCreated);
        }
    }
}
