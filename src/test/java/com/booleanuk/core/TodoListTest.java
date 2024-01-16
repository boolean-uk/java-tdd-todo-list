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

    @Test
    public void isDisplayNotEmpty(){
        TodoList todo = new TodoList();

        todo.addToTodo("clean");
        todo.addToTodo("wash");

        Assertions.assertFalse(todo.list.isEmpty());

    }
    @Test
    public void testDisplayText() {
        TodoList todo = new TodoList();

        todo.addToTodo("clean");
        todo.addToTodo("wash");

        Assertions.assertEquals(displayTodo(), "[clean, wash]");
    }
}
