package com.booleanuk.extension;

import java.util.Date;

public class Task {

    private int id;
    private String taskName;
    private String status;
    private Date date;

    public Task(int id, String taskName) {
        this.id = id;
        this.taskName = taskName;
        status = "incomplete";
        this.date = new Date();
    }

    public void setTaskName(String newName) {
        this.taskName = newName;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatusOfTask(int id) {

            if(status.equals("incomplete")) {
                status = "complete";
            }else if(status.equals("complete")){
                status = "incomplete";
            }
        }
    public Date getDate() {
        return date;
    }
}
