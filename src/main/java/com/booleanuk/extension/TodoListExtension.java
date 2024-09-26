package com.booleanuk.extension;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TodoListExtension {

    private HashMap<Integer, String[]> toDoList;
    //LocalDateTime creationTime;
    private int nextId;

    public TodoListExtension() {
        this.toDoList = new HashMap<>();
        //this.creationTime = LocalDateTime.now();
        this.nextId = 1;
    }

    public boolean addTask(String task) {
        if (toDoList.values().stream().anyMatch(t -> t[0].equals(task))) {
            return false;
        }
        String creationTime = LocalDateTime.now().toString();
        toDoList.put(nextId++, new String[]{task, "incomplete", creationTime});
        return true;
    }

    public String getTaskById(int id) {
        if (toDoList.containsKey(id)) {
            String[] task = toDoList.get(id);
            return "ID: " + id + ", Task: " + task[0] + ", Status: " + task[1];
        }
        return "Task not found";
    }
    public boolean updateTaskName(int id, String newName) {
        if (toDoList.containsKey(id)) {
            toDoList.get(id)[0] = newName; // Update the task name
            return true;
        }
        return false;
    }
    public String changeStatus(int id) {
        if (toDoList.containsKey(id)) {
            String[] task = toDoList.get(id);
            task[1] = task[1].equals("incomplete") ? "complete" : "incomplete";
            return "Status changed to: " + task[1];
        }
        return "Task not found";
    }
    public String getTaskWithTimestampById(int id){
        if (toDoList.containsKey(id)){
            String[] task = toDoList.get(id);
            System.out.println(task[2]);
            return "ID: " + id + ", Task: " + task[0] + ", Status: " + task[1] + ", Created on: " + task[2];
        }
        return "Task not found";

    }

    public static void main(String[] args) {
        TodoListExtension todolist = new TodoListExtension();
        todolist.addTask("walk");
        todolist.getTaskWithTimestampById(1);
    }

}


