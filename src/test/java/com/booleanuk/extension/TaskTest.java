package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static java.lang.Thread.sleep;

public class TaskTest {


    @Test
    public void testGetDate() throws InterruptedException {
        Task task = new Task();


        Date date1 = task.getTaskDate();
        sleep(2000);
        Date date2 = task.getTaskDate();

        Assertions.assertEquals(date1.getTime(), date2.getTime());
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
