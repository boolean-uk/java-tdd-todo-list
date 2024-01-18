package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListExtensionTest {
    private TodoListExtension todoList;
    @Test
    void testGetTaskById() {
        todoList = new TodoListExtension();
        String taskName = "Test Task";
        todoList.addTask(taskName);
        String expected = "ID: 1, Task: Test Task, Status: incomplete";
        assertEquals(expected, todoList.getTaskById(1));
    }

    @Test
    void testUpdateTaskName() {
        todoList = new TodoListExtension();
        todoList.addTask("walk");
        assertTrue(todoList.updateTaskName(1, "run"));

        String expected = "ID: 1, Task: run, Status: incomplete";
        assertEquals(expected, todoList.getTaskById(1));

        assertFalse(todoList.updateTaskName(99, "Non-existent Task"));
    }
}
