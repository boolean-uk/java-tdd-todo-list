package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoListExtensionTest {
    private TodoListExtension todoList;

    @BeforeEach
    void setUp() {
        todoList = new TodoListExtension();
        Task.resetNextId();
        // This was needed because without it the tests were passing individually,
        // but failing when I run them all together.
    }

    @Test
    public void testGetTask() {
        Assertions.assertTrue(todoList.addTask("Feed the cat", "2023-09-15 14:00"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertEquals(("Feed the cat"), todoList.tasks.get(0).getName());
        Assertions.assertEquals("Task 1: Feed the cat - incomplete", todoList.getTaskById(1));
        Assertions.assertTrue(todoList.addTask("Feed the dog", "2023-09-16 14:00"));
        Assertions.assertEquals("Task 2: Feed the dog - incomplete", todoList.getTaskById(2));
        Assertions.assertEquals("Task not found", todoList.getTaskById(3));

    }

    @Test
    public void testUpdateTaskName() {
        Assertions.assertTrue(todoList.addTask("Feed the cat","2023-09-15 14:00"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.updateTaskName(1, "Feed the dog"));
        Assertions.assertEquals("Feed the dog", todoList.tasks.get(0).getName());
        Assertions.assertFalse(todoList.updateTaskName(2, "Feed the rabbit"));

    }
    @Test
    public void testChangeStatus() {
        Assertions.assertTrue(todoList.addTask("Feed the cat","2023-09-15 14:00"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertFalse(todoList.tasks.get(0).getStatus());
        Assertions.assertEquals("Task Feed the cat updated successfully.",todoList.changeTaskStatus(1));
        Assertions.assertTrue(todoList.tasks.get(0).getStatus());
        Assertions.assertEquals("Task not found.",todoList.changeTaskStatus(2));

    }
    @Test
    public void testGetTaskTimeAndDate() {
        Assertions.assertTrue(todoList.addTask("Feed the cat","2023-09-15 14:00"));
        Assertions.assertTrue(todoList.addTask("Feed the dog","2023-09-15 16:00"));
        Assertions.assertEquals("2023-09-15 14:00", todoList.getTaskTimeAndDate(1));
        Assertions.assertEquals("2023-09-15 16:00",todoList.getTaskTimeAndDate(2));
        Assertions.assertEquals("Task not found.",todoList.getTaskTimeAndDate(3));

    }
}
