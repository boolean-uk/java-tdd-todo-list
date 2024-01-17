package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class TaskTest {


    @Test
    public void testGetDate() {
        Task task = new Task();

        Date date1 = task.getTaskDate();
    }

    @Test
    public void testGetStatus() {

        Task task = new Task();

        boolean status = task.getStatus();

    }

    @Test
    public void testGetSetStatus() {
        Task task = new Task();

        task.setStatusOfTask(true);

    }
}
