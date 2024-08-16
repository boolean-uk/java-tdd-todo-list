package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Task {

    private String name;
    private String id;
    private Boolean completed;
    private LocalDateTime date;

    Task(String name){
        this.name = name;
        this.id = generateId();
        this.completed = false;
        this.date = LocalDateTime.now();
    }

    private String generateId(){
        final String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    public String getName(){return this.name;}
    public void setName(String newName){this.name = newName;}
    public Boolean getCompleted(){return this.completed;}
    public void setCompleted(Boolean bool){this.completed = bool;}
    public String getId(){return this.id;}
    public LocalDateTime getDate(){return date;}

}
