package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class TodoListExtensionTest {
    @Test
    public void testGetTaskById() {
        TodoListExtension todoList = new TodoListExtension();

        // Test if return is correct when list is empty
        Assertions.assertEquals("Todo list is empty.", todoList.getTaskById(2));

        // Test if return is correct when task does not exist
        todoList.addTask("Test task 1");
        Assertions.assertEquals("Task not found.", todoList.getTaskById(2));

        // Test if correct task is retrieved by id
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("'Test task 2' is Incomplete", todoList.getTaskById(2));
    }
    @Test
    public void testEditTaskName() {
        TodoListExtension todoList = new TodoListExtension();

        // Test if name is updated by providing id and new name
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task name changed to 'Edited name'", todoList.editTaskName(2, "Edited name"));

        // Double check that the new name is set correct in the task object
        Assertions.assertEquals("'Edited name' is Incomplete", todoList.getTaskById(2));
    }

    @Test
    public void testChangeStatus() {
        TodoListExtension todoList = new TodoListExtension();

        // Test if return is correct when list is empty
        Assertions.assertEquals("Task list is empty.", todoList.setCompletedById(2));

        // Test if return is correct when task does not exist
        todoList.addTask("Test task 1");
        Assertions.assertEquals("Task not found.", todoList.setCompletedById(2));

        // Test that the status is changed to complete
        todoList.addTask("Test task 2");
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task status is now 'Completed'.", todoList.setCompletedById(2));

        // Test that the status is changed to incomplete
        Assertions.assertEquals("Task status is now 'Incomplete'.", todoList.setUncompletedById(2));
    }

    @Test
    public void testGetCreationDateTime() {
        TodoListExtension todoList = new TodoListExtension();

        // Test that the creation datetime is retrieved
        todoList.addTask("Test task 1");
        todoList.addTask("Test task 2");
        String timeNow = LocalDateTime.now().withNano(0).withSecond(0).toString();
        todoList.addTask("Test task 3");
        Assertions.assertEquals("Task created at '" + timeNow + "' is Incomplete", todoList.getCreationDateTime(2));
    }
}
