package com.booleanuk.extension;

import java.time.LocalDateTime;

public class ExtensionTask {
    public String name;

    public Boolean status;
    private final LocalDateTime creationDate;

    public ExtensionTask(String name) {
        this.name = name;
        this.status = false;
        this.creationDate = LocalDateTime.now();
    }

    public void changeStatus(){
        setStatus(!getStatus());
    }
    @Override
    public String toString() {
        return name + (status ? " Completed" : " Uncompleted");
    }

    public String getName() {
        return name;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
