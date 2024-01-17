package com.booleanuk.extension;

import java.util.Date;

public class Task {

    private Date date;
    private boolean status;

    private int Id;

    public Task(int i) {
        this.date = new Date();
        this.status = false;
        this.Id = i;

    }

    public Date getTaskDate() {
        return this.date;
    }

    public boolean getStatus() {
        
        return this.status;
    }

    public void setStatusOfTask(boolean b) {
        this.status = b;
    }

    public int getId() {
        return this.Id;
    }
}
