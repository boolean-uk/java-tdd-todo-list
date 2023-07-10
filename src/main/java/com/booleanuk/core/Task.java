package com.booleanuk.core;

public class Task {
    String name;
    boolean status;

    public void changeStatus() {
        status = !status;
    }
}
