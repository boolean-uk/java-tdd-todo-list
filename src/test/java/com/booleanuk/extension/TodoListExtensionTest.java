package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TodoListExtensionTest {

    @Test
    public void testGetTaskById() {
        TodoListExtension task = new TodoListExtension( 1, "Jason", "Complete", LocalDate.now());
        TodoListExtension retrievedTask = task.getTaskById(1);
        Assertions.assertEquals(task.getName(), retrievedTask.getName());
    }

    @Test
    public void testUpdateName() {
        TodoListExtension task = new TodoListExtension( 2, "Bourne", "Incomplete", LocalDate.now());
        task.updateTaskName(2, "James");
        Assertions.assertEquals("James", task.getName());
    }

    @Test
    public void testUpdateStatus() {
        TodoListExtension task = new TodoListExtension( 3, "Bourne", "Incomplete", LocalDate.now());
        task.updateTaskStatus(3, "Complete");
        Assertions.assertEquals("Complete", task.getStatus());
    }

    @Test
    public void testGetDateAndTime() {
        TodoListExtension task = new TodoListExtension( 4, "Bourne", "Incomplete", LocalDate.now());
        LocalDate date = LocalDate.now();
        Assertions.assertEquals(date, task.getTaskCreationDateTime(4));
    }

}
