package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExtensionTodoListTest {
    private ExtensionTodoList todoList;

    @BeforeEach
    public void setUp() {
        ArrayList<Task> tasks = new ArrayList<>() {{
            add(new Task("Eat", false, "2025-01-19T10:00:00"));
            add(new Task("Sleep", true, "2025-01-20T09:00:00"));
        }};
        todoList = new ExtensionTodoList(tasks);
    }

    @Test
    public void testGetTaskById() {
        Assertions.assertEquals("Eat, incomplete", todoList.getTaskById(0));
        Assertions.assertEquals("Sleep, completed", todoList.getTaskById(1));
    }

    @Test
    public void testUpdateTaskName() {
        Assertions.assertEquals("Task successfully updated to: Dinner", todoList.updateTaskName(0, "Dinner"));
        Assertions.assertEquals("Task successfully updated to: sleep", todoList.updateTaskName(1, "sleep"));
    }

    @Test
    public void testUpdateTaskStatus() {
        Assertions.assertTrue(todoList.updateTaskStatus(0));
        Assertions.assertFalse(todoList.updateTaskStatus(1));
    }

    @Test
    public void testShowDateTime() {
        Assertions.assertEquals("Task: Eat, Created on: 2025-01-19T10:00:00\nTask: Sleep, Created on: 2025-01-20T09:00:00\n", todoList.showDateTime());
        ArrayList<Task> empty = new ArrayList<>();
        ExtensionTodoList emptyTodoList = new ExtensionTodoList(empty);
        Assertions.assertEquals("Todolist is empty", emptyTodoList.showDateTime());
    }
}
