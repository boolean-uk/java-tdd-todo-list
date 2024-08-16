package com.booleanuk.core;

public class Task {

    private int id;
    private String title;
    private Status status;

    // TODO: Do I need to do something specific to make arguments/parameters required to fill in?
    // TODO: How to validate in a constructor?
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.INCOMPLETE;
    }

    public int id() {
        return this.id;
    }

    public String title() {
        return this.title;
    }

    public Status status() {
        return this.status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }
}
