package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, String> taskList;

    public TodoList() {
        this.taskList = new HashMap<>();
//        taskList.put("Speak","Complete");
//        taskList.put("talk","Incomplete");
//        taskList.put("Sleep","Complete");
//        taskList.put("Snore","Incomplete");
    }

    public boolean add(String task) {
        if (taskList.containsKey(task)){
            return false;
        }else {
            taskList.put(task, "Incomplete");
            return true;
        }
    }

    public String viewTask() {
        return "Task:"+ taskList;
    }

    public String updateTask(String task) {
        if (taskList.get(task).equals("Incomplete")){
            taskList.put(task,"Complete");
        } else taskList.put(task,"Incomplete");

        return task + " " + taskList.get(task);
    }

    public String viewCompletedTask() {
        HashMap<String, String> completeTask = new HashMap<>();
        for (String key : taskList.keySet()) {
            if (taskList.get(key).equals("Complete")){
                completeTask.put(key, "Complete");
            }
        }
        return "Completed tasks: " + completeTask;
    }

    public String viewIncompletedTask() {
        HashMap<String, String> incompleteTask = new HashMap<>();
        for (String key : taskList.keySet()) {
            if (taskList.get(key).equals("Incomplete")){
                incompleteTask.put(key, "Incomplete");
            }
        }
        return "Incompleted tasks: " + incompleteTask;
    }


    public String findTask(String task) {
        return "your Task: " + task + " is " + taskList.get(task);
    }

    public boolean remove(String task) {
        if (taskList.containsKey(task)){
            taskList.remove(task);
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.findTask("Sleep");
        //System.out.println(todoList.viewCompletedTask());
    }
}
