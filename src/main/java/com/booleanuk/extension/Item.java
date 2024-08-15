package com.booleanuk.extension;

public class Item {
    private String id;
    private String message;
    private static int identifier = 1;

    public Item(String message) {
        this.message = message;
        this.id = "task-" + identifier++;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
