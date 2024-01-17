package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

public class TaskTest {


    @Test
    public void testGetDate() {
        Task task = new Task();

        task.getTaskDate();
    }

    @Test
    public void testGetStatus() {

        Task task = new Task();

        task.getStatus("Task1");

    }

    @Test
    public void testGetSetStatus() {
        Task task = new Task();

        task.setStatusOfTask("Task");

    }
}
