package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExtensionTask {
    String name;
    boolean status=false;
    LocalTime time;
    LocalDate date;
    public ExtensionTask(String name){
        this.name=name;
        time=LocalTime.now();
        date=LocalDate.now();
    }
    public void changeStatus(){
        status=!status;
    }
    public String getDateAndTime(){
        return date+" "+time;
    }
}
