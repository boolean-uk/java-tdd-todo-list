package com.booleanuk.extension;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListExtensionTest {
    private TodoListExtension todoList;
    @Test
    public void testGetTaskById() {
        todoList = new TodoListExtension();
        String taskName = "run";
        todoList.addTask(taskName);
        String expected = "ID: 1, Task: run, Status: incomplete";
        assertEquals(expected, todoList.getTaskById(1));
    }

    @Test
    public void testUpdateTaskName() {
        todoList = new TodoListExtension();
        todoList.addTask("walk");
        assertTrue(todoList.updateTaskName(1, "run"));

        String expected = "ID: 1, Task: run, Status: incomplete";
        assertEquals(expected, todoList.getTaskById(1));

        assertFalse(todoList.updateTaskName(99, "Non-existent Task"));
    }
    @Test
    public void testChangeStatus(){
        todoList = new TodoListExtension();
        todoList.addTask("walk");
        int taskId = 1;

        String result1 = todoList.changeStatus(taskId);
        assertEquals("Status changed to: complete", result1);

        String result2 = todoList.changeStatus(taskId);
        assertEquals("Status changed to: incomplete", result2);
    }
    @Test
    public void testTaskCreationTime(){
        todoList = new TodoListExtension();
        todoList.addTask("walk");
        String taskInfo = todoList.getTaskWithTimestampById(1);
        String creationTime = LocalDateTime.now().toString();

        assertTrue(taskInfo.contains("walk"));
        assertTrue(taskInfo.contains("incomplete"));
        assertTrue(taskInfo.contains("2024"));

    }


}