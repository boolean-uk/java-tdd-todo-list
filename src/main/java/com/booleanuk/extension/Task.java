package com.booleanuk.extension;

import java.time.LocalDate;
import java.util.Date;

public class Task implements Comparable<com.booleanuk.core.Task> {
    private int id;
    private String description;
    private boolean isComplete;

    private Date date;

    public Task(int id,String description) {
        this.id = id;
        this.description = description;
        this.isComplete = false;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void changeTaskStatus() {
        isComplete = !isComplete;
    }


    @Override
    public int compareTo(com.booleanuk.core.Task o) {
        return this.getDescription().compareTo(o.getDescription());
    }
}

