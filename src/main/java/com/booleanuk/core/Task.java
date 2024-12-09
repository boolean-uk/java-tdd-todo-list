package com.booleanuk.core;

import javax.management.Descriptor;

public class Task {
    private String description;
    private boolean isComplete;
    public String getDescription() {
        return description;
    }
    public void setDescription(String newDescription) {
        description = newDescription;
    }
    public boolean getCompletion() {
        return isComplete;
    }
    public void setCompletion(boolean newIsComplete) {
        isComplete = newIsComplete;
    }
    public Task(String description, boolean isComplete) {
        this.description = description;
        this.isComplete = isComplete;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(description);
        if(!description.endsWith("."))
            sb.append(".");
        sb.append(" Completion status: ");
        // if(!isComplete) sb.append("in");
        // sb.append("complete.");
        if(isComplete) sb.append("complete.\n");
        else sb.append("incomplete.\n");
        return sb.toString();
    }
}
