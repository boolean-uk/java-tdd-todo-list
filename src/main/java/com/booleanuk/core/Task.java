package com.booleanuk.core;

import java.util.Map;

public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        completed = false;
    }

    public String getName() {
        return this.name;
    }
}
