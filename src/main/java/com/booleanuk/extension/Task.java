package com.booleanuk.extension;

import java.util.Date;

public class Task {

    private Date date;
    private boolean status;

    public Task() {
        this.date = new Date();
        this.status = false;


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

}
