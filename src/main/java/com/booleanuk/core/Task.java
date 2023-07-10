package com.booleanuk.core;

import java.time.LocalDateTime;

public class Task{
    private int id;
    private String name;
    private boolean status;
    private LocalDateTime createTime;

    private static int lastId = 0;

    public Task(String name, boolean status, LocalDateTime createTime) {
        this.name = name;
        this.status = status;
        this.createTime = createTime;
        this.id = ++lastId;
    }

    public boolean toggleStatus(){
        this.status = !this.status;
        return this.status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }
}
