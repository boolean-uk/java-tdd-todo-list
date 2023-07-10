package com.booleanuk.core;

import java.util.Objects;

public class Task {
    public String name;
    public boolean completed;

    public Task(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Task)) {
            return false;
        }
        Task aTask = (Task) o;
        return this.name.equals(aTask.name) && (this.completed == aTask.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.completed);
    }
}
