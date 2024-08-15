package com.booleanuk.core;

public class Task {
    int uniqueID;
    Boolean status;
    String dateCreated;
    String taskName;

    public Task(String taskName, int id, Boolean status, String date){
        this.uniqueID = id;
        this.status = status;
        this.dateCreated = date;
        this.taskName = taskName;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "uniqueID=" + uniqueID +
                ", status=" + status +
                ", dateCreated='" + dateCreated + '\'' +
                ", taskName='" + taskName + '\'' +
                '}';
    }
}
