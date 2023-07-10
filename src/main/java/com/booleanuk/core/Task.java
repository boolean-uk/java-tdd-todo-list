package com.booleanuk.core;

public class Task implements Comparable<Task>{

    private String taskName;
    private boolean status;

    public Task(String taskName) {
        this.taskName = taskName;
        status = false;
    }

    public Task(String taskName, boolean status) {
        this.taskName = taskName;
        this.status = status;
    }

    public String printTaskName(){
        return taskName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }


    @Override
    public int compareTo(Task o) {
        return this.taskName.compareTo(o.taskName);
    }
}
