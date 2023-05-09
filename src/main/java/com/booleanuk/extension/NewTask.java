package com.booleanuk.extension;

import com.booleanuk.core.Task;

import java.util.Date;

public class NewTask extends Task {


    int id;
    Date date;

    public NewTask(int id) {
        this.id = id;
    }

    public NewTask(String name, int id) {
        super(name);
        this.id = id;
        this.date =new Date();
    }

}
