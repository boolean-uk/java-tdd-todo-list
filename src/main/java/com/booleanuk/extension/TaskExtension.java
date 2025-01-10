package com.booleanuk.extension;
import java.util.UUID;

public class TaskExtension {
    String name;
    boolean complete;
    UUID uid;

    public TaskExtension(String name) {
        this.name = name;
        this.complete = false;
        this.uid = UUID.randomUUID();

    }

    public void changeStatus(boolean status) {
        this.complete = status;
    }

}
