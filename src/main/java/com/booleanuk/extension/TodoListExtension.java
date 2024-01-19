package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TodoListExtension {

    private HashMap<Integer, String> tasks;
    private HashMap<Integer, Boolean> taskStatus;
    private HashMap<Integer, LocalDateTime> dateTimes;

    public TodoListExtension() {

    }

    public void add(String task) {

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
