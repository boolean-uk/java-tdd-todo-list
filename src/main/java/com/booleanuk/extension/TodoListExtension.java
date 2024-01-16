package com.booleanuk.extension;

import java.util.ArrayList;

public class TodoListExtension {
    ArrayList<Task> todos;

    public TodoListExtension() {
        this.todos = new ArrayList<>();
    }

    public String getTaskById(String taskId) {
        if (todos.isEmpty()) return "List is empty";
        for(Task task: todos) {
            if (taskId.equals(task.taskId)) {
                return task.name+": "+(task.status ? "complete" : "incomplete");
            }
        }
        return "Task not found";
    }

    public boolean setTaskName(String taskId, String name) {
        for(Task task: todos) {
            if (taskId.equals(task.taskId)) {
                task.name = name;
                return true;
            }
        }
        return false;
    }

    public boolean setTaskStatus(String taskId) {
        for(Task task: todos) {
            if (taskId.equals(task.taskId)) {
                task.status = !task.status;
                return true;
            }
        }
        return false;
    }

    public String getTasksWithTime() {
        if (this.todos.isEmpty()) return "List is empty";
        String todoString = "";
        for(Task task: todos) {
            todoString = todoString.concat(task.name+": "+(task.status ? "complete" : "incomplete") + "\n" + task.creationTime +"\n");
        }
        return todoString.substring(0, todoString.length()-1);
    }
}
