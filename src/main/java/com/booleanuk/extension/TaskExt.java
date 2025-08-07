package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class TaskExt {
    private String description;
    private boolean completeStatus;
    private String id;
    private LocalDateTime creationTime;

    public TaskExt(String description){
        this.completeStatus = false;
        this.description = description;
        this.id = UUID.randomUUID().toString();
        this.creationTime = LocalDateTime.now();
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getCompleteStatus(){
        return this.completeStatus;
    }

    public boolean completeTask(){
        if (this.completeStatus){
            return false;
        }
        this.completeStatus = true;
        return true;
    }

    public boolean incompleteTask(){
        if (!this.completeStatus){
            return false;
        }
        this.completeStatus = false;
        return true;
    }

    public String getId(){
        return this.id;
    }

    public void setDescription(String newDesc){
        this.description = newDesc;
    }

    public void setCompleteStatus(boolean status){
        this.completeStatus = status;
    }

    public LocalDateTime getCreationTime(){
        return this.creationTime;

    }
}
