package com.booleanuk.extension;

import com.booleanuk.core.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskExtension {
    private final UUID id = UUID.randomUUID();
    private final String title;
    private TaskStatusExtension status;
    private LocalDateTime date;

    public UUID getId() {
        return id;
    }

    public TaskExtension(String title) {
        this.title = title;
        this.status = TaskStatusExtension.INCOMPLETED;
        this.date = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public TaskExtension(String title, TaskStatusExtension taskStatus) {
        this.title = title;
        this.status = taskStatus;
        this.date = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public TaskStatusExtension getStatus() {
        return status;
    }

    public void setStatus(TaskStatusExtension status) {
        this.status = status;
    }
}
