package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {

    @Test
    public void testGetTaskById() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Code"));
        Assertions.assertEquals("Work: incomplete",todoList.getTaskById("1"));
    }

    @Test
    public void testGetTaskByIdNotInList() {
        TodoListExtension todoList = new TodoListExtension();
        todoList.todos.add(new Task("1","Work"));
        todoList.todos.add(new Task("2","Code"));
        Assertions.assertEquals("Task not found",todoList.getTaskById("3"));
    }

    @Test
    public void testGetTaskByIdFromEmptyList() {
        TodoListExtension todoList = new TodoListExtension();
        Assertions.assertEquals("List is empty",todoList.getTaskById("1"));
    }
}
