package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskExtension {
    public String text;
    public final String creationDate;
    public final int id;

    public TaskExtension(int id, String text) {
        this.text = text;
        this.id = id;

        creationDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
    }
}
