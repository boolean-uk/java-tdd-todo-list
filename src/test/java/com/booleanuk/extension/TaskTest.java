package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class TaskTest {

    // Had to add this to reset static counter in between different tests
    @BeforeEach
    public void resetCounter() throws NoSuchFieldException, IllegalAccessException {
        Field counterField = Task.class.getDeclaredField("counter");
        counterField.setAccessible(true);
        counterField.set(null, 0); // Reset the static counter to 0
    }

    @Test
    public void testGetId(){
        Task task1 = new Task("a");
        Task task2 = new Task("b");
        Task task3 = new Task("c");

        Assertions.assertEquals(1, task1.getId());
        Assertions.assertEquals(2, task2.getId());
        Assertions.assertEquals(3, task3.getId());
    }

    @Test
    public void testChangeName(){
        Task task = new Task("Code");
        Assertions.assertEquals("Code", task.getName());
        task.changeName("Jump");
        Assertions.assertEquals("Jump", task.getName());
    }

    @Test
    public void testValidTask(){
        Task task = new Task("Code");

        Assertions.assertFalse(task.getName().isEmpty());
        Assertions.assertFalse(task.getStatus());
    }

    @Test
    public void testGetName(){
        Task task = new Task("Run");

        String name = task.getName();
        Assertions.assertEquals("Run", name);
    }

    @Test
    public void testChangeStatusTrue(){
        Task task = new Task("Run");

        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
    }

    @Test
    public void testChangeStatusFalse(){
        Task task = new Task("Run");

        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
        task.setStatus(false);
        Assertions.assertFalse(task.getStatus());
    }

    @Test
    public void testGetStatus(){
        Task task = new Task("Run");

        Assertions.assertFalse(task.getStatus());
        task.setStatus(true);
        Assertions.assertTrue(task.getStatus());
    }

}