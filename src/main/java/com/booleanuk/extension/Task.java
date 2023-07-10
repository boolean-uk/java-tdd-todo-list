package com.booleanuk.extension;

public class Task {
    String name;
    boolean isCompleted;

    Task(String name, boolean isCompleted){
        this.name = name;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
