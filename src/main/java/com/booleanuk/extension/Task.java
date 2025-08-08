package com.booleanuk.extension;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private static int counter = 0;
    public final int id;
    private String name;
    private String status;
    private LocalDate date;

    public Task(String name) {
        this.id = ++counter;
        this.name = name;
        this.status = "Incomplete";
        this.date = LocalDate.now();
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String updateName(String s) {
       this.name = s;
       return this.name;
    }

    public boolean changeStatus() {
        if(Objects.equals(this.status, "Incomplete")){
            this.status = "Completed";
        } else this.status = "Incomplete";
        return true;
    }

    public LocalDate getDate() {
        return this.date;
    }
}
