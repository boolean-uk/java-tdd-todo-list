package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoList {

    private HashMap<String, Boolean> todoList = new HashMap<String, Boolean>();

    public HashMap<String, Boolean> getTodoList() {
        return todoList;
    }

    // I want to add tasks to my todo list.
    public void add(String todo) {
        todoList.put(todo, false);
    }

    // I want to see all the tasks in my todo list.
    public void list() {
        for (String key : todoList.keySet()) {
            System.out.println(key);
        }
    }

    // I want to change the status of a task between incomplete and complete.
    public boolean toggle(String todo) {
        if (todoList.containsKey(todo)) {
            todoList.put(todo, !todoList.get(todo));
            return true;
        }
        return false;
    }

    // I want to be able to get only the complete tasks.
    public HashMap<String, Boolean> getComplete() {
        HashMap<String, Boolean> complete = new HashMap<String, Boolean>();

        for (String key : todoList.keySet()) {
            if (todoList.get(key)) {
                complete.put(key, todoList.get(key));
            }
        }
        return complete;
    }

    // I want to be able to get only the incomplete tasks.
    public HashMap<String, Boolean> getIncomplete() {
        HashMap<String, Boolean> inComplete = new HashMap<String, Boolean>();

        for (String key : todoList.keySet()) {
            if (!todoList.get(key)) {
                inComplete.put(key, todoList.get(key));
            }
        }
        return inComplete;
    }

    // I want to search for a task and receive a message that says it wasn't found
    // if it doesn't exist.

    public String search(String todo) {
        if (todoList.containsKey(todo)) {
            return todo;
        }
        return "Task not found";
    }

}
