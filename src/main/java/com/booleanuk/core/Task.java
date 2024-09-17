package com.booleanuk.core;

import java.util.Objects;

public class Task {
    private String name;
    private boolean completed;

    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task other = (Task) obj;
        return name.equals(other.name) && completed == other.completed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, completed);
    }

    @Override
    public String toString() {
        return "Task[name=" + name + ", completed=" + completed + "]";
    }
}
