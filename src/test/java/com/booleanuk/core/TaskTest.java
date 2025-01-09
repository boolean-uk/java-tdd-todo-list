package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void getCorrectTaskNameTest() {
        Task task = new Task("laundry", false);
        Assertions.assertEquals("laundry", task.getTaskName());
    }

    @Test
    public void getIncorrectTaskNameTest() {
        Task task = new Task("laundry", false);
        Assertions.assertNotEquals("shower", task.getTaskName());
    }

    @Test
    public void getCorrectCompletedTest() {
        Task task = new Task("laundry", false);
        Assertions.assertEquals(false, task.getIsCompleted());
    }

    @Test
    public void getIncorrectCompletedTest() {
        Task task = new Task("laundry", false);
        Assertions.assertNotEquals(true, task.getIsCompleted());
    }
}
