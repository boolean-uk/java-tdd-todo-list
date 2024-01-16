package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddingTask1() {
        TodoList todo = new TodoList();

        Assertions.assertTrue(todo.addToTodo("clean"));
    }

    @Test
    public void testAddingTask2() {
        TodoList todo = new TodoList();

        Assertions.assertTrue(todo.addToTodo("wash"));
    }

}
