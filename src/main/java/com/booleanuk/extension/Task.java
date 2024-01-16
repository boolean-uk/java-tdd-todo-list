package com.booleanuk.extension;

import java.util.Date;

public class Task {
    String taskId;
    String name;
    boolean status;
    Date creationTime;

    public Task(String taskId, String name) {
        this.taskId = taskId;
        this.name = name;
        this.status = false;
        this.creationTime = new Date();
    }
}
