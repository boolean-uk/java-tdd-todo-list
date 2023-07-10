package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {

    UUID uuid = UUID.randomUUID();
    String name;
    boolean isCompleted;
    LocalDateTime dateOfCreation = LocalDateTime.now();

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
