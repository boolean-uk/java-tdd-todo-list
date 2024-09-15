package com.booleanuk.extension;

import java.util.Date;

public class Task {
    private int taskID;
    private String taskName;
    private boolean taskStatus;
    private Date taskDate;

    public Task(int taskID, String taskName, boolean taskStatus, Date taskDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
        this.taskDate = taskDate;
    }

    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

}
