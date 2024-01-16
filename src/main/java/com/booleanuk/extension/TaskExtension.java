package com.booleanuk.extension;

import java.time.LocalDateTime;

public class TaskExtension {

    public String name;
    public boolean status;
    public int ID;
    public LocalDateTime dateTime;

    public TaskExtension(String name) {
        this.name = name;
        this.status = false;
        this.dateTime = LocalDateTime.now();
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
