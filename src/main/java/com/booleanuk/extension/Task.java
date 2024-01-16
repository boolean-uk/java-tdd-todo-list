package com.booleanuk.extension;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    String id, name, date, time;
    boolean status;

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
        status = false;
        time = new SimpleDateFormat("H:mm:ss").format(new Date());
        date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    }
}
