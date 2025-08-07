package com.booleanuk.extension;

import java.text.SimpleDateFormat;
import java.util.UUID;

public class TaskExt {
    private String description;
    private boolean status;
    private final String id;
    private final String timeStamp;

    public TaskExt(String description){
        this.description = description;
        this.status = false;
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        this.id = UUID.randomUUID().toString();
    }

    public TaskExt(String description, boolean status){
        this.description = description;
        this.status = status;
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        this.id = UUID.randomUUID().toString();
    }

    public void toggleStatus(){
        status = !status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getId() {
        return id;
    }
}
