package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoListExtensionTest {
    private TodoListExtension todoList;
    @Test
    void testGetTaskById() {
        todoList = new TodoListExtension();
        String taskName = "Test Task";
        todoList.addTask(taskName); // This should get ID 1
        String expected = "ID: 1, Task: Test Task, Status: incomplete";
        assertEquals(expected, todoList.getTaskById(1));
    }
}
