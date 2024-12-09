package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void changeStatusShouldBeTrue() {
        Task task = new Task();
        task.status = false;
        task.changeStatus();
        Assertions.assertTrue(task.status);
    }

    @Test
    public void changeStatusShouldBeFalse() {
        Task task = new Task();
        task.status = true;
        task.changeStatus();
        Assertions.assertFalse(task.status);
    }
}
