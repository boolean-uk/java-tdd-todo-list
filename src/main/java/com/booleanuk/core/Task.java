package com.booleanuk.core;

import java.time.LocalDateTime;

public class Task{
    private int id;
    private String name;
    private boolean isComplete;
    private LocalDateTime createTime;



    public Task(String name, boolean isComplete, LocalDateTime createTime) {
        this.name = name;
        this.isComplete = isComplete;
        this.createTime = createTime;
    }

    public boolean toggleStatus(){
        this.isComplete = !this.isComplete;
        return this.isComplete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + isComplete +
                ", createTime=" + createTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
