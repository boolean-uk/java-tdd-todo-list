package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    private int id;
    private String description;
    private boolean completed;
    private LocalDateTime creationDate;

    public Task(int id, String description) {
        this.description = description;
        this.completed = false;
        this.id = id;
        this.creationDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "[" + id +", \"" + description + "\", " + (completed ? "1, " : "0, ") + creationDate.getDayOfWeek() + "]";
    }
}
