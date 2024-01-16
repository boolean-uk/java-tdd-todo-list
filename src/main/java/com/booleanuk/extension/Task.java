package com.booleanuk.extension;

import java.time.LocalDate;

public class Task {
    public String name;
    public int ID;
    public boolean complete;
    public LocalDate creationDate;

    public Task(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
        this.complete = false;
        this.creationDate = LocalDate.now();
    }

    public String getName()
    {
        return this.name;
    }
}
