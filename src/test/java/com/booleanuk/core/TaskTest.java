package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void statusChanged() {
        Task task = new Task("Take out the garbage");
        task.changeStatus(true);
        Assertions.assertTrue(task.isComplete());

        task.changeStatus(false);
        Assertions.assertFalse(task.isComplete());
    }
}
