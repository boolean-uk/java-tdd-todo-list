package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void shouldGetNameFromNewTask() {
        Task t = new Task("Laundry");
        Assertions.assertEquals("Laundry",t.getName());
    }

    @Test
    public void shouldGetStatus() {
        Task t = new Task("Laundry");
        Assertions.assertFalse(t.getStatus());
    }

    @Test
    public void shouldSetStatusCorrectly() {
        Task t = new Task("Laundry");
        t.setStatus();
        Assertions.assertTrue(t.getStatus());
    }
}
