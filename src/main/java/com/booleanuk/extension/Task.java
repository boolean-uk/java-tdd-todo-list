package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int taskId;
    private String name;
    private LocalDateTime timeCreated;
    private boolean completed;

    public Task(String name) {
        this.taskId = count.incrementAndGet();
        this.name = name;
        this.timeCreated = LocalDateTime.now();
        this.completed = false;
    }

    public static void resetCount(){
        count.set(0);
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task: " + name + "\n" +
                "Task ID: " + taskId + "\n" +
                "Created at: " + timeCreated.toLocalDate() + "T" + timeCreated.toLocalTime().withSecond(0).withNano(0) + "\n" +
                "Completed: " + completed + "\n\n";
    }
}