package com.booleanuk.core;

public class Task {

    String content;
    boolean complete;

    public Task(String content, boolean complete) {
        this.content = content;
        this.complete = complete;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
