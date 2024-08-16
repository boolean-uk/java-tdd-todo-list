package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void createTaskTest() {
        Task task = new Task("First Task");

        Assertions.assertEquals("First Task", task.getName());
    }

    @Test
    public void getTaskStatusTest() {
        Task task = new Task("First Task");

        Assertions.assertFalse(task.getTaskStatus());
    }

    @Test
    public void changeStatusTest() {
        Task task = new Task("First Task");

        Assertions.assertFalse(task.getTaskStatus());

        task.changeStatus();

        Assertions.assertTrue(task.getTaskStatus());
    }
}
