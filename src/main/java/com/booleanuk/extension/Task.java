package com.booleanuk.extension;


import java.time.LocalDateTime;

public class Task {
    long id;
    String name;
    LocalDateTime creationDataAndTime;
    boolean status;

    public Task(long id, String name) {
        this.id = id;
        this.name = name;
        this.status= false;
        this.creationDataAndTime= LocalDateTime.now();
    }

}
