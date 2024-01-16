package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void addingTaskShouldReturnTrue() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Task1", "incomplete"));
    }
    @Test
    public void addingTaskShouldReturnFalse() {
        TodoList todoList = new TodoList();
        todoList.addTask("Task1", "incomplete");
        Assertions.assertFalse(todoList.addTask("Task1", "incomplete"));
    }
}
