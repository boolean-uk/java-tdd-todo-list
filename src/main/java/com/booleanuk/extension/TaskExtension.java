package com.booleanuk.extension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TaskExtension {
    String name, dateTime;
    int id;
    boolean status;
    LocalDateTime datetime;
    public TaskExtension(int id, String name, boolean status ){

        this.id= id;
        this.name = name;
        this.status = status;
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dateTime = localDate.format(formatter);

    }
    @Override
    public String toString(){
        return "Task: "+ name+ " " + "Created: "+ dateTime;
    }

}
