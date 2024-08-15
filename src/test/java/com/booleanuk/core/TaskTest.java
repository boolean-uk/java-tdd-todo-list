package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testCreatingATask() {
        Task task = new Task("task name", "task description");
        Assertions.assertNotNull(task, "The TodoList object should not be null after creation");
    }

    @Test
    public void testGetName() {
        Task task = new Task("task name", "task description");
        Assertions.assertEquals("task name", task.getName(), "The name of the task should be 'task name'");
    }

    @Test
    public void testGetDescription() {
        Task task = new Task("task name", "task description");
        Assertions.assertEquals("task description", task.getDescription(), "The description of the task should be 'task description'");
    }

    @Test
    public void testGetId() {
        Task task = new Task("task name", "task description");
        Assertions.assertNotNull(task.getId(), "The id of the task should not be null");
    }
}
