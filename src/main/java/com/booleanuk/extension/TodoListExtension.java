package com.booleanuk.extension;

import java.util.ArrayList;

public class TodoListExtension {
    ArrayList<TaskExtension> todoList;

    public TodoListExtension() {
        this.todoList = new ArrayList<>();
    }

    public boolean add(String name) {
        TaskExtension task = new TaskExtension(this.todoList.size(), name);
        this.todoList.add(task);
        return true;
    }

    public ArrayList<TaskExtension> viewTodos() {
        return this.todoList;
    }

    public TaskExtension getTaskById(int id) {
        return this.todoList.get(id);
    }

    public void updateTaskName(int id, String newName) {
            TaskExtension updateTask = this.todoList.get(id);
            updateTask.updateName(newName);
    }
}
