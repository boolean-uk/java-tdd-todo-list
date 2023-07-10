package com.booleanuk.extension;

public class Task implements Comparable<com.booleanuk.core.Task> {
    private int id;
    private String description;
    private boolean isComplete;

    public Task(int id,String description) {
        this.id = id;
        this.description = description;
        this.isComplete = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void changeTaskStatus() {
        isComplete = !isComplete;
    }


    @Override
    public int compareTo(com.booleanuk.core.Task o) {
        return this.getDescription().compareTo(o.getDescription());
    }
}

