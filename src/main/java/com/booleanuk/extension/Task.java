package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    String content;
    boolean complete;
    int id;
    LocalDateTime dateTime = LocalDateTime.now();

    public Task(String content, boolean complete, int id) {
        this.content = content;
        this.complete = complete;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public boolean isComplete() {
        return complete;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
