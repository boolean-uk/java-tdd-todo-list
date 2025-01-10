package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    void testComplete() {
        Task task = new Task("task1");

        Assertions.assertFalse(task.isComplete());

        task.complete();

        Assertions.assertTrue(task.isComplete());
    }    

    @Test
    void testGetName() {
        Task task = new Task("task1");

        Assertions.assertEquals("task1", task.getName());
    }
}
