package com.booleanuk.extension;

import java.util.Date;

public class Task {
    String todoId;
    String name;
    boolean status;
    Date creationTime;

    public Task(String todoId, String name) {
        this.todoId = todoId;
        this.name = name;
        this.status = false;
        this.creationTime = new Date();
    }
}
