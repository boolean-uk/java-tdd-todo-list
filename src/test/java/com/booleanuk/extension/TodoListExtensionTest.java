package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListExtensionTest {
    @Test
    public void testGetTask() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertEquals(("Feed the cat"), todoList.tasks.get(0).getName());
        Assertions.assertEquals("Task 1: Feed the cat - incomplete", todoList.getTaskById(1));
        Assertions.assertEquals("Task not found", todoList.getTaskById(2));

    }

    @Test
    public void testUpdateTaskName() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertTrue(todoList.addTask("Feed the cat"));
        Assertions.assertEquals(1, todoList.tasks.size());
        Assertions.assertTrue(todoList.updateTaskName(1, "Feed the dog"));
        Assertions.assertFalse(todoList.updateTaskName(2, "Feed the rabbit"));

    }
}
