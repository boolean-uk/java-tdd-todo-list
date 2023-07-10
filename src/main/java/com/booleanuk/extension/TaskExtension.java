package com.booleanuk.extension;

public class TaskExtension implements Comparable<TaskExtension>{

    private String taskName;
    private boolean status;

    private static int counter =0;
    private String taskExtensionId;



    public TaskExtension(String taskName) {
        this.taskName = taskName;
        status = false;
        taskExtensionId = "ID"+counter;
        counter++;
    }

    public TaskExtension(String taskName, boolean status) {
        this.taskName = taskName;
        this.status = status;
        taskExtensionId = "ID"+counter;
        counter++;
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

    public String getTaskExtensionId() {
        return taskExtensionId;
    }

    public static void setCounterToZero(){
        counter = 0;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskExtensionId(String taskExtensionId) {
        this.taskExtensionId = taskExtensionId;
    }
}
