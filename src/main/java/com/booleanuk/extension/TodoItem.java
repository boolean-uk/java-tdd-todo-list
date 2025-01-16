package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private String name;
    private Boolean completed;
    private final Integer todoID;
    private LocalDateTime dateTime;

    public TodoItem(Integer todoID, String name, Boolean completed, LocalDateTime dateTime){
        this.todoID = todoID;
        this.name = name;
        this.completed = false;
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getTodoID() {
        return todoID;
    }
}
