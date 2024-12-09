package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void changeStatusTestToComplete() {
        Task task = new Task(Status.INCOMPLETE, "Do the dishes.");
        task.changeStatus();
        Assertions.assertEquals(task.status, Status.COMPLETE);
    }

    @Test
    public void changeStatusTestToIncomplete() {
        Task task = new Task(Status.COMPLETE, "Do the dishes.");
        task.changeStatus();
        Assertions.assertEquals(task.status, Status.INCOMPLETE);
    }
}
