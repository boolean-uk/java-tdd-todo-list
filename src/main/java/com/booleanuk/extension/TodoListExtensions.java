package com.booleanuk.extension;

import java.util.HashMap;

public class TodoListExtensions {
    private HashMap<String, TaskExtension> todoList;

    public TodoListExtensions() {
        this.todoList = new HashMap<>();
    }

    public HashMap<String, TaskExtension> getTodoList() {
        return todoList;
    }

    public String add(TaskExtension task) {
        if(todoList.containsKey(task.getId())) {
            return task.getId();
        } else {
            todoList.put(task.getId(), task);
            return task.getId();
        }
    }

    public boolean changeName(String id, String name) {
        if (todoList.containsKey(id)) {
            todoList.get(id).setName(name);
            return true;
        } else {
            System.out.println("Task is not in the todo list!");
            return false;
        }
    }

    public boolean changeStatus(String id, boolean status) {
        if (todoList.containsKey(id)) {
            todoList.get(id).changeStatus(status);
            return true;
        } else {
            System.out.println("Task is not in the todo list!");
            return false;
        }
    }
}
