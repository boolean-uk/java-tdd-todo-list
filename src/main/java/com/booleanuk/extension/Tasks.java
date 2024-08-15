package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Tasks {

    private String name;
    private boolean statusForTask;
    private String uuid;
    LocalDateTime now;


    public Tasks(String name, boolean statusForTask) {
        this.name = name;
        this.statusForTask = statusForTask;
        generateId();
        this.now = LocalDateTime.now();

    }

    public LocalDateTime getNow() {
        return now;
    }

    private void generateId(){
        uuid = UUID.randomUUID().toString().replace("-", "");
    }

    public String getUuid() {
        return uuid;
    }

    public String getTask() {
        return name;
    }

    public boolean isStatusForTask() {
        return statusForTask;
    }

    public void setTask(String task) {
        this.name = task;
    }

    public void setStatusForTask(boolean statusForTask) {
        this.statusForTask = statusForTask;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.statusForTask;
    }
}
