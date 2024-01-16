package com.booleanuk.extension;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskExtension {

    private static AtomicInteger count;
    private final int id;
    private String name;
    private boolean status;
    private final Timestamp createdAt;


    public TaskExtension(String name) {
        count = new AtomicInteger(0);
        this.id = count.incrementAndGet();
        this.name = name;
        this.status = false;
        this.createdAt = Timestamp.from(Instant.now());
    }

    public TaskExtension(String name, boolean status) {
        count = new AtomicInteger(0);
        this.id = count.incrementAndGet();
        this.name = name;
        this.status = status;
        this.createdAt = Timestamp.from(Instant.now());
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return this.createdAt;
    }

}
