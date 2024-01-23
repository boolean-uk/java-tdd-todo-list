package com.booleanuk.extension;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private int id;
    private String name;
    private String status;
    private String created;

    public Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;

        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.created = simpleDateFormat.format(new Date());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public String toString(){
        return "Task{ \n"
                +"ID: "+getId()+"\n"
                +"Name: "+getName()+"\n"
                +"Status: "+getStatus()+"\n"
                +"Created: "+getCreated()+" \n}";
    }

}
