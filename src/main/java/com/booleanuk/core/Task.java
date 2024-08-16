package com.booleanuk.core;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    String taskName;
    String taskDesc;
    String taskStatus;
    String taskId;

    public Task(String taskName, String taskDesc){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
        String formattedDateTime = now.format(formatter);
        this.taskDesc = taskDesc;
        this.taskName = taskName;
        this.taskStatus = "Incomplete";
        this.taskId = formattedDateTime;
    }
    @Override
    public String toString() {
        return "{" +
                "taskName='" + taskName + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskId='" + taskId + '\'' +
                '}';
    }

}
