package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    //User story 3
    @Test
    public void shouldReturnTrueIfTaskIsSetAsCompleted() {
        Task task = new Task("Buy groceries");
        task.setCompleted(true);
        boolean isCompleted = task.isCompleted();
        Assertions.assertTrue(isCompleted);
    }
}
