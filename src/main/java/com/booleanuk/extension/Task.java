package com.booleanuk.extension;

import java.util.concurrent.atomic.AtomicLong;

public class Task {
    public String name;
    public Boolean status;

    static final AtomicLong NEXT_ID = new AtomicLong(0);
    final long id = NEXT_ID.getAndIncrement();

    public long getId() {
        return id;
    }

    public Task(String name) {
        this.name = name;
        this.status = false;
    }

    @Override
    public String toString() {
        return name + (status ? " Completed" : " Uncompleted");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }
}
