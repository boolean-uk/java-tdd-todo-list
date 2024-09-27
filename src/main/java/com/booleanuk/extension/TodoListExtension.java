package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TodoListExtension {

    private HashMap<Integer, String> tasks;
    private HashMap<Integer, Boolean> taskStatus;
    private HashMap<Integer, LocalDateTime> dateTimes;
    private int idCount;

    public TodoListExtension() {
        this.tasks = new HashMap<>();
        this.taskStatus = new HashMap<>();
        this.dateTimes = new HashMap<>();
        this.idCount = 0;
    }

    public void add(String task) {
        this.idCount += 1;
        this.tasks.put(this.idCount, task);
        this.taskStatus.put(this.idCount, false);
        this.dateTimes.put(this.idCount, LocalDateTime.now());
    }

    public HashMap<Integer, String> getTasks() {
        return this.tasks;
    }

    public String getTask(int id) {
        return "";
    }

    public boolean updateName(int id, String newName) {
        return false;
    }

    public boolean changeStatus(int id) {
        return false;
    }

    public LocalDateTime getDateTime(int id) {
        return null;
    }


}
