package com.booleanuk.extension;

public class TaskExtension implements Comparable<TaskExtension>{

    private String taskName;
    private boolean status;

    public TaskExtension(String taskName) {
        this.taskName = taskName;
        status = false;
    }

    public TaskExtension(String taskName, boolean status) {
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
    public int compareTo(TaskExtension o) {
        return this.taskName.compareTo(o.taskName);
    }
}
