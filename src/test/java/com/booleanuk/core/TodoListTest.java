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
    public void testAddEmptyTask() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.add(""));
    }

    @Test
    public void testCheckIfTaskIsAdded() {
        TodoList todoList = new TodoList();
        todoList.add("exercise");
        Assertions.assertTrue(todoList.todos.containsKey("exercise"));
    }
}
