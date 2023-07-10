package com.booleanuk.core;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Task {
    private final String name;
    private TaskStatus status;

    private Task(String name, TaskStatus status) {
        this.name = name;
        this.status = status;
    }

    public static Task of(String name) {
        return new Task(name, TaskStatus.InProgress);
    }

    public String name() {
        return name;
    }

    public TaskStatus status() {
        return status;
    }

    public void toggleStatus() {
        switch (status) {
            case InProgress -> status = TaskStatus.Complete;
            case Complete -> status = TaskStatus.InProgress;
        }
    }
}
