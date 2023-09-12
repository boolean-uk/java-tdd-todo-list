package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Objects;

public class TodoList {
    ArrayList<Task> tasks2;

    public TodoList() {
        this.tasks2 = new ArrayList<>();
    }

    public void add(String name) {
        Task newTask = new Task(name);
        this.tasks2.add(newTask);
    }

    public String getTasks() {
        if (tasks2.size() == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (Task task: this.tasks2){
            result.append(task.getName()).append("\n");
        }
        return String.valueOf(result).substring(0,result.length()-1);
    }

    public boolean setStatus(String name){
        for (Task task : this.tasks2) {
            if (Objects.equals(task.getName(), name)) {
                task.setStatus();
                return true;
            }
        }
        return false;
    }

    public Task search(String name){
        for (Task task: this.tasks2){
            if (Objects.equals(task.getName(), name)) {
                return task;
            }
        }
        System.out.println("This task was not found in the Todo List.");
        return null;
    }
}
