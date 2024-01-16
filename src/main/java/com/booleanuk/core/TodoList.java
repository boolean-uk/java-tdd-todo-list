package com.booleanuk.core;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TodoList {
    HashMap<Integer, String> taskname;
    boolean status;
    LocalDateTime creation;

    public TodoList() {
        this.taskname = new HashMap<>();
        this.status = false;
        this.creation = LocalDateTime.now();
        this.taskname.put(1, "Fiske");

    }

    public boolean addTask(int id, String name) {

        if (this.taskname.containsKey(id)) {
            return false;
        }

            this.taskname.put(id, name);
            this.creation = LocalDateTime.now();


        return true;
    }

    public String allTasks() {

        return "";
    }

    public boolean setStatus() {

        return true;
    }

    public String getComplete() {

        return "";
    }

    public String getInComplete() {

        return "";
    }

    public String getTask() {

        return "";
    }

    public boolean removeTask(int id) {


        return true;
    }

    public HashMap<Integer, String> ascending() {

        return new HashMap<>();
    }

    public HashMap<Integer, String> descending() {

        return new HashMap<>();
    }



}
