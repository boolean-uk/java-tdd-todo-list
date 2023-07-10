package com.booleanuk.extension;

import com.booleanuk.core.TaskStatus;

import java.util.UUID;

public class TaskExtension {
    private final UUID id = UUID.randomUUID();
    private String title;
    private TaskStatus status;

    public UUID getId() {
        return id;
    }

    public TaskExtension(String title) {
        this.title = title;
        this.status = TaskStatus.INCOMPLETED;
    }

    public TaskExtension(String title, TaskStatus taskStatus) {
        this.title = title;
        this.status = taskStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
