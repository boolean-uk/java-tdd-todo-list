package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class TodoList {

   private Map<String, Boolean> todolist = new HashMap<>();

    public TodoList() {

    }



    public void addTaskToTodolist(String task) {
        this.todolist.put(task, false);
    }

    public Map<String, Boolean> getTodolist() {
        return new HashMap<>(todolist);
    }

    public void printTasksFromTodolist() {
        for(String str : todolist.keySet()) {
            System.out.println(str);
        }
    }

    public void changeTaskToCompleteOrIncomplete(String task1) {
        if(this.todolist.containsKey(task1)) {
            this.todolist.put(task1, !(this.todolist.get(task1)));
        }

    }

    public Map<String, Boolean> getCompleteOrIncompleteTasks(String complete) {

        return new HashMap<>();
    }
}
