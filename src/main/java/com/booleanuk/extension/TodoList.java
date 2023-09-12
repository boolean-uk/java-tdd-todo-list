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
        return true;
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
        return null;
    }

    public boolean setStatus(int id){
        for (Task task : this.tasks2) {
            if (Objects.equals(task.getId(), id)) {
                task.setStatus();
                return true;
            }
        }
        return false;
    }
}
