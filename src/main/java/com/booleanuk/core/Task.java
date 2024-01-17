package com.booleanuk.core;

public class Task {
    public String text;
    public boolean completed;

    public Task(String text) {
        this.text = text;
    }

    public Task(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }
}
