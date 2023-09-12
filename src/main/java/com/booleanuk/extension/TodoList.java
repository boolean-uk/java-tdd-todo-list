package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.Objects;

public class TodoList {
    ArrayList<Task> tasks2;
    int idCount;

    public TodoList() {
        this.tasks2 = new ArrayList<>();
        this.idCount = 0;
    }

    public void add(String name) {
        Task newTask = new Task(name, idCount++);
        this.tasks2.add(newTask);
    }

    public boolean updateTask(int id, String newName) {
        if (id >= idCount || id < 0) {
            return false;
        }
        for (Task task: this.tasks2){
            if (task.getId() == id){
                task.setName(newName);
                return true;
            }
        }
        return false;
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

    public Task getTaskById(int id) {
        if (id >= idCount || id < 0) {
            return null;
        }
        for (Task task: this.tasks2) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public boolean setStatus(int id){
        if (id >= idCount || id < 0) {
            return false;
        }
        for (Task task : this.tasks2) {
            if (Objects.equals(task.getId(), id)) {
                task.setStatus();
                return true;
            }
        }
        return false;
    }
}
