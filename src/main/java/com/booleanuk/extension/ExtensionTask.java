package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExtensionTask {
    private String description;
    private boolean isComplete;
    private final LocalDateTime creationDate;
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
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public ExtensionTask(String description, boolean isComplete) {
        this.description = description;
        this.isComplete = isComplete;
        this.creationDate = LocalDateTime.now();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(description);
        if(!description.endsWith("."))
            sb.append(".");
        sb.append(" Completion status: ");
        if(isComplete) sb.append("complete. ");
        else sb.append("incomplete. ");
        sb.append("Creation time: ");
        sb.append(creationDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
        sb.append("\n");
        return sb.toString();
    }
}
