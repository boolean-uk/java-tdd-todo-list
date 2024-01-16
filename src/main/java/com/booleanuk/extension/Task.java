package com.booleanuk.extension;

public class Task {

    String id, name, date, time;
    boolean status;

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
        status = false;
    }
}
