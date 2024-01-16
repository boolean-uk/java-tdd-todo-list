package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class TodoListExtension {
    HashMap<Integer, String> taskname;
    boolean status;
    LocalDateTime creation;
    HashMap<String, Boolean> tasks;

    public TodoListExtension() {
        this.tasks = new HashMap<>();
        this.taskname = new HashMap<>();
        this.status = false;
        this.creation = LocalDateTime.now();





    }


    public boolean addTask(int id, String name) {

        if (this.taskname.containsKey(name)) {
            return false;
        }


        taskname.put(id, name);


        return true;
    }

    public String allTasks() {

        return this.tasks.toString();
    }

    public boolean setStatus(String name, boolean status) {

        if (tasks.containsKey(name)) {
            tasks.put(name, status);
            return true;

        }

        return false;
    }


    public String getComplete() {
        HashMap<String, Boolean> completedTasks = new HashMap<>();

        for (HashMap.Entry<String, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue()) {
                completedTasks.put(entry.getKey(), true);
            }
        }

        if (!completedTasks.isEmpty()) {
            return completedTasks.toString();
        } else {
            return "didnt find anything";
        }
    }

    public String getInComplete() {
        HashMap<String, Boolean> inCompletedTasks = new HashMap<>();

        for (HashMap.Entry<String, Boolean> entry : tasks.entrySet()) {
            if (entry.getValue()) {
                inCompletedTasks.put(entry.getKey(), false);
            }
        }

        if (!inCompletedTasks.isEmpty()) {
            return inCompletedTasks.toString();
        } else {
            return "didnt find anything";
        }

    }

    public String getTask(String name) {


        if (tasks.containsKey(name)) {
            return "This was your task: " + name + " status: " + tasks.get(name);
        }


        return "The task wasnt found!";
    }

    public boolean removeTask(String name) {

        if (tasks.containsKey(name)) {
            tasks.remove(name);
            return true;
        }

        return false;


    }

    public String ascending() {

        ArrayList<String> order = new ArrayList<>();


        for (HashMap.Entry<String, Boolean> entry : tasks.entrySet()) {

            order.add(entry.getKey());


        }
        Collections.sort(order);


        return order.toString();
    }

    public String descending() {
        ArrayList<String> order1 = new ArrayList<>();

        List<String> order = new ArrayList<>(tasks.keySet());
        Collections.reverse(order);
        return order.toString();
    }


    public boolean getTaskWithId(int id) {

        return taskname.containsKey(id);
    }

    public String setNewName(int id, String newName) {


        if (taskname.containsKey(id)) {
            taskname.put(id, newName);
            return taskname.get(id).toString();
        }


        return "It no work";
    }

    public boolean changeStatus(int id) {

        return false;
    }



}

