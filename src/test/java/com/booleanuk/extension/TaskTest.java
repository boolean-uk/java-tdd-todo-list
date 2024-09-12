package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static java.lang.Thread.sleep;

public class TaskTest {


    @Test
    public void testGetDate() throws InterruptedException {
        Task task = new Task(1, "Task1");


        Date date1 = task.getTaskDate();
        sleep(2000);
        Date date2 = task.getTaskDate();

        Assertions.assertEquals(date1.getTime(), date2.getTime());
    }


    @Test
    public void testGetSetStatus() {
        Task task = new Task(1, "Task1");

        Assertions.assertFalse(task.getStatus());

        task.setStatusOfTask(true);

        Assertions.assertTrue(task.getStatus());


    }

    @Test
    public void testGetId() {
        Task task = new Task(1, "Task1");


        Assertions.assertEquals(1, task.getId());


    }


}
