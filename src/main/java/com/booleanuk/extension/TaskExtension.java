package com.booleanuk.extension;

import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TaskExtension {
    private String name;
    private boolean complete;
    private String id;
    private String date;

    public TaskExtension(String name) {
        this.name = name;
        this.complete = false;
        this.id = UUID.randomUUID().toString();
        this.date = java.time.ZonedDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm"));
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void changeStatus(boolean status) {
        complete = status;
    }

    public void setName(String name) {
        this.name = name;
    }
}
