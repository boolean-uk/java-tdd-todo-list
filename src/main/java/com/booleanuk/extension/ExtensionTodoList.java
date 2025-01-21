package com.booleanuk.extension;

import java.util.ArrayList;

public class ExtensionTodoList {

    private ArrayList<Task> tasks;

    public ExtensionTodoList(ArrayList<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public String getTaskById(int id) {
        String output;
        Task task = this.tasks.get(id);
        if (task.isStatus()) {
            output = task.getName() + ", completed";
            return output;
        }
        output = task.getName() + ", incomplete";
        return output;
    }

    public String updateTaskName(int id, String name) {
        Task task = this.tasks.get(id);
        task.setName(name);
        return "Task successfully updated to: " + task.getName();
    }

    public boolean updateTaskStatus(int id) {
        Task task = this.tasks.get(id);
        if (!task.isStatus()) {
            task.setStatus(true);
            return task.isStatus();
        }
        task.setStatus(false);
        return task.isStatus();
    }

    public String showDateTime() {
        StringBuilder output = new StringBuilder();
         if (this.tasks.isEmpty()) {
             return "Todolist is empty";
         }
         for (Task task : tasks) {
             output.append("Task: ").append(task.getName()).append(", Created on: ").append(task.getTime()).append("\n");
         }
         return output.toString();
    }
}
