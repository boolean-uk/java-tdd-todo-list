package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    Status status = Status.INCOMPLETE;
    String description;
    LocalDateTime date = LocalDateTime.now();

    String ID = UUID.randomUUID().toString();

    public Task() {
    }

    public Task(String description) {
        this.description = description;
    }

    public Task(Status status, String description) {
        this.status = status;
        this.description = description;
    }

    public void changeStatus() {
        if (status == Status.INCOMPLETE) {
            status = Status.COMPLETE;
        } else {
            status = Status.INCOMPLETE;
        }
    }


}
