package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void testAddTaskSuccessfully() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.add("Walk the dog"));
    }

    @Test
    public void testAddTaskThatAlreadyExists() {
        TodoList todoList = new TodoList();
        todoList.add("Code");
        Assertions.assertFalse(todoList.add("Code"));
    }

    @Test
    public void testAddEmptyTask() {
        TodoList todoList = new TodoList();
        Assertions.assertFalse(todoList.add(""));
    }

    @Test
    public void testCheckIfTaskIsAdded() {
        TodoList todoList = new TodoList();
        todoList.add("exercise");
        Assertions.assertTrue(todoList.todos.containsKey("exercise"));
    }
}
