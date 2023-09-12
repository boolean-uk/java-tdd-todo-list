package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String name) {
        Task newTask = new Task(name);
        this.tasks.add(newTask);
    }

    public String getTasks() {
        StringBuilder result = new StringBuilder();
        for (Task task: this.tasks){
            result.append(task.getName()).append("\n");
        }
        return String.valueOf(result).substring(0,result.length()-1);
    }
}
