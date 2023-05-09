package com.booleanuk.extension;

public class Task {
    int id;
    String name;
    boolean status;


    public void changeStatus() {
        status = !status;
    }
}
