package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task {
    int id;
    String name;
    boolean status;
    LocalDateTime timeCreated;


    public void changeStatus() {
        status = !status;
    }
}
