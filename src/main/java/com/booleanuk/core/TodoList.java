package com.booleanuk.core;

import java.time.LocalDateTime;
import java.util.*;

public class TodoList {
    HashMap<Integer, String> taskname;
    boolean status;
    LocalDateTime creation;
    HashMap<String, Boolean> tasks;

    public TodoList() {
        this.tasks = new HashMap<>();
        this.taskname = new HashMap<>();
        this.status = false;
        this.creation = LocalDateTime.now();


        tasks.put("Fiske", true);


    }


    public boolean addTask(String name, boolean status) {

        if (this.tasks.containsKey(name)) {
            return false;
        }


        tasks.put(name, status);


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



}