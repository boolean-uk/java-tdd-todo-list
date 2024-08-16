package com.booleanuk.extension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TaskExtension {
    int id;
    String name;
    boolean isComplete;
    String date;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public TaskExtension(int id, String name) {
        this.id = id;
        this.name = name;
        this.isComplete = false;
        this.date = LocalDateTime.now().format(formatter);
    }

    public String getName() {
        return this.name;
    }

    public String getDateString() {

        return this.date.toString();
    }

    public boolean getTaskStatus() {
        return this.isComplete;
    }

    public void changeStatus() {
        this.isComplete = !this.isComplete;
    }

    public void updateName(String newName) {
        this.name = newName;
    }
}
