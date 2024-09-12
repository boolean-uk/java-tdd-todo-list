package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task {
    public String name;
    public int ID;
    public boolean complete;
    public LocalDate creationDate;
    public LocalTime creationTime;
    public String timeString;

    public Task(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
        this.complete = false;

        this.creationDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        this.creationTime = LocalTime.now();
        this.timeString = creationDate.toString() + " " + creationTime.format(formatter);
    }

    public String getName()
    {
        return this.name;
    }
}
