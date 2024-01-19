package com.booleanuk.extension;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.format.DateTimeFormatter.ofLocalizedDateTime;

public class TaskExtension {
    String name, dateTime;
    int id;
    boolean status;
    public TaskExtension(int id, String name, boolean status ){

        this.id= id;
        this.name = name;
        this.status = status;
        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dateTime = localDate.format(formatter);

    }

}
