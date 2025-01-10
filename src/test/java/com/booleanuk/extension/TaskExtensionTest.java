package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskExtensionTest {
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

    @Test
    void testGetId() {
        Task task = new Task("task1", 1);

        Assertions.assertEquals(1, task.getId());
    }

    @Test
    void testChangeName() {
        Task task = new Task("task1");
        task.changeName("task2");

        Assertions.assertEquals("task2", task.getName());
    }

    @Test
    void testSetStatus() {
        Task task = new Task("task1");

        task.setStatus(true);
        Assertions.assertTrue(task.isComplete());

        task.setStatus(false);
        Assertions.assertFalse(task.isComplete());
    }

    @Test
    void testGetTimeCreated() {
        Task task = new Task("task1");
        LocalDateTime time = task.getTimeCreated();
        LocalDateTime now = LocalDateTime.now();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            System.err.println(e);
        }

        Task task2 = new Task("task2");

        Assertions.assertTrue(Math.abs(ChronoUnit.MILLIS.between(time, now)) < 50);
        Assertions.assertNotEquals(time, task2.getTimeCreated());
    }

    @Test
    void testSetId() {
        Task task = new Task("task1");
        
        task.setId(777);
        Assertions.assertEquals(777, task.getId());
    }
}
