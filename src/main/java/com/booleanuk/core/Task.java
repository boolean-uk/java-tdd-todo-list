package com.booleanuk.core;

public record Task(
        String name,
        TaskStatus status
) {
    public static Task of(String name) {
        return new Task(name, TaskStatus.InProgress);
    }
}
