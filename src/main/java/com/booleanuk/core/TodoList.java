package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> todos;

    public TodoList() {
        this.todos = new HashMap<>();
    }

    public boolean add(String todo) {
        if (todo.isBlank() || this.todos.containsKey(todo)) {
            return false;
        }
        this.todos.put(todo, false);
        return true;
    }

    public String getTodoList() {
        if (this.todos.isEmpty()) return "List is empty";
        String todoString = "";
        for (String todo: this.todos.keySet()) {
            todoString = todoString.concat(todo+": ");
            if (this.todos.get(todo)) {
                todoString = todoString.concat("Complete\n");
            } else {
                todoString = todoString.concat("Incomplete\n");
            }
        }
        return todoString.substring(0,todoString.length()-1);
    }

    public boolean completeTask(String todo) {
        if (!this.todos.containsKey(todo) || this.todos.get(todo)) {
            return false;
        }
        this.todos.put(todo, true);
        return true;
    }

    public String getCompleteTasks() {
        if (this.todos.isEmpty()) return "No tasks completed";
        String todoString = "";
        for (String todo: this.todos.keySet()) {
            if (this.todos.get(todo)) {
                todoString = todoString.concat(todo+"\n");
            }
        }
        if (todoString.isBlank()) return "No tasks completed";
        return todoString.substring(0,todoString.length()-1);
    }

    public String getIncompleteTasks() {
        if (this.todos.isEmpty()) return "No tasks incomplete";
        String todoString = "";
        for (String todo: this.todos.keySet()) {
            if (!this.todos.get(todo)) {
                todoString = todoString.concat(todo+"\n");
            }
        }
        if (todoString.isBlank()) return "No tasks incomplete";
        return todoString.substring(0,todoString.length()-1);
    }

    public String getTask(String todo) {
        if (!this.todos.containsKey(todo)) {
            return "Task not found";
        }
        if (this.todos.get(todo)) {
            return todo.concat(": complete");
        }
        return todo.concat(": incomplete");
    }

    public boolean removeTask(String todo) {
        if (!this.todos.containsKey(todo)) {
            return false;
        }
        this.todos.remove(todo);
        return true;
    }

    public String getOrderedAscending() {
        if (this.todos.isEmpty()) return "No tasks in list";
        ArrayList<String> todos = new ArrayList<>(this.todos.keySet());
        Collections.sort(todos);
        String todoString = "";
        for(String todo: todos) {
            todoString = todoString.concat(todo+": ");
            if (this.todos.get(todo)) {
                todoString = todoString.concat("complete\n");
            } else {
                todoString = todoString.concat("incomplete\n");
            }
        }
        return todoString.substring(0, todoString.length()-1);
    }
}
