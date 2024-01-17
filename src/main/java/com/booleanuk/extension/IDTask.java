package com.booleanuk.extension;

import com.booleanuk.core.Task;
import java.time.LocalDateTime;

public class IDTask extends Task {
    String ID;
    LocalDateTime created;
    public IDTask(String ID, String name){
        super(name);
        this.ID = ID;
        created = LocalDateTime.now();
    }

    public boolean equals(IDTask otherTask) {
        return this.ID.equals(otherTask.ID);
    }

    @Override
    public String toString(){
        return ID + " - " + description;
    }
}
